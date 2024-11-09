package co.edu.unbosque.controller;

/**
 * Clase principal del programa que inicia el controlador
 * 
 * @author Samuel Diaz
 */
public class AplMain {
	/**
	 * Metodo principal que ejecuta el programa.
	 * 
	 * @param args Parametro que permite la reserva de memoria
	 */
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.run();
	}
}