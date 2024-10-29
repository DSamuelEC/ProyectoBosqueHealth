package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.table.TableColumnModel;

/**
 * Clase encargada de mostrar una tabla con los cambios que compañeros quieren
 * hacer de turno, para aceptarlo o rechazarlos
 */
public class PanelESolicitudTurno extends JPanel {
	/**
	 * Atributo encargado de mostrar una tabla con el nombre y fecha de los
	 * compañeros que quieren hacer un cambio de turno
	 */
	private JTable tblSolicitudTurno;
	/**
	 * Atributo encargado de mostrar un boton para aceptar el cambio
	 */
	private JButton btnAceptar;
	/**
	 * Atributo encargado de mostrar un boton para rechazar el cambio
	 */
	private JButton btnRechazar;
	/**
	 * Atribujo encargado de mostrar un panel de desplazamiento
	 */
	private JScrollPane scrollPane;
	/**
	 * Atributo encargado de mostrar un texto del nombre del compañero en el Panel
	 */
	private JLabel lblNombreCompañero;
	/**
	 * Atributo encargado de mostrar un texto de la fecha para del turno del
	 * compañero el Panel
	 */
	private JLabel lblFecha;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelESolicitudTurno() {
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
		tblSolicitudTurno = new JTable(50, 2);
		TableColumnModel columnModel = tblSolicitudTurno.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(800);
		columnModel.getColumn(1).setPreferredWidth(500);
		tblSolicitudTurno.setBounds(0, 40, 1300, 450);

		btnAceptar = new JButton("Aceptar Cambio");
		btnAceptar.setBounds(870, 505, 170, 30);

		btnRechazar = new JButton("Rechazar Cambio");
		btnRechazar.setBounds(1070, 505, 170, 30);

		scrollPane = new JScrollPane(tblSolicitudTurno);

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(810, 10, 300, 20);

		lblNombreCompañero = new JLabel("Nombre Compañero");
		lblNombreCompañero.setBounds(30, 10, 300, 20);

		add(lblNombreCompañero);
		add(lblFecha);
		add(btnAceptar);
		add(btnRechazar);
		add(scrollPane);
		add(tblSolicitudTurno);
	}

	/**
	 * Metodo que retorna el valor del atributo tblSolicitudTurno
	 * 
	 * @return Contenido del atributo tblSolicitudTurno
	 */
	public JTable getTblSolicitudTurno() {
		return tblSolicitudTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo tblSolicitudTurno
	 * 
	 * @param tblSolicitudTurno valor a actualizar
	 */
	public void setTblSolicitudTurno(JTable tblSolicitudTurno) {
		this.tblSolicitudTurno = tblSolicitudTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAceptar
	 * 
	 * @return Contenido del atributo btnAceptar
	 */
	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnAceptar
	 * 
	 * @param btnAceptar valor a actualizar
	 */
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	/**
	 * Metodo que retorna el valor del atributo btnRechazar
	 * 
	 * @return Contenido del atributo btnRechazar
	 */
	public JButton getBtnRechazar() {
		return btnRechazar;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnRechazar
	 * 
	 * @param btnRechazar valor a actualizar
	 */
	public void setBtnRechazar(JButton btnRechazar) {
		this.btnRechazar = btnRechazar;
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
	 * Metodo que retorna el valor del atributo lblNombreCompañero
	 * 
	 * @return Contenido del atributo lblNombreCompañero
	 */
	public JLabel getLblNombreCompañero() {
		return lblNombreCompañero;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombreCompañero
	 * 
	 * @param lblNombreCompañero valor a actualizar
	 */
	public void setLblNombreCompañero(JLabel lblNombreCompañero) {
		this.lblNombreCompañero = lblNombreCompañero;
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

}
