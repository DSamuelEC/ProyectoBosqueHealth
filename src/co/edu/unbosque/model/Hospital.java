package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.edu.unbosque.model.persistence.HospitalDAO;
import co.edu.unbosque.model.persistence.MapHandler;
import co.edu.unbosque.model.persistence.PersonaDTO;

public class Hospital {
	private ArrayList<Persona> todasPersonas;
	private HospitalDAO hospitalDAO;
	private Persona persona;
	private Actividad actividad;

	public Hospital() {
		this.todasPersonas = new ArrayList<Persona>();
		this.hospitalDAO = new HospitalDAO();
	}

	public boolean crearPersona(PersonaDTO personaDto) {
		persona = MapHandler.convertirPersonaDTOtoPersona(personaDto);
		boolean creado = hospitalDAO.add(persona);
		if (creado == true && !personaDto.getRol().equals("ADMIN")) {
			Admin aux = (Admin) hospitalDAO.find("ADMIN");
			aux.setPacientes(new ArrayList<Paciente>());
			aux.setEspecialistas(new ArrayList<Especialista>());
			aux.agruparPacientesyEspecialistas(hospitalDAO.getAll());
			hospitalDAO.update(aux, aux);
		}
		return creado;
	}

	public boolean actualizarPersona(PersonaDTO personaDto) {
		persona = MapHandler.convertirPersonaDTOtoPersona(personaDto);
		System.out.println("llegoooooooooooooooooo" + hospitalDAO.update(persona, persona));
		return hospitalDAO.update(persona, persona);
	}

	public String find(String nombre, long cedula, String rol) {
		persona = hospitalDAO.find(nombre, cedula);
		if (persona.getRol() == rol) {
			return "ACESSO CONCEDIDO";
		} else {
			return "ACCESO DENEGADO, INTENTE DE NUEVO";
		}
	}

	public void verTodos() {
		todasPersonas = hospitalDAO.getAll();
		for (Persona persona : todasPersonas) {
			System.out.println(persona.getNombre() + "    " + persona.getRol() + "    " + persona.getCedula());
		}
	}

	public ArrayList<Especialista> obtenerEspecialistasDisponibles(LocalDate fecha, String especialidad) {
		ArrayList<Especialista> especialistasDisponibles = new ArrayList<>();

		for (Persona persona : todasPersonas) {
			if (persona instanceof Especialista) {
				Especialista especialista = (Especialista) persona;
				if (especialista.getEspecializacion().equalsIgnoreCase(especialidad)) {
					for (Turno turno : especialista.getTurnos()) {
						if (turno.getFecha().isEqual(fecha)) {
							int citasEnFecha = 0;
							for (Cita cita : especialista.getCitas()) {
								if (cita.getFecha().isEqual(fecha)) {
									citasEnFecha++;
								}
							}
							if (citasEnFecha < 24) {
								especialistasDisponibles.add(especialista);
							}
							break;
						}
					}
				}
			}
		}
		return especialistasDisponibles;
	}

	public ArrayList<Especialista> obtenerTodosLosEspecialistas() {
		ArrayList<Especialista> especialistas = new ArrayList<>();

		for (Persona persona : todasPersonas) {
			if (persona instanceof Especialista) {
				Especialista especialista = (Especialista) persona;
				especialistas.add(especialista);
			}
		}
		return especialistas;
	}

	public void actualizarBD() {
		hospitalDAO.actualizarBD();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public ArrayList<Persona> getTodasPersonas() {
		return todasPersonas;
	}

	public void setTodasPersonas(ArrayList<Persona> todasPersonas) {
		this.todasPersonas = todasPersonas;
	}

	public HospitalDAO getHospitalDAO() {
		return hospitalDAO;
	}

	public void setHospitalDAO(HospitalDAO hospitalDAO) {
		this.hospitalDAO = hospitalDAO;
	}
}