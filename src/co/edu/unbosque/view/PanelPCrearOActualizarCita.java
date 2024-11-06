package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.table.TableColumnModel;

/**
 * Clase encargada de mostrar el panel para el agendamiento de citas, para
 * actualizar y crear.
 * 
 * @author Mariana Ovallos
 */
public class PanelPCrearOActualizarCita extends JPanel {

	/**
	 * Atributo encargado de mostrar un texto como titulo Agendamiento
	 */
	private JLabel lblAgendamiento;
	/**
	 * Atributo encargado de mostrar una lista desplegable con las especialidades
	 * que maneja el hospital
	 */
	private JComboBox ldIngreseEspecialista;
	/**
	 * Atributo encargado de almacenar la fecha que busca el paciente para su cita
	 */
	private JTextField txtDigiteFecha;
	/**
	 * Atributo encargado de mostrar un boton para buscar la disponibilidad de citas
	 * según la fecha
	 */
	private JButton btnBuscarDisponibilidad;
	/**
	 * Atributo encargado de mostrar un boton Agendar para agendar la cita o
	 * actualizarla
	 */
	private JButton btnAgendar;
	/**
	 * Atributo encargado de mostrar un texto como titulo Disponibilidad
	 */
	private JLabel lblDisponinilidad;
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
	 * Atributo encargado de motrar una tabla con las citas disponibles
	 */
	private JTable tblCrearOActualizar;
	/**
	 * Atribujo encargado de mostrar un panel de desplazamiento
	 */
	private JScrollPane scrollPane;

	/**
	 * Metodo Constructor de la clase
	 */

	public PanelPCrearOActualizarCita() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		lblAgendamiento = new JLabel("AGENDAMIENTO DE CITAS");
		lblAgendamiento.setBounds(545, 12, 300, 30);
		lblAgendamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgendamiento.setForeground(new Color(5, 25, 35 ));

		String[] opciones = { "Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología", "Medicina Interna" };
		ldIngreseEspecialista = new JComboBox<String>(opciones);
		ldIngreseEspecialista.setBounds(50, 50, 350, 30);

		txtDigiteFecha = new JTextField();
		txtDigiteFecha.setBounds(420, 50, 400, 30);
		configurarPlaceHolder(txtDigiteFecha, "Digite Fecha AA/MM/DD");

		btnBuscarDisponibilidad = new JButton("Buscar Disponibilidad");
		btnBuscarDisponibilidad.setBounds(860, 50, 250, 30);
		btnBuscarDisponibilidad.setActionCommand("P_CREAR_O_ACTUALIZAR_PACIENTE_BUSCAR_DISPONIBILIDAD");
		btnBuscarDisponibilidad.setBackground(new Color(244, 158, 76));
		btnBuscarDisponibilidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarDisponibilidad.setForeground(new Color(5, 25, 35 ));

		btnAgendar = new JButton("Agendar");
		btnAgendar.setBounds(1150, 50, 100, 30);
		btnAgendar.setActionCommand("P_CREAR_O_ACTUALIZAR_PACIENTE_AGENDAR");
		btnAgendar.setBackground(new Color(244, 158, 76));
		btnAgendar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgendar.setForeground(new Color(5, 25, 35 ));

		lblDisponinilidad = new JLabel("DISPONIBILIDAD");
		lblDisponinilidad.setBounds(580, 100, 300, 30);
		lblDisponinilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDisponinilidad.setForeground(new Color(5, 25, 35 ));

		lblCita = new JLabel("Cita");
		lblCita.setBounds(10, 120, 300, 30);
		lblCita.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCita.setForeground(new Color(5, 25, 35 ));

		lblExamen = new JLabel("Exámen");
		lblExamen.setBounds(10, 120, 300, 30);
		lblExamen.setVisible(false);
		lblExamen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExamen.setForeground(new Color(5, 25, 35 ));

		lblNombreEspecialista = new JLabel("Nombre Especialista");
		lblNombreEspecialista.setBounds(210, 120, 300, 30);
		lblNombreEspecialista.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombreEspecialista.setForeground(new Color(5, 25, 35 ));

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(810, 120, 300, 30);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setForeground(new Color(5, 25, 35 ));

		lblHora = new JLabel("Hora");
		lblHora.setBounds(1110, 120, 300, 30);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHora.setForeground(new Color(5, 25, 35 ));

		tblCrearOActualizar = new JTable(50, 4);
		tblCrearOActualizar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblCrearOActualizar.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		columnModel.getColumn(1).setPreferredWidth(600);
		columnModel.getColumn(2).setPreferredWidth(300);
		columnModel.getColumn(3).setPreferredWidth(200);
		tblCrearOActualizar.setBounds(0, 150, 1300, 590);

		scrollPane = new JScrollPane(tblCrearOActualizar);

		add(lblAgendamiento);
		add(lblCita);
		add(lblDisponinilidad);
		add(lblExamen);
		add(lblFecha);
		add(lblHora);
		add(lblNombreEspecialista);
		add(ldIngreseEspecialista);
		add(txtDigiteFecha);
		add(tblCrearOActualizar);
		add(btnAgendar);
		add(btnBuscarDisponibilidad);

	}

	/**
	 * Metodo encargado de configurar el texto que se muestra en "txtNombre,
	 * txtCedula, txtCorreo y txtEdad" para que cuando no tenga ningun texto muestre
	 * por defecto un mensaje indicando lo que debe ingresar el paciente
	 */
	public void configurarPlaceHolder(JTextField textField, String placeholder) {
		textField.setText(placeholder);
		textField.setForeground(Color.GRAY);

		textField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals(placeholder)) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setForeground(Color.GRAY);
					textField.setText(placeholder);
				}
			}
		});
	}

	/**
	 * Metodo que retorna el valor del atributo lblAgendamiento
	 * 
	 * @return Contenido del atributo lblAgendamiento
	 */
	public JLabel getLblAgendamiento() {
		return lblAgendamiento;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblAgendamiento
	 * 
	 * @param lblAgendamiento valor a actualizar
	 */
	public void setLblAgendamiento(JLabel lblAgendamiento) {
		this.lblAgendamiento = lblAgendamiento;
	}

	/**
	 * Metodo que retorna el valor del atributo ldIngreseEspecialista
	 * 
	 * @return Contenido del atributo ldIngreseEspecialista
	 */
	public JComboBox getIdIngreseEspecialista() {
		return ldIngreseEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo ldIngreseEspecialista
	 * 
	 * @param ldIngreseEspecialista valor a actualizar
	 */
	public void setIdIngreseEspecialista(JComboBox idIngreseEspecialista) {
		this.ldIngreseEspecialista = idIngreseEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo txtDigiteFecha
	 * 
	 * @return Contenido del atributo txtDigiteFecha
	 */
	public JTextField getTxtDigiteFecha() {
		return txtDigiteFecha;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtDigiteFecha
	 * 
	 * @param txtDigiteFecha valor a actualizar
	 */
	public void setTxtDigiteFecha(JTextField txtDigiteFecha) {
		this.txtDigiteFecha = txtDigiteFecha;
	}

	/**
	 * Metodo que retorna el valor del atributo btnBuscarDisponibilidad
	 * 
	 * @return Contenido del atributo btnBuscarDisponibilidad
	 */
	public JButton getBtnBuscarDisponibilidad() {
		return btnBuscarDisponibilidad;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnBuscarDisponibilidad
	 * 
	 * @param btnBuscarDisponibilidad valor a actualizar
	 */
	public void setBtnBuscarDisponibilidad(JButton btnBuscarDisponibilidad) {
		this.btnBuscarDisponibilidad = btnBuscarDisponibilidad;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAgendar
	 * 
	 * @return Contenido del atributo btnAgendar
	 */
	public JButton getBtnAgendar() {
		return btnAgendar;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnAgendar
	 * 
	 * @param btnAgendar valor a actualizar
	 */
	public void setBtnAgendar(JButton btnAgendar) {
		this.btnAgendar = btnAgendar;
	}

	/**
	 * Metodo que retorna el valor del atributo lblDisponinilidad
	 * 
	 * @return Contenido del atributo lblDisponinilidad
	 */
	public JLabel getLblDisponinilidad() {
		return lblDisponinilidad;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblDisponinilidad
	 * 
	 * @param lblDisponinilidad valor a actualizar
	 */
	public void setLblDisponinilidad(JLabel lblDisponinilidad) {
		this.lblDisponinilidad = lblDisponinilidad;
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
	 * Metodo que retorna el valor del atributo tblCrearOActualizar
	 * 
	 * @return Contenido del atributo tblCrearOActualizar
	 */
	public JTable getTblCrearOActualizar() {
		return tblCrearOActualizar;
	}

	/**
	 * Metodo que actualiza el valor del atributo tblCrearOActualizar
	 * 
	 * @param tblCrearOActualizar valor a actualizar
	 */
	public void setTblCrearOActualizar(JTable tblCrearOActualizar) {
		this.tblCrearOActualizar = tblCrearOActualizar;
	}

}
