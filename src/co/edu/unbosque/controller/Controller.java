package co.edu.unbosque.controller;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.model.Paciente;
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
		controllerAccesos = new ControllerAccesos(this, ventanaP);
		controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
		controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
		controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
		hospital.actualizarBD();
		hospital.verTodos();
	}

	public void run() {
	}

	public void capturarDatosCrearPersonas(String nombre, long cedula, String correo, String sexo, int edad, String rol,
			String especialidad) {
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
				vistaE.mostrarInformacion("Se creo con exito UN PACIENTE, por favor logueese", 2);
				controllerAccesos.cambiarPanel(2);
			} else {
//				manejo de errores
			}
			break;
		case "ESPECIALISTA":
			EspecialistaDTO especialistaDto = new EspecialistaDTO();
			especialistaDto.setNombre(nombre);
			especialistaDto.setEspecializacion(especialidad);
			especialistaDto.setCedula(cedula);
			especialistaDto.setCorreo(correo);
			especialistaDto.setSexo(sexo);
			especialistaDto.setEdad(edad);
			especialistaDto.setRol(rol);
			personadto = especialistaDto;
//			VALIDACIONES DE SI SE PUDO CREAR O NO, Y MANEJAR LOS CASOS EXCEPCIONALES
			if (hospital.crearPersona(personadto)) {
				vistaE.mostrarInformacion("Se creo con exito UN ESPECIALISTA", 2);
				controllerAdmin.cambiarPanel(1);
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
				vistaE.mostrarInformacion("Se creo con exito UN ADMIN, por favor logueese", 2);
				controllerAccesos.cambiarPanel(2);
			} else {
//				manejo de errores
			}
			break;
		default:
			break;
		}
	}

	public void capturarDatosLogin(String nombre, long cedula, String rol, int index) {
		String mensaje = hospital.find(nombre, cedula, rol);
		if (mensaje == "ACESSO CONCEDIDO") {
			vistaE.mostrarInformacion(mensaje, 2);
			controllerAccesos.cambiarPanel(1);
			ventanaP.cambiarVisibilidad(index);
			switch (rol) {
			case "PACIENTE":
				controllerPaciente.setearDatosPaciente((Paciente) hospital.getPersona());
				break;
			case "ADMIN":
				System.out.println(((Admin) hospital.getPersona()).toString());
				controllerAdmin.setearDatosAdmin((Admin) hospital.getPersona());
				break;
			default:
				break;
			}
		} else {
			vistaE.mostrarInformacion(mensaje, 1);
		}
	}
}
