package co.edu.unbosque.model;

import java.util.ArrayList;

public class Paciente extends Persona implements InterfaceCRUD<Cita> {
	private ArrayList<Cita> citas;
	private ArrayList<Cita> examenes;

	public Paciente(String nombre, int cedula, String correo, String sexo, int edad, ArrayList<Cita> citas,
			ArrayList<Cita> examenes) {
		super(nombre, cedula, correo, sexo, edad);
		this.citas = citas;
		this.examenes = examenes;
	}

	@Override
	public String verTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean añadir(Cita x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Cita x, Cita y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Cita x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscar(Cita x) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}

	public ArrayList<Cita> getExamenes() {
		return examenes;
	}

	public void setExamenes(ArrayList<Cita> examenes) {
		this.examenes = examenes;
	}
}
