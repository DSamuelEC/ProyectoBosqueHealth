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
		LocalTime horaInicioTurno = LocalTime.of(7, 0);
		LocalTime horaFinTurno = LocalTime.of(7, 0);

		int maxTurnosPorSemana = 2;

		Map<String, ArrayList<Especialista>> especialistasPorArea = agruparEspecialistasPorArea();

		LocalDate inicioMes = LocalDate.now().withDayOfMonth(1);

		for (int semana = 0; semana < 4; semana++) {
			LocalDate inicioSemana = inicioMes.plusWeeks(semana);

			for (String area : especialistasPorArea.keySet()) {
				ArrayList<Especialista> especialistas = especialistasPorArea.get(area);
				int numEspecialistas = especialistas.size();

				for (int dia = 0; dia < 7; dia++) {
					LocalDate fechaTurno = inicioSemana.plusDays(dia);

					int especialistaIndex = (semana * 7 + dia) % numEspecialistas;
					Especialista especialista = especialistas.get(especialistaIndex);

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