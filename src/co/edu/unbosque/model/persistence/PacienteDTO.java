package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class PacienteDTO extends PersonaDTO {
	private static final long serialVersionUID = 1L;
	private ArrayList<CitaDTO> citas;
	private ArrayList<CitaDTO> examenes;

	public ArrayList<CitaDTO> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<CitaDTO> citas) {
		this.citas = citas;
	}

	public ArrayList<CitaDTO> getExamenes() {
		return examenes;
	}

	public void setExamenes(ArrayList<CitaDTO> examenes) {
		this.examenes = examenes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}