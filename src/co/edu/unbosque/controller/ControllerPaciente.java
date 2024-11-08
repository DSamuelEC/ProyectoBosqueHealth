package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerPaciente implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;

	public ControllerPaciente(Controller controllerPrincipal, VentanaPrincipal ventanaP,
			VistaVentanasEmergentes vistaE) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		this.vistaE = vistaE;
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaP.getpPPrincipal().getpPSuperior().getBtnAgendarCita().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnCancelarCita().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnCerrarSesion().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnReagendarCita().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnVerCitas().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnVerExamenes().addActionListener(this);
		ventanaP.getpPPrincipal().getpPSuperior().getBtnVerMas().addActionListener(this);

		ventanaP.getpPPrincipal().getpPVerMas().getBtnAtras().addActionListener(this);
		ventanaP.getpPPrincipal().getpPVerMas().getBtnExamenes().addActionListener(this);
		ventanaP.getpPPrincipal().getpPVerMas().getBtnResultadoExamen().addActionListener(this);
		ventanaP.getpPPrincipal().getpPVerMas().getBtnSubmit().addActionListener(this);
		ventanaP.getpPPrincipal().getpPVerMas().getBtnTratamiento().addActionListener(this);

		ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getBtnAgendar().addActionListener(this);
		ventanaP.getpPPrincipal().getpPCrearOActualizarCita().getBtnBuscarDisponibilidad().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		switch (comando) {
		case "P_SUPERIOR_PACIENTE_VER_CITAS":
			ventanaP.getpPPrincipal().cambiarVisibilidad(1);
			break;
		/*
		 * case "P_SUPERIOR_PACIENTE_VER_EXAMENES":
		 * ventanaP.getpPPrincipal().cambiarVisibilidad(1); break;
		 */
		case "P_SUPERIOR_PACIENTE_AGENDAR_CITA":
			ventanaP.getpPPrincipal().cambiarVisibilidad(2);
//			ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText("ola");
			break;
		/*
		 * case "P_SUPERIOR_PACIENTE_REAGENDAR_CITA":
		 * ventanaP.getpPPrincipal().cambiarVisibilidad(2); break; case
		 * "P_SUPERIOR_PACIENTE_CANCELAR_CITA":
		 * ventanaP.getpPPrincipal().cambiarVisibilidad(2); break;
		 */
		case "P_SUPERIOR_PACIENTE_CERRAR_SESION":
			ventanaP.getpPPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
			ventanaP.cambiarVisibilidad(1);
			break;
		case "P_SUPERIOR_PACIENTE_VER_MAS":
			ventanaP.getpPPrincipal().cambiarVisibilidad(3);
			break;
		case "P_VER_MAS_PACIENTE_ATRAS":
			ventanaP.getpPPrincipal().cambiarVisibilidad(1);
			break;
		case "P_VER_MAS_PACIENTE_SUBMIT":
			ventanaP.getpPPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("FATAL ERROR: AUN NO HAY CAMBIOS", 0);
			break;
		default:
			break;
		}
	}

	public void setearDatosPaciente(Paciente persona) {
		ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText(persona.getNombre());
		ventanaP.getpPPrincipal().getpPSuperior().getLblNombre().setText(persona.getNombre());
		
	}
}
