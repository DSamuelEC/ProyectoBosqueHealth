package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.HospitalDAO;

public class Hospital {
	private ArrayList<Persona> todasPersonas;
	private HospitalDAO hospitalDAO;
	private Persona persona;
	private Actividad actividad;

	public Hospital(Persona persona, Actividad actividad) {
		super();
		this.persona = persona;
		this.actividad = actividad;
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