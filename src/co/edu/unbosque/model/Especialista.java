package co.edu.unbosque.model;

import java.util.ArrayList;

public class Especialista extends Persona implements InterfaceCRUD<Actividad> {
	private ArrayList<Turno> turnos;
	private ArrayList<Cita> citas;
	String especializacion;

	public Especialista(String nombre, int cedula, String correo, String sexo, int edad, ArrayList<Turno> turnos,
			ArrayList<Cita> citas, String especializacion) {
		super(nombre, cedula, correo, sexo, edad);
		this.turnos = turnos;
		this.citas = citas;
		this.especializacion = especializacion;
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