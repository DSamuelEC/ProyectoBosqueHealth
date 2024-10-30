package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ventanaP;

	public Controller() {
		ventanaP = new VentanaPrincipal();
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
		/**
		 * e -> { // mostrar un popup que diga si se mandó el correo con sus turnos o no
		 * }
		 */
		ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnMisPacientes().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpSolicitudTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(true); }
		 */
		ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnVerMas().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpSolicitudTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(false);
		 * ventanaP.getpEPrincipal().getpVerMas().setVisible(true); }
		 */
		ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnCambiarTurno().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpSolicitudTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(false);
		 * ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(true); // popup de si
		 * se envió el cambio de turno }
		 */
		ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnSolicitudTurno().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpMisPacientes().setVisible(false);
		 * ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpSolicitudTurno().setVisible(true); // popup de
		 * si se acepto o rechazo el turno }
		 */
		ventanaP.getpEPrincipal().getpBotonesEspecialista().getBtnCerrarSesion().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpSolicitudTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(true);
		 * ventanaP.getpEPrincipal().setVisible(false);
		 * ventanaP.getpAccesosPrincipal().setVisible(true); }
		 */
		ventanaP.getpEPrincipal().getpVerMas().getBtnSubmit().addActionListener(this);
		/**
		 * e -> { // popup de que ya se cambió los datos, sino se cambian mostrar error
		 * ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(true); }
		 */
		ventanaP.getpEPrincipal().getpVerMas().getBtnAtras().addActionListener(this);
		/**
		 * e -> { ventanaP.getpEPrincipal().getpVerMas().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(true); }
		 */
		ventanaP.getpEPrincipal().getpCambiarTurno().getBtnSubmit().addActionListener(this);
		/**
		 * e -> { // popup de que pidio el cambio de turno bien
		 * ventanaP.getpEPrincipal().getpCambiarTurno().setVisible(false);
		 * ventanaP.getpEPrincipal().getpMisPacientes().setVisible(true); }
		 */
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
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
//			debe mostrar el popup de si se pudo ingresar o no, si si entonces se pone 
//			visible el panel 1 por defecto para que al cerrar sesion aparezca desde ese panel ya visible, 
//			y luego se oculta el panel contenedor de todos los de accesos
			break;
		case "P_ACCESOPACIENTE_CREARUSUARIO":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(3);
			break;
		case "P_ACCESOSCREARPACIENTE_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESOSCREARPACIENTE_SUBMIT":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
//			si se creo bien el paciente, mostrar un popup de que se creo bien, y si si 
//			entonces se devuelve automaticamente al login para que pueda ingresar con sus datos e ingresar
			break;
		case "P_ACCESOESPECIALISTA_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOESPECIALISTA_SUBMIT":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
//			debe mostrar el popup de si se pudo ingresar o no, si si entonces se pone 
//			visible el panel 1 por defecto para que al cerrar sesion aparezca desde ese panel ya visible, 
//			y luego se oculta el panel contenedor de todos los de accesos
			break;
		case "P_ACCESOADMIN_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOADMIN_SUBMIT":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
//			debe mostrar el popup de si se pudo ingresar o no, si si entonces se pone 
//			visible el panel 1 por defecto para que al cerrar sesion aparezca desde ese panel ya visible, 
//			y luego se oculta el panel contenedor de todos los de accesos
			break;
		default:
			break;
		}
	}
}
