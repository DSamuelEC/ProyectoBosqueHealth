package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;

/**
 * Clase encargada de tener todos los paneles que se utilizan para el Paciente
 * 
 * @author Mariana Ovallos
 */
public class PanelPPrincipal extends JPanel {
	/**
	 * Atributo encragado de traer el PanelPSuperior
	 */
	private PanelPSuperior pPSuperior;
	/**
	 * Atributo encragado de traer el PanelPVerCitasOExamen
	 */
	private PanelPVerCitasOExamen pPVerCitasOExamen;
	/**
	 * Atributo encragado de traer el PanelPCrearOActualizarCita
	 */
	private PanelPCrearOActualizarCita pPCrearOActualizarCita;
	/**
	 * Atributo encragado de traer el PanelPVerMas
	 */
	private PanelPVerMas pPVerMas;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelPPrincipal() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(250, 246, 245));
		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		pPSuperior = new PanelPSuperior();
		pPSuperior.setBounds(0, 0, 1300, 100);

		pPCrearOActualizarCita = new PanelPCrearOActualizarCita();
		pPCrearOActualizarCita.setBounds(0, 110, 1300, 590);

		pPVerCitasOExamen = new PanelPVerCitasOExamen();
		pPVerCitasOExamen.setBounds(0, 110, 1300, 590);

		pPVerMas = new PanelPVerMas();
		pPVerMas.setBounds(0, 110, 1300, 590);

		add(pPSuperior);
		add(pPCrearOActualizarCita);
		add(pPVerCitasOExamen);
		add(pPVerMas);

	}

	/**
	 * Metodo que cambia la visibilidad de los paneles, el orden son 1 =
	 * pPVerCitasOExamen, 2 = pPCrearOActualizarCita, 3 = pPVerMas,
	 * 
	 * @param panelVisible index panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:
			pPCrearOActualizarCita.setVisible(false);
			pPVerMas.setVisible(false);
			pPVerCitasOExamen.setVisible(true);
			break;
		case 2:
			pPVerCitasOExamen.setVisible(false);
			pPVerMas.setVisible(false);
			pPCrearOActualizarCita.setVisible(true);
			break;
		case 3:
			pPVerCitasOExamen.setVisible(false);
			pPCrearOActualizarCita.setVisible(false);
			pPVerMas.setVisible(true);
			break;
		default:
			break;
		}
	}

	/**
	 * Metodo que retorna el valor del atributo pPSuperior
	 * 
	 * @return Contenido del atributo pPSuperior
	 */
	public PanelPSuperior getpPSuperior() {
		return pPSuperior;
	}

	/**
	 * Metodo que actualiza el valor del atributo pPSuperior
	 * 
	 * @param pPSuperior valor a actualizar
	 */
	public void setpPSuperior(PanelPSuperior pPSuperior) {
		this.pPSuperior = pPSuperior;
	}

	/**
	 * Metodo que retorna el valor del atributo pPVerCitasOExamen
	 * 
	 * @return Contenido del atributo pPVerCitasOExamen
	 */
	public PanelPVerCitasOExamen getpPVerCitasOExamen() {
		return pPVerCitasOExamen;
	}

	/**
	 * Metodo que actualiza el valor del atributo pPVerCitasOExamen
	 * 
	 * @param pPVerCitasOExamen valor a actualizar
	 */
	public void setpPVerCitasOExamen(PanelPVerCitasOExamen pPVerCitasOExamen) {
		this.pPVerCitasOExamen = pPVerCitasOExamen;
	}

	/**
	 * Metodo que retorna el valor del atributo pPCrearOActualizarCita
	 * 
	 * @return Contenido del atributo pPCrearOActualizarCita
	 */
	public PanelPCrearOActualizarCita getpPCrearOActualizarCita() {
		return pPCrearOActualizarCita;
	}

	/**
	 * Metodo que actualiza el valor del atributo pPCrearOActualizarCita
	 * 
	 * @param pPCrearOActualizarCita valor a actualizar
	 */
	public void setpPCrearOActualizarCita(PanelPCrearOActualizarCita pPCrearOActualizarCita) {
		this.pPCrearOActualizarCita = pPCrearOActualizarCita;
	}

	/**
	 * Metodo que retorna el valor del atributo pPVerMas
	 * 
	 * @return Contenido del atributo pPVerMas
	 */
	public PanelPVerMas getpPVerMas() {
		return pPVerMas;
	}

	/**
	 * Metodo que actualiza el valor del atributo pPVerMas
	 * 
	 * @param pPVerMas valor a actualizar
	 */
	public void setpPVerMas(PanelPVerMas pPVerMas) {
		this.pPVerMas = pPVerMas;
	}

}
