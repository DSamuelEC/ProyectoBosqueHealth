package co.edu.unbosque.model;

public class Admin extends Persona implements InterfaceCRUD<Persona> {

	// private ArrayList<Paciente> pacientes;
	// private ArrayList<Especialista> especialistas;

	public Admin(String nombre, int cedula, String correo, String sexo, int edad) {
		super(nombre, cedula, correo, sexo, edad);
		// TODO Auto-generated constructor stub
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

}
