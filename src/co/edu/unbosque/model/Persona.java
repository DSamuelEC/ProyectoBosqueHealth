package co.edu.unbosque.model;

/**
 * Clase encargada de agrupar los atributos generales que se usaran en las otras
 * clases
 * @author Samuel Diaz
 */
public abstract class Persona {
	/**
	 * Atributo protegido nombre
	 */
	protected String nombre;
	/**
	 * Atributo protegido cedula
	 */
	protected long cedula;
	/**
	 * Atributo protegido correo
	 */
	protected String correo;
	/**
	 * Atributo protegido sexo
	 */
	protected String sexo;
	/**
	 * Atributo protegido edad
	 */
	protected int edad;
	/**
	 * Atributo protegido rol
	 */
	protected String rol;
	/**
	 * Constructor de la clase Persona
	 * @param nombre, nombre de la Persona
	 * @param cedula, cedula de la persona
	 * @param correo, correo de la persona
	 * @param sexo, sexo de la persona
	 * @param edad, edad de la persona
	 * @param rol, rol de la persona
	 */
	public Persona(String nombre, long cedula, String correo, String sexo, int edad, String rol) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.sexo = sexo;
		this.edad = edad;
		this.rol = rol;
	}
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
	 * @param rol valor a actualizar
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}
}