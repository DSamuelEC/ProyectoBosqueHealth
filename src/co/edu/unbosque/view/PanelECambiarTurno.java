package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

/**
 * Clase encargada del panel para poder cambiar de turno con otro especialista
 * 
 * @author Mariana Ovallos
 */
public class PanelECambiarTurno extends JPanel {

	/**
	 * Atributo encargado de almacenar el Nombre del compañero con el que se desea
	 * cambiar de turno
	 */
	private JTextField txtNombreCompañero;
	/**
	 * Atributo encargado de almacenar la fecha del turno del Especialista
	 */
	private JTextField txtFechaMiTurno;
	/**
	 * Atributo encargado de almacenar la fecha del turno del compañero
	 */
	private JTextField txtFechaTurnoCompañero;

	/**
	 * Atributo encargado de mostrar un boton que guarde la información y vuelva al
	 * panel principal
	 */
	private JButton btnSubmit;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelECambiarTurno() {
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
		txtNombreCompañero = new JTextField();
		txtNombreCompañero.setBounds(140, 100, 1000, 50);
		configurarPlaceHolder(txtNombreCompañero, "Nombre Compañero");

		txtFechaMiTurno = new JTextField();
		txtFechaMiTurno.setBounds(140, 180, 1000, 50);
		configurarPlaceHolder(txtFechaMiTurno, "Fecha Mi Turno (AA/MM/DD)");

		txtFechaTurnoCompañero = new JTextField();
		txtFechaTurnoCompañero.setBounds(140, 260, 1000, 50);
		configurarPlaceHolder(txtFechaTurnoCompañero, "Fecha Turno Compañero (AA/MM/DD)");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(600, 340, 100, 30);
		btnSubmit.setActionCommand("P_CAMBIAR_TURNO_ESPECIALISTA_SUBMIT");

		add(btnSubmit);
		add(txtFechaMiTurno);
		add(txtFechaTurnoCompañero);
		add(txtNombreCompañero);

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
	 * Metodo que retorna el valor del atributo txtFechaMiTurno
	 * 
	 * @return Contenido del atributo txtFechaMiTurno
	 */
	public JTextField getTxtFechaMiTurno() {
		return txtFechaMiTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtFechaMiTurno
	 * 
	 * @param txtFechaMiTurno Valor a actualizar
	 */
	public void setTxtFechaMiTurno(JTextField txtFechaMiTurno) {
		this.txtFechaMiTurno = txtFechaMiTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo txtFechaTurnoCompañero
	 * 
	 * @return Contenido del atributo txtFechaTurnoCompañero
	 */
	public JTextField getTxtFechaTurnoCompañero() {
		return txtFechaTurnoCompañero;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtFechaTurnoCompañero
	 * 
	 * @param txtFechaTurnoCompañero Valor a actualizar
	 */
	public void setTxtFechaTurnoCompañero(JTextField txtFechaTurnoCompañero) {
		this.txtFechaTurnoCompañero = txtFechaTurnoCompañero;
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
