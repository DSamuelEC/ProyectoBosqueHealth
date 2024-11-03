package co.edu.unbosque.model;

import java.util.ArrayList;

public class Especialista extends Persona implements InterfaceCRUD<Actividad> {
	
	String especializacion;
	//private ArrayList<Turno> turnos;
	//private ArrayList<Cita> citas;

	public Especialista(String nombre, int cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad);
		// TODO Auto-generated constructor stub
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
	
	

}
