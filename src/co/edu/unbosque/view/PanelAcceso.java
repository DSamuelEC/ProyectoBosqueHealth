package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

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
	private JLabel lblBienvenida;
	/**
	 * Atributo encargado de mostrar un texto para indicar al Usuario que ingrese el
	 * modo de acceso deseado
	 */
	private JLabel lblModoDeAcceso;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Usuario
	 */
	private JButton btnUsuario;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Especialista
	 */
	private JButton btnEspecialista;
	/**
	 * Atributo encargado de mostrar un boton con acceso a Admin
	 */
	private JButton btnAdmin;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAcceso() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		lblBienvenida = new JLabel("¡Bienvenidos a BOSQUEHEALTH!");
		lblBienvenida.setBounds(480, 100, 400, 100);
		lblBienvenida.setFont(new Font("Tahoma", Font. BOLD, 20));
		lblBienvenida.setForeground(new Color(5, 25, 35));

		lblModoDeAcceso = new JLabel("Ingrese el modo de acceso");
		lblModoDeAcceso.setBounds(545, 130, 400, 100);
		lblModoDeAcceso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBienvenida.setForeground(new Color(5, 25, 35));

		btnUsuario = new JButton("Usuario");
		btnUsuario.setBounds(570, 250, 150, 60);
		btnUsuario.setActionCommand("P_ACCESO_USUARIO");
		btnUsuario.setBackground(new Color(244, 158, 76));
		btnUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUsuario.setForeground(new Color(5, 25, 35 ));

		btnEspecialista = new JButton("Especialista");
		btnEspecialista.setBounds(570, 350, 150, 60);
		btnEspecialista.setActionCommand("P_ACCESO_ESPECIALISTA");
		btnEspecialista.setBackground(new Color(244, 158, 76));
		btnEspecialista.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEspecialista.setForeground(new Color(5, 25, 35 ));

		btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(570, 450, 150, 60);
		btnAdmin.setActionCommand("P_ACCESO_ADMIN");
		btnAdmin.setBackground(new Color(244, 158, 76));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdmin.setForeground(new Color(5, 25, 35 ));
		
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
