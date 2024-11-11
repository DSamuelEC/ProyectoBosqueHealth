package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin extends Persona {
	private ArrayList<Paciente> pacientes;
	private ArrayList<Especialista> especialistas;

	public Admin(String nombre, long cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad, "ADMIN");
		this.pacientes = new ArrayList<Paciente>();
		this.especialistas = new ArrayList<Especialista>();
	}

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

	public void agruparPacientesyEspecialistas(ArrayList<Persona> personas) {
		for (Persona persona : personas) {
			if (persona instanceof Paciente) {
				pacientes.add((Paciente) persona);
			} else if (persona instanceof Especialista) {
				especialistas.add((Especialista) persona);
			}
		}
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public ArrayList<Especialista> getEspecialistas() {
		return especialistas;
	}

	public void setEspecialistas(ArrayList<Especialista> especialistas) {
		this.especialistas = especialistas;
	}

	@Override
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