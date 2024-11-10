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
	 * Metodo encargado de traer lo que esta en nuestra base de datos y almacenarlo
	 */
	public void actualizarBD() {
		ArrayList<Persona> personasExistentes = archivo.leerArchivoBinario();
		if (personasExistentes != null) {
			datos = personasExistentes;
		}
	}

	/**
	 * Metodo que devuelve lo que se trae de la base de datos
	 * 
	 * @return contenido almacenado en el atributo datos
	 */
	@Override
	public ArrayList<Persona> getAll() {
		return datos;
	}

	/**
	 * Metodo encargado de agregar una persona a la base de datos
	 * 
	 * @return devuelve un valor de verdad o falsedad en caso de que si o no haya
	 *         podido agregarlo
	 */
	@Override
	public boolean add(Persona x) {
		if (find(x.getNombre(), x.getCedula()) == null) {
			datos.add(x);
			archivo.escribirArchivoBinario(datos);
			return true;
		}
		return false;
	}

	/**
	 * Metodo encargado de eliminar una persona de la base de datos
	 * 
	 * @return devuelve falso o verdadero en caso de que pueda eliminarla
	 */
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

	/**
	 * Metodo encargado de actualizar lo que hay en la base de datos
	 * 
	 * @return devuelve falso o verdadero en caso de que pueda actualizarlo
	 */
	@Override
	public boolean update(Persona x, Persona y) {
		Persona e = find(x.getNombre(), x.getCedula());
		if (e != null) {
			try {
				datos.remove(e);
				datos.add(y);
				archivo.getUbicacionArchivoBinario().delete();
				archivo.getUbicacionArchivoBinario().createNewFile();
				archivo.escribirArchivoBinario(datos);
				return true;
			} catch (IOException e2) {
				e2.printStackTrace();
			}

		}
		return false;
	}

	/**
	 * Metodo que busca una persona en especifico dentro de la base de datos
	 * 
	 * @param nombre Primer criterio para buscar a una persona especifica
	 * @param cedula Segundo criterio para buscar a una persona especifica
	 * @return devuelve a la persona si la encontro con esos parametros de busqueda,
	 *         si no devuelve nulo
	 */
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

	/**
	 * Metodo que busca una persona en especifico dentro de la base de datos
	 * 
	 * @param rol Primer y unico criterio para buscar a una persona especifica
	 * @return devuelve a la persona si la encontro con ese parametro de busqueda,
	 *         si no devuelve nulo
	 */
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