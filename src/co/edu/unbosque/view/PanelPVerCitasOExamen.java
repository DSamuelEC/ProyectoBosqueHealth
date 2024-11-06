package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
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
	 * Atributo encargado de mostrar un texto Cita
	 */
	private JLabel lblCita;
	/**
	 * Atributo encargado de mostrar un texto Examen
	 */
	private JLabel lblExamen;
	/**
	 * Atributo encargado de mostrar un texto Nombre Especialista
	 */
	private JLabel lblNombreEspecialista;
	/**
	 * Atributo encargado de mostrar un texto Fecha
	 */
	private JLabel lblFecha;
	/**
	 * Atributo encargado de mostrar un texto Hora
	 */
	private JLabel lblHora;
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
		tblVerCitasOExamen = new JTable(50, 4);
		tblVerCitasOExamen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblVerCitasOExamen.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		columnModel.getColumn(1).setPreferredWidth(600);
		columnModel.getColumn(2).setPreferredWidth(300);
		columnModel.getColumn(3).setPreferredWidth(200);
		tblVerCitasOExamen.setBounds(0, 40, 1300, 590);

		lblCita = new JLabel("Cita");
		lblCita.setBounds(10, 10, 300, 20);
		lblCita.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCita.setForeground(new Color(5, 25, 35 ));
		
		lblExamen = new JLabel("Exámen");
		lblExamen.setBounds(10, 10, 300, 20);
		lblExamen.setVisible(false);
		lblExamen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExamen.setForeground(new Color(5, 25, 35 ));

		lblNombreEspecialista = new JLabel("Nombre Especialista");
		lblNombreEspecialista.setBounds(210, 10, 300, 20);
		lblNombreEspecialista.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombreEspecialista.setForeground(new Color(5, 25, 35 ));

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(810, 10, 300, 20);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setForeground(new Color(5, 25, 35 ));

		lblHora = new JLabel("Hora");
		lblHora.setBounds(1110, 10, 300, 20);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHora.setForeground(new Color(5, 25, 35 ));

		scrollPane = new JScrollPane(tblVerCitasOExamen);
		
		add(tblVerCitasOExamen);
		add(lblCita);
		add(lblExamen);
		add(lblFecha);
		add(lblHora);
		add(lblNombreEspecialista);
		add(scrollPane);

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
	 * Metodo que retorna el valor del atributo lblCita
	 * 
	 * @return Contenido del atributo lblCita
	 */
	public JLabel getLblCita() {
		return lblCita;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCita
	 * 
	 * @param lblCita valor a actualizar
	 */
	public void setLblCita(JLabel lblCita) {
		this.lblCita = lblCita;
	}

	/**
	 * Metodo que retorna el valor del atributo lblExamen
	 * 
	 * @return Contenido del atributo lblExamen
	 */
	public JLabel getLblExamen() {
		return lblExamen;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblExamen
	 * 
	 * @param lblExamen valor a actualizar
	 */
	public void setLblExamen(JLabel lblExamen) {
		this.lblExamen = lblExamen;
	}

	/**
	 * Metodo que retorna el valor del atributo lblNombreEspecialista
	 * 
	 * @return Contenido del atributo lblNombreEspecialista
	 */
	public JLabel getLblNombreEspecialista() {
		return lblNombreEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombreEspecialista
	 * 
	 * @param lblNombreEspecialista valor a actualizar
	 */
	public void setLblNombreEspecialista(JLabel lblNombreEspecialista) {
		this.lblNombreEspecialista = lblNombreEspecialista;
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
