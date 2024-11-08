package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

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
	 * Atributo encargado de mostrar un boton que de acceso al Panel VerMas del Paciente
	 */
	private JButton btnVerMas;

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
		lblNombre.setBounds(50, 20, 700, 60);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setForeground(new Color(5, 25, 35 ));

		btnVerCitas = new JButton("Ver Citas");
		btnVerCitas.setBounds(240, 30, 130, 40);
		btnVerCitas.setActionCommand("P_SUPERIOR_PACIENTE_VER_CITAS");
		btnVerCitas.setBackground(new Color(244, 158, 76));
		btnVerCitas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerCitas.setForeground(new Color(5, 25, 35 ));

		btnVerExamenes = new JButton("Ver Examenes");
		btnVerExamenes.setBounds(390, 30, 130, 40);
		btnVerExamenes.setActionCommand("P_SUPERIOR_PACIENTE_VER_EXAMENES");
		btnVerExamenes.setBackground(new Color(244, 158, 76));
		btnVerExamenes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerExamenes.setForeground(new Color(5, 25, 35 ));
		
		btnAgendarCita = new JButton("Agendar Cita");
		btnAgendarCita.setBounds(690, 30, 130, 40);
		btnAgendarCita.setActionCommand("P_SUPERIOR_PACIENTE_AGENDAR_CITA");
		btnAgendarCita.setBackground(new Color(244, 158, 76));
		btnAgendarCita.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgendarCita.setForeground(new Color(5, 25, 35 ));

		btnReagendarCita = new JButton("Reagendar Cita");
		btnReagendarCita.setBounds(840, 30, 130, 40);
		btnReagendarCita.setActionCommand("P_SUPERIOR_PACIENTE_REAGENDAR_CITA");
		btnReagendarCita.setBackground(new Color(244, 158, 76));
		btnReagendarCita.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReagendarCita.setForeground(new Color(5, 25, 35 ));

		btnCancelarCita = new JButton("Cancelar Cita");
		btnCancelarCita.setBounds(990, 30, 130, 40);
		btnCancelarCita.setActionCommand("P_SUPERIOR_PACIENTE_CANCELAR_CITA");
		btnCancelarCita.setBackground(new Color(244, 158, 76));
		btnCancelarCita.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelarCita.setForeground(new Color(5, 25, 35 ));

		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(1140, 30, 130, 40);
		btnCerrarSesion.setActionCommand("P_SUPERIOR_PACIENTE_CERRAR_SESION");
		btnCerrarSesion.setBackground(new Color(244, 158, 76));
		btnCerrarSesion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCerrarSesion.setForeground(new Color(5, 25, 35 ));
		
		btnVerMas = new JButton("Ver Mas");
		btnVerMas.setBounds(540, 30, 130, 40);
		btnVerMas.setActionCommand("P_SUPERIOR_PACIENTE_VER_MAS");
		btnVerMas.setBackground(new Color(244, 158, 76));
		btnVerMas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerMas.setForeground(new Color(5, 25, 35 ));
		
		
		add(lblNombre);
		add(btnAgendarCita);
		add(btnCancelarCita);
		add(btnCerrarSesion);
		add(btnReagendarCita);
		add(btnVerCitas);
		add(btnVerExamenes);
		add(btnVerMas);
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

}
