package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
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
	 * Atributo encargado de mostrar un texto del nombre del paciente en el Panel
	 */
	private JLabel lblNombrePaciente;
	/**
	 * Atributo encargado de mostrar un texto de la fecha de la cita en el Panel
	 */
	private JLabel lblFecha;
	/**
	 * Atributo encargado de mostrar un texto de la Hora de la cita en el Panel
	 */
	private JLabel lblHora;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEMisPacientes() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		
		tblMisPacientes = new JTable(50, 3);
		TableColumnModel columnModel = tblMisPacientes.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(680);
	    columnModel.getColumn(1).setPreferredWidth(280);
	    columnModel.getColumn(2).setPreferredWidth(300);
		tblMisPacientes.setBounds(0, 40, 1300, 590);

		scrollPane = new JScrollPane(tblMisPacientes);
		
		lblNombrePaciente = new JLabel("Nombre paciente");
		lblNombrePaciente.setBounds(30, 10, 300, 20);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(700, 10, 300, 20);

		lblHora = new JLabel("Hora");
		lblHora.setBounds(1000, 10, 300, 20);
		
		add(scrollPane);
		add(tblMisPacientes);
		add(lblNombrePaciente);
		add(lblFecha);
		add(lblHora);

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

	/**
	 * Metodo que retorna el valor del atributo lblNombrePaciente
	 * 
	 * @return Contenido del atributo lblNombrePaciente
	 */
	public JLabel getLblNombrePaciente() {
		return lblNombrePaciente;
	}
	/**
	 * Metodo que actualiza el valor del atributo lblNombrePaciente
	 * 
	 * @param lblNombrePaciente valor a actualizar
	 */
	public void setLblNombrePaciente(JLabel lblNombrePaciente) {
		this.lblNombrePaciente = lblNombrePaciente;
	}
	/**
	 * Metodo que retorna el valor del atributo lblFecha
	 * 
	 * @return Contenido del atributo lblFecha
	 */
	public JLabel getLblFecha() {
		return lblFecha;
	}
	/**
	 * Metodo que actualiza el valor del atributo lblFecha
	 * 
	 * @param lblFecha valor a actualizar
	 */
	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}
	/**
	 * Metodo que retorna el valor del atributo lblHora
	 * 
	 * @return Contenido del atributo lblHora
	 */
	public JLabel getLblHora() {
		return lblHora;
	}
	/**
	 * Metodo que actualiza el valor del atributo lblHora
	 * 
	 * @param lblHora valor a actualizar
	 */
	public void setLblHora(JLabel lblHora) {
		this.lblHora = lblHora;
	}

}
