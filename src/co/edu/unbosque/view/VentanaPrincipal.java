package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelAccesosPrincipal pAccesosPrincipal;
	private PanelEPrincipal pEPrincipal;
//	private PanelPrincipalPaciente pPrincipalPaciente;

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

//		pPrincipalPaciente = new PanelPrincipalPaciente();
//		pPrincipalPaciente.setBounds(0, 0, 1300, 700);
//		getContentPane().add(pPrincipalPaciente);

	}

	/**
	 * Metodo que cambia la visibilidad de los paneles principales, el orden son 1 =
	 * pAccesosPrincipal, 3 = pEPrincipal, y faltan los otros 2 paneles principales
	 * 
	 * @param panelVisible panel que se hara visible
	 */
	public void cambiarVisibilidad(int panelVisible) {
		switch (panelVisible) {
		case 1:
			pEPrincipal.setVisible(false);
			pAccesosPrincipal.setVisible(true);
			break;
		case 2:

			break;
		case 3:
			pAccesosPrincipal.setVisible(false);
			pEPrincipal.setVisible(true);
			break;
		case 4:

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
}
