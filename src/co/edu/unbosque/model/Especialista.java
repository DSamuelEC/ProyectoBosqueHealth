package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Especialista extends Persona implements InterfaceCRUD<Actividad> {
	private ArrayList<Turno> turnos;
	private ArrayList<Cita> citas;
	private String especializacion;

	public Especialista(String nombre, int cedula, String correo, String sexo, int edad, String especializacion) {
		super(nombre, cedula, correo, sexo, edad, "ESPECIALISTA");
		this.turnos = new ArrayList<Turno>();
		this.citas = new ArrayList<Cita>();
		this.especializacion = especializacion;
	}

	public boolean puedeTomarTurno(int maxTurnosPorSemana) {
		// Contar turnos asignados en la semana actual
		int turnosSemana = 0;
		LocalDate inicioSemana = LocalDate.now().withDayOfMonth(1);
		for (Turno turno : turnos) {
			if (turno.getFecha().isAfter(inicioSemana) && turno.getFecha().isBefore(inicioSemana.plusDays(7))) {
				turnosSemana++;
			}
		}
		return turnosSemana < maxTurnosPorSemana;
	}

	public void agregarTurno(Turno turno) {
		turnos.add(turno);
	}

	@Override
	public String verTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean añadir(Actividad x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Actividad x, Actividad y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Actividad x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscar(Actividad x) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
}