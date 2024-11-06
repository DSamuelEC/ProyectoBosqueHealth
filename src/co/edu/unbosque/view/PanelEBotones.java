package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

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
	 * Atributo encargado de mostrar un boton que cierre sesion y regrese al panel
	 * Acceso
	 */
	private JButton btnCerrarSesion;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEBotones() {
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

		lblNombreEspecialista = new JLabel("Nombre Especialista");
		lblNombreEspecialista.setBounds(50, 20, 700, 60);
		lblNombreEspecialista.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreEspecialista.setForeground(new Color(5, 25, 35 ));
	
		btnTurnos = new JButton("Turnos");
		btnTurnos.setBounds(250, 30, 150, 40);
		btnTurnos.setActionCommand("P_BOTONES_ESPECIALISTA_TURNOS");
		btnTurnos.setBackground(new Color(244, 158, 76));
		btnTurnos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTurnos.setForeground(new Color(5, 25, 35 ));
		
		btnMisPacientes = new JButton("Mis Pacientes");
		btnMisPacientes.setBounds(420, 30, 150, 40);
		btnMisPacientes.setActionCommand("P_BOTONES_ESPECIALISTA_MIS_PACIENTES");
		btnMisPacientes.setBackground(new Color(244, 158, 76));
		btnMisPacientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMisPacientes.setForeground(new Color(5, 25, 35 ));
		
		btnVerMas = new JButton("Ver Más");
		btnVerMas.setBounds(590, 30, 150, 40);
		btnVerMas.setActionCommand("P_BOTONES_ESPECIALISTA_VER_MAS");
		btnVerMas.setBackground(new Color(244, 158, 76));
		btnVerMas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerMas.setForeground(new Color(5, 25, 35 ));

		btnCambiarTurno = new JButton("Cambiar Turno");
		btnCambiarTurno.setBounds(760, 30, 150, 40);
		btnCambiarTurno.setActionCommand("P_BOTONES_ESPECIALISTA_CAMBIAR_TURNO");
		btnCambiarTurno.setBackground(new Color(244, 158, 76));
		btnCambiarTurno.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCambiarTurno.setForeground(new Color(5, 25, 35 ));
		
		btnSolicitudTurno = new JButton("Solicitud Turno");
		btnSolicitudTurno.setBounds(930, 30, 150, 40);
		btnSolicitudTurno.setActionCommand("P_BOTONES_ESPECIALISTA_SOLICITUD_TURNO");
		btnSolicitudTurno.setBackground(new Color(244, 158, 76));
		btnSolicitudTurno.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSolicitudTurno.setForeground(new Color(5, 25, 35 ));

		btnCerrarSesion = new JButton("Cerrar Sesión");
		btnCerrarSesion.setBounds(1100, 30, 150, 40);
		btnCerrarSesion.setActionCommand("P_BOTONES_ESPECIALISTA_CERRAR_SESION");
		btnCerrarSesion.setBackground(new Color(244, 158, 76));
		btnCerrarSesion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCerrarSesion.setForeground(new Color(5, 25, 35 ));

		add(btnCambiarTurno);
		add(btnCerrarSesion);
		add(btnMisPacientes);
		add(btnSolicitudTurno);
		add(btnTurnos);
		add(btnVerMas);
		add(lblNombreEspecialista);

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
