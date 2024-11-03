package co.edu.unbosque.model;
/**
 * @author Samuel Diaz
 * @param <T>
 */
public interface InterfaceCRUD <T>{
	
	String verTodo();
	boolean añadir(T x);
	boolean actualizar(T x, T y);
	boolean eliminar(T x);
	boolean buscar(T x);
}