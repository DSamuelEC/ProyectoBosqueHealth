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
		btnRegistrarEspecialistas.setBounds(250, 30, 140, 40);
		btnRegistrarEspecialistas.setActionCommand("P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA");

		btnAsignarTurnos = new JButton("Asignar Turnos");
		btnAsignarTurnos.setBounds(400, 30, 130, 40);
		btnAsignarTurnos.setActionCommand("P_BOTONES_ADMIN_ASIGNAR_TURNOS");

		btnVerPacientes = new JButton("Ver Pacientes");
		btnVerPacientes.setBounds(540, 30, 130, 40);
		btnVerPacientes.setActionCommand("P_BOTONES_ADMIN_VER_PACIENTES");

		btnVerEspecialistas = new JButton("Ver Especialistas");
		btnVerEspecialistas.setBounds(680, 30, 140, 40);
		btnVerEspecialistas.setActionCommand("P_BOTONES_ADMIN_VER_ESPECIALISTAS");

		btnReportes = new JButton("Reportes");
		btnReportes.setBounds(830, 30, 120, 40);
		btnReportes.setActionCommand("P_BOTONES_ADMIN_REPORTES");

		btnConfiguraciones = new JButton("Configuraciones");
		btnConfiguraciones.setBounds(960, 30, 140, 40);
		btnConfiguraciones.setActionCommand("P_BOTONES_ADMIN_CONFIGURACIONES");

		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(1110, 30, 140, 40);
		btnCerrarSesion.setActionCommand("P_BOTONES_ADMIN_CERRAR_SESION");

		add(lblNombreAdmin);
		add(btnRegistrarEspecialistas);
		add(btnAsignarTurnos);
		add(btnVerPacientes);
		add(btnVerEspecialistas);
		add(btnReportes);
		add(btnConfiguraciones);
		add(btnCerrarSesion);
	}

	/**
	 * Metodo que retorna el valor del atributo lblNombreAdmin
	 * 
	 * @return Contenido del atributo lblNombreAdmin
	 */
	public JLabel getLblNombreAdmin() {
		return lblNombreAdmin;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombreAdmin
	 * 
	 * @param lblNombreAdmin valor a actualizar
	 */
	public void setLblNombreAdmin(JLabel lblNombreAdmin) {
		this.lblNombreAdmin = lblNombreAdmin;
	}

	/**
	 * Metodo que retorna el valor del atributo btnRegistrarEspecialistas
	 * 
	 * @return Contenido del atributo btnRegistrarEspecialistas
	 */
	public JButton getBtnRegistrarEspecialistas() {
		return btnRegistrarEspecialistas;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnRegistrarEspecialistas
	 * 
	 * @param btnRegistrarEspecialistas valor a actualizar
	 */
	public void setBtnRegistrarEspecialistas(JButton btnRegistrarEspecialistas) {
		this.btnRegistrarEspecialistas = btnRegistrarEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAsignarTurnos
	 * 
	 * @return Contenido del atributo btnAsignarTurnos
	 */
	public JButton getBtnAsignarTurnos() {
		return btnAsignarTurnos;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnAsignarTurnos
	 * 
	 * @param btnAsignarTurnos valor a actualizar
	 */
	public void setBtnAsignarTurnos(JButton btnAsignarTurnos) {
		this.btnAsignarTurnos = btnAsignarTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo btnVerPacientes
	 * 
	 * @return Contenido del atributo btnVerPacientes
	 */
	public JButton getBtnVerPacientes() {
		return btnVerPacientes;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnVerPacientes
	 * 
	 * @param btnVerPacientes valor a actualizar
	 */
	public void setBtnVerPacientes(JButton btnVerPacientes) {
		this.btnVerPacientes = btnVerPacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnVerEspecialistas
	 * 
	 * @return Contenido del atributo btnVerEspecialistas
	 */
	public JButton getBtnVerEspecialistas() {
		return btnVerEspecialistas;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnVerEspecialistas
	 * 
	 * @param btnVerEspecialistas valor a actualizar
	 */
	public void setBtnVerEspecialistas(JButton btnVerEspecialistas) {
		this.btnVerEspecialistas = btnVerEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnReportes
	 * 
	 * @return Contenido del atributo btnReportes
	 */
	public JButton getBtnReportes() {
		return btnReportes;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnReportes
	 * 
	 * @param btnReportes valor a actualizar
	 */
	public void setBtnReportes(JButton btnReportes) {
		this.btnReportes = btnReportes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnConfiguraciones
	 * 
	 * @return Contenido del atributo btnConfiguraciones
	 */
	public JButton getBtnConfiguraciones() {
		return btnConfiguraciones;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnConfiguraciones
	 * 
	 * @param btnConfiguraciones valor a actualizar
	 */
	public void setBtnConfiguraciones(JButton btnConfiguraciones) {
		this.btnConfiguraciones = btnConfiguraciones;
	}

	/**
	 * Metodo que retorna el valor del atributo btnCerrarSesion
	 * 
	 * @return Contenido del atributo btnCerrarSesion
	 */
	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnCerrarSesion
	 * 
	 * @param btnCerrarSesion valor a actualizar
	 */
	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}
}
