package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class ActividadDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFinal;
	private String tipo;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}