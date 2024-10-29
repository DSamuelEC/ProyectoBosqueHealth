package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Clase principal del panel de gestion de citas para el paciente.
 * Controla la visibilidad de los subpaneles para ver citas/examenes
 * y agendar citas.
 * 
 * @author Juan Leal
 */
public class PanelPrincipalPaciente extends JPanel {
    private PanelVerCitasOExam panelVerCitasOExam;
    private PanelAgendarCita panelAgendarCita;

    /**
     * Constructor del panel principal. Inicializa los paneles superiores
     * y de contenido, y establece el tamaño y la disposicion del panel.
     */
    public PanelPrincipalPaciente() {
        setPreferredSize(new Dimension(1300, 700));
        setLayout(null); // Para posicionar manualmente los paneles

        PanelSuperiorPaciente panelSuperior = new PanelSuperiorPaciente(this);
        panelSuperior.setBounds(0, 0, 1300, 100);
        add(panelSuperior);

        panelVerCitasOExam = new PanelVerCitasOExam();
        panelVerCitasOExam.setBounds(0, 100, 1300, 600);
        panelVerCitasOExam.setVisible(false);
        add(panelVerCitasOExam);

        panelAgendarCita = new PanelAgendarCita();
        panelAgendarCita.setBounds(0, 100, 1300, 600);
        panelAgendarCita.setVisible(false);
        add(panelAgendarCita);
    }

    /**
     * Muestra el panel de ver citas o examenes y oculta el panel de agendar cita.
     */
    public void mostrarPanelVerCitas() {
        panelVerCitasOExam.setVisible(true);
        panelAgendarCita.setVisible(false);
    }

    /**
     * Muestra el panel de agendar cita y oculta el panel de ver citas o examenes.
     */
    public void mostrarPanelAgendarCita() {
        panelVerCitasOExam.setVisible(false);
        panelAgendarCita.setVisible(true);
    }

 }
