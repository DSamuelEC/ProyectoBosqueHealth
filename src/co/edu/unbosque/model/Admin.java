package co.edu.unbosque.model;

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