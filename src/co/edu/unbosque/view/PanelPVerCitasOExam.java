package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra una tabla de citas o examenes para el paciente.
 * Este panel se utiliza para visualizar la lista de citas o examenes
 * que el paciente tiene programados, incluyendo informacion como el
 * nombre del especialista, la fecha y la hora.
 * 
 * @autor Juan Leal
 */
public class PanelPVerCitasOExam extends JPanel {

    /**
     * Tabla que contiene las citas o examenes del paciente.
     */
    private JTable tablaCitas;

    /**
     * Panel de desplazamiento que envuelve la tabla de citas para permitir
     * desplazarse en caso de que haya muchas citas o examenes.
     */
    private JScrollPane scrollPaneCitas;

    /**
     * Constructor del panel de ver citas/examenes. Configura el diseño y
     * los componentes visuales para mostrar la tabla de citas.
     */
    public PanelPVerCitasOExam() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1300, 600));
        inicializarTabla();
    }

    /**
     * Metodo encargado de inicializar la tabla de citas y agregarla
     * dentro de un JScrollPane para permitir el desplazamiento.
     */
    private void inicializarTabla() {
        String[] columnas = {"Cita/Examen", "Nombre Especialista", "Fecha", "Hora"};
        tablaCitas = new JTable(new Object[][]{}, columnas);
        scrollPaneCitas = new JScrollPane(tablaCitas);
        add(scrollPaneCitas, BorderLayout.CENTER);
    }

    /**
     * Devuelve la tabla que muestra las citas o examenes del paciente.
     * 
     * @return la tabla de citas o examenes
     */
    public JTable getTablaCitas() {
        return tablaCitas;
    }

    /**
     * Establece la tabla que muestra las citas o examenes del paciente.
     * 
     * @param tablaCitas la tabla de citas o examenes a establecer
     */
    public void setTablaCitas(JTable tablaCitas) {
        this.tablaCitas = tablaCitas;
    }

    /**
     * Devuelve el JScrollPane que envuelve la tabla de citas, permitiendo
     * el desplazamiento en caso de que haya varias citas o examenes.
     * 
     * @return el JScrollPane que contiene la tabla de citas
     */
    public JScrollPane getScrollPaneCitas() {
        return scrollPaneCitas;
    }

    /**
     * Establece el JScrollPane que envuelve la tabla de citas.
     * 
     * @param scrollPaneCitas el JScrollPane de la tabla de citas a establecer
     */
    public void setScrollPaneCitas(JScrollPane scrollPaneCitas) {
        this.scrollPaneCitas = scrollPaneCitas;
    }
}
