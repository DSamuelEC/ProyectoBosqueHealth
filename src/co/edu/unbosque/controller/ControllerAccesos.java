package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.view.VentanaPrincipal;

/**
 * Controlador encargado de gestionar los accesos y cambios de paneles
 * en la interfaz de usuario de la aplicación, asignando oyentes a los botones
 * y procesando las acciones relacionadas con accesos de usuario, especialista
 * y administrador.
 * 
 * @author Samuel Diaz
 */
public class ControllerAccesos implements ActionListener {

    /**
     * Controlador principal de la aplicación, encargado de procesar datos y 
     * realizar acciones de negocio.
     */
    private Controller controllerPrincipal;

    /**
     * Ventana principal de la interfaz gráfica, que contiene los paneles de acceso
     * y sus componentes.
     */
    private VentanaPrincipal ventanaP;

    /**
     * Constructor de la clase ControllerAccesos. Inicializa los atributos y asigna
     * oyentes a los botones de la ventana principal.
     * 
     * @param controllerPrincipal El controlador principal de la aplicación
     * @param ventanaP La ventana principal que contiene los paneles de acceso
     */
    public ControllerAccesos(Controller controllerPrincipal, VentanaPrincipal ventanaP) {
        this.controllerPrincipal = controllerPrincipal;
        this.ventanaP = ventanaP;
        asignarOyentes();
    }

    /**
     * Asigna oyentes de acción a los botones dentro de los paneles de acceso,
     * para gestionar eventos de clic en los diferentes componentes de la interfaz.
     */
    public void asignarOyentes() {
        ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnUsuario().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnEspecialista().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnAdmin().addActionListener(this);

        ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnAtras().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnCrearUsuario().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnSubmit().addActionListener(this);

        ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnAtras().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnSubmit().addActionListener(this);

        ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnAtras().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnSubmit().addActionListener(this);

        ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnAtras().addActionListener(this);
        ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnSubmit().addActionListener(this);
    }

    /**
     * Gestiona los eventos de acción de los botones de acceso, realizando
     * cambios de panel o capturando datos según el botón presionado.
     * 
     * @param e Evento de acción que contiene el comando asociado al botón
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);
        switch (comando) {
            case "P_ACCESO_USUARIO":
                cambiarPanel(2);
                break;
            case "P_ACCESO_ESPECIALISTA":
                cambiarPanel(4);
                break;
            case "P_ACCESO_ADMIN":
                cambiarPanel(5);
                break;
            case "P_ACCESOPACIENTE_ATRAS":
                cambiarPanel(1);
                break;
            case "P_ACCESOPACIENTE_SUBMIT":
                capturarAcceso(1);
                break;
            case "P_ACCESOPACIENTE_CREARUSUARIO":
                cambiarPanel(3);
                break;
            case "P_ACCESOSCREARPACIENTE_ATRAS":
                cambiarPanel(2);
                break;
            case "P_ACCESOSCREARPACIENTE_SUBMIT":
                capturarDatosCrearPaciente();
                break;
            case "P_ACCESOESPECIALISTA_ATRAS":
                cambiarPanel(1);
                break;
            case "P_ACCESOESPECIALISTA_SUBMIT":
                capturarAcceso(2);
                break;
            case "P_ACCESOADMIN_ATRAS":
                cambiarPanel(1);
                break;
            case "P_ACCESOADMIN_SUBMIT":
                capturarAcceso(3);
                break;
            default:
                break;
        }
    }

    /**
     * Cambia la visibilidad de los paneles en la ventana principal según el índice
     * especificado.
     * 
     * @param index Índice del panel al que se desea cambiar la visibilidad
     */
    public void cambiarPanel(int index) {
        ventanaP.getpAccesosPrincipal().cambiarVisibilidad(index);
    }

    /**
     * Captura los datos del formulario de creación de paciente y los envía al
     * controlador principal para su procesamiento y almacenamiento.
     */
    public void capturarDatosCrearPaciente() {
        String nombre = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtNombre().getText();
        long cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCedula().getText());
        String correo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCorreo().getText();
        String sexo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getLdSexo().getSelectedItem().toString();
        int edad = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtEdad().getText());
        controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "PACIENTE", null);
    }

    /**
     * Captura los datos del formulario de creación de administrador y los envía
     * al controlador principal para su procesamiento y almacenamiento.
     */
    public void capturarDatosCrearAdmin() {
        String nombre = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtNombre().getText();
        long cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCedula().getText());
        String correo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCorreo().getText();
        String sexo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getLdSexo().getSelectedItem().toString();
        int edad = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtEdad().getText());
        controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "ADMIN", null);
    }

    /**
     * Captura los datos de acceso de los usuarios y los envía al controlador
     * principal para validación.
     * 
     * @param index Índice que identifica el rol del usuario (1 = Paciente, 2 = Especialista, 3 = Administrador)
     */
    public void capturarAcceso(int index) {
        String nombre;
        long cedula;
        switch (index) {
            case 1:
                nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getTxtNombre().getText();
                cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getTxtCedula().getText());
                controllerPrincipal.capturarDatosLogin(nombre, cedula, "PACIENTE", 2);
                break;
            case 2:
                nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getTxtNombre().getText();
                cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getTxtCedula().getText());
                controllerPrincipal.capturarDatosLogin(nombre, cedula, "ESPECIALISTA", 3);
                break;
            case 3:
                nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getTxtNombre().getText();
                cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getTxtCedula().getText());
                controllerPrincipal.capturarDatosLogin(nombre, cedula, "ADMIN", 4);
                break;
            default:
                break;
        }
    }
}
