package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.TableColumnModel;

/**
 * Clase encargada de mostrar los pacientes y los especialistas
 * 
 * @author Samuel Diaz
 */
public class PanelAdVerTodos extends JPanel {
	/**
	 * Atributo encargado de motrar una tabla con los pacientes o especialistas
	 */
	private JTable tblTodos;
	/**
	 * Atribujo encargado de mostrar un panel de desplazamiento
	 */
	private JScrollPane scrollPane;
	/**
	 * Atributo encargado de mostrar un texto del nombre de la columna
	 */
	private JLabel lblNombre;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAdVerTodos() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {

		tblTodos = new JTable(50, 3);
		tblTodos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblTodos.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(680);
		columnModel.getColumn(1).setPreferredWidth(280);
		columnModel.getColumn(2).setPreferredWidth(300);
		tblTodos.setBounds(0, 40, 1300, 590);

		scrollPane = new JScrollPane(tblTodos);

		lblNombre = new JLabel("Nombre paciente");
		lblNombre.setBounds(30, 10, 300, 20);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setForeground(new Color(5, 25, 35 ));

		add(scrollPane);
		add(tblTodos);
		add(lblNombre);
	}

	/**
	 * Metodo que retorna el valor del atributo tblTodos
	 * 
	 * @return Contenido del atributo tblTodos
	 */
	public JTable getTblTodos() {
		return tblTodos;
	}

	/**
	 * Metodo que actualiza el valor del atributo tblTodos
	 * 
	 * @param tblTodos valor a actualizar
	 */
	public void setTblTodos(JTable tblTodos) {
		this.tblTodos = tblTodos;
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

	/**
	 * Metodo que retorna el valor del atributo lblNombre
	 * 
	 * @return Contenido del atributo lblNombre
	 */
	public JLabel getLblNombre() {
		return lblNombre;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombre
	 * 
	 * @param lblNombre valor a actualizar
	 */
	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}
}
