package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * Clase encargada de indicar una estructura a trabajar a otras clases
 * 
 * @author Samuel Diaz
 * @param <T> Indica que puede interactuar con diferentes tipos de datos
 */
public interface InterfaceDAO<T> {
	/**
	 * Metodo que permite ver todo lo que se encuentre con el tipo de dato que se
	 * especifique
	 * 
	 * @return devuelve los valores que se tengan almacenados y disponibles para
	 *         mostrar
	 */
	ArrayList<T> getAll();

	/**
	 * Metodo que permite agregar un tipo de dato que se especifique
	 * 
	 * @param x Representa el dato del tipo seleccionado a agregar
	 * @return devuelve verdadero o falso dependiendo de si se pudo o no agregar
	 */
	boolean add(T x);

	/**
	 * Metodo que permite eliminar un tipo de dato que se especifique
	 * 
	 * @param x Representa el dato del tipo seleccionado a eliminar
	 * @return devuelve verdadero o falso dependiendo de si se pudo o no eliminar
	 */
	boolean delete(T x);

	/**
	 * Metodo que permite actualizar un tipo de dato que se especifique
	 * 
	 * @param x Representa el dato del tipo seleccionado a ser actualizado
	 * @param y Representa el dato del tipo seleccionado a actualizar
	 * @return devuelve verdadero o falso dependiendo de si se pudo o no actualizar
	 */
	boolean update(T x, T y);

	/**
	 * Metodo que permite buscar algo especifico basado en ciertos criterios de
	 * busqueda con base en el tipo de dato que se indique
	 * 
	 * @param nombre Representa el primer valor a filtrar para la busqueda
	 * @param cedula Representa el segundo valor a filtrar para la busqueda
	 * @return devuelve lo que se estaba buscando si se pudo encontrar
	 */
	T find(String nombre, long cedula);

	/**
	 * Metodo que permite buscar algo especifico basado en cierto criterio de
	 * busqueda con base en el tipo de dato que se indique
	 * 
	 * @param rol Representa el primero y unico valor a filtrar para la busqueda
	 * @return devuelve lo que se estaba buscando si se pudo encontrar
	 */
	T find(String rol);
}