package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;

/**
 * Clase encargada de tener los botones para las funciones del Paciente
 * 
 * @author Mariana Ovallos
 */
public class PanelPSuperior extends JPanel {
	/**
	 * Atributo encargado de mostrar un texto con el nombre del paciente en el Panel
	 */
	private JLabel lblNombre;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de Ver
	 * CitasOExamen para el caso de Citas
	 */
	private JButton btnVerCitas;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de Ver
	 * CitasOExamen para el caso de Examenes
	 */
	private JButton btnVerExamenes;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de
	 * CrearOActualizar para el caso de crear
	 */
	private JButton btnAgendarCita;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de
	 * CrearOActualizar para el caso de Actualizarla
	 */
	private JButton btnReagendarCita;
	/**
	 * Atributo encargado de mostrar un boton que de acceso al Panel de
	 * CrearOActualizar para el caso de Eliminar
	 */
	private JButton btnCancelarCita;
	/**
	 * Atributo encargado de mostrar un boton que cierre sesion y regrese al panel
	 * Acceso
	 */
	private JButton btnCerrarSesion;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelPSuperior() {
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

		lblNombre = new JLabel("Nombre Usuario");
		lblNombre.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnVerCitas = new JButton("Ver Citas");
		btnVerCitas.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnVerCitas.setActionCommand("P_SUPERIOR_PACIENTE_VER_CITAS");

		btnVerExamenes = new JButton("Ver Examenes");
		btnVerExamenes.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnVerExamenes.setActionCommand("P_SUPERIOR_PACIENTE_VER_EXAMENES");
		
		btnAgendarCita = new JButton("Agendar Cita");
		btnAgendarCita.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnAgendarCita.setActionCommand("P_SUPERIOR_PACIENTE_AGENDAR_CITA");

		btnReagendarCita = new JButton("Reagendar Cita");
		btnReagendarCita.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnReagendarCita.setActionCommand("P_SUPERIOR_PACIENTE_REAGENDAR_CITA");

		btnCancelarCita = new JButton("Cancelar Cita");
		btnCancelarCita.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnCancelarCita.setActionCommand("P_SUPERIOR_PACIENTE_CANCELAR_CITA");

		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnCerrarSesion.setActionCommand("P_SUPERIOR_PACIENTE_CERRAR_SESION");
		
		add(lblNombre);
		add(btnAgendarCita);
		add(btnCancelarCita);
		add(btnCerrarSesion);
		add(btnReagendarCita);
		add(btnVerCitas);
		add(btnVerExamenes);

	}

	/**
	 * Metodo que retorna el valor del atributo lblNombre
	 * 
	 * @return Contenido del atributo lblNombre
	 */
	public JLabel getLblNombre() {
		return lblNombre;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombre
	 * 
	 * @param lblNombre valor a actualizar
	 */
	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	/**
	 * Metodo que retorna el valor del atributo btnVerCitas
	 * 
	 * @return Contenido del atributo btnVerCitas
	 */
	public JButton getBtnVerCitas() {
		return btnVerCitas;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnVerCitas
	 * 
	 * @param btnVerCitas valor a actualizar
	 */
	public void setBtnVerCitas(JButton btnVerCitas) {
		this.btnVerCitas = btnVerCitas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnVerExamenes
	 * 
	 * @return Contenido del atributo btnVerExamenes
	 */
	public JButton getBtnVerExamenes() {
		return btnVerExamenes;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnVerExamenes
	 * 
	 * @param btnVerExamenes valor a actualizar
	 */
	public void setBtnVerExamenes(JButton btnVerExamenes) {
		this.btnVerExamenes = btnVerExamenes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAgendarCita
	 * 
	 * @return Contenido del atributo btnAgendarCita
	 */
	public JButton getBtnAgendarCita() {
		return btnAgendarCita;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnAgendarCita
	 * 
	 * @param btnAgendarCita valor a actualizar
	 */
	public void setBtnAgendarCita(JButton btnAgendarCita) {
		this.btnAgendarCita = btnAgendarCita;
	}

	/**
	 * Metodo que retorna el valor del atributo btnReagendarCita
	 * 
	 * @return Contenido del atributo btnReagendarCita
	 */
	public JButton getBtnReagendarCita() {
		return btnReagendarCita;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnReagendarCita
	 * 
	 * @param btnReagendarCita valor a actualizar
	 */
	public void setBtnReagendarCita(JButton btnReagendarCita) {
		this.btnReagendarCita = btnReagendarCita;
	}

	/**
	 * Metodo que retorna el valor del atributo btnCancelarCita
	 * 
	 * @return Contenido del atributo btnCancelarCita
	 */
	public JButton getBtnCancelarCita() {
		return btnCancelarCita;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnCancelarCita
	 * 
	 * @param btnCancelarCita valor a actualizar
	 */
	public void setBtnCancelarCita(JButton btnCancelarCita) {
		this.btnCancelarCita = btnCancelarCita;
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
