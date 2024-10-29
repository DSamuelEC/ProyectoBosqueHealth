package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelAccesosPrincipal pAccesosPrincipal;
	private PanelEPrincipal pEPrincipal;
	private PanelPrincipalPaciente pPrincipalPaciente;

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

	public void inicializarComponentes() {
		pAccesosPrincipal = new PanelAccesosPrincipal();
		pAccesosPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pAccesosPrincipal);
		
		pEPrincipal = new PanelEPrincipal();
		pEPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pEPrincipal);
		
		pPrincipalPaciente = new PanelPrincipalPaciente();
		pPrincipalPaciente.setBounds(0, 0, 1300, 700);
		getContentPane().add(pPrincipalPaciente);
		
		
		
	}

	public PanelAccesosPrincipal getpAccesosPrincipal() {
		return pAccesosPrincipal;
	}

	public void setpAccesosPrincipal(PanelAccesosPrincipal pAccesosPrincipal) {
		this.pAccesosPrincipal = pAccesosPrincipal;
	}

	public PanelEPrincipal getpEPrincipal() {
		return pEPrincipal;
	}

	public void setpEPrincipal(PanelEPrincipal pEPrincipal) {
		this.pEPrincipal = pEPrincipal;
	}

}
