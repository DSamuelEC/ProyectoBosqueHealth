package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel superior que contiene los botones de navegacion para cambiar entre
 * ver citas/examenes y agendar cita.
 * 
 * @author Juan Leal
 */
public class PanelPSuperior extends JPanel {

    /**
     * Constructor del panel superior. Configura los botones y asigna
     * las acciones de navegacion para mostrar los paneles correspondientes.
     * 
     * @param panelPrincipal Referencia al panel principal que controla la visibilidad
     *                       de los subpaneles.
     */
    public PanelPSuperior(PanelPPrincipal panelPrincipal) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(1300, 100));

        JButton btnVerCitas = new JButton("Ver Citas");
        JButton btnVerExamenes = new JButton("Ver Examenes");
        JButton btnAgendarCita = new JButton("Agendar Cita");

        btnVerCitas.addActionListener(e -> panelPrincipal.mostrarPanelVerCitas());
        btnVerExamenes.addActionListener(e -> panelPrincipal.mostrarPanelVerCitas());
        btnAgendarCita.addActionListener(e -> panelPrincipal.mostrarPanelAgendarCita());

        add(new JLabel("NombreUsuario"));
        add(btnVerCitas);
        add(btnVerExamenes);
        add(btnAgendarCita);
        add(new JButton("Reagendar Cita"));
        add(new JButton("Cancelar Cita"));
        add(new JButton("Cerrar sesion"));
    }
}
