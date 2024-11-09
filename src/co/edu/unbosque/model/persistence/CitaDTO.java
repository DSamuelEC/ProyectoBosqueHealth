package co.edu.unbosque.model.persistence;

/**
 * Clase encargada de representar una cita y almacenar sus valores (algunos son
 * heredados de ActividadDTO)
 * 
 * @author Samuel Diaz
 */
public class CitaDTO extends ActividadDTO {
	/**
	 * Atributo encargado de generar un numero de identificacion unico para cada
	 * cita
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo encargado de almacenar el nombre del paciente
	 */
	private String nombrePaciente;
	/**
	 * Atributo encargado de almacenar el correo del paciente
	 */
	private String correoPaciente;
	/**
	 * Atributo encargado de almacenar el nombre del especialista
	 */
	private String nombreEspecialista;
	/**
	 * Atributo encargado de almacenar el correo del especialista
	 */
	private String correoEspecialista;
	/**
	 * Atributo encargado de almacenar la especialidad de la cita
	 */
	private String especialidad;
	/**
	 * Atributo encargado de almacenar el tratamiento
	 */
	private String tratamiento;
	/**
	 * Atributo encargado de almacenar el diagnostico
	 */
	private String diagnostico;
	/**
	 * Atributo encargado de almacenar los examenes
	 */
	private String examenes;

	/**
	 * Metodo que retorna el valor del atributo nombrePaciente
	 * 
	 * @return contenido del atributo nombrePaciente
	 */
	public String getNombrePaciente() {
		return nombrePaciente;
	}

	/**
	 * Metodo que actualiza el atributo nombrePaciente
	 * 
	 * @param nombrePaciente valor a actualizar
	 */
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	/**
	 * Metodo que retorna el valor del atributo correoPaciente
	 * 
	 * @return contenido del atributo correoPaciente
	 */
	public String getCorreoPaciente() {
		return correoPaciente;
	}

	/**
	 * Metodo que actualiza el atributo correoPaciente
	 * 
	 * @param correoPaciente valor a actualizar
	 */
	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}

	/**
	 * Metodo que retorna el valor del atributo nombreEspecialista
	 * 
	 * @return contenido del atributo nombreEspecialista
	 */
	public String getNombreEspecialista() {
		return nombreEspecialista;
	}

	/**
	 * Metodo que actualiza el atributo nombreEspecialista
	 * 
	 * @param nombreEspecialista valor a actualizar
	 */
	public void setNombreEspecialista(String nombreEspecialista) {
		this.nombreEspecialista = nombreEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo correoEspecialista
	 * 
	 * @return contenido del atributo correoEspecialista
	 */
	public String getCorreoEspecialista() {
		return correoEspecialista;
	}

	/**
	 * Metodo que actualiza el atributo correoEspecialista
	 * 
	 * @param correoEspecialista valor a actualizar
	 */
	public void setCorreoEspecialista(String correoEspecialista) {
		this.correoEspecialista = correoEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo especialidad
	 * 
	 * @return contenido del atributo especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Metodo que actualiza el atributo especialidad
	 * 
	 * @param especialidad valor a actualizar
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Metodo que retorna el valor del atributo tratamiento
	 * 
	 * @return contenido del atributo tratamiento
	 */
	public String getTratamiento() {
		return tratamiento;
	}

	/**
	 * Metodo que actualiza el atributo tratamiento
	 * 
	 * @param tratamiento valor a actualizar
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	/**
	 * Metodo que retorna el valor del atributo diagnostico
	 * 
	 * @return contenido del atributo diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Metodo que actualiza el atributo diagnostico
	 * 
	 * @param diagnostico valor a actualizar
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * Metodo que retorna el valor del atributo examenes
	 * 
	 * @return contenido del atributo examenes
	 */
	public String getExamenes() {
		return examenes;
	}

	/**
	 * Metodo que actualiza el atributo examenes
	 * 
	 * @param examenes valor a actualizar
	 */
	public void setExamenes(String examenes) {
		this.examenes = examenes;
	}
}