package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

/**
 * Clase encargada de manipular el archivo binario
 * 
 * @author Samuel Diaz
 */
public class HospitalDAO implements InterfaceDAO<Persona> {
	/**
	 * Atributo encargado de almacenar todos los datos del archivo
	 */
	private ArrayList<Persona> datos;
	/**
	 * Atributo encargado de almacenar una instancia del archivo binario para poder
	 * manipularlo
	 */
	private Archivo archivo;

	/**
	 * Constructor de la clase, inicializa los atributos
	 */
	public HospitalDAO() {
		this.datos = new ArrayList<Persona>();
		this.archivo = new Archivo();
	}

	/**
	 * 
	 */
	public void actualizarBD() {
		ArrayList<Persona> personasExistentes = archivo.leerArchivoBinario();
		if (personasExistentes != null) {
			datos = personasExistentes;
		}
	}

	@Override
	public ArrayList<Persona> getAll() {
		return datos;
	}

	@Override
	public boolean add(Persona x) {
		if (find(x.getNombre(), x.getCedula()) == null) {
			datos.add(x);
			archivo.escribirArchivoBinario(datos);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Persona x) {
		Persona y = find(x.getNombre(), x.getCedula());
		if (y != null) {
			try {
				datos.remove(y);
				archivo.getUbicacionArchivoBinario().delete();
				archivo.getUbicacionArchivoBinario().createNewFile();
				archivo.escribirArchivoBinario(datos);
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean update(Persona x, Persona y) {
		Persona e = find(x.getNombre(), x.getCedula());
		if (e != null) {
			datos.remove(e);
			datos.add(y);
			archivo.escribirArchivoBinario(datos);
		}
		return false;
	}

	@Override
	public Persona find(String nombre, long cedula) {
		Persona encontrado = null;
		if (!datos.isEmpty()) {
			for (Persona persona : datos) {
				if (persona.getNombre().equals(nombre) && persona.getCedula() == cedula) {
					encontrado = persona;
					break;
				}
			}
		}
		return encontrado;
	}

	@Override
	public Persona find(String rol) {
		Persona encontrado = null;
		if (!datos.isEmpty()) {
			for (Persona persona : datos) {
				if (persona.getRol().equals(rol)) {
					encontrado = persona;
					break;
				}
			}
		}
		return encontrado;
	}
}