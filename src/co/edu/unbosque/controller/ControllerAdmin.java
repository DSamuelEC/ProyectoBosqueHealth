package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class ControllerAdmin implements ActionListener {
	private Controller controllerPrincipal;
	private VentanaPrincipal ventanaP;
	private VistaVentanasEmergentes vistaE;
	private Admin admin;

	public ControllerAdmin(Controller controllerPrincipal, VentanaPrincipal ventanaP, VistaVentanasEmergentes vistaE) {
		this.controllerPrincipal = controllerPrincipal;
		this.ventanaP = ventanaP;
		this.vistaE = vistaE;
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnAsignarTurnos().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnCerrarSesion().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnConfiguraciones().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnRegistrarEspecialistas().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnReportes().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnVerEspecialistas().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdBotones().getBtnVerPacientes().addActionListener(this);

		ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getBtnAtras().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getBtnSubmit().addActionListener(this);

		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasTurnos().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosTurnos().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasEspecialistas().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosEspecialistas().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMasDias().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnMenosDias().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnAtras().addActionListener(this);
		ventanaP.getpAdPrincipal().getpAdConfiguraciones().getBtnSubmit().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		switch (comando) {
		case "P_BOTONES_ADMIN_REGISTRAR_ESPECIALISTA":
			cambiarPanel(2);
			break;
		case "P_BOTONES_ADMIN_ASIGNAR_TURNOS":
			admin.asignarTurnosMensuales();
			controllerPrincipal.actualizarLaDBConEspecialistas(admin.getEspecialistas());
			break;
		case "P_BOTONES_ADMIN_VER_PACIENTES":
			cambiarPanel(1);
			setearTablePacientes(admin.getPacientes());
			break;
		case "P_BOTONES_ADMIN_VER_ESPECIALISTAS":
			cambiarPanel(1);
			setearTableEspecialistas(admin.getEspecialistas());
			break;
		case "P_BOTONES_ADMIN_REPORTES":
			vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
			break;
		case "P_BOTONES_ADMIN_CONFIGURACIONES":
			cambiarPanel(3);
			vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
			break;
		case "P_BOTONES_ADMIN_CERRAR_SESION":
			cambiarPanel(1);
			controllerPrincipal.cerrarSesiones(1);
			break;
		case "P_AD_CONFIGURACIONES_ATRAS":
			cambiarPanel(1);
			break;
		case "P_AD_CONFIGURACIONES_SUBMIT":
			vistaE.mostrarInformacion("FUNCION NO AGREGADA", 0);
//			cambiarPanel(1);
		case "P_AD_REGISTRAR_ESPECIALISTA_ATRAS":
			cambiarPanel(1);
			break;
		case "P_AD_REGISTRAR_ESPECIALISTA_SUBMIT":
			capturarDatosCrearEspecialista();
			break;
		case "P_AD_CONFIGURACIONES_MAS_TURNOS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("turnos", "MAS", 0);
			break;
		case "P_AD_CONFIGURACIONES_MENOS_TURNOS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("turnos", "MENOS", 0);
			break;
		case "P_AD_CONFIGURACIONES_MAS_ESPECIALISTAS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("especialistas", "MAS", 0);
			break;
		case "P_AD_CONFIGURACIONES_MENOS_ESPECIALISTAS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("especialistas", "MENOS", 0);
			break;
		case "P_AD_CONFIGURACIONES_MAS_DIAS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("dias", "MAS", 0);
			break;
		case "P_AD_CONFIGURACIONES_MENOS_DIAS":
			ventanaP.getpAdPrincipal().getpAdConfiguraciones().cambiarEstados("dias", "MENOS", 0);
			break;
		default:
			break;
		}
	}

	public void cambiarPanel(int index) {
		ventanaP.getpAdPrincipal().cambiarVisibilidad(index);
	}

	public void capturarDatosCrearEspecialista() {
		String nombre = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtNombre().getText();
		String especialidad = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getLdEspecialidad()
				.getSelectedItem().toString();
		String correo = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtCorreo().getText();
		long cedula = Long.parseLong(ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtCedula().getText());
		String sexo = ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getLdSexo().getSelectedItem().toString();
		int edad = Integer.parseInt(ventanaP.getpAdPrincipal().getpAdRegistrarEspecialista().getTxtEdad().getText());

		controllerPrincipal.capturarDatosCrearPersonas(nombre, cedula, correo, sexo, edad, "ESPECIALISTA",
				especialidad);
	}

	public void setearDatosAdmin(Admin admin) {
		this.admin = admin;
		ventanaP.getpAdPrincipal().getpAdBotones().getLblNombreAdmin().setText(this.admin.getNombre());
		setearTablePacientes(this.admin.getPacientes());
	}

	public void setearTablePacientes(ArrayList<Paciente> pacientes) {
		ventanaP.getpAdPrincipal().getpAdVerTodos().limpiarTabla();
		if (pacientes.size() == 0) {
			vistaE.mostrarInformacion("No existen pacientes aun", 1);
		} else {
			ventanaP.getpAdPrincipal().getpAdVerTodos().cambiarEncabezado(0, "Paciente");
			for (Paciente paciente : pacientes) {
				ventanaP.getpAdPrincipal().getpAdVerTodos().agregarFilaTabla(paciente.getNombre(),
						paciente.getCorreo());
			}
		}
	}

	public void setearTableEspecialistas(ArrayList<Especialista> especialistas) {
		ventanaP.getpAdPrincipal().getpAdVerTodos().limpiarTabla();
		if (especialistas.size() == 0) {
			vistaE.mostrarInformacion("No existen especialistas aun", 1);
		} else {
			ventanaP.getpAdPrincipal().getpAdVerTodos().cambiarEncabezado(0, "Especialista");
			for (Especialista especialista : especialistas) {
				ventanaP.getpAdPrincipal().getpAdVerTodos().agregarFilaTabla(especialista.getNombre(),
						especialista.getCorreo());
			}
		}
	}
}
