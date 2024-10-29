package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de mostrar los pacientes correspondientes al Especialista
 * 
 * @author Mariana Ovallos
 */
public class PanelEMisPacientes extends JPanel {
	/**
	 * Atributo encargado de motrar una tabla con los pacientes
	 */
	private JTable tblMisPacientes;
	/**
	 * Atribujo encargado de mostrar un panel de desplazamiento
	 */
	private JScrollPane scrollPane;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEMisPacientes() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {

		tblMisPacientes = new JTable();

		scrollPane = new JScrollPane();

	}

	/**
	 * Metodo que retorna el valor del atributo tblMisPacientes
	 * 
	 * @return Contenido del atributo tblMisPacientes
	 */
	public JTable getTblMisPacientes() {
		return tblMisPacientes;
	}

	/**
	 * Metodo que actualiza el valor del atributo tblMisPacientes
	 * 
	 * @param tblMisPacientes valor a actualizar
	 */
	public void setTblMisPacientes(JTable tblMisPacientes) {
		this.tblMisPacientes = tblMisPacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo scrollPane
	 * 
	 * @return Contenido del atributo scrollPane
	 */
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * Metodo que actualiza el valor del atributo scrollPane
	 * 
	 * @param scrollPane valor a actualizar
	 */
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

}
