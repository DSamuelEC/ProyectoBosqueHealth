package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Panel encargado de tner todos los paneles que se utilizan para el
 * Especialista
 * 
 * @author Mariana Ovallos
 */

public class PanelPrincipalEspecialista extends JPanel {
	/**
	 * Atributo encragado de traer el PanelBotonesEspecialista
	 */
	private PanelBotonesEspecialista pBotonesEspecialista;
	/**
	 * Atributo encragado de traer el PanelMisPacientes
	 */
	private PanelMisPacientes pMisPacientes;
	/**
	 * Atributo encragado de traer el PanelVerMas
	 */
	private PanelVerMas pVerMas;
	/**
	 * Atributo encragado de traer el PanelCambiarTurno
	 */
	private PanelCambiarTurno pCambiarTurno;
	/**
	 * Atributo encragado de traer el PanelSolicitudTurno
	 */
	private PanelSolicitudTurno pSolicitudTurno;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelPrincipalEspecialista() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		pBotonesEspecialista = new PanelBotonesEspecialista();
		pBotonesEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pCambiarTurno = new PanelCambiarTurno();
		pCambiarTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pMisPacientes = new PanelMisPacientes();
		pMisPacientes.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pSolicitudTurno = new PanelSolicitudTurno();
		pSolicitudTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pVerMas = new PanelVerMas();
		pVerMas.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

	}

	/**
	 * Metodo que retorna el valor del atributo pBotonesEspecialista
	 * 
	 * @return Contenido del atributo pBotonesEspecialista
	 */
	public PanelBotonesEspecialista getpBotonesEspecialista() {
		return pBotonesEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo pBotonesEspecialista
	 * 
	 * @param pBotonesEspecialista valor a actualizar
	 */
	public void setpBotonesEspecialista(PanelBotonesEspecialista pBotonesEspecialista) {
		this.pBotonesEspecialista = pBotonesEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo pMisPacientes
	 * 
	 * @return Contenido del atributo pMisPacientes
	 */
	public PanelMisPacientes getpMisPacientes() {
		return pMisPacientes;
	}

	/**
	 * Metodo que actualiza el valor del atributo pMisPacientes
	 * 
	 * @param pMisPacientes valor a actualizar
	 */
	public void setpMisPacientes(PanelMisPacientes pMisPacientes) {
		this.pMisPacientes = pMisPacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo pVerMas
	 * 
	 * @return Contenido del atributo pVerMas
	 */
	public PanelVerMas getpVerMas() {
		return pVerMas;
	}

	/**
	 * Metodo que actualiza el valor del atributo pVerMas
	 * 
	 * @param pVerMas valor a actualizar
	 */
	public void setpVerMas(PanelVerMas pVerMas) {
		this.pVerMas = pVerMas;
	}

	/**
	 * Metodo que retorna el valor del atributo pCambiarTurno
	 * 
	 * @return Contenido del atributo pCambiarTurno
	 */
	public PanelCambiarTurno getpCambiarTurno() {
		return pCambiarTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo pCambiarTurno
	 * 
	 * @param pCambiarTurno valor a actualizar
	 */
	public void setpCambiarTurno(PanelCambiarTurno pCambiarTurno) {
		this.pCambiarTurno = pCambiarTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo pSolicitudTurno
	 * 
	 * @return Contenido del atributo pSolicitudTurno
	 */
	public PanelSolicitudTurno getpSolicitudTurno() {
		return pSolicitudTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo pSolicitudTurno
	 * 
	 * @param pSolicitudTurno valor a actualizar
	 */
	public void setpSolicitudTurno(PanelSolicitudTurno pSolicitudTurno) {
		this.pSolicitudTurno = pSolicitudTurno;
	}

}
