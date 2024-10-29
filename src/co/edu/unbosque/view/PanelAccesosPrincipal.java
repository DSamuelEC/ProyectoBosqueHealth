package co.edu.unbosque.view;

import javax.swing.JPanel;

/**
 * Clase encargada de contener todos los paneles que pertenecen al login o como
 * lo llamamos, a los accesos
 * 
 * @author Samuel Diaz
 */

public class PanelAccesosPrincipal extends JPanel {
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del PanelAcceso
	 */
	private PanelAcceso panelAcceso;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del
	 * PanelAccesoPaciente
	 */
	private PanelAccesoPaciente panelAccesoPaciente;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del PanelCrearPaciente
	 */
	private PanelCrearPaciente panelCrearPaciente;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del
	 * PanelAccesoEspecialista
	 */
	private PanelAccesoEspecialista panelAccesoEspecialista;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del PanelAccesoAdmin
	 */
	private PanelAccesoAdmin panelAccesoAdmin;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAccesosPrincipal() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
//		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		panelAcceso = new PanelAcceso();
		panelAcceso.setBounds(0, 0, 1300, 700);

		panelAccesoPaciente = new PanelAccesoPaciente();
		panelAccesoPaciente.setBounds(0, 0, 1300, 700);

		panelCrearPaciente = new PanelCrearPaciente();
		panelCrearPaciente.setBounds(0, 0, 1300, 700);

		panelAccesoEspecialista = new PanelAccesoEspecialista();
		panelAccesoEspecialista.setBounds(0, 0, 1300, 700);

		panelAccesoAdmin = new PanelAccesoAdmin();
		panelAccesoAdmin.setBounds(0, 0, 1300, 700);

		add(panelAcceso);
		add(panelAccesoPaciente);
		add(panelCrearPaciente);
		add(panelAccesoEspecialista);
		add(panelAccesoAdmin);
	}

	/**
	 * Metodo que retorna el valor del atributo panelAcceso
	 * 
	 * @return Contenido del atributo panelAcceso
	 */
	public PanelAcceso getPanelAcceso() {
		return panelAcceso;
	}

	/**
	 * Metodo que actualiza el valor del atributo panelAcceso
	 * 
	 * @param panelAcceso Valor a actualizar
	 */
	public void setPanelAcceso(PanelAcceso panelAcceso) {
		this.panelAcceso = panelAcceso;
	}

	/**
	 * Metodo que retorna el valor del atributo panelAccesoPaciente
	 * 
	 * @return Contenido del atributo panelAccesoPaciente
	 */
	public PanelAccesoPaciente getPanelAccesoPaciente() {
		return panelAccesoPaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo panelAccesoPaciente
	 * 
	 * @param panelAccesoPaciente Valor a actualizar
	 */
	public void setPanelAccesoPaciente(PanelAccesoPaciente panelAccesoPaciente) {
		this.panelAccesoPaciente = panelAccesoPaciente;
	}

	/**
	 * Metodo que retorna el valor del atributo panelAccesoEspecialista
	 * 
	 * @return Contenido del atributo panelAccesoEspecialista
	 */
	public PanelAccesoEspecialista getPanelAccesoEspecialista() {
		return panelAccesoEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo panelAccesoEspecialista
	 * 
	 * @param panelAccesoEspecialista Valor a actualizar
	 */
	public void setPanelAccesoEspecialista(PanelAccesoEspecialista panelAccesoEspecialista) {
		this.panelAccesoEspecialista = panelAccesoEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo panelAccesoAdmin
	 * 
	 * @return Contenido del atributo panelAccesoAdmin
	 */
	public PanelAccesoAdmin getPanelAccesoAdmin() {
		return panelAccesoAdmin;
	}

	/**
	 * Metodo que actualiza el valor del atributo panelAccesoAdmin
	 * 
	 * @param panelAccesoAdmin Valor a actualizar
	 */
	public void setPanelAccesoAdmin(PanelAccesoAdmin panelAccesoAdmin) {
		this.panelAccesoAdmin = panelAccesoAdmin;
	}

	/**
	 * Metodo que retorna el valor del atributo panelCrearPaciente
	 * 
	 * @return Contenido del atributo panelCrearPaciente
	 */
	public PanelCrearPaciente getPanelCrearPaciente() {
		return panelCrearPaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo panelCrearPaciente
	 * 
	 * @param panelCrearPaciente Valor a actualizar
	 */
	public void setPanelCrearPaciente(PanelCrearPaciente panelCrearPaciente) {
		this.panelCrearPaciente = panelCrearPaciente;
	}
}
