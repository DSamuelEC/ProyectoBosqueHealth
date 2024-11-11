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
import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerPaciente implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;
	private Paciente paciente;
	private Especialista especialistaSeleccionado;
	private LocalDate fechaSeleccionada;

	public ControllerPaciente(Controller controllerPrincipal, VentanaPrincipal ventanaP,
			VistaVentanasEmergentes vistaE) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		this.vistaE = vistaE;
		asignarOyentes();
	}

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
						if (!event.getValueIsAdjusting()) { // Verifica que el evento no se esté ajustando
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		switch (comando) {
		case "P_SUPERIOR_PACIENTE_VER_CITAS":
			cambiarPanel(1);
			break;
		case "P_SUPERIOR_PACIENTE_VER_EXAMENES":
			ventanaP.getpPPrincipal().cambiarVisibilidad(1);
			break;
		case "P_SUPERIOR_PACIENTE_AGENDAR_CITA":
			cambiarPanel(2);
//			ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText("ola");
			break;
		case "P_SUPERIOR_PACIENTE_REAGENDAR_CITA":
			ventanaP.getpPPrincipal().cambiarVisibilidad(2);
			break;
		case "P_SUPERIOR_PACIENTE_CANCELAR_CITA":
			ventanaP.getpPPrincipal().cambiarVisibilidad(2);
			break;
		case "P_SUPERIOR_PACIENTE_CERRAR_SESION":
			cambiarPanel(1);
			vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
			ventanaP.cambiarVisibilidad(1);
			break;
		case "P_SUPERIOR_PACIENTE_VER_MAS":
			cambiarPanel(3);
			break;
		case "P_VER_MAS_PACIENTE_TRATAMIENTO":
//			mostrar popup con informacion
			break;
		case "P_VER_MAS_PACIENTE_EXAMENES":
//			mostrar popup con informacion
			break;
		case "P_VER_MAS_PACIENTE_RESULTADO_EXAMEN":
//			mostrar popup con informacion
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

	public void cambiarPanel(int index) {
		ventanaP.getpPPrincipal().cambiarVisibilidad(index);
	}

	public void setearDatosPaciente(Paciente paciente) {
		this.paciente = paciente;
		ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText(this.paciente.getNombre());
		setearTableCitas(this.paciente.getCitas(), "CITAS");
	}

	public void setearTableCitas(ArrayList<Cita> citas, String tipo) {
		ventanaP.getpPPrincipal().getpPVerCitasOExamen().limpiarTabla();
		if (citas.size() == 0) {
			vistaE.mostrarInformacion("No existen " + tipo + " asignadas aun", 1);
		} else {
			ventanaP.getpPPrincipal().getpPVerCitasOExamen().cambiarEncabezado(0, tipo);
			for (Cita cita : citas) {
				ventanaP.getpPPrincipal().getpPVerCitasOExamen().agregarFilaTabla(cita.getNombreEspecialista(),
						cita.getEspecialidad(), cita.getFecha().toString(), cita.getHoraInicio().toString(),
						cita.getHoraFinal().toString());
			}
		}
	}

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

	public void mostrarDisponibilidad() {
		String fecha = ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getTxtDigiteFecha().getText();
		LocalDate fechaSeleccionada = LocalDate.parse(fecha);
		String especialidadSeleccionada = ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getLdAreas()
				.getSelectedItem().toString();

		ArrayList<Especialista> disponibles = controllerPrincipal.traerEspecialistasToPaciente(fechaSeleccionada,
				especialidadSeleccionada);
		setearTableCrearCitas(disponibles, fechaSeleccionada);
	}

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
