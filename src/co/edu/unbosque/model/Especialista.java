package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Clase encargada de administrar el Especialista
 * @author Samuel Diaz
 */
public class Especialista extends Persona {
	/**
	 * Atributo de un arreglo que guarda los Turnos de cada especialista
	 */
	private ArrayList<Turno> turnos;
	/**
	 * Atributo de un arreglo que guarda las citas de los especialistas
	 */
	private ArrayList<Cita> citas;
	/**
	 * Atributo de especializacion del especialista
	 */
	private String especializacion;
	/**
	 * Constructor de la clase Especialista
	 * @param nombre, nombre del especialista
	 * @param cedula, cedula del especialista
	 * @param correo, correo del especialista
	 * @param sexo, sexo del especialista
	 * @param edad, edad del especialista
	 * @param especializacion, especializacion del especialista
	 */
	public Especialista(String nombre, long cedula, String correo, String sexo, int edad, String especializacion) {
		super(nombre, cedula, correo, sexo, edad, "ESPECIALISTA");
		this.turnos = new ArrayList<Turno>();
		this.citas = new ArrayList<Cita>();
		this.especializacion = especializacion;
	}
	/**
	 * Metodo del cual el especialista puede tomar un turno
	 * @param inicioSemana, cuando inicia
	 * @param maxTurnosPorSemana, turnos maximos que puede tomar el especialista
	 * @return los turnos a la semana tomando en cuenta el limite maximo
	 */
	public boolean puedeTomarTurno(LocalDate inicioSemana, int maxTurnosPorSemana) {
		int turnosSemana = 0;

		for (Turno turno : turnos) {
			if (!turno.getFecha().isBefore(inicioSemana) && turno.getFecha().isBefore(inicioSemana.plusDays(7))) {
				turnosSemana++;
			}
		}
		return turnosSemana < maxTurnosPorSemana;
	}
	/**
	 * Metodo que le agrega al especialista el turno
	 * @param turno, el turno asignado
	 */
	public void agregarTurno(Turno turno) {
		turnos.add(turno);
	}
	/**
	 * Metodo que retorna el valor del atributo especializacion
	 * 
	 * @return Contenido del atributo especializacion
	 */
	public String getEspecializacion() {
		return especializacion;
	}
	/**
	 * Metodo que actualiza el valor del atributo especializacion
	 * 
	 * @param especializacion valor a actualizar
	 */
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	/**
	 * Metodo que retorna el valor del atributo turnos
	 * 
	 * @return Contenido del atributo turnos
	 */
	public ArrayList<Turno> getTurnos() {
		return turnos;
	}
	/**
	 * Metodo que actualiza el valor del atributo turnos
	 * 
	 * @param turnos valor a actualizar
	 */
	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
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
}