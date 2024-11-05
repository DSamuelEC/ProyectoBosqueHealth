package co.edu.unbosque.controller;

import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller {
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;
	private ControllerAccesos controllerAccesos;
	private ControllerPaciente controllerPaciente;
	private ControllerEspecialista controllerEspecialista;
	private ControllerAdmin controllerAdmin;
	private Hospital hospital;

	public Controller() {
		hospital = new  Hospital();
		ventanaP = new VentanaPrincipal();
		vistaE = new VistaVentanasEmergentes();
		controllerAccesos = new ControllerAccesos(this, ventanaP, vistaE);
		controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
		controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
		controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
	}

	public void run() {
	}

	public void capturarDaatosCrearPersonas(String nombre, int cedula, String correo, String sexo, int edad,
			String rol) {
		switch (rol) {
		case "PACIENTE":
			boolean creado = hospital.crearPaciente(nombre, cedula, correo, sexo, edad);
			if (creado) {
				controllerAccesos.cambiarPanel(2);
			}
			break;

		default:
			break;
		}
	}
}
