package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * Clase encargada de representar un especialista y sus atributos
 * 
 * @author Samuel Diaz
 */
public class EspecialistaDTO extends PersonaDTO {
	/**
	 * Atributo encargado de generar un numero de identificacion unico para cada
	 * especialista
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo encargado de almacenar sus turnos
	 */
	private ArrayList<TurnoDTO> turnos = new ArrayList<TurnoDTO>();
	/**
	 * Atributo encargado de almacenar sus citas
	 */
	private ArrayList<CitaDTO> citas = new ArrayList<CitaDTO>();
	/**
	 * Atributo encargado de almacenar su especializacion
	 */
	private String especializacion;

	/**
	 * Metodo que retorna el valor del atributo turnos
	 * 
	 * @return contenido del atributo turnos
	 */
	public ArrayList<TurnoDTO> getTurnos() {
		return turnos;
	}

	/**
	 * Metodo que actualiza el atributo turnos
	 * 
	 * @param turnos valor a actualizar
	 */
	public void setTurnos(ArrayList<TurnoDTO> turnos) {
		this.turnos = turnos;
	}

	/**
	 * Metodo que retorna el valor del atributo citas
	 * 
	 * @return contenido del atributo citas
	 */
	public ArrayList<CitaDTO> getCitas() {
		return citas;
	}

	/**
	 * Metodo que actualiza el atributo citas
	 * 
	 * @param citas valor a actualizar
	 */
	public void setCitas(ArrayList<CitaDTO> citas) {
		this.citas = citas;
	}

	/**
	 * Metodo que retorna el valor del atributo especializacion
	 * 
	 * @return contenido del atributo especializacion
	 */
	public String getEspecializacion() {
		return especializacion;
	}

	/**
	 * Metodo que actualiza el atributo especializacion
	 * 
	 * @param especializacion valor a actualizar
	 */
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
}