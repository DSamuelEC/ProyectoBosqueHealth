package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;

/**
 * Clase encargada del panel para poder ver la información de las citas y
 * examenes
 * 
 * @author Mariana Ovallos
 */
public class PanelPVerMas extends JPanel {

	/**
	 * Atributo encargado de mostrar un texto con la fecha en el Panel
	 */
	private JLabel lblFecha;
	/**
	 * Atributo encargado de mostrar un texto con la hora en el Panel
	 */
	private JLabel lblHora;
	/**
	 * Atributo encargado de mostrar un texto con el Nombre del Especialista en el
	 * Panel
	 */
	private JLabel lblNombreEspecialista;
	/**
	 * Atributo encargado de mostrar un texto con el correo del especialista en el
	 * Panel
	 */
	private JLabel lblCorreoEspecialista;
	/**
	 * Atributo encargado de mostrar un texto con el nombre del paciente en el Panel
	 */
	private JLabel lblNombrePaciente;
	/**
	 * Atributo encargado de mostrar un texto con el correo del paciente en el Panel
	 */
	private JLabel lblCorreoPaciente;
	/**
	 * Atributo encargado de mostrar un texto con la especialidad del especialista
	 * en el Panel
	 */
	private JLabel lblEspecialidad;
	/**
	 * Atributo encargado de mostrar un boton que muestre la información del
	 * tratamiento del paciente
	 */
	private JButton btnTratamiento;
	/**
	 * Atributo encargado de mostrar un boton que muestre la información del Examen
	 * del paciente
	 */
	private JButton btnExamenes;
	/**
	 * Atributo encargado de mostrar un boton que muestre la información del
	 * Resultado del Examen del paciente
	 */
	private JButton btnResultadoExamen;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelPVerMas() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblHora = new JLabel("Hora");
		lblHora.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblNombreEspecialista = new JLabel("Nombre Especialista");
		lblNombreEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblCorreoEspecialista = new JLabel("Correo Especialista");
		lblCorreoEspecialista.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblNombrePaciente = new JLabel("Nombre Paciente");
		lblNombrePaciente.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblCorreoPaciente = new JLabel("Correro Paciente");
		lblCorreoPaciente.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);

		btnTratamiento = new JButton("Tratamiento");
		btnTratamiento.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnTratamiento.setActionCommand("P_VER_MAS_PACIENTE_TRATAMIENTO");

		btnExamenes = new JButton("Exámenes");
		btnTratamiento.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnExamenes.setActionCommand("P_VER_MAS_PACIENTE_EXAMENES");

		btnResultadoExamen = new JButton("Resultado Exámen");
		btnResultadoExamen.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		btnResultadoExamen.setActionCommand("P_VER_MAS_PACIENTE_RESULTADO_EXAMEN");

		add(lblCorreoEspecialista);
		add(lblCorreoPaciente);
		add(btnExamenes);
		add(btnResultadoExamen);
		add(btnTratamiento);
		add(lblEspecialidad);
		add(lblFecha);
		add(lblHora);
		add(lblNombreEspecialista);
		add(lblNombrePaciente);

	}

	/**
	 * Metodo que retorna el valor del atributo lblFecha
	 * 
	 * @return Contenido del atributo lblFecha
	 */
	public JLabel getLblFecha() {
		return lblFecha;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblFecha
	 * 
	 * @param lblFecha valor a actualizar
	 */
	public void setLblFecha(JLabel lblFecha) {
		this.lblFecha = lblFecha;
	}

	/**
	 * Metodo que retorna el valor del atributo lblHora
	 * 
	 * @return Contenido del atributo lblHora
	 */
	public JLabel getLblHOra() {
		return lblHora;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblHora
	 * 
	 * @param lblHora valor a actualizar
	 */
	public void setLblHOra(JLabel lblHOra) {
		this.lblHora = lblHOra;
	}

	/**
	 * Metodo que retorna el valor del atributo lblNombreEspecialista
	 * 
	 * @return Contenido del atributo lblNombreEspecialista
	 */
	public JLabel getLblNombreEspecialista() {
		return lblNombreEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombreEspecialista
	 * 
	 * @param lblNombreEspecialista valor a actualizar
	 */
	public void setLblNombreEspecialista(JLabel lblNombreEspecialista) {
		this.lblNombreEspecialista = lblNombreEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo lblCorreoEspecialista
	 * 
	 * @return Contenido del atributo lblCorreoEspecialista
	 */
	public JLabel getLblCorreoEspecialista() {
		return lblCorreoEspecialista;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCorreoEspecialista
	 * 
	 * @param lblCorreoEspecialista valor a actualizar
	 */
	public void setLblCorreoEspecialista(JLabel lblCorreoEspecialista) {
		this.lblCorreoEspecialista = lblCorreoEspecialista;
	}

	/**
	 * Metodo que retorna el valor del atributo lblNombrePaciente
	 * 
	 * @return Contenido del atributo lblNombrePaciente
	 */
	public JLabel getLblNombrePaciente() {
		return lblNombrePaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblNombrePaciente
	 * 
	 * @param lblNombrePaciente valor a actualizar
	 */
	public void setLblNombrePaciente(JLabel lblNombrePaciente) {
		this.lblNombrePaciente = lblNombrePaciente;
	}

	/**
	 * Metodo que retorna el valor del atributo lblCorreoPaciente
	 * 
	 * @return Contenido del atributo lblCorreoPaciente
	 */
	public JLabel getLblCorreroPaciente() {
		return lblCorreoPaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCorreoPaciente
	 * 
	 * @param lblCorreoPaciente valor a actualizar
	 */
	public void setLblCorreroPaciente(JLabel lblCorreroPaciente) {
		this.lblCorreoPaciente = lblCorreroPaciente;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEspecialidad
	 * 
	 * @return Contenido del atributo lblEspecialidad
	 */
	public JLabel getLblEspecialidad() {
		return lblEspecialidad;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblEspecialidad
	 * 
	 * @param lblEspecialidad valor a actualizar
	 */
	public void setLblEspecialidad(JLabel lblEspecialidad) {
		this.lblEspecialidad = lblEspecialidad;
	}

	/**
	 * Metodo que retorna el valor del atributo btnTratamiento
	 * 
	 * @return Contenido del atributo btnTratamiento
	 */
	public JButton getBtnTratamiento() {
		return btnTratamiento;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnTratamiento
	 * 
	 * @param btnTratamiento valor a actualizar
	 */
	public void setBtnTratamiento(JButton btnTratamiento) {
		this.btnTratamiento = btnTratamiento;
	}

	/**
	 * Metodo que retorna el valor del atributo btnExamenes
	 * 
	 * @return Contenido del atributo btnExamenes
	 */
	public JButton getBtnExamenes() {
		return btnExamenes;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnExamenes
	 * 
	 * @param btnExamenes valor a actualizar
	 */
	public void setBtnExamenes(JButton btnExamenes) {
		this.btnExamenes = btnExamenes;
	}

	/**
	 * Metodo que retorna el valor del atributo btnResultadoExamen
	 * 
	 * @return Contenido del atributo btnResultadoExamen
	 */
	public JButton getBtnResultadoExamrn() {
		return btnResultadoExamen;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnResultadoExamen
	 * 
	 * @param btnResultadoExamen valor a actualizar
	 */
	public void setBtnResultadoExamrn(JButton btnResultadoExamrn) {
		this.btnResultadoExamen = btnResultadoExamrn;
	}

}
