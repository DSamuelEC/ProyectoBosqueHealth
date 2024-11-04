package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class PacienteDTO {
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
}