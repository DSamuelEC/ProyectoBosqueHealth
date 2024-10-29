package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelAccesosPrincipal extends JPanel {
	private PanelAcceso panelAcceso;
	private PanelAccesoPaciente panelAccesoPaciente;
	private PanelCrearPaciente panelCrearPaciente;
	private PanelAccesoEspecialista panelAccesoEspecialista;
	private PanelAccesoAdmin panelAccesoAdmin;

	public PanelAccesosPrincipal() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		panelAcceso = new PanelAcceso();
		panelAcceso.setBounds(0, 0, 1300, 700);
		
		panelAccesoPaciente = new PanelAccesoPaciente();
		panelAccesoPaciente.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		panelCrearPaciente = new PanelCrearPaciente();
		panelCrearPaciente.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		panelAccesoEspecialista = new PanelAccesoEspecialista();
		panelAccesoEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
	
		panelAccesoAdmin = new PanelAccesoAdmin();
		panelAccesoAdmin.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		add(panelAcceso);
		add(panelAccesoPaciente);
		add(panelCrearPaciente);
		add(panelAccesoEspecialista);
		add(panelAccesoAdmin);
	}

	public PanelAcceso getPanelAcceso() {
		return panelAcceso;
	}

	public void setPanelAcceso(PanelAcceso panelAcceso) {
		this.panelAcceso = panelAcceso;
	}

	public PanelAccesoPaciente getPanelAccesoPaciente() {
		return panelAccesoPaciente;
	}

	public void setPanelAccesoPaciente(PanelAccesoPaciente panelAccesoPaciente) {
		this.panelAccesoPaciente = panelAccesoPaciente;
	}

	public PanelAccesoEspecialista getPanelAccesoEspecialista() {
		return panelAccesoEspecialista;
	}

	public void setPanelAccesoEspecialista(PanelAccesoEspecialista panelAccesoEspecialista) {
		this.panelAccesoEspecialista = panelAccesoEspecialista;
	}

	public PanelAccesoAdmin getPanelAccesoAdmin() {
		return panelAccesoAdmin;
	}

	public void setPanelAccesoAdmin(PanelAccesoAdmin panelAccesoAdmin) {
		this.panelAccesoAdmin = panelAccesoAdmin;
	}

	public PanelCrearPaciente getPanelCrearPaciente() {
		return panelCrearPaciente;
	}

	public void setPanelCrearPaciente(PanelCrearPaciente panelCrearPaciente) {
		this.panelCrearPaciente = panelCrearPaciente;
	}
}
