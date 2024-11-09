package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase encargada de centralizar atributos comunes entre otras clases, las
 * cuales heredaran de esta dichos atributos
 * 
 * @author Samuel Diaz
 */
public class ActividadDTO implements Serializable {
	/**
	 * Atributo encargado de generar un numero de identificacion unico para cada
	 * actividad
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo encargado de almacenar la fecha de la actividad
	 */
	private LocalDate fecha;
	/**
	 * Atributo encargado de almacenar la hora de inicio
	 */
	private LocalTime horaInicio;
	/**
	 * Atributo encargado de almacenar la hora de fin
	 */
	private LocalTime horaFinal;
	/**
	 * Atributo encargado de almacenar el tipo de actividad
	 */
	private String tipo;

	/**
	 * Metodo que retorna el valor del atributo fecha
	 * 
	 * @return contenido del atributo fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Metodo que actualiza el atributo fecha
	 * 
	 * @param fecha valor a actualizar
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Metodo que retorna el valor del atributo horaInicio
	 * 
	 * @return contenido del atributo horaInicio
	 */
	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	/**
	 * Metodo que actualiza el atributo horaInicio
	 * 
	 * @param horaInicio valor a actualizar
	 */
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * Metodo que retorna el valor del atributo horaFinal
	 * 
	 * @return contenido del atributo horaFinal
	 */
	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	/**
	 * Metodo que actualiza el atributo horaFinal
	 * 
	 * @param horaFinal valor a actualizar
	 */
	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}

	/**
	 * Metodo que retorna el valor del atributo tipo
	 * 
	 * @return contenido del atributo tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Metodo que actualiza el atributo tipo
	 * 
	 * @param tipo valor a actualizar
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}