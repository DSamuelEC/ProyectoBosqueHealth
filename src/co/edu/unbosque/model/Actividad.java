package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Actividad {
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFinal;

	public Actividad(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal) {
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
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