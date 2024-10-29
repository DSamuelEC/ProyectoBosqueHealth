package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de tener los botones para las funciones del Especialista
 * 
 * @author Mariana Ovallos
 */

public class PanelEBotones extends JPanel {

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
	 * Atributo encargado de mostrar un boton que de acceso al Panel VerMas
	 */
	private JButton btnVerMas;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel SolicitudTurno
	 */
	private JButton btnSolicitudTurno;
	/**
	 * Atributo encargado de mostrar un boton que cierre sesión y regrese al panel
	 * Acceso
	 */
	private JButton btnCerrarSesion;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEBotones() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(false);
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

		btnVerMas = new JButton("Ver Más");
		btnVerMas.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnCerrarSesion = new JButton("Cerrar Sesión");
		btnCerrarSesion.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnSolicitudTurno = new JButton("Solicitud Turno");
		btnSolicitudTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

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
	 * Metodo que retorna el valor del atributo btnVerMas
	 * 
	 * @return Contenido del atributo btnVerMas
	 */
	public JButton getBtnVerMas() {
		return btnVerMas;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnVerMas
	 * 
	 * @param btnVerMas valor a actualizar
	 */
	public void setBtnVerMas(JButton btnVerMas) {
		this.btnVerMas = btnVerMas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnSolicitudTurno
	 * 
	 * @return Contenido del atributo btnSolicitudTurno
	 */
	public JButton getBtnSolicitudTurno() {
		return btnSolicitudTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnSolicitudTurno
	 * 
	 * @param btnSolicitudTurno valor a actualizar
	 */
	public void setBtnSolicitudTurno(JButton btnSolicitudTurno) {
		this.btnSolicitudTurno = btnSolicitudTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo CerrarSesion
	 * 
	 * @return Contenido del atributo CerrarSesion
	 */
	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

	/**
	 * Metodo que actualiza el valor del atributo CerrarSesion
	 * 
	 * @param CerrarSesion valor a actualizar
	 */
	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}

}
