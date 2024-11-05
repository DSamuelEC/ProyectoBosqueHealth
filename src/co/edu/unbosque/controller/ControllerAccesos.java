package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerAccesos implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;

	public ControllerAccesos(Controller controllerPrincipal, VentanaPrincipal ventanaP,
			VistaVentanasEmergentes vistaE) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		this.vistaE = vistaE;
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
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESO_ESPECIALISTA":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(4);
			break;
		case "P_ACCESO_ADMIN":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(5);
			break;
		case "P_ACCESOPACIENTE_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOPACIENTE_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Paciente .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(2);
			break;
		case "P_ACCESOPACIENTE_CREARUSUARIO":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(3);
			break;
		case "P_ACCESOSCREARPACIENTE_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESOSCREARPACIENTE_SUBMIT":
			capturarDatos();
//			vistaE.mostrarInformacion("Paciente creado con exito. Por favor loguese", 1);
//			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(2);
			break;
		case "P_ACCESOESPECIALISTA_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOESPECIALISTA_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Especialista .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(3);
			break;
		case "P_ACCESOADMIN_ATRAS":
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			break;
		case "P_ACCESOADMIN_SUBMIT":
			vistaE.mostrarInformacion("Ingreso exitoso. Bienvenido Admin .:Nombre:.", 1);
			ventanaP.getpAccesosPrincipal().cambiarVisibilidad(1);
			ventanaP.cambiarVisibilidad(4);
			break;
		default:
			break;
		}
	}

	public void capturarDatos() {
		String nombre = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtNombre().getText();
		int cedula = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCedula().getText());
		String correo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtCorreo().getText();
		String sexo = ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getLdSexo().getSelectedItem().toString();
		int edad = Integer.parseInt(ventanaP.getpAccesosPrincipal().getPanelCrearPaciente().getTxtEdad().getText());
		controllerPrincipal.capturarDaatosCrearPersonas(nombre, cedula, correo, sexo, edad, "PACIENTE");
	}

	public void cambiarPanel(int index) {
		ventanaP.getpAccesosPrincipal().cambiarVisibilidad(index);
	}
}
