package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller {
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;
	private ControllerAccesos controllerAccesos;
	private ControllerPaciente controllerPaciente;
	private ControllerEspecialista controllerEspecialista;
	private ControllerAdmin controllerAdmin;

	public Controller() {
		ventanaP = new VentanaPrincipal();
		vistaE = new VistaVentanasEmergentes();
		controllerAccesos = new ControllerAccesos(this, ventanaP, vistaE);
		controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
		controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
		controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
//		mostrarAccesos();
	}

	public void run() {
	}

	public void mostrarAccesos() {

	}
}
