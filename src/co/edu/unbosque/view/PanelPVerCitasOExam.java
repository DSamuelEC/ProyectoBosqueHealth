package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra una tabla de citas o examenes para el paciente.
 * 
 * @author Juan Leal
 */
public class PanelPVerCitasOExam extends JPanel {

    /**
     * Constructor del panel de ver citas/examenes. Configura la tabla para mostrar
     * las citas/examenes del paciente.
     */
    public PanelPVerCitasOExam() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1300, 600));

        String[] columnas = {"Cita/Examen", "Nombre Especialista", "Fecha", "Hora"};
        Object[][] datos = {}; 

        JTable tablaCitas = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tablaCitas);

        add(scrollPane, BorderLayout.CENTER);
    }
}
