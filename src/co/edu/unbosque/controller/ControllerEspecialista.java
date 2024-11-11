package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

/**
 * Controlador encargado de gestionar las acciones y funcionalidades específicas
 * para el perfil de especialista, tales como la visualización de turnos, citas y
 * solicitudes de cambio de turno.
 * 
 * @autor Samuel Diaz
 */
public class ControllerEspecialista implements ActionListener {

    /**
     * Controlador principal de la aplicación para la gestión centralizada de acciones.
     */
    private Controller controllerPrincipal;

    /**
     * Ventana principal de la interfaz gráfica, que contiene los paneles del perfil
     * especialista y otros elementos de la interfaz de usuario.
     */
    private VentanaPrincipal ventanaP;

    /**
     * Ventana de diálogos emergentes para mostrar mensajes informativos o de error.
     */
    private VistaVentanasEmergentes vistaE;

    /**
     * Objeto Especialista que representa al especialista actualmente activo en el sistema.
     */
    private Especialista especialista;

    /**
     * Constructor de la clase ControllerEspecialista. Inicializa el controlador y asigna
     * oyentes a los botones de la interfaz especialista.
     * 
     * @param controllerPrincipal El controlador principal de la aplicación
     * @param ventanaP La ventana principal de la interfaz gráfica
     * @param vistaE La ventana de diálogos emergentes para mostrar mensajes
     */
    public ControllerEspecialista(Controller controllerPrincipal, VentanaPrincipal ventanaP,
                                  VistaVentanasEmergentes vistaE) {
        this.controllerPrincipal = controllerPrincipal;
        this.ventanaP = ventanaP;
        this.vistaE = vistaE;
        asignarOyentes();
    }

    /**
     * Asigna oyentes de acción a los botones de los paneles de especialista en la interfaz,
     * para gestionar eventos de clic en los componentes de la interfaz de usuario del especialista.
     */
    public void asignarOyentes() {
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnTurnos().addActionListener(this);
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnMisPacientes().addActionListener(this);
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnVerMas().addActionListener(this);
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnCambiarTurno().addActionListener(this);
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnSolicitudTurno().addActionListener(this);
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnCerrarSesion().addActionListener(this);

        ventanaP.getpEPrincipal().getpVerMas().getBtnSubmit().addActionListener(this);
        ventanaP.getpEPrincipal().getpVerMas().getBtnAtras().addActionListener(this);

        ventanaP.getpEPrincipal().getpCambiarTurno().getBtnSubmit().addActionListener(this);

        ventanaP.getpEPrincipal().getpSolicitudTurno().getBtnAceptar().addActionListener(this);
        ventanaP.getpEPrincipal().getpSolicitudTurno().getBtnRechazar().addActionListener(this);
    }

    /**
     * Método para gestionar los eventos de acción de los botones del perfil especialista, 
     * tales como visualización de turnos, manejo de citas y cierre de sesión.
     * 
     * @param e Evento de acción que contiene el comando asociado al botón
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);
        switch (comando) {
            case "P_BOTONES_ESPECIALISTA_TURNOS":
                vistaE.mostrarInformacion("FATAL ERROR: NO SE PUDO MANDAR EL CORREO AUN", 0);
                break;
            case "P_BOTONES_ESPECIALISTA_MIS_PACIENTES":
                cambiarPanel(1);
                setearTableVerCitas(especialista.getCitas());
                break;
            case "P_BOTONES_ESPECIALISTA_VER_MAS":
                cambiarPanel(2);
                break;
            case "P_BOTONES_ESPECIALISTA_CAMBIAR_TURNO":
                cambiarPanel(3);
                break;
            case "P_BOTONES_ESPECIALISTA_SOLICITUD_TURNO":
                cambiarPanel(4);
                break;
            case "P_BOTONES_ESPECIALISTA_CERRAR_SESION":
                cambiarPanel(1);
                controllerPrincipal.cerrarSesiones(1);
                break;
            case "P_VER_MAS_ESPECIALISTA_ATRAS":
                cambiarPanel(1);
                break;
            case "P_VER_MAS_ESPECIALISTA_SUBMIT":
                cambiarPanel(1);
                vistaE.mostrarInformacion("FATAL ERROR: AUN NO HAY CAMBIOS", 0);
                break;
            case "P_CAMBIAR_TURNO_ESPECIALISTA_SUBMIT":
                cambiarPanel(1);
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 0);
                break;
            case "P_SOLICITUD_TURNO_ESPECIALISTA_ACEPTAR":
                cambiarPanel(1);
                vistaE.mostrarInformacion("Haz aceptado el turno de tu compañero .:Nombre:. mas info al correo", 1);
                break;
            case "P_SOLICITUD_TURNO_ESPECIALISTA_RECHAZAR":
                cambiarPanel(1);
                vistaE.mostrarInformacion("Haz rechazado el turno de tu compañero .:Nombre:. mas info al correo", 1);
                break;
            default:
                break;
        }
    }

    /**
     * Cambia la visibilidad de los paneles en la ventana principal según el índice especificado.
     * 
     * @param index Índice del panel al que se desea cambiar la visibilidad
     */
    public void cambiarPanel(int index) {
        ventanaP.getpEPrincipal().cambiarVisibilidad(index);
    }

    /**
     * Establece el objeto Especialista actual, actualiza la vista con su información y
     * muestra la lista de citas asignadas al especialista.
     * 
     * @param especialista El objeto Especialista con los datos del especialista actual
     */
    public void setearDatosEspecialista(Especialista especialista) {
        this.especialista = especialista;
        ventanaP.getpEPrincipal().getpBotonesEspecialista().getLblNombreEspecialista()
                .setText(this.especialista.getNombre());
        setearTableVerCitas(this.especialista.getCitas());
    }

    /**
     * Llena la tabla en la interfaz de usuario con la lista de citas especificada.
     * 
     * @param citas Lista de objetos Cita para mostrar en la tabla
     */
    public void setearTableVerCitas(ArrayList<Cita> citas) {
        ventanaP.getpEPrincipal().getpMisPacientes().limpiarTabla();
        if (citas.size() == 0) {
            vistaE.mostrarInformacion("No tiene citas agendadas aun", 1);
        } else {
            for (Cita cita : citas) {
                ventanaP.getpEPrincipal().getpMisPacientes().agregarFilaTabla(cita.getNombrePaciente(),
                        cita.getFecha().toString(),
                        cita.getHoraInicio().toString() + " - " + cita.getHoraFinal().toString());
            }
        }
    }
}
