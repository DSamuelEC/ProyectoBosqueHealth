package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita extends Actividad {
	private String nombrePaciente;
	private String correoPaciente;
	private String nombreEspecialista;
	private String correoEspecialista;
	private String especialidad;
	private String tratamiento;
	private String diagnostico;
	private String examenes;

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

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getCorreoPaciente() {
		return correoPaciente;
	}

	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}

	public String getNombreEspecialista() {
		return nombreEspecialista;
	}

	public void setNombreEspecialista(String nombreEspecialista) {
		this.nombreEspecialista = nombreEspecialista;
	}

	public String getCorreoEspecialista() {
		return correoEspecialista;
	}

	public void setCorreoEspecialista(String correoEspecialista) {
		this.correoEspecialista = correoEspecialista;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getExamenes() {
		return examenes;
	}

	public void setExamenes(String examenes) {
		this.examenes = examenes;
	}
}