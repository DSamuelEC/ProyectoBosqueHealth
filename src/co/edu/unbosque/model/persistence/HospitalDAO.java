package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class HospitalDAO implements InterfaceDAO<Persona> {
	private ArrayList<Persona> datos;
	private Archivo archivo;

	public HospitalDAO() {
		this.datos = new ArrayList<Persona>();
		this.archivo = new Archivo();
	}

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
		if (find(x.getCedula()) == null) {
			datos.add(x);
			archivo.escribirArchivoBinario(datos);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Persona x) {
		Persona y = find(x.getCedula());
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
		Persona e = find(x.getCedula());
		if (e != null) {
			datos.remove(e);
			datos.add(y);
			archivo.escribirArchivoBinario(datos);
		}
		return false;
	}

	@Override
	public Persona find(int cedula) {
		Persona encontrado = null;
		if (!datos.isEmpty()) {
			for (Persona persona : datos) {
				if (persona.getCedula() == cedula) {
					encontrado = persona;
				}
			}
		}
		return encontrado;
	}
}