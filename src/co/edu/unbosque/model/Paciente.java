package co.edu.unbosque.model;

import java.util.ArrayList;
/**
 * Clase encragada de administrar al paciente
 * @author Samuel Diaz
 */
public class Paciente extends Persona {
	/**
	 * Atributo de un arreglo que guarda las citas del paciente
	 */
	private ArrayList<Cita> citas;
	/**
	 * Atributo de una rreglo que guarda los examenes
	 */
	private ArrayList<Cita> examenes;
/**
 * Constructor de la clase Paciente
 * @param nombre, nombre del paciente
 * @param cedula, cedula del paciente
 * @param correo, correo del paciente
 * @param sexo, sexo del paciente
 * @param edad, edad del paciente
 */
	public Paciente(String nombre, long cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad, "PACIENTE");
		this.citas = new ArrayList<Cita>();
		this.examenes = new ArrayList<Cita>();
	}
	/**
	 * Metodo que retorna el valor del atributo citas
	 * 
	 * @return Contenido del atributo citas
	 */
	public ArrayList<Cita> getCitas() {
		return citas;
	}
	/**
	 * Metodo que actualiza el valor del atributo citas
	 * 
	 * @param citas valor a actualizar
	 */
	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
	/**
	 * Metodo que retorna el valor del atributo examenes
	 * 
	 * @return Contenido del atributo examenes
	 */
	public ArrayList<Cita> getExamenes() {
		return examenes;
	}
	/**
	 * Metodo que actualiza el valor del atributo examenes
	 * 
	 * @param examenes valor a actualizar
	 */
	public void setExamenes(ArrayList<Cita> examenes) {
		this.examenes = examenes;
	}
}
