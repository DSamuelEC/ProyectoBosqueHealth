package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno extends Actividad {
	private String estado;

	public Turno(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, String estado) {
		super(fecha, horaInicio, horaFinal);
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}