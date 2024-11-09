package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
//	/**
//	 * Atributo encargado de mostrar un texto del nombre de la columna
//	 */
//	private JLabel lblNombre;

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
		DefaultTableModel modeloTabla = new DefaultTableModel(new Object[] { "Nombre", "correo" }, 0);
		tblTodos = new JTable(modeloTabla);
		tblTodos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblTodos.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(500);
		columnModel.getColumn(1).setPreferredWidth(800);
		tblTodos.setBounds(0, 40, 1300, 590);

		scrollPane = new JScrollPane(tblTodos);

//		lblNombre = new JLabel("Nombre paciente");
//		lblNombre.setBounds(30, 10, 300, 20);
//		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblNombre.setForeground(new Color(5, 25, 35 ));

//		add(tblTodos);
//		add(lblNombre);
		add(scrollPane);
	}

	/**
	 * Metodo que cambia el texto de una columna especifica
	 * 
	 * @param columna     Valor que representa el indice de la colunma
	 * @param nuevoTitulo Valor que reemplaza el texto de la colunma
	 */
	public void cambiarEncabezado(int columna, String nuevoTitulo) {
		tblTodos.getColumnModel().getColumn(columna).setHeaderValue(nuevoTitulo);
		tblTodos.getTableHeader().repaint();
	}

	/**
	 * Metodo que agrega una fila a la tabla
	 * 
	 * @param nombre Valor a agregar del nombre
	 * @param correo Valor a agregar del correo
	 */
	public void agregarFilaTabla(String nombre, String correo) {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblTodos.getModel();
		modeloTabla.addRow(new Object[] { nombre, correo });
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

//	/**
//	 * Metodo que retorna el valor del atributo lblNombre
//	 * 
//	 * @return Contenido del atributo lblNombre
//	 */
//	public JLabel getLblNombre() {
//		return lblNombre;
//	}
//
//	/**
//	 * Metodo que actualiza el valor del atributo lblNombre
//	 * 
//	 * @param lblNombre valor a actualizar
//	 */
//	public void setLblNombre(JLabel lblNombre) {
//		this.lblNombre = lblNombre;
//	}
}
