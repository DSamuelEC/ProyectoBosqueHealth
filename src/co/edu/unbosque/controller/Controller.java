package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller implements ActionListener {

	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;

	public Controller() {
		ventanaP = new VentanaPrincipal();
		vistaE = new VistaVentanasEmergentes();
		asignarOyentes();
	}

	public void asignarOyentes() {
//		Accesos
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

//		Especialista
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

	public void run() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);

		switch (comando) {
//		ACCESOS
		case "P_ACCESO_USUARIO":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESO_ESPECIALISTA":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(4);
			break;
		case "P_ACCESO_ADMIN":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(5);
			break;
		case "P_ACCESOPACIENTE_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOPACIENTE_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Paciente .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(2);
			break;
		case "P_ACCESOPACIENTE_CREARUSUARIO":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(3);
			break;
		case "P_ACCESOSCREARPACIENTE_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESOSCREARPACIENTE_SUBMIT":
			vistaE.mostrarInformacion("Paciente creado con exito. Por favor loguese", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESOESPECIALISTA_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOESPECIALISTA_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Especialista .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(3);
			break;
		case "P_ACCESOADMIN_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOADMIN_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Admin .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(4);
			break;

//			ESPECIALISTA
		case "P_BOTONES_ESPECIALISTA_TURNOS":
			vistaE.mostrarInformacion("FATAL ERROR: NO SE PUDO MANDAR EL CORREO AUN", 0);
			break;
		case "P_BOTONES_ESPECIALISTA_MIS_PACIENTES":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			break;
		case "P_BOTONES_ESPECIALISTA_VER_MAS":
			ventanaP.getpEPrincipal().cambiarVisibilidad(2);
			break;
		case "P_BOTONES_ESPECIALISTA_CAMBIAR_TURNO":
			ventanaP.getpEPrincipal().cambiarVisibilidad(3);
			break;
		case "P_BOTONES_ESPECIALISTA_SOLICITUD_TURNO":
			ventanaP.getpEPrincipal().cambiarVisibilidad(4);
			break;
		case "P_BOTONES_ESPECIALISTA_CERRAR_SESION":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
			ventanaP.cambiarVisibilidad(1);
			break;
		case "P_VER_MAS_ESPECIALISTA_ATRAS":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			break;
		case "P_VER_MAS_ESPECIALISTA_SUBMIT":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("FATAL ERROR: AUN NO HAY CAMBIOS", 0);
			break;
		case "P_CAMBIAR_TURNO_ESPECIALISTA_SUBMIT":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("FUNCION NO IMPLEMENTADA", 0);
			break;
		case "P_SOLICITUD_TURNO_ESPECIALISTA_ACEPTAR":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("Haz aceptado el turno de tu compañero .:Nombre:. mas info al correo", 1);
			break;
		case "P_SOLICITUD_TURNO_ESPECIALISTA_RECHAZAR":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("Haz rechazado el turno de tu compañero .:Nombre:. mas info al correo", 1);
			break;
		default:
			break;
		}
	}
}
