package co.edu.unbosque.model;

public abstract class Persona {

	protected String nombre;
	protected int cedula;
	protected String correo;
	protected String sexo;
	protected int edad;

	public Persona(String nombre, int cedula, String correo, String sexo, int edad) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
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
}