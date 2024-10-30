package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase encargada de tener los botones para las funciones del Admin
 * 
 * @author Samuel Diaz
 */
public class PanelAdBotones extends JPanel {

	/**
	 * Atributo encargado de mostrar un texto con el nombre del admin en el Panel
	 */
	private JLabel lblNombreAdmin;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel encargado de
	 * registrar un especialista
	 */
	private JButton btnRegistrarEspecialistas;
	/**
	 * Atributo encargado de mostrar un boton que permita asignar los turnos
	 * automaticamente para los especialistas y enviar al correo la informacion
	 */
	private JButton btnAsignarTurnos;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel encargado de
	 * mostrar los pacientes
	 */
	private JButton btnVerPacientes;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel encargado de
	 * mostrar los especialistas
	 */
	private JButton btnVerEspecialistas;
	/**
	 * Atributo encargado de mostrar un boton que permite elegir el tipo de reporte
	 * que quiere ver
	 */
	private JButton btnReportes;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel encargado de
	 * mostrar las configuraciones que el admin puede hacer
	 */
	private JButton btnConfiguraciones;
	/**
	 * Atributo encargado de mostrar un boton que cierre sesion y regrese al panel
	 * Acceso
	 */
	private JButton btnCerrarSesion;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAdBotones() {
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
		lblNombreAdmin = new JLabel("Nombre Admin");
		lblNombreAdmin.setBounds(50, 20, 700, 60);

		btnRegistrarEspecialistas = new JButton("Crear Especialista");
		btnRegistrarEspecialistas.setBounds(250, 30, 150, 40);
		btnRegistrarEspecialistas.setActionCommand("P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA");

		btnAsignarTurnos = new JButton("Crear Especialista");
		btnAsignarTurnos.setBounds(250, 30, 150, 40);
		btnAsignarTurnos.setActionCommand("P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA");

		add(lblNombreAdmin);
		add(btnRegistrarEspecialistas);
		add(btnAsignarTurnos);
	}

	public JLabel getLblNombreAdmin() {
		return lblNombreAdmin;
	}

	public void setLblNombreAdmin(JLabel lblNombreAdmin) {
		this.lblNombreAdmin = lblNombreAdmin;
	}

	public JButton getBtnRegistrarEspecialistas() {
		return btnRegistrarEspecialistas;
	}

	public void setBtnRegistrarEspecialistas(JButton btnRegistrarEspecialistas) {
		this.btnRegistrarEspecialistas = btnRegistrarEspecialistas;
	}

	public JButton getBtnAsignarTurnos() {
		return btnAsignarTurnos;
	}

	public void setBtnAsignarTurnos(JButton btnAsignarTurnos) {
		this.btnAsignarTurnos = btnAsignarTurnos;
	}

	public JButton getBtnVerPacientes() {
		return btnVerPacientes;
	}

	public void setBtnVerPacientes(JButton btnVerPacientes) {
		this.btnVerPacientes = btnVerPacientes;
	}

	public JButton getBtnVerEspecialistas() {
		return btnVerEspecialistas;
	}

	public void setBtnVerEspecialistas(JButton btnVerEspecialistas) {
		this.btnVerEspecialistas = btnVerEspecialistas;
	}

	public JButton getBtnReportes() {
		return btnReportes;
	}

	public void setBtnReportes(JButton btnReportes) {
		this.btnReportes = btnReportes;
	}

	public JButton getBtnConfiguraciones() {
		return btnConfiguraciones;
	}

	public void setBtnConfiguraciones(JButton btnConfiguraciones) {
		this.btnConfiguraciones = btnConfiguraciones;
	}

	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}
}
