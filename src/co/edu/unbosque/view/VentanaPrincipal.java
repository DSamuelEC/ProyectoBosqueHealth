package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelAccesosPrincipal pAccesosPrincipal;
	private PanelEPrincipal pEPrincipal;
	private PanelPPrincipal pPPrincipal;
	private PanelAdPrincipal pAdPrincipal;

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
		
		pPPrincipal = new PanelPPrincipal();
		pPPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pPPrincipal);
		
		pAdPrincipal = new PanelAdPrincipal();
		pAdPrincipal.setBounds(0, 0, 1300, 700);
		getContentPane().add(pAdPrincipal);

		
	}

	/**
	 * Metodo que cambia la visibilidad de los paneles principales, el orden son 1 =
	 * pAccesosPrincipal, 2 = pPPrincipal 3 = pEPrincipal, y falta Admin
	 * 
	 * @param panelVisible index panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:
			pAdPrincipal.setVisible(false);
			pPPrincipal.setVisible(false);
			pEPrincipal.setVisible(false);
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
			pPPrincipal.setVisible(false);
			pAccesosPrincipal.setVisible(false);
			pEPrincipal.setVisible(false);
			pAdPrincipal.setVisible(true);
			break;
		default:
			break;
		}
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

	public PanelPPrincipal getpPPrincipal() {
		return pPPrincipal;
	}

	public void setpPPrincipal(PanelPPrincipal pPPrincipal) {
		this.pPPrincipal = pPPrincipal;
	}

	public PanelAdPrincipal getpAdPrincipal() {
		return pAdPrincipal;
	}

	public void setpAdPrincipal(PanelAdPrincipal pAdPrincipal) {
		this.pAdPrincipal = pAdPrincipal;
	}

	

}
