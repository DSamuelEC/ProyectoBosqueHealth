package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Clase encargada de administrar al Admin
 * @author Samuel Diaz
 */
public class Admin extends Persona {
	/**
	 * Atributo de un arreglo donde se guardan los pacientes
	 */
	private ArrayList<Paciente> pacientes;
	/**
	 * Atributo de un arreglo donde se gurdan los especialistas
	 */
	private ArrayList<Especialista> especialistas;
	/**
	 * Constructor de la clase Admin
	 * @param nombre, nombre del admin
	 * @param cedula, cedula del admin
	 * @param correo, correo del admin
	 * @param sexo, sexo del admin
	 * @param edad, edad del admin
	 */
	public Admin(String nombre, long cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad, "ADMIN");
		this.pacientes = new ArrayList<Paciente>();
		this.especialistas = new ArrayList<Especialista>();
	}
	/**
	 * Metodo para asignar los turnos mensuales a los especialistas
	 */
	public void asignarTurnosMensuales() {
		LocalTime horaInicioTurno = LocalTime.of(7, 0);
		LocalTime horaFinTurno = LocalTime.of(7, 0);
		int maxTurnosPorSemana = 2;

		Map<String, ArrayList<Especialista>> especialistasPorArea = agruparEspecialistasPorArea();
		LocalDate inicioMes = LocalDate.now().withDayOfMonth(1);

		for (int semana = 0; semana < 4; semana++) {
			LocalDate inicioSemana = inicioMes.plusWeeks(semana);

			for (String area : especialistasPorArea.keySet()) {
				ArrayList<Especialista> especialistas = especialistasPorArea.get(area);

				for (int dia = 0; dia < 7; dia++) {
					LocalDate fechaTurno = inicioSemana.plusDays(dia);

					for (Especialista especialista : especialistas) {
						if (especialista.puedeTomarTurno(inicioSemana, maxTurnosPorSemana)) {
							Turno turno = new Turno(fechaTurno, horaInicioTurno, horaFinTurno.plusHours(24),
									"Asignado");
							especialista.agregarTurno(turno);
							System.out.println(especialista.getNombre() + " asignado a turno el " + fechaTurno);
						}
					}
				}
			}
		}
	}
	/**
	 * Metodo para agrupar a los especialistas según su area
	 * @return A los especialistas por area
	 */
	public Map<String, ArrayList<Especialista>> agruparEspecialistasPorArea() {
		Map<String, ArrayList<Especialista>> especialistasPorArea = new HashMap<>();

		especialistasPorArea.put("Cirugia", new ArrayList<>());
		especialistasPorArea.put("Oncologia", new ArrayList<>());
		especialistasPorArea.put("Dermatologia", new ArrayList<>());
		especialistasPorArea.put("Neumologia", new ArrayList<>());
		especialistasPorArea.put("Cardiologia", new ArrayList<>());
		especialistasPorArea.put("Medicina Interna", new ArrayList<>());

		for (Especialista especialista : especialistas) {
			String area = especialista.getEspecializacion();

			if (especialistasPorArea.containsKey(area)) {
				especialistasPorArea.get(area).add(especialista);
			} else {
				System.out.println("Área desconocida: " + area);
				return especialistasPorArea = null;
			}
		}
		return especialistasPorArea;
	}
	/**
	 * Metodo envcragado de agrupar a los pacientes y a los especialistas
	 * @param personas, valor que se actualiza
	 */
	public void agruparPacientesyEspecialistas(ArrayList<Persona> personas) {
		for (Persona persona : personas) {
			if (persona instanceof Paciente) {
				pacientes.add((Paciente) persona);
			} else if (persona instanceof Especialista) {
				especialistas.add((Especialista) persona);
			}
		}
	}
	/**
	 * Metodo que retorna el valor del atributo pacientes
	 * 
	 * @return Contenido del atributo pacientes
	 */
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}
	/**
	 * Metodo que actualiza el valor del atributo pacientes
	 * 
	 * @param pacientes valor a actualizar
	 */
	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	/**
	 * Metodo que retorna el valor del atributo especialistas
	 * 
	 * @return Contenido del atributo especialistas
	 */
	public ArrayList<Especialista> getEspecialistas() {
		return especialistas;
	}
	/**
	 * Metodo que actualiza el valor del atributo especialistas
	 * 
	 * @param especialistas valor a actualizar
	 */
	public void setEspecialistas(ArrayList<Especialista> especialistas) {
		this.especialistas = especialistas;
	}
	
	@Override
	/**
	 * Devuelve una cadena con los principales atributos y métodos del objeto
	 * @return Una cadena que contiene el estado
	 */
	public String toString() {
		return "Admin [pacientes=" + pacientes + ", especialistas=" + especialistas + ", nombre=" + nombre + ", cedula="
				+ cedula + ", correo=" + correo + ", sexo=" + sexo + ", edad=" + edad + ", rol=" + rol
				+ ", agruparEspecialistasPorArea()=" + agruparEspecialistasPorArea() + ", getPacientes()="
				+ getPacientes() + ", getEspecialistas()=" + getEspecialistas() + ", getNombre()=" + getNombre()
				+ ", getCedula()=" + getCedula() + ", getCorreo()=" + getCorreo() + ", getSexo()=" + getSexo()
				+ ", getEdad()=" + getEdad() + ", getRol()=" + getRol() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}