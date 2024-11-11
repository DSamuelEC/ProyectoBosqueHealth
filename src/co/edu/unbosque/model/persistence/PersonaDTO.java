package co.edu.unbosque.model.persistence;

import java.io.Serializable;
/**
 * Clase encargada representar a Persona y almacenar sus datos
 * @author Samuel Diaz
 */
public class PersonaDTO implements Serializable {
	/**
	 * Identificador único de versión para la serialización de esta clase.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo nombre de la persona
	 */
	private String nombre;
	/**
	 * Atributo cedula de la persona
	 */
	private long cedula;
	/**
	 * Atributo correo de la persona
	 */
	private String correo;
	/**
	 * Atributo sexo de la persona
	 */
	private String sexo;
	/**
	 * Atributo edad de la persona
	 */
	private int edad;
	/**
	 * Atributo rol de la persona
	 */
	private String rol;
	/**
	 * Metodo que retorna el valor del atributo nombre
	 * 
	 * @return Contenido del atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que actualiza el valor del atributo nombre
	 * 
	 * @param nombre valor a actualizar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo que retorna el valor del atributo cedula
	 * 
	 * @return Contenido del atributo cedula
	 */
	public long getCedula() {
		return cedula;
	}
	/**
	 * Metodo que actualiza el valor del atributo cedula
	 * 
	 * @param cedula valor a actualizar
	 */
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	/**
	 * Metodo que retorna el valor del atributo correo
	 * 
	 * @return Contenido del atributo correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * Metodo que actualiza el valor del atributo correo
	 * 
	 * @param correo valor a actualizar
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * Metodo que retorna el valor del atributo sexo
	 * 
	 * @return Contenido del atributo sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * Metodo que actualiza el valor del atributo sexo
	 * 
	 * @param sexo valor a actualizar
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * Metodo que retorna el valor del atributo edad
	 * 
	 * @return Contenido del atributo edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Metodo que actualiza el valor del atributo edad
	 * 
	 * @param edad valor a actualizar
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Metodo que retorna el valor del atributo rol
	 * 
	 * @return Contenido del atributo rol
	 */
	public String getRol() {
		return rol;
	}
	/**
	 * Metodo que actualiza el valor del atributo rol
	 * 
	 * @param rols valor a actualizar
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}
}