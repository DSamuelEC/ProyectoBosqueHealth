package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerAdmin implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;

	public ControllerAdmin(Controller controllerPrincipal, VentanaPrincipal ventanaP,
			VistaVentanasEmergentes vistaE) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		this.vistaE = vistaE;
		asignarOyentes();
	}

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

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		switch (comando) {
		case "P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(2);
			break;
		case "P_BOTONES_ADMIN_ASIGNAR_TURNOS":
			vistaE.mostrarInformacion("FATAL ERROR: NO SE PUDO MANDAR EL CORREO AUN", 0);
			break;
		case "P_BOTONES_ADMIN_VER_PACIENTES":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			break;
		case "P_BOTONES_ADMIN_VER_ESPECIALISTAS":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			break;
		case "P_BOTONES_ADMIN_REPORTES":
			vistaE.mostrarInformacion("FATAL ERROR: NO SE PUDO MANDAR EL CORREO AUN", 0);
			break;
		case "P_BOTONES_ADMIN_CONFIGURACIONES":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(3);
			break;
		case "P_BOTONES_ADMIN_CERRAR_SESION":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
			ventanaP.cambiarVisibilidad(1);
			break;
		case "P_AD_CONFIGURACIONES_ATRAS":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			break;
		case "P_AD_CONFIGURACIONES_SUBMIT":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("FATAL ERROR: AUN NO HAY CAMBIOS", 0);
		case "P_AD_REGISTRAR_ESPECIALISTA_ATRAS":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			break;
		case "P_AD_REGISTRAR_ESPECIALISTA_SUBMIT":
			ventanaP.getpAdPrincipal().cambiarVisibilidad(1);
			vistaE.mostrarInformacion("FATAL ERROR: AUN NO HAY CAMBIOS", 0);
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
}
