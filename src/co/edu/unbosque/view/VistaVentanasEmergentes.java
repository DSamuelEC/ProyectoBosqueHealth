package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/**
 * Clase encargada de almacenar una ventana emergente la cual sirve para dar
 * indicaciones al usuario de errores o de acciones realizadas
 * 
 * @author Samuel Diaz
 */
public class VistaVentanasEmergentes {
	/**
	 * Metodo encargado de mostrar la ventana emergente con su informacion
	 * respectiva
	 * 
	 * @param mensaje Texto a mostrar en la ventana emergente
	 * @param n       Valor que indica si la ventana tendra un simbolo de error o de
	 *                informacion
	 */
	public void mostrarInformacion(String mensaje, int n) {
		if (n == 0) {
			JOptionPane.showMessageDialog(null, mensaje, "INFORMACION", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, mensaje, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
