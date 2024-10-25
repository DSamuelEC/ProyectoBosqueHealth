package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelPrincipalAccesos panelPrincipalAccesos;

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
		panelPrincipalAccesos = new PanelPrincipalAccesos();
		panelPrincipalAccesos.setBounds(0, 0, 1300, 700);
		getContentPane().add(panelPrincipalAccesos);
	}

	public PanelPrincipalAccesos getPanelPrincipalAccesos() {
		return panelPrincipalAccesos;
	}

	public void setPanelPrincipalAccesos(PanelPrincipalAccesos panelPrincipalAccesos) {
		this.panelPrincipalAccesos = panelPrincipalAccesos;
	}
}
