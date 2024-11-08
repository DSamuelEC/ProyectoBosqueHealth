package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class EspecialistaDTO extends PersonaDTO {
	private static final long serialVersionUID = 1L;
	private ArrayList<TurnoDTO> turnos = new ArrayList<TurnoDTO>();
	private ArrayList<CitaDTO> citas = new ArrayList<CitaDTO>();
	private String especializacion;

	public ArrayList<TurnoDTO> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<TurnoDTO> turnos) {
		this.turnos = turnos;
	}

	public ArrayList<CitaDTO> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<CitaDTO> citas) {
		this.citas = citas;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
}