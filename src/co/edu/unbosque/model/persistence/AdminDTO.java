package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * Clase encargada representar al admin y almacenar sus datos
 * 
 * @author Samuel Diaz
 */
public class AdminDTO extends PersonaDTO {
	/**
	 * Atributo encargado de generar un numero de identificacion unico para cada
	 * admin
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo encargado de almacenar a todos los pacientes
	 */
	private ArrayList<PacienteDTO> pacientes = new ArrayList<PacienteDTO>();
	/**
	 * Atributo encargado de almacenar a todos los especialistas
	 */
	private ArrayList<EspecialistaDTO> especialistas = new ArrayList<EspecialistaDTO>();

	/**
	 * Metodo que retorna el valor del atributo pacientes
	 * 
	 * @return contenido del atributo pacientes
	 */
	public ArrayList<PacienteDTO> getPacientes() {
		return pacientes;
	}

	/**
	 * Metodo que actualiza el atributo pacientes
	 * 
	 * @param pacientes valor a actualizar
	 */
	public void setPacientes(ArrayList<PacienteDTO> pacientes) {
		this.pacientes = pacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo especialistas
	 * 
	 * @return contenido del atributo especialistas
	 */
	public ArrayList<EspecialistaDTO> getEspecialistas() {
		return especialistas;
	}

	/**
	 * Metodo que actualiza el atributo especialistas
	 * 
	 * @param especialistas valor a actualizar
	 */
	public void setEspecialistas(ArrayList<EspecialistaDTO> especialistas) {
		this.especialistas = especialistas;
	}
}