package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que
 * 
 * @author Samuel Diaz
 * @param <T>
 */
public abstract class Actividad<T> implements InterfaceCRUD<T> {
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFinal;

	public Actividad(LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal) {
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}

	@Override
	public String verTodo() {
		return "Todas las citas o examenes o turnos";
	};

	@Override
	public boolean añadir(T x) {
		System.out.println("Añadiendo a..." + x);
		return true;
	}

	@Override
	public boolean actualizar(T x, T y) {
		System.out.println("Actualizando a..." + x + "En..." + y);
		return true;
	}

	@Override
	public boolean eliminar(T x) {
		System.out.println("Eliminando a..." + x);
		return true;
	}

	@Override
	public T buscar(LocalDate fecha, LocalTime hora) {
		System.out.println("Buscando a...");
		return null;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}
}