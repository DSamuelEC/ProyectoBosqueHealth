package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

public interface InterfaceCRUD <T>{
	
	String verTodo();
	boolean añadir(T x);
	boolean actualizar(T x, T y);
	boolean eliminar(T x);
	T buscar(LocalDate fecha, LocalTime hora);
}