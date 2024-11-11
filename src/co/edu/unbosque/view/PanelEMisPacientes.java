package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

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
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		DefaultTableModel modeloTabla = new DefaultTableModel(new Object[] { "Nombre Paciente", "Fecha", "Hora" }, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tblMisPacientes = new JTable(modeloTabla);
		tblMisPacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblMisPacientes.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(700);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(300);

		scrollPane = new JScrollPane(tblMisPacientes);
		scrollPane.setBounds(0, 40, 1300, 590);

		add(scrollPane);
	}

	/**
	 * Metodo que agrega una fila a la tabla
	 * 
	 * @param nombrePaciente Valor a agregar del nombre del paciente
	 * @param fecha          Valor a agregar de la fecha
	 * @param hora           Valor a agregar de la hora
	 */
	public void agregarFilaTabla(String nombrePaciente, String fecha, String hora) {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblMisPacientes.getModel();
		modeloTabla.addRow(new Object[] { nombrePaciente, fecha, hora });
		modeloTabla.fireTableDataChanged();
		tblMisPacientes.getTableHeader().repaint();
	}

	/**
	 * Metodo encargado de limpiar la tabla cuando se quiera cambiar de
	 * visualizaciones
	 */
	public void limpiarTabla() {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblMisPacientes.getModel();
		modeloTabla.setRowCount(0);
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