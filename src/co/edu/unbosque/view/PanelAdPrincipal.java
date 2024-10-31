package co.edu.unbosque.view;

import javax.swing.JPanel;

/**
 * Clase encargada de contener todos los paneles que pertenecen al login o como
 * lo llamamos, a los accesos
 * 
 * @author Samuel Diaz
 */
public class PanelAdPrincipal extends JPanel {
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del PanelAdBotones
	 */
	private PanelAdBotones pAdBotones;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del PanelAdVerTodos
	 */
	private PanelAdVerTodos pAdVerTodos;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del
	 * PanelAdRegistrarEspecialista
	 */
	private PanelAdRegistrarEspecialista pAdRegistrarEspecialista;
	/**
	 * Atributo encargado de almacenar y mostrar la instancia del
	 * PanelAdConfiguraciones
	 */
	private PanelAdConfiguraciones pAdConfiguraciones;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAdPrincipal() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que cambia la visibilidad de los paneles, el orden son 1 = pAdBotones,
	 * 2 = pAdVerTodos, 3 = pAdRegistrarEspecialista, 4 = pAdConfiguraciones
	 * 
	 * @param panelVisible index panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:

			break;

		default:
			break;
		}

	}

	public PanelAdBotones getpAdBotones() {
		return pAdBotones;
	}

	public void setpAdBotones(PanelAdBotones pAdBotones) {
		this.pAdBotones = pAdBotones;
	}

	public PanelAdVerTodos getpAdVerTodos() {
		return pAdVerTodos;
	}

	public void setpAdVerTodos(PanelAdVerTodos pAdVerTodos) {
		this.pAdVerTodos = pAdVerTodos;
	}

	public PanelAdRegistrarEspecialista getpAdRegistrarEspecialista() {
		return pAdRegistrarEspecialista;
	}

	public void setpAdRegistrarEspecialista(PanelAdRegistrarEspecialista pAdRegistrarEspecialista) {
		this.pAdRegistrarEspecialista = pAdRegistrarEspecialista;
	}

	public PanelAdConfiguraciones getpAdConfiguraciones() {
		return pAdConfiguraciones;
	}

	public void setpAdConfiguraciones(PanelAdConfiguraciones pAdConfiguraciones) {
		this.pAdConfiguraciones = pAdConfiguraciones;
	}
}
