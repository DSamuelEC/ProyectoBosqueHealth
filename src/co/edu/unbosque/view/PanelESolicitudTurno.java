package co.edu.unbosque.view;

import javax.swing.*;

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
	 * Metodo Constructor de la clase
	 */
	public PanelESolicitudTurno() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		tblSolicitudTurno = new JTable();

		btnAceptar = new JButton("Aceptar Cambio");
		btnAceptar.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnRechazar = new JButton("Rechazar Cambio");
		btnRechazar.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		scrollPane = new JScrollPane();
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

}
