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
			ventanaP.cambiarVisibilidad(3);
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
			
//			ESPECIALISTA
		case "P_BOTONES_ESPECIALISTA_TURNOS":
//			debe mostrar en un popup si se mando al correo o no sus turnos del mes
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
			ventanaP.cambiarVisibilidad(1);
//			debe cerrar sesion y mandarme al accesos
			break;
		case "P_VER_MAS_ESPECIALISTA_ATRAS":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
			break;
		case "P_VER_MAS_ESPECIALISTA_SUBMIT":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
//			mostrar un popup diciendo si se hicieron los cambios o no 
			break;
		case "P_CAMBIAR_TURNO_ESPECIALISTA_SUBMIT":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
//			mostrar un popup diciendo si se pudo pedir un cambio de turno o no 
			break;
		case "P_SOLICITUD_TURNO_ESPECIALISTA_ACEPTAR":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
//			mostrar un popup diciendo si se pudo aceptar un cambio de turno o no y avisando que se envia al correo la informacion 
			break;
		case "P_SOLICITUD_TURNO_ESPECIALISTA_RECHAZAR":
			ventanaP.getpEPrincipal().cambiarVisibilidad(1);
//			mostrar un popup diciendo si se pudo rechazar un cambio de turno o no y avisando que se envia al correo la informacion
			break;
		default:
			break;
		}
	}
}
