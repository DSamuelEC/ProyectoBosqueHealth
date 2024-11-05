package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Actividad {
	protected LocalDate fecha;
	protected LocalTime horaInicio;
	protected LocalTime horaFinal;
	protected String tipo; 

	public Actividad(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, String tipo) {
		super();
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}
}