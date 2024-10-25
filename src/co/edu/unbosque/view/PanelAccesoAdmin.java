package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

/**
 * Clase encargada de recibir los datos del Administrador para que pueda acceder
 * al sistema.
 * 
 * @author Mariana Ovallos
 */
public class PanelAccesoAdmin extends JPanel {
	/**
	 * Atributo encargado de almacenar el nombre del Administrador
	 */
	private JTextField txtNombre;
	/**
	 * Atributo encargado de almacenar la cedula del Administrador
	 */
	private JTextField txtCedula;
	/**
	 * Atributo encargado de mostrar un boton para navegar al panel anterior
	 */
	private JButton btnAtras;
	/**
	 * Atributo encargado de mostrar un boton para guardar la informacion del
	 * Administrador y avanzar al siguiente panel de AccesoAdmin
	 */
	private JButton btnSubmit;

	/**
	 * Metodo Constructor de la clase
	 */

	public PanelAccesoAdmin() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		txtNombre = new JTextField();
		txtNombre.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceholder(txtNombre, "Nombre");

		txtCedula = new JTextField();
		txtCedula.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		configurarPlaceholder(txtCedula, "Cedula");

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
	}

	/**
	 * Metodo encargado de configurar el texto que se muestra en "txtNombre y
	 * txtCedula" para que cuando no tenga ningun texto muestre por defecto un
	 * mensaje indicando lo que debe ingresar el Administrador
	 */
	private void configurarPlaceholder(JTextField textField, String placeholder) {
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
	 * Metodo que retorna el valor del atributo txtNombre
	 * 
	 * @return Contenido del atributo txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtNombre
	 * 
	 * @param txtNombre valor a actualizar
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * Metodo que retorna el valor del atributo txtCedula
	 * 
	 * @return Contenido del atributo txtCedula
	 */

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtCedula
	 * 
	 * @param txtCedula valor a actualizar
	 */
	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
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
	 * @param btnAtras valor a actualizar
	 */
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
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
	 * @param btnSubmit valor a actualizar
	 */
	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

}
