package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Panel superior que contiene los botones de navegacion para cambiar entre
 * ver citas, ver examenes, agendar cita, reagendar y cancelar cita, y cerrar sesion.
 * Este panel se coloca en la parte superior de la interfaz del paciente.
 * 
 * @autor Juan Leal
 */
public class PanelPSuperior extends JPanel {

    /**
     * Boton para ver las citas del paciente.
     */
    private JButton btnVerCitas;

    /**
     * Boton para ver los examenes del paciente.
     */
    private JButton btnVerExamenes;

    /**
     * Boton para acceder al panel de agendar una cita.
     */
    private JButton btnAgendarCita;

    /**
     * Boton para reagendar una cita existente.
     */
    private JButton btnReagendarCita;

    /**
     * Boton para cancelar una cita.
     */
    private JButton btnCancelarCita;

    /**
     * Boton para cerrar la sesion del paciente.
     */
    private JButton btnCerrarSesion;

    /**
     * Etiqueta que muestra el nombre del usuario actual.
     */
    private JLabel lblNombreUsuario;

    /**
     * Referencia al panel principal para controlar la visibilidad de los subpaneles.
     */
    private PanelPPrincipal panelPrincipal;

    /**
     * Constructor del panel superior. Configura el layout, inicializa los componentes
     * y asigna acciones a los botones para la navegacion entre vistas.
     * 
     * @param panelPrincipal Referencia al panel principal que controla la visibilidad
     *                       de los subpaneles.
     */
    public PanelPSuperior(PanelPPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(1300, 100));
        inicializarComponentes();
        asignarOyentes();
    }

    /**
     * Metodo encargado de inicializar y agregar los componentes al panel,
     * incluyendo la etiqueta del nombre de usuario y los botones de navegacion.
     */
    private void inicializarComponentes() {
        lblNombreUsuario = new JLabel("Nombre Usuario");
        btnVerCitas = new JButton("Ver Citas");
        btnVerExamenes = new JButton("Ver Examenes");
        btnAgendarCita = new JButton("Agendar Cita");
        btnReagendarCita = new JButton("Reagendar Cita");
        btnCancelarCita = new JButton("Cancelar Cita");
        btnCerrarSesion = new JButton("Cerrar sesion");

        add(lblNombreUsuario);
        add(btnVerCitas);
        add(btnVerExamenes);
        add(btnAgendarCita);
        add(btnReagendarCita);
        add(btnCancelarCita);
        add(btnCerrarSesion);
    }

    /**
     * Metodo que asigna los ActionListeners a cada boton del panel.
     * Se encarga de definir las acciones de navegacion para cada boton.
     */
    private void asignarOyentes() {
        btnVerCitas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarPanelVerCitas();
            }
        });

        btnVerExamenes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarPanelVerCitas();
            }
        });

        btnAgendarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarPanelAgendarCita();
            }
        });

        btnReagendarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Funcionalidad de reagendar :p.");
            }
        });

        btnCancelarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Funcionalidad de cancelar :p.");
            }
        });

        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cerrando sesion...");
                System.exit(0);
            }
        });
    }

    /**
     * Devuelve el boton para ver citas.
     * 
     * @return el boton para ver citas
     */
    public JButton getBtnVerCitas() {
        return btnVerCitas;
    }

    /**
     * Establece el boton para ver citas.
     * 
     * @param btnVerCitas el boton para ver citas
     */
    public void setBtnVerCitas(JButton btnVerCitas) {
        this.btnVerCitas = btnVerCitas;
    }

    /**
     * Devuelve el boton para ver examenes.
     * 
     * @return el boton para ver examenes
     */
    public JButton getBtnVerExamenes() {
        return btnVerExamenes;
    }

    /**
     * Establece el boton para ver examenes.
     * 
     * @param btnVerExamenes el boton para ver examenes
     */
    public void setBtnVerExamenes(JButton btnVerExamenes) {
        this.btnVerExamenes = btnVerExamenes;
    }

    /**
     * Devuelve el boton para agendar una cita.
     * 
     * @return el boton para agendar cita
     */
    public JButton getBtnAgendarCita() {
        return btnAgendarCita;
    }

    /**
     * Establece el boton para agendar una cita.
     * 
     * @param btnAgendarCita el boton para agendar cita
     */
    public void setBtnAgendarCita(JButton btnAgendarCita) {
        this.btnAgendarCita = btnAgendarCita;
    }

    /**
     * Devuelve el boton para reagendar una cita.
     * 
     * @return el boton para reagendar cita
     */
    public JButton getBtnReagendarCita() {
        return btnReagendarCita;
    }

    /**
     * Establece el boton para reagendar una cita.
     * 
     * @param btnReagendarCita el boton para reagendar cita
     */
    public void setBtnReagendarCita(JButton btnReagendarCita) {
        this.btnReagendarCita = btnReagendarCita;
    }

    /**
     * Devuelve el boton para cancelar una cita.
     * 
     * @return el boton para cancelar cita
     */
    public JButton getBtnCancelarCita() {
        return btnCancelarCita;
    }

    /**
     * Establece el boton para cancelar una cita.
     * 
     * @param btnCancelarCita el boton para cancelar cita
     */
    public void setBtnCancelarCita(JButton btnCancelarCita) {
        this.btnCancelarCita = btnCancelarCita;
    }

    /**
     * Devuelve el boton para cerrar sesion.
     * 
     * @return el boton para cerrar sesion
     */
    public JButton getBtnCerrarSesion() {
        return btnCerrarSesion;
    }

    /**
     * Establece el boton para cerrar sesion.
     * 
     * @param btnCerrarSesion el boton para cerrar sesion
     */
    public void setBtnCerrarSesion(JButton btnCerrarSesion) {
        this.btnCerrarSesion = btnCerrarSesion;
    }

    /**
     * Devuelve la etiqueta que muestra el nombre del usuario.
     * 
     * @return la etiqueta del nombre del usuario
     */
    public JLabel getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    /**
     * Establece la etiqueta del nombre del usuario.
     * 
     * @param lblNombreUsuario la etiqueta del nombre del usuario
     */
    public void setLblNombreUsuario(JLabel lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }
}
