package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de tener los botones para las funciones del Especialista
 * 
 * @author Mariana Ovallos
 */

public class PanelEspecialista extends JPanel {

	/**
	 * Atributo encargado de mostrar un texto con el nombre del especialista en el
	 * Panel
	 */

	private JLabel lblNombreEspecialista;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de Turnos
	 */
	private JButton btnTurnos;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de MisPacientes
	 */
	private JButton btnMisPacientes;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de CambiarTurno
	 */
	private JButton btnCambiarTurno;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de
	 * Notificaciones
	 */
	private JButton btnNotificaciones;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEspecialista() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {

		lblNombreEspecialista = new JLabel("");
		lblNombreEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnTurnos = new JButton("Turnos");
		btnTurnos.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnMisPacientes = new JButton("Mis Pacientes");
		btnMisPacientes.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnCambiarTurno = new JButton("Cambiar Turno");
		btnCambiarTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnNotificaciones = new JButton("Notificaciones");
		btnNotificaciones.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
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
	 * Metodo que retorna el valor del atributo btnTurnos
	 * 
	 * @return Contenido del atributo btnTurnos
	 */
	public JButton getBtnTurnos() {
		return btnTurnos;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnTurnos
	 * 
	 * @param btnTurnos valor a actualizar
	 */
	public void setBtnTurnos(JButton btnTurnos) {
		this.btnTurnos = btnTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMisPacientes
	 * 
	 * @return Contenido del atributo btnMisPacientes
	 */
	public JButton getBtnMisPacientes() {
		return btnMisPacientes;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnMisPacientes
	 * 
	 * @param btnMisPacientes valor a actualizar
	 */
	public void setBtnMisPacientes(JButton btnMisPacientes) {
		this.btnMisPacientes = btnMisPacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnCambiarTurno
	 * 
	 * @return Contenido del atributo btnCambiarTurno
	 */
	public JButton getBtnCambiarTurno() {
		return btnCambiarTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnCambiarTurno
	 * 
	 * @param btnCambiarTurno valor a actualizar
	 */
	public void setBtnCambiarTurno(JButton btnCambiarTurno) {
		this.btnCambiarTurno = btnCambiarTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo btnNotificaciones
	 * 
	 * @return Contenido del atributo btnNotificaciones
	 */
	public JButton getBtnNotificaciones() {
		return btnNotificaciones;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnNotificaciones
	 * 
	 * @param btnNotificaciones valor a actualizar
	 */
	public void setBtnNotificaciones(JButton btnNotificaciones) {
		this.btnNotificaciones = btnNotificaciones;
	}

}
