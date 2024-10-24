package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase encargada de recibir los datos del usuario para que pueda acceder al
 * sistema. En caso de que no exista un usuario, tiene un boton para poder
 * crearlo.
 * 
 * @author Samuel Diaz
 */

public class PanelAccesoPaciente extends JPanel {
	/**
	 * Atributo encargado de almacenar el nombre del paciente
	 */
	private JTextField txtNombre;
	/**
	 * Atributo encargado de almacenar la cedula del paciente
	 */
	private JTextField txtCedula;
	/**
	 * Atributo encargado de mostrar un boton para navegar al panel anterior
	 */
	private JButton btnAtras;
	/**
	 * Atributo encargado de mostrar un boton para tomar los datos y navegar al
	 * panel siguiente en caso de que los datos coincidan con la informacion
	 * almacenada en la persistencia
	 */
	private JButton btnSubmit;
	/**
	 * Atributo encargado de mostrar un boton para navegar al panel para crear un
	 * usuario
	 */
	private JButton btnCrearUsuario;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAccesoPaciente() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		txtNombre = new JTextField(" ");
		txtNombre.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		txtCedula = new JTextField(" ");
		txtCedula.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnCrearUsuario = new JButton("CrearUsuario");
		btnCrearUsuario.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		add(txtNombre);
		add(txtCedula);
		add(btnAtras);
		add(btnSubmit);
		add(btnCrearUsuario);
	}

	/**
	 * Metodo encargado de configurar el texto que se muestra en "txtNombre y
	 * txtCedula" para que cuando no tenga ningun texto muestre por defecto un
	 * mensaje indicando lo que debe ingresar el paciente
	 */
	public void configurarPlaceHolder() {

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
	 * @param txtNombre Valor a actualizar
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
	 * @param txtCedula Valor a actualizar
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
	 * @param btnAtras Valor a actualizar
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
	 * @param btnSubmit Valor a actualizar
	 */
	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	/**
	 * Metodo que retorna el valor del atributo btnCrearUsuario
	 * 
	 * @return Contenido del atributo btnCrearUsuario
	 */
	public JButton getBtnCrearUsuario() {
		return btnCrearUsuario;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnCrearUsuario
	 * 
	 * @param btnCrearUsuario Valor a actualizar
	 */
	public void setBtnCrearUsuario(JButton btnCrearUsuario) {
		this.btnCrearUsuario = btnCrearUsuario;
	}
}
