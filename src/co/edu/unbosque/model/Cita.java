package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Clase encragada de gestionar lo que son las Citas del sistema
 * 
 * @author Samuel Diaz
 */
public class Cita extends Actividad {
	/**
	 * Atributo con el nombre del Paciente
	 */
	private String nombrePaciente;
	/**
	 * Atributo con el correo del Paciente
	 */
	private String correoPaciente;
	/**
	 * Atributo con el nombre del especialista
	 */
	private String nombreEspecialista;
	/**
	 * Atributo con el correo del especialista
	 */
	private String correoEspecialista;
	/**
	 * Atributo con la especialidad del especialista
	 */
	private String especialidad;
	/**
	 * Atributo con el tratamiento
	 */
	private String tratamiento;
	/**
	 * Atributo con el diagnostico
	 */
	private String diagnostico;
	/**
	 * Atributo con los examenes
	 */
	private String examenes;
	/**
	 * Constructor de la clase
	 * @param fecha, fecha de la cita
	 * @param horaInicio, hora de inicio de la cita
	 * @param horaFinal, hora final de la cita
	 * @param nombrePaciente, nombre del paciente
	 * @param correoPaciente, correo del paciente
	 * @param nombreEspecialista, nombre del especialista
	 * @param correoEspecialista, correo del especialista
	 * @param especialidad, especialidad del especialista
	 * @param tratamiento, tratamiento generado
	 * @param diagnostico, diagnostico generado
	 * @param examenes, examen generado
	 */
	public Cita(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, String nombrePaciente,
			String correoPaciente, String nombreEspecialista, String correoEspecialista, String especialidad,
			String tratamiento, String diagnostico, String examenes) {
		super(fecha, horaInicio, horaFinal, "CITA");
		this.nombrePaciente = nombrePaciente;
		this.correoPaciente = correoPaciente;
		this.nombreEspecialista = nombreEspecialista;
		this.correoEspecialista = correoEspecialista;
		this.especialidad = especialidad;
		this.tratamiento = tratamiento;
		this.diagnostico = diagnostico;
		this.examenes = examenes;
	}
	/**
	 * Metodo que retorna el valor del atributo nombrePaciente
	 * 
	 * @return Contenido del atributo nombrePaciente
	 */
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	/**
	 * Metodo que actualiza el valor del atributo nombrePaciente
	 * 
	 * @param nombrePaciente valor a actualizar
	 */
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	/**
	 * Metodo que retorna el valor del atributo correoPaciente
	 * 
	 * @return Contenido del atributo correoPaciente
	 */
	public String getCorreoPaciente() {
		return correoPaciente;
	}
	/**
	 * Metodo que actualiza el valor del atributo correoPaciente
	 * 
	 * @param correoPaciente valor a actualizar
	 */
	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}
	/**
	 * Metodo que retorna el valor del atributo nombreEspecialista
	 * 
	 * @return Contenido del atributo nombreEspecialista
	 */
	public String getNombreEspecialista() {
		return nombreEspecialista;
	}
	/**
	 * Metodo que actualiza el valor del atributo nombreEspecialista
	 * 
	 * @param nombreEspecialista valor a actualizar
	 */
	public void setNombreEspecialista(String nombreEspecialista) {
		this.nombreEspecialista = nombreEspecialista;
	}
	/**
	 * Metodo que retorna el valor del atributo correoEspecialista
	 * 
	 * @return Contenido del atributo correoEspecialista
	 */
	public String getCorreoEspecialista() {
		return correoEspecialista;
	}
	/**
	 * Metodo que actualiza el valor del atributo correoEspecialista
	 * 
	 * @param correoEspecialista valor a actualizar
	 */
	public void setCorreoEspecialista(String correoEspecialista) {
		this.correoEspecialista = correoEspecialista;
	}
	/**
	 * Metodo que retorna el valor del atributo especialidad
	 * 
	 * @return Contenido del atributo especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	/**
	 * Metodo que actualiza el valor del atributo especialidad
	 * 
	 * @param especialidad valor a actualizar
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	/**
	 * Metodo que retorna el valor del atributo tratamiento
	 * 
	 * @return Contenido del atributo tratamiento
	 */
	public String getTratamiento() {
		return tratamiento;
	}
	/**
	 * Metodo que actualiza el valor del atributo tratamiento
	 * 
	 * @param tratamiento valor a actualizar
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	/**
	 * Metodo que retorna el valor del atributo diagnostico
	 * 
	 * @return Contenido del atributo diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}
	/**
	 * Metodo que actualiza el valor del atributo diagnostico
	 * 
	 * @param diagnostico valor a actualizar
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	/**
	 * Metodo que retorna el valor del atributo examenes
	 * 
	 * @return Contenido del atributo examenes
	 */
	public String getExamenes() {
		return examenes;
	}
	/**
	 * Metodo que actualiza el valor del atributo examenes
	 * 
	 * @param examenes valor a actualizar
	 */
	public void setExamenes(String examenes) {
		this.examenes = examenes;
	}
}