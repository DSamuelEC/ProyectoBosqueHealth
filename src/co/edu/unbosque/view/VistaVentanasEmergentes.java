package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VistaVentanasEmergentes {

	public void mostrarInformacion(String mensaje, int n) {
		if (n == 0) {
			JOptionPane.showMessageDialog(null, mensaje, "INFORMACION", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, mensaje, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
