package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
/**
 * Clase encargada representar a Paciente y almacenar sus datos
 * @author Samuel Diaz
 */
public class PacienteDTO extends PersonaDTO {
	/**
	 * Identificador único de versión para la serialización de esta clase.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo de un arreglo de citas asociadas al paciente
	 */
	private ArrayList<CitaDTO> citas = new ArrayList<CitaDTO>();
	/**
	 * Atributo de un arreglo de examenes asociadas al paciente
	 */
	private ArrayList<CitaDTO> examenes = new ArrayList<CitaDTO>();
	
	/**
	 * Metodo que retorna el valor del atributo citas
	 * 
	 * @return Contenido del atributo citas
	 */
	public ArrayList<CitaDTO> getCitas() {
		return citas;
	}
	/**
	 * Metodo que actualiza el valor del atributo citas
	 * 
	 * @param citas valor a actualizar
	 */
	public void setCitas(ArrayList<CitaDTO> citas) {
		this.citas = citas;
	}
	/**
	 * Metodo que retorna el valor del atributo examenes
	 * 
	 * @return Contenido del atributo examenes
	 */
	public ArrayList<CitaDTO> getExamenes() {
		return examenes;
	}
	/**
	 * Metodo que actualiza el valor del atributo examenes
	 * 
	 * @param examenes valor a actualizar
	 */
	public void setExamenes(ArrayList<CitaDTO> examenes) {
		this.examenes = examenes;
	}
}