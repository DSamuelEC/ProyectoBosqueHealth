package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que permite al paciente agendar una cita, seleccionando la especialidad
 * y la fecha, y mostrando la disponibilidad de citas.
 * 
 * @author Juan Leal
 */
public class PanelAgendarCita extends JPanel {

    /**
     * Constructor del panel para agendar cita. Configura los campos de entrada y
     * la tabla de disponibilidad para que el paciente seleccione una cita.
     */
    public PanelAgendarCita() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1300, 600));

        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new FlowLayout(FlowLayout.LEFT));

        JComboBox<String> comboEspecialidad = new JComboBox<>(new String[]{"Especialidad 1", "Especialidad 2"});
        JTextField campoFecha = new JTextField(10);
        JButton btnBuscarDisponibilidad = new JButton("Buscar Disponibilidad");
        JButton btnAgendar = new JButton("Agendar");

        panelFormulario.add(new JLabel("Ingrese Especialidad"));
        panelFormulario.add(comboEspecialidad);
        panelFormulario.add(new JLabel("Digite Fecha AA/MM/DD"));
        panelFormulario.add(campoFecha);
        panelFormulario.add(btnBuscarDisponibilidad);
        panelFormulario.add(btnAgendar);

        add(panelFormulario, BorderLayout.NORTH);

        String[] columnas = {"Cita/Examen", "Nombre Especialista", "Fecha", "Hora"};
        Object[][] datos = {}; 

        JTable tablaDisponibilidad = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tablaDisponibilidad);

        add(scrollPane, BorderLayout.CENTER);
    }
}
