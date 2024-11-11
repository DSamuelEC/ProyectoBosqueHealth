package co.edu.unbosque.model;

import java.util.ArrayList;

public class Paciente extends Persona {
	private ArrayList<Cita> citas;
	private ArrayList<Cita> examenes;

	public Paciente(String nombre, long cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad, "PACIENTE");
		this.citas = new ArrayList<Cita>();
		this.examenes = new ArrayList<Cita>();
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}

	public ArrayList<Cita> getExamenes() {
		return examenes;
	}

	public void setExamenes(ArrayList<Cita> examenes) {
		this.examenes = examenes;
	}
}
