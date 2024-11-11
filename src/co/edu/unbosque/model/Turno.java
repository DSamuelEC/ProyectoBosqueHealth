package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Clase encargada de los turnos de los especialistas
 * @author Samuel Diaz
 */
public class Turno extends Actividad {
	/**
	 * Atributo del estado del especialista, disponible o no
	 */
	private String estado;
	/**
	 * Constructor de la clase Turno
	 * @param fecha, fecha del turno
	 * @param horaInicio, hora de inicio del turno
	 * @param horaFinal, hora final del turno
	 * @param estado, estado del especialista
	 */
	public Turno(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, String estado) {
		super(fecha, horaInicio, horaFinal,"TURNO");
		this.estado = estado;
	}
	/**
	 * Metodo que retorna el valor del atributo estado
	 * 
	 * @return Contenido del atributo estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * Metodo que actualiza el valor del atributo estado
	 * 
	 * @param estado valor a actualizar
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}