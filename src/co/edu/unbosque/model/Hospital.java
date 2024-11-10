package co.edu.unbosque.model;

import java.util.ArrayList;

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
		if (creado == true) {
			Admin aux = (Admin) hospitalDAO.find("ADMIN");
			aux.setPacientes(null);
			aux.setEspecialistas(null);
			aux.agruparPacientesyEspecialistas(hospitalDAO.getAll());
			hospitalDAO.update(aux, aux);
		}
		return creado;
	}

	public String find(String nombre, int cedula, String rol) {
		persona = hospitalDAO.find(nombre, cedula);
		if (persona.getRol() == rol) {
			return "ACESSO CONCEDIDO";
		} else {
			return "ACCESO DENEGADO, INTENTE DE NUEVO";
		}
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