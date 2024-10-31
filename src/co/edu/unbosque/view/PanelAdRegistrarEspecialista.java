package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase encargada de la creacion de los especialistas, solo se puede crear uno
 * a la vez
 * 
 * @author Samuel Diaz
 */
public class PanelAdRegistrarEspecialista extends JPanel {
	/**
	 * Atributo encargado de mostrar un texto para indicar que esta en el panel para
	 * registrar especialistas
	 */
	private JLabel lblRegistroEspecialistas;
	/**
	 * Atributo encargado de mostrar un campo de texto para almacenar el nombre del
	 * especialista a registrar
	 */
	private JTextField txtNombre;
	/**
	 * Atributo encargado de mostrar una lista desplegable con las especialidades
	 */
	private JComboBox ldEspecialidad;
	/**
	 * Atributo encargado de mostrar un campo de texto para almacenar el correo del
	 * especialista a registrar
	 */
	private JTextField txtCorreo;
	/**
	 * Atributo encargado de mostrar un campo de texto para almacenar la edad del
	 * especialista a registrar
	 */
	private JTextField txtEdad;
	/**
	 * Atributo encargado de mostrar un campo de texto para almacenar la cedula del
	 * especialista a registrar
	 */
	private JTextField txtCedula;
	/**
	 * Atributo encargado de mostrar una lista desplegable con los sexos
	 */
	private JComboBox ldSexo;
	/**
	 * Atributo encargado de mostrar un boton para ir a atras, o en caso de default,
	 * devuelve al menu del panel del admin
	 */
	private JButton btnAtras;
	/**
	 * Atributo encargado de mostrar un boton para enviar la informacion y crear un
	 * especialista
	 */
	private JButton btnSubmit;

	/**
	 * Metodo constructor de la clase
	 */
	public PanelAdRegistrarEspecialista() {
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
		lblRegistroEspecialistas = new JLabel("Registrar Especialista");
		lblRegistroEspecialistas.setBounds(580, 20, 300, 30);

		txtNombre = new JTextField();
		txtNombre.setBounds(30, 120, 900, 60);
		configurarPlaceHolder(txtNombre, "Nombre");

		txtCorreo = new JTextField();
		txtCorreo.setBounds(30, 200, 1220, 60);
		configurarPlaceHolder(txtCorreo, "Correo");

		txtEdad = new JTextField();
		txtEdad.setBounds(140, 320, 300, 60);
		configurarPlaceHolder(txtEdad, "Edad");

		txtCedula = new JTextField();
		txtCedula.setBounds(490, 320, 300, 60);
		configurarPlaceHolder(txtCedula, "Cedula");

		String[] opcionesSexo = { "F", "M" };
		ldSexo = new JComboBox<String>(opcionesSexo);
		ldSexo.setBounds(840, 320, 300, 60);

		String[] opcionesEspecialidades = { "Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología",
				"Medicina Interna" };
		ldEspecialidad = new JComboBox<String>(opcionesEspecialidades);
		ldEspecialidad.setBounds(950, 120, 300, 60);

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(360, 450, 200, 40);
		btnAtras.setActionCommand("P_AD_REGISTRAR_ESPECIALISTA_ATRAS");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(710, 450, 200, 40);
		btnSubmit.setActionCommand("P_AD_REGISTRAR_ESPECIALISTA_SUBMIT");

		add(lblRegistroEspecialistas);
		add(txtNombre);
		add(txtCorreo);
		add(txtEdad);
		add(txtCedula);
		add(ldSexo);
		add(ldEspecialidad);
		add(btnAtras);
		add(btnSubmit);
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
	 * Metodo que retorna el valor del atributo lblRegistroEspecialistas
	 * 
	 * @return Contenido del atributo lblRegistroEspecialistas
	 */
	public JLabel getLblRegistroEspecialistas() {
		return lblRegistroEspecialistas;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblRegistroEspecialistas
	 * 
	 * @param lblRegistroEspecialistas valor a actualizar
	 */
	public void setLblRegistroEspecialistas(JLabel lblRegistroEspecialistas) {
		this.lblRegistroEspecialistas = lblRegistroEspecialistas;
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
	 * Metodo que retorna el valor del atributo ldEspecialidad
	 * 
	 * @return Contenido del atributo ldEspecialidad
	 */
	public JComboBox getLdEspecialidad() {
		return ldEspecialidad;
	}

	/**
	 * Metodo que actualiza el valor del atributo ldEspecialidad
	 * 
	 * @param ldEspecialidad valor a actualizar
	 */
	public void setLdEspecialidad(JComboBox ldEspecialidad) {
		this.ldEspecialidad = ldEspecialidad;
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
