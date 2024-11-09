package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin extends Persona implements InterfaceCRUD<Persona> {
	private ArrayList<Paciente> pacientes;
	private ArrayList<Especialista> especialistas;

	public Admin(String nombre, int cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad, "ADMIN");
		this.pacientes = new ArrayList<Paciente>();
		this.especialistas = new ArrayList<Especialista>();
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

	public void asignarTurnosMensuales() {
		// Definición del horario de turnos: 7 a.m. a 7 a.m. del día siguiente
		LocalTime horaInicioTurno = LocalTime.of(7, 0);
		LocalTime horaFinTurno = LocalTime.of(7, 0);

		// Máximo de turnos que un especialista puede tomar por semana
		int maxTurnosPorSemana = 2;

		// Agrupar especialistas por área (Cirugía, Oncología, etc.)
		Map<String, ArrayList<Especialista>> especialistasPorArea = agruparEspecialistasPorArea();

		// Fecha del primer día del mes actual
		LocalDate inicioMes = LocalDate.now().withDayOfMonth(1);

		// Para cada semana del mes (4 semanas)
		for (int semana = 0; semana < 4; semana++) {
			// Fecha de inicio de la semana
			LocalDate inicioSemana = inicioMes.plusWeeks(semana);

			// Asignación de turnos por área
			for (String area : especialistasPorArea.keySet()) {
				ArrayList<Especialista> especialistas = especialistasPorArea.get(area);
				int numEspecialistas = especialistas.size();

				// Asignar turnos para cada día de la semana (7 días)
				for (int dia = 0; dia < 7; dia++) {
					LocalDate fechaTurno = inicioSemana.plusDays(dia);

					// Selección cíclica de especialistas para garantizar descanso
					int especialistaIndex = (semana * 7 + dia) % numEspecialistas;
					Especialista especialista = especialistas.get(especialistaIndex);

					// Verificar si el especialista puede tomar el turno sin exceder el límite
					if (especialista.puedeTomarTurno(maxTurnosPorSemana)) {
						Turno turno = new Turno(fechaTurno, horaInicioTurno, horaFinTurno.plusHours(24), "Asignado");
						especialista.agregarTurno(turno);
					}
				}
			}
		}
//		Falta actualizar la DB con el turno
	}

	@Override
	public String verTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean añadir(Persona x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Persona x, Persona y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Persona x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscar(Persona x) {
		// TODO Auto-generated method stub
		return false;
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
}