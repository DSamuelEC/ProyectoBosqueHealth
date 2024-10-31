package co.edu.unbosque.view;

import javax.swing.*;

public class PanelPPrincipal extends JPanel {
	
	private PanelPSuperior pPSuperior;
	private PanelPVerCitasOExamen pPVerCitasOExamen;
	private PanelPCrearOActualizarCita pPCrearOActualizarCita;
	private PanelPVerMas pPVerMas;
	
	public PanelPPrincipal() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		pPCrearOActualizarCita = new PanelPCrearOActualizarCita();
		pPCrearOActualizarCita.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		pPSuperior = new PanelPSuperior();
		pPSuperior.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		pPVerCitasOExamen = new PanelPVerCitasOExamen();
		pPVerCitasOExamen.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		
		
		
		
		
	}

}
