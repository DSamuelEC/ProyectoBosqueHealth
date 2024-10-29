package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

/**
 * Clase encargada del panel para poder ver la información de los pacientes y
 * escribir su tratamiento, examen y diagnostico. Según el especialista.
 * 
 * @author Mariana Ovallos
 */

public class PanelEVerMas extends JPanel {

	/**
	 * Atributo encargado de mostrar una etiqueta "Nombre del paciente" y el nombre
	 * del paciente en el Panel
	 */
	private JLabel lblNombrePaciente;

	/**
	 * Atributo encargado de mostrar una etiqueta "Nombre del Especialista" y el
	 * nombre del Especialista en el Panel
	 */
	private JLabel lblNombreEspecialista;
	/**
	 * Atributo encargado de mostrar una etiqueta "Fecha" y la fecha de la cita en
	 * el Panel
	 */
	private JLabel lblFecha;
	/**
	 * Atributo encargado de mostrar una etiqueta "Hora" y la hora de la cita en el
	 * Panel
	 */
	private JLabel lblHora;
	/*
	 * Atributo encargado de mostrar una etiqueta "Sexo" y el sexo del paciente en
	 * el Panel
	 */
	private JLabel lblSexo;
	/*
	 * Atributo encargado de mostrar una etiqueta "Edad" y la edad del paciente en
	 * el Panel
	 */
	private JLabel lblEdad;
	/*
	 * Atributo encargado de mostrar una etiqueta "Correo" y el correo del paciente
	 * en el Panel
	 */
	private JLabel lblCorreo;
	/*
	 * Atributo encargado de mostrar una etiqueta "Correo" y el correo del paciente
	 * en el Panel
	 */
	private JLabel lblCedula;
	/**
	 * Atributo encargado de almacenar el tratamiento del paciente
	 */
	private JTextField txtTratamiento;
	/**
	 * Atributo encargado de almacenar el diagnostico del paciente
	 */
	private JTextField txtDiagnostico;
	/**
	 * Atributo encargado de almacenar el examen del paciente
	 */
	private JTextField txtExamenes;
	/**
	 * Atributo encargado de mostrar un boton que guarde la información y vuelva al
	 * panel MisPacientes
	 */
	private JButton btnSubmit;
	/**
	 * Atributo encargado de mostrar un boton de volver al panelEMisPacientes
	 */
	private JButton btnAtras;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEVerMas() {
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
		lblNombrePaciente = new JLabel("Nombre del paciente: ");
		lblNombrePaciente.setBounds(40, 30, 300, 20);

		lblNombreEspecialista = new JLabel("Nombre del especialista: ");
		lblNombreEspecialista.setBounds(40, 70, 300, 20);

		lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(760, 30, 300, 20);

		lblHora = new JLabel("Hora: ");
		lblHora.setBounds(1050, 30, 300, 20);

		lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(40, 110, 300, 20);

		lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(40, 150, 300, 20);

		lblCorreo = new JLabel("Correo: ");
		lblCorreo.setBounds(40, 190, 300, 20);

		lblCedula = new JLabel("Cedula: ");
		lblCedula.setBounds(40, 230, 300, 20);

		txtTratamiento = new JTextField();
		txtTratamiento.setBounds(40, 270, 1200, 50);
		configurarPlaceHolder(txtTratamiento, "Tratamiento");

		txtDiagnostico = new JTextField();
		txtDiagnostico.setBounds(40, 340, 1200, 50);
		configurarPlaceHolder(txtDiagnostico, "Diagnostico");

		txtExamenes = new JTextField();
		txtExamenes.setBounds(40, 410, 1200, 50);
		configurarPlaceHolder(txtExamenes, "Examenes");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(660, 480, 100, 30);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(590, 480, 100, 30);
		
		add(btnSubmit);
		add(lblCedula);
		add(lblCorreo);
		add(lblEdad);
		add(lblFecha);
		add(lblHora);
		add(lblNombreEspecialista);
		add(lblNombrePaciente);
		add(lblSexo);
		add(txtDiagnostico);
		add(txtExamenes);
		add(txtTratamiento);
		add(btnAtras);
	}

	/**
	 * Metodo encargado de configurar el texto que se muestra en "txtNombre y
	 * txtCedula" para que cuando no tenga ningun texto muestre por defecto un
	 * mensaje indicando lo que debe ingresar el paciente
	 *
	 * @param textField
	 * @param placeholder
	 */
	public void configurarPlaceHolder(JTextField textField, String placeholder) {
		// Establecer el placeholder inicialmente
				textField.setText(placeholder);
				textField.setForeground(Color.GRAY);

				textField.addFocusListener(new FocusListener() {
					@Override
					public void focusGained(FocusEvent e) {
						// Si el texto es igual al placeholder, lo borra y cambia el color
						if (textField.getText().equals(placeholder)) {
							textField.setText("");
							textField.setForeground(Color.BLACK);
						}
					}

					@Override
					public void focusLost(FocusEvent e) {
						// Si el campo está vacío al perder el foco, restablece el placeholder
						if (textField.getText().isEmpty()) {
							textField.setForeground(Color.GRAY);
							textField.setText(placeholder);
						}
					}
				});
	}

	/**
	 * Metodo que retorna el valor del atributo lblNombrePaciente
	 * 
	 * @return Contenido del atributo lblNombrePaciente
	 */
	public JLabel getLblNombrePaciente() {
		return lblNombrePaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombrePaciente
	 * 
	 * @param lblNombrePaciente Valor a actualizar
	 */
	public void setLblNombrePaciente(JLabel lblNombrePaciente) {
		this.lblNombrePaciente = lblNombrePaciente;
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
	 * @param lblNombreEspecialista Valor a actualizar
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
	 * @param lblFecha Valor a actualizar
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
	 * @param lblHora Valor a actualizar
	 */
	public void setLblHora(JLabel lblHora) {
		this.lblHora = lblHora;
	}

	/**
	 * Metodo que retorna el valor del atributo lblSexo
	 * 
	 * @return Contenido del atributo lblSexo
	 */
	public JLabel getLblSexo() {
		return lblSexo;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblSexo
	 * 
	 * @param lblSexo Valor a actualizar
	 */
	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEdad
	 * 
	 * @return Contenido del atributo lblEdad
	 */
	public JLabel getLblEdad() {
		return lblEdad;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblEdad
	 * 
	 * @param lblEdad Valor a actualizar
	 */
	public void setLblEdad(JLabel lblEdad) {
		this.lblEdad = lblEdad;
	}

	/**
	 * Metodo que retorna el valor del atributo lblCorreo
	 * 
	 * @return Contenido del atributo lblCorreo
	 */
	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCorreo
	 * 
	 * @param lblCorreo Valor a actualizar
	 */
	public void setLblCorreo(JLabel lblCorreo) {
		this.lblCorreo = lblCorreo;
	}

	/**
	 * Metodo que retorna el valor del atributo lblCedula
	 * 
	 * @return Contenido del atributo lblCedula
	 */
	public JLabel getLblCedula() {
		return lblCedula;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCedula
	 * 
	 * @param lblCedula Valor a actualizar
	 */
	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	/**
	 * Metodo que retorna el valor del atributo txtTratamiento
	 * 
	 * @return Contenido del atributo txtTratamiento
	 */
	public JTextField getTxtTratamiento() {
		return txtTratamiento;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtTratamiento
	 * 
	 * @param txtTratamiento Valor a actualizar
	 */
	public void setTxtTratamiento(JTextField txtTratamiento) {
		this.txtTratamiento = txtTratamiento;
	}

	/**
	 * Metodo que retorna el valor del atributo txtDiagnostico
	 * 
	 * @return Contenido del atributo txtDiagnostico
	 */
	public JTextField getTxtDiagnostico() {
		return txtDiagnostico;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtDiagnostico
	 * 
	 * @param txtDiagnostico Valor a actualizar
	 */
	public void setTxtDiagnostico(JTextField txtDiagnostico) {
		this.txtDiagnostico = txtDiagnostico;
	}

	/**
	 * Metodo que retorna el valor del atributo txtExamenes
	 * 
	 * @return Contenido del atributo txtExamenes
	 */
	public JTextField getTxtExamenes() {
		return txtExamenes;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtExamenes
	 * 
	 * @param txtExamenes Valor a actualizar
	 */
	public void setTxtExamenes(JTextField txtExamenes) {
		this.txtExamenes = txtExamenes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnSubmit
	 * 
	 * @return Contenido del atributo btnSubmit
	 */
	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnSubmit
	 * 
	 * @param btnSubmit Valor a actualizar
	 */
	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	/**
	 * Metodo que retorna el valor del atributo btnAtras
	 * 
	 * @return Contenido del atributo btnAtras
	 */
	public JButton getBtnAtras() {
		return btnAtras;
	}
	/**
	 * Metodo que actualiza el valor del atributo btnAtras
	 * 
	 * @param btnAtras Valor a actualizar
	 */
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}

}
