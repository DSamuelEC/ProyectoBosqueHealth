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
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		pAdBotones = new PanelAdBotones();
		pAdBotones.setBounds(0, 0, 1300, 100);

		pAdVerTodos = new PanelAdVerTodos();
		pAdVerTodos.setBounds(0, 110, 1300, 590);

		pAdRegistrarEspecialista = new PanelAdRegistrarEspecialista();
		pAdRegistrarEspecialista.setBounds(0, 110, 1300, 590);

		pAdConfiguraciones = new PanelAdConfiguraciones();
		pAdConfiguraciones.setBounds(0, 110, 1300, 590);

		add(pAdBotones);
		add(pAdVerTodos);
		add(pAdRegistrarEspecialista);
		add(pAdConfiguraciones);
	}

	/**
	 * Metodo que cambia la visibilidad de los paneles, el orden son 1 =
	 * pAdVerTodos, 2 = pAdRegistrarEspecialista, 3 = pAdConfiguraciones
	 * 
	 * @param panelVisible index panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:
			pAdRegistrarEspecialista.setVisible(false);
			pAdConfiguraciones.setVisible(false);
			pAdVerTodos.setVisible(true);
			break;
		case 2:
			pAdConfiguraciones.setVisible(false);
			pAdVerTodos.setVisible(false);
			pAdRegistrarEspecialista.setVisible(true);
			break;
		case 3:
			pAdVerTodos.setVisible(false);
			pAdRegistrarEspecialista.setVisible(false);
			pAdConfiguraciones.setVisible(true);
			break;
		default:
			break;
		}
	}

	/**
	 * Metodo que retorna el valor del atributo pAdBotones
	 * 
	 * @return Contenido del atributo pAdBotones
	 */
	public PanelAdBotones getpAdBotones() {
		return pAdBotones;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAdBotones
	 * 
	 * @param pAdBotones Valor a actualizar
	 */
	public void setpAdBotones(PanelAdBotones pAdBotones) {
		this.pAdBotones = pAdBotones;
	}

	/**
	 * Metodo que retorna el valor del atributo pAdVerTodos
	 * 
	 * @return Contenido del atributo pAdVerTodos
	 */
	public PanelAdVerTodos getpAdVerTodos() {
		return pAdVerTodos;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAdVerTodos
	 * 
	 * @param pAdVerTodos Valor a actualizar
	 */
	public void setpAdVerTodos(PanelAdVerTodos pAdVerTodos) {
		this.pAdVerTodos = pAdVerTodos;
	}

	/**
	 * Metodo que retorna el valor del atributo pAdRegistrarEspecialista
	 * 
	 * @return Contenido del atributo pAdRegistrarEspecialista
	 */
	public PanelAdRegistrarEspecialista getpAdRegistrarEspecialista() {
		return pAdRegistrarEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAdRegistrarEspecialista
	 * 
	 * @param pAdRegistrarEspecialista Valor a actualizar
	 */
	public void setpAdRegistrarEspecialista(PanelAdRegistrarEspecialista pAdRegistrarEspecialista) {
		this.pAdRegistrarEspecialista = pAdRegistrarEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo pAdConfiguraciones
	 * 
	 * @return Contenido del atributo pAdConfiguraciones
	 */
	public PanelAdConfiguraciones getpAdConfiguraciones() {
		return pAdConfiguraciones;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAdConfiguraciones
	 * 
	 * @param pAdConfiguraciones Valor a actualizar
	 */
	public void setpAdConfiguraciones(PanelAdConfiguraciones pAdConfiguraciones) {
		this.pAdConfiguraciones = pAdConfiguraciones;
	}
}
