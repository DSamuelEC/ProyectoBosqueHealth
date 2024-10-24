package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Clase encargada de la creacion y gestion del panel de acceso principal en el
 * sistema. Este panel permite a los usuarios seleccionar el modo de acceso
 * (Usuario, Especialista o Admin)
 * 
 * @author Mariana Ovallos
 */

public class PanelAcceso extends JPanel {
	/**
	 * Atributo encargado de mostrar un texto de Bienvenida en el Panel
	 */
	JLabel lblBienvenida;
	/**
	 * Atributo encargado de mostrar un texto para indicar al Usuario que ingrese el
	 * modo de acceso deseado
	 */
	JLabel lblModoDeAcceso;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Usuario
	 */
	JButton btnUsuario;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Especialista
	 */
	JButton btnEspecialista;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Admin
	 */
	JButton btnAdmin;

	/**
	 * Metodo Constructor de la clase
	 */

	public PanelAcceso() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);

	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		lblBienvenida = new JLabel("¡Bienvenidos a BOSQUEHEALTH!");
		lblBienvenida.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblModoDeAcceso = new JLabel("Ingrese el modo de acceso");
		lblModoDeAcceso.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnUsuario = new JButton("Usuario");
		btnUsuario.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnEspecialista = new JButton("Especialista");
		btnEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		add(lblBienvenida);
		add(lblModoDeAcceso);
		add(btnUsuario);
		add(btnEspecialista);
		add(btnAdmin);
	}

	/**
	 * Metodo que retorna el valor del atributo lblBienvenida
	 * 
	 * @return contenido del atributo lblBienvenida
	 */
	public JLabel getLblBienvenida() {
		return lblBienvenida;
	}

	/**
	 * Metodo que actualiza el atributo lblBienvendia
	 * 
	 * @param lblBienvenida valor a actualizar
	 */

	public void setLblBienvenida(JLabel lblBienvenida) {
		this.lblBienvenida = lblBienvenida;
	}

	/**
	 * Metodo que retorna el valor del atributo lblModoDeAcceso
	 * 
	 * @return contenido del atributo lblModoDeAcceso
	 */

	public JLabel getLblModoDeAcceso() {
		return lblModoDeAcceso;
	}

	/**
	 * Metodo que actualiza el atributo lblModoDeAcceso
	 * 
	 * @param lblModoDeAcceso valor a actualizar
	 */
	public void setLblModoDeAcceso(JLabel lblModoDeAcceso) {
		this.lblModoDeAcceso = lblModoDeAcceso;
	}

	/**
	 * Metodo que retorna el valor del atributo btnUsuario
	 * 
	 * @return contenido del atributo btnUsuario
	 */

	public JButton getBtnUsuario() {
		return btnUsuario;
	}

	/**
	 * Metodo que actualiza el atributo btnUsuario
	 * 
	 * @param btnUsuario valor a actualizar
	 */

	public void setBtnUsuario(JButton btnUsuario) {
		this.btnUsuario = btnUsuario;
	}

	/**
	 * Metodo que retorna el valor del atributo btnEspecialista
	 * 
	 * @return contenido del atriburo btnEspecialista
	 */

	public JButton getBtnEspecialista() {
		return btnEspecialista;
	}

	/**
	 * Metodo que actualiza el atributo btnEspecialista
	 * 
	 * @param btnEspecialista valor a actualizar
	 */

	public void setBtnEspecialista(JButton btnEspecialista) {
		this.btnEspecialista = btnEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAdmin
	 * 
	 * @return contenido del atributo btnAdmin
	 */

	public JButton getBtnAdmin() {
		return btnAdmin;
	}

	/**
	 * Metodo que actualiza el atributo btnAdmin
	 * 
	 * @param btnAdmin valor a actualizar
	 */
	public void setBtnAdmin(JButton btnAdmin) {
		this.btnAdmin = btnAdmin;
	}

}
