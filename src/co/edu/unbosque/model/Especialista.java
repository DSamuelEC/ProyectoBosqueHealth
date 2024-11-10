package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Especialista extends Persona {
	private ArrayList<Turno> turnos;
	private ArrayList<Cita> citas;
	private String especializacion;

	public Especialista(String nombre, long cedula, String correo, String sexo, int edad, String especializacion) {
		super(nombre, cedula, correo, sexo, edad, "ESPECIALISTA");
		this.turnos = new ArrayList<Turno>();
		this.citas = new ArrayList<Cita>();
		this.especializacion = especializacion;
	}

	public boolean puedeTomarTurno(LocalDate inicioSemana, int maxTurnosPorSemana) {
		int turnosSemana = 0;

		for (Turno turno : turnos) {
			if (!turno.getFecha().isBefore(inicioSemana) && turno.getFecha().isBefore(inicioSemana.plusDays(7))) {
				turnosSemana++;
			}
		}
		return turnosSemana < maxTurnosPorSemana;
	}

	public void agregarTurno(Turno turno) {
		turnos.add(turno);
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
}