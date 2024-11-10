package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class ControllerAccesos implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;

	public ControllerAccesos(Controller controllerPrincipal, VentanaPrincipal ventanaP) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnUsuario().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnEspecialista().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAcceso().getBtnAdmin().addActionListener(this);

		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnAtras().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnCrearUsuario().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getBtnSubmit().addActionListener(this);

		ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnAtras().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getBtnSubmit().addActionListener(this);

		ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnAtras().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getBtnSubmit().addActionListener(this);

		ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnAtras().addActionListener(this);
		ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getBtnSubmit().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		switch (comando) {
		case "P_ACCESO_USUARIO":
			cambiarPanel(2);
			break;
		case "P_ACCESO_ESPECIALISTA":
			cambiarPanel(4);
			break;
		case "P_ACCESO_ADMIN":
			cambiarPanel(5);
			break;
		case "P_ACCESOPACIENTE_ATRAS":
			cambiarPanel(1);
			break;
		case "P_ACCESOPACIENTE_SUBMIT":
			capturarAcceso(1);
			break;
		case "P_ACCESOPACIENTE_CREARUSUARIO":
			cambiarPanel(3);
			break;
		case "P_ACCESOSCREARPACIENTE_ATRAS":
			cambiarPanel(2);
			break;
		case "P_ACCESOSCREARPACIENTE_SUBMIT":
			capturarDatosCrearPaciente();
			break;
		case "P_ACCESOESPECIALISTA_ATRAS":
			cambiarPanel(1);
			break;
		case "P_ACCESOESPECIALISTA_SUBMIT":
			capturarAcceso(2);
			break;
		case "P_ACCESOADMIN_ATRAS":
			cambiarPanel(1);
			break;
		case "P_ACCESOADMIN_SUBMIT":
			capturarAcceso(3);
			break;
		default:
			break;
		}
	}

	public void cambiarPanel(int index) {
		ventanaP.getpAccesosPrincipal().cambiarVisibilidad(index);
	}

	public void capturarDatosCrearPaciente() {
		String nombre = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtNombre().getText();
		long cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCedula().getText());
		String correo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCorreo().getText();
		String sexo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getLdSexo().getSelectedItem().toString();
		int edad = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtEdad().getText());
		controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "PACIENTE", null);
	}

//	ADM
	public void capturarDatosCrearAdmin() {
		String nombre = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtNombre().getText();
		long cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCedula().getText());
		String correo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCorreo().getText();
		String sexo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getLdSexo().getSelectedItem().toString();
		int edad = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtEdad().getText());
		controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "ADMIN", null);
	}

	public void capturarAcceso(int index) {
		String nombre;
		long cedula;
		switch (index) {
		case 1:
			nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getTxtNombre().getText();
			cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoPaciente().getTxtCedula().getText());
			controllerPrincipal.capturarDatosLogin(nombre, cedula, "PACIENTE", 2);
			break;
		case 2:
			nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getTxtNombre().getText();
			cedula = Long
					.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoEspecialista().getTxtCedula().getText());
			controllerPrincipal.capturarDatosLogin(nombre, cedula, "ESPECIALISTA", 3);
			break;
		case 3:
			nombre = ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getTxtNombre().getText();
			cedula = Long.parseLong(ventanaP.getpAccesosPrincipal().getPanelAccesoAdmin().getTxtCedula().getText());
			controllerPrincipal.capturarDatosLogin(nombre, cedula, "ADMIN", 4);
			break;
		default:
			break;
		}
	}
}