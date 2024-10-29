package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

/**
 * Clase encargada de la creacion del PanelCrearUsuario para crear un usuario
 * nuevo en el sistema.
 * 
 * @author Mariana Ovallos
 */

public class PanelCrearPaciente extends JPanel {
	/**
	 * Atributo encargado de almacenar el nombre del paciente
	 */
	private JTextField txtNombre;
	/**
	 * Atributo encargado de almacenar la cedula del paciente
	 */
	private JTextField txtCedula;
	/**
	 * Atributo encargado de almacenar el correo del paciente
	 */
	private JTextField txtCorreo;
	/**
	 * Atributo encargado de almacenar la edad del paciente
	 */
	private JTextField txtEdad;
	/**
	 * Atributo encargado de mostrar un boton para regresar al panel anterior
	 */
	private JButton btnAtras;
	/**
	 * Atributo encargado de mostrar un boton para guardar la informacion del
	 * paciente y avanzar al siguiente panel de AccesoUsuario
	 */
	private JButton btnSubmit;
	/**
	 * Atributo encargado de mostrar una lista desplegable con el Sexo del paciente
	 */
	private JComboBox ldSexo;

	/**
	 * Metodo Constructor de la clase
	 */

	public PanelCrearPaciente() {
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
		txtNombre.setBounds(300, 120, 700, 60);
		configurarPlaceHolder(txtNombre, "Nombre");

		txtCedula = new JTextField();
		txtCedula.setBounds(300, 200, 700, 60);
		configurarPlaceHolder(txtCedula, "Cedula");

		txtCorreo = new JTextField();
		txtCorreo.setBounds(300, 280, 700, 60);
		configurarPlaceHolder(txtCorreo, "Correo");

		txtEdad = new JTextField();
		txtEdad.setBounds(670, 370, 330, 60);
		configurarPlaceHolder(txtEdad, "Edad");
		
		String[] opciones = {"F", "M" };
		ldSexo = new JComboBox<String>(opciones);
		ldSexo.setBounds(300, 370, 330, 60);

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(375, 450, 250, 60);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(670, 450, 250, 60);

		add(txtNombre);
		add(txtCedula);
		add(txtCorreo);
		add(txtEdad);
		add(btnAtras);
		add(btnSubmit);
		add(ldSexo);

	}

	/**
	 * Metodo encargado de configurar el texto que se muestra en "txtNombre,
	 * txtCedula, txtCorreo y txtEdad" para que cuando no tenga ningun texto muestre
	 * por defecto un mensaje indicando lo que debe ingresar el paciente
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
	 * Metodo que retorna el valor del atributo txtCorreo
	 * 
	 * @return Contenido del atributo txtCorreo
	 */

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtCorreo
	 * 
	 * @param txtCorreo valor a actualizar
	 */

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	/**
	 * Metodo que retorna el valor del atributo txtEdad
	 * 
	 * @return Contenido del atributo txtEdad
	 */

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	/**
	 * Metodo que actualiza el valor del atributo txtEdad
	 * 
	 * @param txtEdad valor a actualizar
	 */

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
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

	/**
	 * Metodo que retorna el valor del atributo ldSexo
	 * 
	 * @return Contenido del atributo ldSexo
	 */

	public JComboBox getLdSexo() {
		return ldSexo;
	}

	/**
	 * Metodo que actualiza el valor del atributo ldSexo
	 * 
	 * @param ldSexo valor a actualizar
	 */

	public void setLdSexo(JComboBox ldSexo) {
		this.ldSexo = ldSexo;
	}

}
