package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelAccesosPrincipal panelPrincipalAccesos;
	private PanelEPrincipal pEPrincipal;

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
		panelPrincipalAccesos = new PanelAccesosPrincipal();
		panelPrincipalAccesos.setBounds(0, 0, 1300, 700);
		getContentPane().add(panelPrincipalAccesos);
		
		pEPrincipal = new PanelEPrincipal();
		pEPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pEPrincipal);
	}

	public PanelAccesosPrincipal getPanelPrincipalAccesos() {
		return panelPrincipalAccesos;
	}

	public void setPanelPrincipalAccesos(PanelAccesosPrincipal panelPrincipalAccesos) {
		this.panelPrincipalAccesos = panelPrincipalAccesos;
	}
}
