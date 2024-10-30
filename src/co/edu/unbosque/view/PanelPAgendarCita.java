package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que permite al paciente agendar una cita, seleccionando la especialidad
 * y la fecha, y mostrando la disponibilidad de citas.
 * Este panel facilita la seleccion de una cita en funcion de la especialidad y
 * la fecha ingresada.
 * 
 * @autor Juan Leal
 */
public class PanelPAgendarCita extends JPanel {

    /**
     * ComboBox para seleccionar la especialidad de la cita.
     */
    private JComboBox<String> comboEspecialidad;

    /**
     * Campo de texto para ingresar la fecha de la cita en formato AA/MM/DD.
     */
    private JTextField campoFecha;

    /**
     * Boton para buscar la disponibilidad de citas segun la especialidad y fecha.
     */
    private JButton btnBuscarDisponibilidad;

    /**
     * Boton para confirmar el agendamiento de la cita seleccionada.
     */
    private JButton btnAgendar;

    /**
     * Tabla que muestra la disponibilidad de citas segun la especialidad y fecha ingresadas.
     */
    private JTable tablaDisponibilidad;

    /**
     * Panel de desplazamiento que envuelve la tabla de disponibilidad para permitir
     * desplazarse cuando hay varias opciones de citas.
     */
    private JScrollPane scrollPaneDisponibilidad;

    /**
     * Constructor del panel para agendar cita. Configura el diseño del panel,
     * inicializa los componentes y estructura el area de seleccion de citas.
     */
    public PanelPAgendarCita() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(1300, 600));
        inicializarComponentes();
    }

    /**
     * Metodo encargado de inicializar y configurar los componentes del panel,
     * incluyendo el ComboBox de especialidades, el campo de fecha, los botones,
     * y la tabla de disponibilidad.
     */
    private void inicializarComponentes() {
        JPanel panelSuperior = new JPanel(new FlowLayout());
        
        comboEspecialidad = new JComboBox<>(new String[]{"Seleccione Especialidad", "Cardiologia", "Dermatologia", "Neurologia"});
        campoFecha = new JTextField("Digite Fecha AA/MM/DD", 10);
        btnBuscarDisponibilidad = new JButton("Buscar Disponibilidad");
        btnAgendar = new JButton("Agendar");
        
        panelSuperior.add(new JLabel("AGENDAMIENTO DE CITAS"));
        panelSuperior.add(comboEspecialidad);
        panelSuperior.add(campoFecha);
        panelSuperior.add(btnBuscarDisponibilidad);
        panelSuperior.add(btnAgendar);

        String[] columnas = {"Cita", "Especialista", "Fecha", "Hora"};
        tablaDisponibilidad = new JTable(new Object[][]{}, columnas);
        scrollPaneDisponibilidad = new JScrollPane(tablaDisponibilidad);

        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPaneDisponibilidad, BorderLayout.CENTER);
    }

    /**
     * Devuelve el ComboBox para seleccionar la especialidad de la cita.
     * 
     * @return el ComboBox de especialidad
     */
    public JComboBox<String> getComboEspecialidad() {
        return comboEspecialidad;
    }

    /**
     * Establece el ComboBox para seleccionar la especialidad de la cita.
     * 
     * @param comboEspecialidad el ComboBox de especialidad a establecer
     */
    public void setComboEspecialidad(JComboBox<String> comboEspecialidad) {
        this.comboEspecialidad = comboEspecialidad;
    }

    /**
     * Devuelve el campo de texto para ingresar la fecha de la cita.
     * 
     * @return el campo de fecha
     */
    public JTextField getCampoFecha() {
        return campoFecha;
    }

    /**
     * Establece el campo de texto para ingresar la fecha de la cita.
     * 
     * @param campoFecha el campo de fecha a establecer
     */
    public void setCampoFecha(JTextField campoFecha) {
        this.campoFecha = campoFecha;
    }

    /**
     * Devuelve el boton para buscar la disponibilidad de citas.
     * 
     * @return el boton para buscar disponibilidad
     */
    public JButton getBtnBuscarDisponibilidad() {
        return btnBuscarDisponibilidad;
    }

    /**
     * Establece el boton para buscar la disponibilidad de citas.
     * 
     * @param btnBuscarDisponibilidad el boton para buscar disponibilidad a establecer
     */
    public void setBtnBuscarDisponibilidad(JButton btnBuscarDisponibilidad) {
        this.btnBuscarDisponibilidad = btnBuscarDisponibilidad;
    }

    /**
     * Devuelve el boton para confirmar el agendamiento de la cita seleccionada.
     * 
     * @return el boton para agendar cita
     */
    public JButton getBtnAgendar() {
        return btnAgendar;
    }

    /**
     * Establece el boton para confirmar el agendamiento de la cita seleccionada.
     * 
     * @param btnAgendar el boton para agendar cita a establecer
     */
    public void setBtnAgendar(JButton btnAgendar) {
        this.btnAgendar = btnAgendar;
    }

    /**
     * Devuelve la tabla que muestra la disponibilidad de citas.
     * 
     * @return la tabla de disponibilidad de citas
     */
    public JTable getTablaDisponibilidad() {
        return tablaDisponibilidad;
    }

    /**
     * Establece la tabla que muestra la disponibilidad de citas.
     * 
     * @param tablaDisponibilidad la tabla de disponibilidad a establecer
     */
    public void setTablaDisponibilidad(JTable tablaDisponibilidad) {
        this.tablaDisponibilidad = tablaDisponibilidad;
    }

    /**
     * Devuelve el JScrollPane que envuelve la tabla de disponibilidad de citas,
     * permitiendo desplazarse en caso de que haya varias opciones.
     * 
     * @return el JScrollPane que contiene la tabla de disponibilidad
     */
    public JScrollPane getScrollPaneDisponibilidad() {
        return scrollPaneDisponibilidad;
    }

    /**
     * Establece el JScrollPane que envuelve la tabla de disponibilidad de citas.
     * 
     * @param scrollPaneDisponibilidad el JScrollPane de la tabla de disponibilidad a establecer
     */
    public void setScrollPaneDisponibilidad(JScrollPane scrollPaneDisponibilidad) {
        this.scrollPaneDisponibilidad = scrollPaneDisponibilidad;
    }
}
