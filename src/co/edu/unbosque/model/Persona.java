package co.edu.unbosque.model;

public abstract class Persona {
	protected String nombre;
	protected long cedula;
	protected String correo;
	protected String sexo;
	protected int edad;
	protected String rol;

	public Persona(String nombre, long cedula, String correo, String sexo, int edad, String rol) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.sexo = sexo;
		this.edad = edad;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}