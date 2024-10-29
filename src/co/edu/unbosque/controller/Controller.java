package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ventanaP;

	public Controller() {
		ventanaP = new VentanaPrincipal();
		asignarOyentes();
	}

	public void asignarOyentes() {
//		Accesos
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnUsuario().addActionListener(e -> {
			System.out.println("eventoo");
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnEspecialista().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnAdmin().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnAtras().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnCrearUsuario().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnSubmit().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(false);
//			ventanaP.getp().setVisible(true); (deberia llevarme a la vista del usuario)
		});
		ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnAtras().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnSubmit().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().setVisible(false);
//			 mostrar un popup que diga si se creo y si si que ingrese
			ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnAtras().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnSubmit().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().setVisible(false);
//			ventanaP.getpEPrincipal().setVisible(true); 
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnAtras().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().setVisible(false);
			ventanaP.getpAccesosPrincipal().getPanelAcceso().setVisible(true);
		});
		ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnSubmit().addActionListener(e -> {
			ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().setVisible(false);
//			ventanaP.getp.setVisible(true); (deberia llevarme a la vista del admin)
		});

	}

	public void run() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
	}
}
