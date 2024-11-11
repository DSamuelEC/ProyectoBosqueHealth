package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Clase encargada de reunir todos los atrivbutos que se van a implementar en otras clases
 * 
 * @author Samuel Diaz
 */
public abstract class Actividad {
	/**
	 * Atributo protegido para la fecha
	 */
	protected LocalDate fecha;
	/**
	 * Atributo protegido para la hora inicial
	 */
	protected LocalTime horaInicio;
	/**
	 * Atributo protegido para la hora final
	 */
	protected LocalTime horaFinal;
	/**
	 * Atributo protegido para el tipo
	 */
	protected String tipo; 
/**
 * Constructor de la clase Actividad
 * @param fecha, fecha de la actividad
 * @param horaInicio, hora inicial de la actividad
 * @param horaFinal, hora final de la actividad
 * @param tipo, tipo de la actividad
 */
	public Actividad(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, String tipo) {
		super();
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.tipo = tipo;
	}
	/**
	 * Metodo que retorna el valor del atributo fecha
	 * 
	 * @return Contenido del atributo fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * Metodo que actualiza el valor del atributo fecha
	 * 
	 * @param fecha valor a actualizar
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * Metodo que retorna el valor del atributo horaInicio
	 * 
	 * @return Contenido del atributo horaInicio
	 */
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	/**
	 * Metodo que actualiza el valor del atributo horaInicio
	 * 
	 * @param horaInicio valor a actualizar
	 */
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	/**
	 * Metodo que retorna el valor del atributo horaFinal
	 * 
	 * @return Contenido del atributo horaFinal
	 */
	public LocalTime getHoraFinal() {
		return horaFinal;
	}
	/**
	 * Metodo que actualiza el valor del atributo horaFinal
	 * 
	 * @param horaFinal valor a actualizar
	 */
	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}
	/**
	 * Metodo que retorna el valor del atributo tipo
	 * 
	 * @return Contenido del atributo tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Metodo que actualiza el valor del atributo tipo
	 * 
	 * @param tipo valor a actualizar
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}