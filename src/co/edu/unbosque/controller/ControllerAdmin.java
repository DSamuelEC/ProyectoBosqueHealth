package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

/**
 * Controlador encargado de gestionar las acciones y configuraciones administrativas
 * en la aplicacion, tales como asignación de turnos, visualización de listas de 
 * pacientes y especialistas, y ajustes de configuraciones.
 * 
 * @author Samuel Diaz
 */
public class ControllerAdmin implements ActionListener {

    /**
     * Controlador principal de la aplicacion para la gestion centralizada de acciones.
     */
    private Controller controllerPrincipal;

    /**
     * Ventana principal de la interfaz grafica, que contiene los paneles administrativos
     * y otros elementos de la interfaz de usuario.
     */
    private VentanaPrincipal ventanaP;

    /**
     * Ventana de dialogos emergentes para mostrar mensajes informativos o de error.
     */
    private VistaVentanasEmergentes vistaE;

    /**
     * Objeto Admin que representa al administrador actualmente activo en el sistema.
     */
    private Admin admin;

    /**
     * Constructor de la clase ControllerAdmin. Inicializa el controlador y asigna
     * oyentes a los botones de la interfaz administrativa.
     * 
     * @param controllerPrincipal El controlador principal de la aplicación
     * @param ventanaP La ventana principal de la interfaz gráfica
     * @param vistaE La ventana de diálogos emergentes para mostrar mensajes
     */
    public ControllerAdmin(Controller controllerPrincipal, VentanaPrincipal ventanaP, VistaVentanasEmergentes vistaE) {
        this.controllerPrincipal = controllerPrincipal;
        this.ventanaP = ventanaP;
        this.vistaE = vistaE;
        asignarOyentes();
    }

    /**
     * Asigna oyentes de accion a los botones de los paneles administrativos en la interfaz,
     * para gestionar eventos de clic en los componentes de la interfaz de administracion.
     */
    public void asignarOyentes() {
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnAsignarTurnos().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnCerrarSesion().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnConfiguraciones().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnRegistrarEspecialistas().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnReportes().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnVerEspecialistas().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdBotones().getBtnVerPacientes().addActionListener(this);

        ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getBtnAtras().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getBtnSubmit().addActionListener(this);

        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasTurnos().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosTurnos().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasEspecialistas().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosEspecialistas().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasDias().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosDias().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnAtras().addActionListener(this);
        ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnSubmit().addActionListener(this);
    }

    /**
     * Metodo para gestionar los eventos de accion de los botones administrativos, tales como
     * asignar turnos, ver pacientes y especialistas, configurar parámetros y cerrar sesion.
     * 
     * @param e Evento de acción que contiene el comando asociado al boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);
        switch (comando) {
            case "P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA":
                cambiarPanel(2);
                break;
            case "P_BOTONES_ADMIN_ASIGNAR_TURNOS":
                admin.asignarTurnosMensuales();
                controllerPrincipal.actualizarLaDBConEspecialistas(admin.getEspecialistas());
                break;
            case "P_BOTONES_ADMIN_VER_PACIENTES":
                cambiarPanel(1);
                setearTablePacientes(admin.getPacientes());
                break;
            case "P_BOTONES_ADMIN_VER_ESPECIALISTAS":
                cambiarPanel(1);
                setearTableEspecialistas(admin.getEspecialistas());
                break;
            case "P_BOTONES_ADMIN_REPORTES":
                vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
                break;
            case "P_BOTONES_ADMIN_CONFIGURACIONES":
                cambiarPanel(3);
                vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
                break;
            case "P_BOTONES_ADMIN_CERRAR_SESION":
                cambiarPanel(1);
                controllerPrincipal.cerrarSesiones(1);
                break;
            case "P_AD_CONFIGURACIONES_ATRAS":
                cambiarPanel(1);
                break;
            case "P_AD_CONFIGURACIONES_SUBMIT":
                vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
                break;
            case "P_AD_REGISTRAR_ESPECIALISTA_ATRAS":
                cambiarPanel(1);
                break;
            case "P_AD_REGISTRAR_ESPECIALISTA_SUBMIT":
                capturarDatosCrearEspecialista();
                break;
            case "P_AD_CONFIGURACIONES_MAS_TURNOS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("turnos", "MAS", 0);
                break;
            case "P_AD_CONFIGURACIONES_MENOS_TURNOS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("turnos", "MENOS", 0);
                break;
            case "P_AD_CONFIGURACIONES_MAS_ESPECIALISTAS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("especialistas", "MAS", 0);
                break;
            case "P_AD_CONFIGURACIONES_MENOS_ESPECIALISTAS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("especialistas", "MENOS", 0);
                break;
            case "P_AD_CONFIGURACIONES_MAS_DIAS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("dias", "MAS", 0);
                break;
            case "P_AD_CONFIGURACIONES_MENOS_DIAS":
                ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("dias", "MENOS", 0);
                break;
            default:
                break;
        }
    }

    /**
     * Cambia la visibilidad de los paneles en la ventana principal segun el indice especificado.
     * 
     * @param index Indice del panel al que se desea cambiar la visibilidad
     */
    public void cambiarPanel(int index) {
        ventanaP.getpAdPrincipal().cambiarVisibilidad(index);
    }

    /**
     * Captura los datos del formulario de creación de un especialista y los envia
     * al controlador principal para su procesamiento y almacenamiento.
     */
    public void capturarDatosCrearEspecialista() {
        String nombre = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtNombre().getText();
        String especialidad = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getLdEspecialidad()
                .getSelectedItem().toString();
        String correo = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtCorreo().getText();
        long cedula = Long.parseLong(ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtCedula().getText());
        String sexo = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getLdSexo().getSelectedItem().toString();
        int edad = Integer.parseInt(ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtEdad().getText());

        controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "ESPECIALISTA",
                especialidad);
    }

    /**
     * Establece el objeto Admin actual, actualiza la vista con su informaciOn y
     * muestra la lista de pacientes asignados al administrador.
     * 
     * @param admin El objeto Admin con los datos del administrador actual
     */
    public void setearDatosAdmin(Admin admin) {
        this.admin = admin;
        ventanaP.getpAdPrincipal().getpAdBotones().getLblNombreAdmin().setText(this.admin.getNombre());
        setearTablePacientes(this.admin.getPacientes());
    }

    /**
     * Llena la tabla en la interfaz de usuario con la lista de pacientes especificada.
     * 
     * @param pacientes Lista de objetos Paciente para mostrar en la tabla
     */
    public void setearTablePacientes(ArrayList<Paciente> pacientes) {
        ventanaP.getpAdPrincipal().getpAdVerTodos().limpiarTabla();
        if (pacientes.size() == 0) {
            vistaE.mostrarInformacion("No existen pacientes aun", 1);
        } else {
            ventanaP.getpAdPrincipal().getpAdVerTodos().cambiarEncabezado(0, "Paciente");
            for (Paciente paciente : pacientes) {
                ventanaP.getpAdPrincipal().getpAdVerTodos().agregarFilaTabla(paciente.getNombre(),
                        paciente.getCorreo());
            }
        }
    }

    /**
     * Llena la tabla en la interfaz de usuario con la lista de especialistas especificada.
     * 
     * @param especialistas Lista de objetos Especialista para mostrar en la tabla
     */
    public void setearTableEspecialistas(ArrayList<Especialista> especialistas) {
        ventanaP.getpAdPrincipal().getpAdVerTodos().limpiarTabla();
        if (especialistas.size() == 0) {
            vistaE.mostrarInformacion("No existen especialistas aun", 1);
        } else {
            ventanaP.getpAdPrincipal().getpAdVerTodos().cambiarEncabezado(0, "Especialista");
            for (Especialista especialista : especialistas) {
                ventanaP.getpAdPrincipal().getpAdVerTodos().agregarFilaTabla(especialista.getNombre(),
                        especialista.getCorreo());
            }
        }
    }
}
