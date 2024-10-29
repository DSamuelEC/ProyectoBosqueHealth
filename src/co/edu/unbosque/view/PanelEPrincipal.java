package co.edu.unbosque.view;

import javax.swing.*;

/**
 * Panel encargado de tner todos los paneles que se utilizan para el
 * Especialista
 * 
 * @author Mariana Ovallos
 */

public class PanelEPrincipal extends JPanel {
	/**
	 * Atributo encragado de traer el PanelBotonesEspecialista
	 */
	private PanelEBotonesEspecialista pBotonesEspecialista;
	/**
	 * Atributo encragado de traer el PanelMisPacientes
	 */
	private PanelEMisPacientes pMisPacientes;
	/**
	 * Atributo encragado de traer el PanelVerMas
	 */
	private PanelEVerMas pVerMas;
	/**
	 * Atributo encragado de traer el PanelCambiarTurno
	 */
	private PanelECambiarTurno pCambiarTurno;
	/**
	 * Atributo encragado de traer el PanelSolicitudTurno
	 */
	private PanelESolicitudTurno pSolicitudTurno;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelEPrincipal() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		pBotonesEspecialista = new PanelEBotonesEspecialista();
		pBotonesEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pCambiarTurno = new PanelECambiarTurno();
		pCambiarTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pMisPacientes = new PanelEMisPacientes();
		pMisPacientes.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pSolicitudTurno = new PanelESolicitudTurno();
		pSolicitudTurno.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		pVerMas = new PanelEVerMas();
		pVerMas.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

	}

	/**
	 * Metodo que retorna el valor del atributo pBotonesEspecialista
	 * 
	 * @return Contenido del atributo pBotonesEspecialista
	 */
	public PanelEBotonesEspecialista getpBotonesEspecialista() {
		return pBotonesEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo pBotonesEspecialista
	 * 
	 * @param pBotonesEspecialista valor a actualizar
	 */
	public void setpBotonesEspecialista(PanelEBotonesEspecialista pBotonesEspecialista) {
		this.pBotonesEspecialista = pBotonesEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo pMisPacientes
	 * 
	 * @return Contenido del atributo pMisPacientes
	 */
	public PanelEMisPacientes getpMisPacientes() {
		return pMisPacientes;
	}

	/**
	 * Metodo que actualiza el valor del atributo pMisPacientes
	 * 
	 * @param pMisPacientes valor a actualizar
	 */
	public void setpMisPacientes(PanelEMisPacientes pMisPacientes) {
		this.pMisPacientes = pMisPacientes;
	}

	/**
	 * Metodo que retorna el valor del atributo pVerMas
	 * 
	 * @return Contenido del atributo pVerMas
	 */
	public PanelEVerMas getpVerMas() {
		return pVerMas;
	}

	/**
	 * Metodo que actualiza el valor del atributo pVerMas
	 * 
	 * @param pVerMas valor a actualizar
	 */
	public void setpVerMas(PanelEVerMas pVerMas) {
		this.pVerMas = pVerMas;
	}

	/**
	 * Metodo que retorna el valor del atributo pCambiarTurno
	 * 
	 * @return Contenido del atributo pCambiarTurno
	 */
	public PanelECambiarTurno getpCambiarTurno() {
		return pCambiarTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo pCambiarTurno
	 * 
	 * @param pCambiarTurno valor a actualizar
	 */
	public void setpCambiarTurno(PanelECambiarTurno pCambiarTurno) {
		this.pCambiarTurno = pCambiarTurno;
	}

	/**
	 * Metodo que retorna el valor del atributo pSolicitudTurno
	 * 
	 * @return Contenido del atributo pSolicitudTurno
	 */
	public PanelESolicitudTurno getpSolicitudTurno() {
		return pSolicitudTurno;
	}

	/**
	 * Metodo que actualiza el valor del atributo pSolicitudTurno
	 * 
	 * @param pSolicitudTurno valor a actualizar
	 */
	public void setpSolicitudTurno(PanelESolicitudTurno pSolicitudTurno) {
		this.pSolicitudTurno = pSolicitudTurno;
	}

}
