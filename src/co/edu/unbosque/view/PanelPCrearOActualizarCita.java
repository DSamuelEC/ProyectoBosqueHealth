package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
		lblAgendamiento.setForeground(new Color(5, 25, 35));

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
		btnBuscarDisponibilidad.setForeground(new Color(5, 25, 35));

		btnAgendar = new JButton("Agendar");
		btnAgendar.setBounds(1150, 50, 100, 30);
		btnAgendar.setActionCommand("P_CREAR_O_ACTUALIZAR_PACIENTE_AGENDAR");
		btnAgendar.setBackground(new Color(244, 158, 76));
		btnAgendar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgendar.setForeground(new Color(5, 25, 35));

		lblDisponinilidad = new JLabel("DISPONIBILIDAD");
		lblDisponinilidad.setBounds(580, 90, 300, 30);
		lblDisponinilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDisponinilidad.setForeground(new Color(5, 25, 35));

		DefaultTableModel modeloTabla = new DefaultTableModel(
				new Object[] { "Especialista", "Especialidad", "Fecha", "Hora Inicio", "Hora Final" }, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tblCrearOActualizar = new JTable(modeloTabla);
		tblCrearOActualizar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TableColumnModel columnModel = tblCrearOActualizar.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(400);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(200);
		columnModel.getColumn(4).setPreferredWidth(200);

		scrollPane = new JScrollPane(tblCrearOActualizar);
		scrollPane.setBounds(0, 120, 1300, 590);

		add(lblAgendamiento);
		add(lblDisponinilidad);
		add(ldIngreseEspecialista);
		add(txtDigiteFecha);
		add(btnAgendar);
		add(btnBuscarDisponibilidad);
		add(scrollPane);
	}

	/**
	 * Metodo que agrega una fila a la tabla
	 * 
	 * @param especialista Valor a agregar del nombre del especialista
	 * @param fecha        Valor a agregar de la fecha
	 * @param horaInicio   Valor a agregar de la hora de inicio
	 * @param horaFinal    Valor a agregar de la hora de fin
	 */
	public void agregarFilaTabla(String especialista, String especialidad, String fecha, String horaInicio,
			String horaFinal) {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblCrearOActualizar.getModel();
		modeloTabla.addRow(new Object[] { especialista, especialidad, fecha, horaInicio, horaFinal });
		modeloTabla.fireTableDataChanged();
		tblCrearOActualizar.getTableHeader().repaint();
	}
	
	/**
	 * Metodo encargado de limpiar la tabla cuando se quiera cambiar de
	 * visualizaciones
	 */
	public void limpiarTabla() {
		DefaultTableModel modeloTabla = (DefaultTableModel) tblCrearOActualizar.getModel();
		modeloTabla.setRowCount(0);
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