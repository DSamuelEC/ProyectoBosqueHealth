package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class AdminDTO extends PersonaDTO {
	private static final long serialVersionUID = 1L;
	private ArrayList<PacienteDTO> pacientes = new ArrayList<PacienteDTO>();
	private ArrayList<EspecialistaDTO> especialistas = new ArrayList<EspecialistaDTO>();

	public ArrayList<PacienteDTO> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<PacienteDTO> pacientes) {
		this.pacientes = pacientes;
	}

	public ArrayList<EspecialistaDTO> getEspecialistas() {
		return especialistas;
	}

	public void setEspecialistas(ArrayList<EspecialistaDTO> especialistas) {
		this.especialistas = especialistas;
	}
}