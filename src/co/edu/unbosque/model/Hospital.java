package co.edu.unbosque.model;

public class Hospital {
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
}