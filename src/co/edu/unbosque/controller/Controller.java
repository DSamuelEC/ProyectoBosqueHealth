package co.edu.unbosque.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.persistence.AdminDTO;
import co.edu.unbosque.model.persistence.EspecialistaDTO;
import co.edu.unbosque.model.persistence.MapHandler;
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
	private EmailService envioCorreos;

	public Controller() {
		hospital = new Hospital();
		ventanaP = new VentanaPrincipal();
		vistaE = new VistaVentanasEmergentes();
		envioCorreos = new EmailService("smtp.gmail.com", 587, "bosquehealthapp8@gmail.com", "nljl rlsz mods rpov");
		controllerAccesos = new ControllerAccesos(this, ventanaP);
		controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
		controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
		controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
	}

	public void run() {
		hospital.actualizarBD();
		hospital.verTodos();
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
			case "ESPECIALISTA":
				controllerEspecialista.setearDatosEspecialista((Especialista) hospital.getPersona());
				break;
			case "ADMIN":
				controllerAdmin.setearDatosAdmin((Admin) hospital.getPersona());
				break;
			default:
				break;
			}
		} else {
			vistaE.mostrarInformacion(mensaje, 1);
		}
	}

	public void cerrarSesiones(int index) {
		vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
		ventanaP.cambiarVisibilidad(index);
	}

	public void actualizarLaDBConEspecialistas(ArrayList<Especialista> especialistas) {
		int bandera = 1;
		PersonaDTO personadto;
		EspecialistaDTO especialistaDto = new EspecialistaDTO();
		for (Especialista especialista : especialistas) {
			especialistaDto.setNombre(especialista.getNombre());
			especialistaDto.setEspecializacion(especialista.getEspecializacion());
			especialistaDto.setCedula(especialista.getCedula());
			especialistaDto.setCorreo(especialista.getCorreo());
			especialistaDto.setSexo(especialista.getSexo());
			especialistaDto.setEdad(especialista.getEdad());
			especialistaDto.setRol(especialista.getRol());
			especialistaDto.setTurnos(MapHandler.convertirTurnoToTurnoDTO(especialista.getTurnos()));
			personadto = especialistaDto;

			if (hospital.actualizarPersona(personadto)) {
				System.out.println("SE ASIGNARON TURNOS AUTOMATICAMENTE!!!");
				bandera++;
				vistaE.mostrarInformacion("Se actualizo correctamente a " + especialista.getNombre(), 2);
			}
		}
		if (bandera == especialistas.size()) {

		}
	}

	public ArrayList<Especialista> traerEspecialistasToPaciente(LocalDate fechaABuscar, String especialidad) {
		return hospital.obtenerEspecialistasDisponibles(fechaABuscar, especialidad);
	}

	public ArrayList<Especialista> traerTodosLosEspecialistas() {
		return hospital.obtenerTodosLosEspecialistas();
	}

	public void actualizarPersona(Persona persona) {
		PersonaDTO personadto = null;
		if (persona instanceof Especialista) {
			EspecialistaDTO especialistaDto = new EspecialistaDTO();
			especialistaDto.setNombre(persona.getNombre());
			especialistaDto.setEspecializacion(((Especialista) persona).getEspecializacion());
			especialistaDto.setCedula(persona.getCedula());
			especialistaDto.setCorreo(persona.getCorreo());
			especialistaDto.setSexo(persona.getSexo());
			especialistaDto.setEdad(persona.getEdad());
			especialistaDto.setRol(persona.getRol());
			especialistaDto.setTurnos(MapHandler.convertirTurnoToTurnoDTO(((Especialista) persona).getTurnos()));
			especialistaDto.setCitas(MapHandler.convertirCitaToCitaDTO(((Especialista) persona).getCitas()));
			personadto = especialistaDto;
		} else if (persona instanceof Paciente) {
			PacienteDTO pacienteDto = new PacienteDTO();
			pacienteDto.setNombre(persona.getNombre());
			pacienteDto.setCedula(persona.getCedula());
			pacienteDto.setCorreo(persona.getCorreo());
			pacienteDto.setSexo(persona.getSexo());
			pacienteDto.setEdad(persona.getEdad());
			pacienteDto.setRol(persona.getRol());
			pacienteDto.setCitas(MapHandler.convertirCitaToCitaDTO(((Paciente) persona).getCitas()));
			pacienteDto.setExamenes(MapHandler.convertirCitaToCitaDTO(((Paciente) persona).getExamenes()));
			personadto = pacienteDto;
		}
		if (hospital.actualizarPersona(personadto)) {
			System.out.println("SE ASIGNARON TURNOS AUTOMATICAMENTE!!!");
			vistaE.mostrarInformacion("Se agrego correctamente la citaaa", 2);
		}
	}
	
}