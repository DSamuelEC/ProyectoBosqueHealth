package co.edu.unbosque.controller;

import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.model.persistence.AdminDTO;
import co.edu.unbosque.model.persistence.EspecialistaDTO;
import co.edu.unbosque.model.persistence.PacienteDTO;
import co.edu.unbosque.model.persistence.PersonaDTO;
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
		hospital = new Hospital();
		ventanaP = new VentanaPrincipal();
		vistaE = new VistaVentanasEmergentes();
		controllerAccesos = new ControllerAccesos(this, ventanaP, vistaE);
		controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
		controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
		controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
		hospital.actualizarBD();
	}

	public void run() {
	}

	public void capturarDatosCrearPersonas(String nombre, int cedula, String correo, String sexo, int edad,
			String rol) {
		PersonaDTO personadto;
		switch (rol) {
		case "PACIENTE":
			personadto = new PacienteDTO();
			personadto.setNombre(nombre);
			personadto.setCedula(cedula);
			personadto.setCorreo(correo);
			personadto.setSexo(sexo);
			personadto.setEdad(edad);
			personadto.setRol(rol);
			if (hospital.crearPersona(personadto)) {
				controllerAccesos.mostrarVentanaEmergente("Se creo con exito, por favor logueese", 2);
				controllerAccesos.cambiarPanel(2);
			} else {
//				manejo de errores
			}
			break;
		case "ESPECIALISTA":
			personadto = new EspecialistaDTO();
			personadto.setNombre(nombre);
			personadto.setCedula(cedula);
			personadto.setCorreo(correo);
			personadto.setSexo(sexo);
			personadto.setEdad(edad);
			personadto.setRol(rol);
//			VALIDACIONES DE SI SE PUDO CREAR O NO, Y MANEJAR LOS CASOS EXCEPCIONALES
			if (hospital.crearPersona(personadto)) {
				controllerAccesos.mostrarVentanaEmergente("Se creo con exito, por favor logueese", 2);
				controllerAccesos.cambiarPanel(2);
			} else {
//				manejo de errores
			}
			break;
		case "ADMIN":
			personadto = new AdminDTO();
			personadto.setNombre(nombre);
			personadto.setCedula(cedula);
			personadto.setCorreo(correo);
			personadto.setSexo(sexo);
			personadto.setEdad(edad);
			personadto.setRol(rol);
//			VALIDACIONES DE SI SE PUDO CREAR O NO, Y MANEJAR LOS CASOS EXCEPCIONALES, IGUAL AMDIN SOLO HAY 1
			if (hospital.crearPersona(personadto)) {
				controllerAccesos.mostrarVentanaEmergente("Se creo con exito, por favor logueese", 2);
				controllerAccesos.cambiarPanel(2);
			} else {
//				manejo de errores
			}
			break;
		default:
			break;
		}
	}

	public void capturarDatosLogin(String nombre, int cedula, String rol, int index) {
		String mensaje = hospital.find(nombre, cedula, rol);
		if (mensaje == "ACESSO CONCEDIDO") {
			controllerAccesos.mostrarVentanaEmergente(mensaje, 2);
			controllerAccesos.cambiarPanel(2);
			ventanaP.cambiarVisibilidad(index);
		} else {
			controllerAccesos.mostrarVentanaEmergente(mensaje, 1);
		}
	}
}
