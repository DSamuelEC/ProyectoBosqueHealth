package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada del panel para poder cambiar de turno con otro especialista
 * 
 * @author Mariana Ovallos
 */
public class PanelCambiarTurno extends JPanel {

	/**
	 * Atributo encargado de almacenar el Nombre del compañero con el que se desea
	 * cambiar de turno
	 */
	private JTextField txtNombreCompañero;
	/**
	 * Atributo encargado de almacenar la fecha del nuevo turno
	 */
	private JTextField txtFecha;
	/**
	 * Atributo encargado de almacenar la hora inicial del nuevo turno
	 */
	private JTextField txtHoraInicio;
	/**
	 * Atributo encargado de almacenar la hora final del nuevo turno
	 */
	private JTextField txtHoraFinal;
	/**
	 * Atributo encargado de mostrar un boton que guarde la información y vuelva al
	 * panel principal
	 */
	private JButton btnSubmit;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelCambiarTurno() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		txtNombreCompañero = new JTextField();
		txtNombreCompañero.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceHolder(txtNombreCompañero, "Nombre Compañero");

		txtFecha = new JTextField();
		txtFecha.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceHolder(txtFecha, "Fecha");

		txtHoraInicio = new JTextField();
		txtHoraInicio.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceHolder(txtHoraInicio, "Hora inicio");

		txtHoraFinal = new JTextField();
		txtHoraFinal.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceHolder(txtHoraFinal, "Hora Final");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

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

	}

	/**
	 * Metodo que retorna el valor del atributo txtNombreCompañero
	 * 
	 * @return Contenido del atributo txtNombreCompañero
	 */
	public JTextField getTxtNombreCompañero() {
		return txtNombreCompañero;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtNombreCompañero
	 * 
	 * @param txtNombreCompañero Valor a actualizar
	 */
	public void setTxtNombreCompañero(JTextField txtNombreCompañero) {
		this.txtNombreCompañero = txtNombreCompañero;
	}

	/**
	 * Metodo que retorna el valor del atributo txtFecha
	 * 
	 * @return Contenido del atributo txtFecha
	 */
	public JTextField getTxtFecha() {
		return txtFecha;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtFecha
	 * 
	 * @param txtFecha Valor a actualizar
	 */
	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	/**
	 * Metodo que retorna el valor del atributo txtHoraInicio
	 * 
	 * @return Contenido del atributo txtHoraInicio
	 */
	public JTextField getTxthHoraInicio() {
		return txtHoraInicio;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtHoraInicio
	 * 
	 * @param txtHoraInicio Valor a actualizar
	 */
	public void setTxthHoraInicio(JTextField txthHoraInicio) {
		this.txtHoraInicio = txthHoraInicio;
	}

	/**
	 * Metodo que retorna el valor del atributo txtHoraFinal
	 * 
	 * @return Contenido del atributo txtHoraFinal
	 */
	public JTextField getTxtHoraFinal() {
		return txtHoraFinal;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtHoraFinal
	 * 
	 * @param txtHoraFinal Valor a actualizar
	 */
	public void setTxtHoraFinal(JTextField txtHoraFinal) {
		this.txtHoraFinal = txtHoraFinal;
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

}
