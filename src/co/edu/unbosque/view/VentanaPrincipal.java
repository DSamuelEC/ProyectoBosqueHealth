package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * Clase encargada de contener todos los paneles principales y mostrar el frame
 * donde se iran mostrando estos
 * 
 * @author Mariana Ovallos
 * @author Samuel Diaz
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * Atributo encargado de almacenar la instancia del PanelAccesosPrincipal
	 */
	private PanelAccesosPrincipal pAccesosPrincipal;
	/**
	 * Atributo encargado de almacenar la instancia del PanelEPrincipal
	 */
	private PanelEPrincipal pEPrincipal;
	/**
	 * Atributo encargado de almacenar la instancia del PanelPPrincipal
	 */
	private PanelPPrincipal pPPrincipal;
	/**
	 * Atributo encargado de almacenar la instancia del PanelAdPrincipal
	 */
	private PanelAdPrincipal pAdPrincipal;

	/**
	 * Metodo constructor de la clase
	 */
	public VentanaPrincipal() {
		setTitle("BosqueHealthApp");
		setSize(1300, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		pAccesosPrincipal = new PanelAccesosPrincipal();
		pAccesosPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pAccesosPrincipal);

		pEPrincipal = new PanelEPrincipal();
		pEPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pEPrincipal);

		pPPrincipal = new PanelPPrincipal();
		pPPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pPPrincipal);

		pAdPrincipal = new PanelAdPrincipal();
		pAdPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pAdPrincipal);
	}

	/**
	 * Metodo que cambia la visibilidad de los paneles principales, el orden son 1 =
	 * pAccesosPrincipal, 2 = pPPrincipal, 3 = pEPrincipal, y 4 = pAdPrincipal
	 * 
	 * @param panelVisible index panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:
			pPPrincipal.setVisible(false);
			pEPrincipal.setVisible(false);
			pAdPrincipal.setVisible(false);
			pAccesosPrincipal.setVisible(true);
			break;
		case 2:
			pEPrincipal.setVisible(false);
			pAdPrincipal.setVisible(false);
			pAccesosPrincipal.setVisible(false);
			pPPrincipal.setVisible(true);
			break;
		case 3:
			pAdPrincipal.setVisible(false);
			pPPrincipal.setVisible(false);
			pAccesosPrincipal.setVisible(false);
			pEPrincipal.setVisible(true);
			break;
		case 4:
			pAccesosPrincipal.setVisible(false);
			pPPrincipal.setVisible(false);
			pEPrincipal.setVisible(false);
			pAdPrincipal.setVisible(true);
			break;
		default:
			break;
		}
	}

	/**
	 * Metodo que retorna el valor del atributo pAccesosPrincipal
	 * 
	 * @return Contenido del atributo pAccesosPrincipal
	 */
	public PanelAccesosPrincipal getpAccesosPrincipal() {
		return pAccesosPrincipal;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAccesosPrincipal
	 * 
	 * @param pAccesosPrincipal valor a actualizar
	 */
	public void setpAccesosPrincipal(PanelAccesosPrincipal pAccesosPrincipal) {
		this.pAccesosPrincipal = pAccesosPrincipal;
	}

	/**
	 * Metodo que retorna el valor del atributo pEPrincipal
	 * 
	 * @return Contenido del atributo pEPrincipal
	 */
	public PanelEPrincipal getpEPrincipal() {
		return pEPrincipal;
	}

	/**
	 * Metodo que actualiza el valor del atributo pEPrincipal
	 * 
	 * @param pEPrincipal valor a actualizar
	 */
	public void setpEPrincipal(PanelEPrincipal pEPrincipal) {
		this.pEPrincipal = pEPrincipal;
	}

	/**
	 * Metodo que retorna el valor del atributo pPPrincipal
	 * 
	 * @return Contenido del atributo pPPrincipal
	 */
	public PanelPPrincipal getpPPrincipal() {
		return pPPrincipal;
	}

	/**
	 * Metodo que actualiza el valor del atributo pPPrincipal
	 * 
	 * @param pPPrincipal valor a actualizar
	 */
	public void setpPPrincipal(PanelPPrincipal pPPrincipal) {
		this.pPPrincipal = pPPrincipal;
	}

	/**
	 * Metodo que retorna el valor del atributo pAdPrincipal
	 * 
	 * @return Contenido del atributo pAdPrincipal
	 */
	public PanelAdPrincipal getpAdPrincipal() {
		return pAdPrincipal;
	}

	/**
	 * Metodo que actualiza el valor del atributo pAdPrincipal
	 * 
	 * @param pAdPrincipal valor a actualizar
	 */
	public void setpAdPrincipal(PanelAdPrincipal pAdPrincipal) {
		this.pAdPrincipal = pAdPrincipal;
	}
}
