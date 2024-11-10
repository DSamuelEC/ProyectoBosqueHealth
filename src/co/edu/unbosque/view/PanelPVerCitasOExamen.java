package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * Clase encargada de mostrar el panel para ver las citas o examenes
 * 
 * @author Mariana Ovallos
 */
public class PanelPVerCitasOExamen extends JPanel {
	/**
	 * Atributo encargado de motrar una tabla con las citas o examenes que tiene el
	 * paciente
	 */
	private JTable tblVerCitasOExamen;
	/**
	 * Atribujo encargado de mostrar un panel de desplazamiento
	 */
	private JScrollPane scrollPane;

	/**
	 * Metodo Constructor de la clase
	 */

	public PanelPVerCitasOExamen() {
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
		DefaultTableModel modeloTabla = new DefaultTableModel(
				new Object[] { "Nombre Especialista", "Especialidad", "Fecha", "Hora Inicio", "Hora Final" }, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblVerCitasOExamen = new JTable(modeloTabla);
		tblVerCitasOExamen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblVerCitasOExamen.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(400);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(200);
		columnModel.getColumn(4).setPreferredWidth(200);

		scrollPane = new JScrollPane(tblVerCitasOExamen);
		scrollPane.setBounds(0, 40, 1300, 590);
		add(scrollPane);
	}

	/**
	 * Metodo que cambia el texto de una columna especifica
	 * 
	 * @param columna     Valor que representa el indice de la colunma
	 * @param nuevoTitulo Valor que reemplaza el texto de la colunma
	 */
	public void cambiarEncabezado(int columna, String nuevoTitulo) {
		tblVerCitasOExamen.getColumnModel().getColumn(columna).setHeaderValue(nuevoTitulo);
		tblVerCitasOExamen.getTableHeader().repaint();
	}

	/**
	 * Metodo que agrega una fila a la tabla
	 * 
	 * @param especialista Valor a agregar del nombre del especialista
	 * @param fecha        Valor a agregar de la fecha
	 * @param horaInicio   Valor a agregar de la hora de inicio
	 * @param horaFinal    Valor a agregar de la hora de fin
	 */
	public void agregarFilaTabla(String especialista, String especialidad, String fecha, String horaInicio,
			String horaFinal) {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblVerCitasOExamen.getModel();
		modeloTabla.addRow(new Object[] { especialista, especialidad, fecha, horaInicio, horaFinal });
		modeloTabla.fireTableDataChanged();
		tblVerCitasOExamen.getTableHeader().repaint();
	}

	/**
	 * Metodo encargado de limpiar la tabla cuando se quiera cambiar de
	 * visualizaciones
	 */
	public void limpiarTabla() {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblVerCitasOExamen.getModel();
		modeloTabla.setRowCount(0);
	}

	/**
	 * Metodo que retorna el valor del atributo tblVerCitasOExamen
	 * 
	 * @return Contenido del atributo tblVerCitasOExamen
	 */
	public JTable getTblVerCitasOExamen() {
		return tblVerCitasOExamen;
	}

	/**
	 * Metodo que actualiza el valor del atributo tblVerCitasOExamen
	 * 
	 * @param tblVerCitasOExamen valor a actualizar
	 */
	public void setTblVerCitasOExamen(JTable tblVerCitasOExamen) {
		this.tblVerCitasOExamen = tblVerCitasOExamen;
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