package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerPaciente implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;
	private Paciente paciente;

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
			break;
		case "P_CREAR_O_ACTUALIZAR_PACIENTE_AGENDAR":
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
}
