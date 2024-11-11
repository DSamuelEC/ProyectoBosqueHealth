package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

/**
 * Controlador encargado de gestionar las acciones y funcionalidades especificas
 * para el perfil de paciente, tales como agendar citas, ver citas y examenes,
 * y cerrar sesion.
 * 
 * @author Samuel Diaz
 */
public class ControllerPaciente implements ActionListener {

    /**
     * Controlador principal de la aplicacion para la gestion centralizada de acciones.
     */
    private Controller controllerPrincipal;

    /**
     * Ventana principal de la interfaz grafica, que contiene los paneles del perfil
     * paciente y otros elementos de la interfaz de usuario.
     */
    private VentanaPrincipal ventanaP;

    /**
     * Ventana de dialogos emergentes para mostrar mensajes informativos o de error.
     */
    private VistaVentanasEmergentes vistaE;

    /**
     * Objeto Paciente que representa al paciente actualmente activo en el sistema.
     */
    private Paciente paciente;

    /**
     * Especialista seleccionado para la cita que se va a agendar.
     */
    private Especialista especialistaSeleccionado;

    /**
     * Fecha seleccionada para la cita que se va a agendar.
     */
    private LocalDate fechaSeleccionada;

    /**
     * Constructor de la clase ControllerPaciente. Inicializa el controlador y asigna
     * oyentes a los botones de la interfaz paciente.
     * 
     * @param controllerPrincipal El controlador principal de la aplicacion
     * @param ventanaP La ventana principal de la interfaz grafica
     * @param vistaE La ventana de dialogos emergentes para mostrar mensajes
     */
    public ControllerPaciente(Controller controllerPrincipal, VentanaPrincipal ventanaP,
                              VistaVentanasEmergentes vistaE) {
        this.controllerPrincipal = controllerPrincipal;
        this.ventanaP = ventanaP;
        this.vistaE = vistaE;
        asignarOyentes();
    }

    /**
     * Asigna oyentes de accion a los botones de los paneles de paciente en la interfaz,
     * para gestionar eventos de clic en los componentes de la interfaz de usuario del paciente.
     */
    public void asignarOyentes() {
        ventanaP.getpPPrincipal().getpPSuperior().getBtnAgendarCita().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnVerCitas().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnVerExamenes().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnVerMas().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnReagendarCita().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnCancelarCita().addActionListener(this);
        ventanaP.getpPPrincipal().getpPSuperior().getBtnCerrarSesion().addActionListener(this);

        ventanaP.getpPPrincipal().getpPVerMas().getBtnTratamiento().addActionListener(this);
        ventanaP.getpPPrincipal().getpPVerMas().getBtnExamenes().addActionListener(this);
        ventanaP.getpPPrincipal().getpPVerMas().getBtnResultadoExamen().addActionListener(this);

        ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getBtnAgendar().addActionListener(this);
        ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getBtnBuscarDisponibilidad().addActionListener(this);
        ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getTblCrearOActualizar().getSelectionModel()
                .addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        if (!event.getValueIsAdjusting()) {
                            int selectedRow = ventanaP.getpPPrincipal().getpPCrearOActualizarCita()
                                    .getTblCrearOActualizar().getSelectedRow();

                            if (selectedRow != -1) {
                                String nombreEspecialista = ventanaP.getpPPrincipal().getpPCrearOActualizarCita()
                                        .getTblCrearOActualizar().getValueAt(selectedRow, 0).toString();
                                String especialidad = ventanaP.getpPPrincipal().getpPCrearOActualizarCita()
                                        .getTblCrearOActualizar().getValueAt(selectedRow, 1).toString();
                                String fecha = ventanaP.getpPPrincipal().getpPCrearOActualizarCita()
                                        .getTblCrearOActualizar().getValueAt(selectedRow, 2).toString();

                                for (Especialista esp : controllerPrincipal.traerTodosLosEspecialistas()) {
                                    if (esp.getNombre().equals(nombreEspecialista)
                                            && esp.getEspecializacion().equals(especialidad)) {
                                        especialistaSeleccionado = esp;
                                        fechaSeleccionada = LocalDate.parse(fecha);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                });
    }

    /**
     * Metodo para gestionar los eventos de accion de los botones del perfil paciente,
     * tales como agendar citas, ver citas y examenes, y cerrar sesion.
     * 
     * @param e Evento de accion que contiene el comando asociado al boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);
        switch (comando) {
            case "P_SUPERIOR_PACIENTE_VER_CITAS":
                cambiarPanel(1);
                setearTableCitas(paciente.getCitas(), "CITAS");
                break;
            case "P_SUPERIOR_PACIENTE_VER_EXAMENES":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_SUPERIOR_PACIENTE_AGENDAR_CITA":
                cambiarPanel(2);
                break;
            case "P_SUPERIOR_PACIENTE_REAGENDAR_CITA":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_SUPERIOR_PACIENTE_CANCELAR_CITA":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_SUPERIOR_PACIENTE_CERRAR_SESION":
                cambiarPanel(1);
                controllerPrincipal.cerrarSesiones(1);
                break;
            case "P_SUPERIOR_PACIENTE_VER_MAS":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                cambiarPanel(3);
                break;
            case "P_VER_MAS_PACIENTE_TRATAMIENTO":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_VER_MAS_PACIENTE_EXAMENES":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_VER_MAS_PACIENTE_RESULTADO_EXAMEN":
                vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 1);
                break;
            case "P_CREAR_O_ACTUALIZAR_PACIENTE_BUSCAR_DISPONIBILIDAD":
                mostrarDisponibilidad();
                break;
            case "P_CREAR_O_ACTUALIZAR_PACIENTE_AGENDAR":
                asignarCita(fechaSeleccionada);
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
        ventanaP.getpPPrincipal().cambiarVisibilidad(index);
    }

    /**
     * Establece el objeto Paciente actual, actualiza la vista con su informacion y
     * muestra la lista de citas asignadas al paciente.
     * 
     * @param paciente El objeto Paciente con los datos del paciente actual
     */
    public void setearDatosPaciente(Paciente paciente) {
        this.paciente = paciente;
        ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText(this.paciente.getNombre());
        setearTableCitas(this.paciente.getCitas(), "CITAS");
    }

    /**
     * Llena la tabla en la interfaz de usuario con la lista de citas especificada.
     * 
     * @param citas Lista de objetos Cita para mostrar en la tabla
     * @param tipo Tipo de informacion a mostrar en la tabla (Citas o Examenes)
     */
    public void setearTableCitas(ArrayList<Cita> citas, String tipo) {
        ventanaP.getpPPrincipal().getpPVerCitasOExamen().limpiarTabla();
        if (citas.size() == 0) {
            vistaE.mostrarInformacion("No existen " + tipo + " asignadas aun", 1);
        } else {
            for (Cita cita : citas) {
                ventanaP.getpPPrincipal().getpPVerCitasOExamen().agregarFilaTabla(cita.getNombreEspecialista(),
                        cita.getEspecialidad(), cita.getFecha().toString(), cita.getHoraInicio().toString(),
                        cita.getHoraFinal().toString());
            }
        }
    }

    /**
     * Llena la tabla en la interfaz de usuario con los especialistas disponibles para la fecha seleccionada.
     * 
     * @param especialistasDisponibles Lista de especialistas disponibles
     * @param fecha Fecha para la cual se muestran los especialistas disponibles
     */
    public void setearTableCrearCitas(ArrayList<Especialista> especialistasDisponibles, LocalDate fecha) {
        ventanaP.getpPPrincipal().getpPCrearOActualizarCita().limpiarTabla();
        if (especialistasDisponibles.size() == 0) {
            vistaE.mostrarInformacion("No hay especialistas disponibles para la fecha seleccionada", 1);
        } else {
            for (Especialista especialista : especialistasDisponibles) {
                ventanaP.getpPPrincipal().getpPCrearOActualizarCita().agregarFilaTabla(especialista.getNombre(),
                        especialista.getEspecializacion(), fecha.toString());
            }
        }
    }

    /**
     * Muestra la disponibilidad de especialistas segun la fecha y especialidad seleccionadas.
     */
    public void mostrarDisponibilidad() {
        String fecha = ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getTxtDigiteFecha().getText();
        LocalDate fechaSeleccionada = LocalDate.parse(fecha);
        String especialidadSeleccionada = ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getLdAreas()
                .getSelectedItem().toString();

        ArrayList<Especialista> disponibles = controllerPrincipal.traerEspecialistasToPaciente(fechaSeleccionada,
                especialidadSeleccionada);
        setearTableCrearCitas(disponibles, fechaSeleccionada);
    }

    /**
     * Asigna una nueva cita al paciente con el especialista seleccionado y actualiza los datos en el sistema.
     * 
     * @param fecha Fecha de la cita a asignar
     */
    public void asignarCita(LocalDate fecha) {
        if (especialistaSeleccionado != null) {
            LocalTime horaInicioTurno = LocalTime.of(7, 0);
            int citasEnFecha = 0;

            for (Cita cita : especialistaSeleccionado.getCitas()) {
                if (cita.getFecha().isEqual(fecha)) {
                    citasEnFecha++;
                }
            }

            LocalTime horaInicial = horaInicioTurno.plusHours(citasEnFecha);
            LocalTime horaFinal = horaInicial.plusHours(1);
            Cita nuevaCita = new Cita(fecha, horaInicial, horaFinal, paciente.getNombre(), paciente.getCorreo(),
                    especialistaSeleccionado.getNombre(), especialistaSeleccionado.getCorreo(),
                    especialistaSeleccionado.getEspecializacion(), null, null, null);
            especialistaSeleccionado.getCitas().add(nuevaCita);
            paciente.getCitas().add(nuevaCita);
            controllerPrincipal.actualizarPersona(especialistaSeleccionado);
            controllerPrincipal.actualizarPersona(paciente);
        } else {
            vistaE.mostrarInformacion("No se pudo asignar Cita", 2);
        }
    }
}
