package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

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
	 * Atributo encargado de mostrar un boton que guarde la información y vuelva al
	 * panel VerCitasOexamen
	 */
	private JButton btnSubmit;
	/**
	 * Atributo encargado de mostrar un boton de volver al VerCitasOexamen
	 */
	private JButton btnAtras;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelPVerMas() {
		setSize(1300, 700);
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setVisible(false);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {

		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(50, 30, 100, 30);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setForeground(new Color(5, 25, 35 ));

		lblHora = new JLabel("Hora");
		lblHora.setBounds(900, 30, 100, 30);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHora.setForeground(new Color(5, 25, 35 ));

		lblNombreEspecialista = new JLabel("Nombre Especialista");
		lblNombreEspecialista.setBounds(50, 100, 200, 30);
		lblNombreEspecialista.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombreEspecialista.setForeground(new Color(5, 25, 35 ));

		lblCorreoEspecialista = new JLabel("Correo Especialista");
		lblCorreoEspecialista.setBounds(50, 140, 200, 30);
		lblCorreoEspecialista.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCorreoEspecialista.setForeground(new Color(5, 25, 35 ));

		lblNombrePaciente = new JLabel("Nombre Paciente");
		lblNombrePaciente.setBounds(50, 180, 200, 30);
		lblNombrePaciente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombrePaciente.setForeground(new Color(5, 25, 35 ));

		lblCorreoPaciente = new JLabel("Correro Paciente");
		lblCorreoPaciente.setBounds(50, 220, 200, 30);
		lblCorreoPaciente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCorreoPaciente.setForeground(new Color(5, 25, 35 ));

		lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(50, 260, 200, 30);
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEspecialidad.setForeground(new Color(5, 25, 35 ));

		btnTratamiento = new JButton("Tratamiento");
		btnTratamiento.setBounds(150, 400, 300, 40);
		btnTratamiento.setActionCommand("P_VER_MAS_PACIENTE_TRATAMIENTO");
		btnTratamiento.setBackground(new Color(244, 158, 76));
		btnTratamiento.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTratamiento.setForeground(new Color(5, 25, 35 ));

		btnExamenes = new JButton("Exámenes");
		btnExamenes.setBounds(500, 400, 300, 40);
		btnExamenes.setActionCommand("P_VER_MAS_PACIENTE_EXAMENES");
		btnExamenes.setBackground(new Color(244, 158, 76));
		btnExamenes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExamenes.setForeground(new Color(5, 25, 35 ));

		btnResultadoExamen = new JButton("Resultado Exámen");
		btnResultadoExamen.setBounds(850, 400, 300, 40);
		btnResultadoExamen.setActionCommand("P_VER_MAS_PACIENTE_RESULTADO_EXAMEN");
		btnResultadoExamen.setBackground(new Color(244, 158, 76));
		btnResultadoExamen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResultadoExamen.setForeground(new Color(5, 25, 35 ));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(680, 480, 100, 30);
		btnSubmit.setActionCommand("P_VER_MAS_PACIENTE_SUBMIT");
		btnSubmit.setBackground(new Color(244, 158, 76));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setForeground(new Color(5, 25, 35 ));

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(510, 480, 100, 30);
		btnAtras.setActionCommand("P_VER_MAS_PACIENTE_ATRAS");
		btnAtras.setBackground(new Color(244, 158, 76));
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtras.setForeground(new Color(5, 25, 35 ));

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
		add(btnAtras);
		add(btnSubmit);
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
	public JLabel getLblHora() {
		return lblHora;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblHora
	 * 
	 * @param lblHora valor a actualizar
	 */
	public void setLblHora(JLabel lblHOra) {
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
	public JLabel getLblCorreoPaciente() {
		return lblCorreoPaciente;
	}

	/**
	 * Metodo que actualiza el valor del atributo lblCorreoPaciente
	 * 
	 * @param lblCorreoPaciente valor a actualizar
	 */
	public void setLblCorreoPaciente(JLabel lblCorreroPaciente) {
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
	public JButton getBtnResultadoExamen() {
		return btnResultadoExamen;
	}

	/**
	 * Metodo que actualiza el valor del atributo btnResultadoExamen
	 * 
	 * @param btnResultadoExamen valor a actualizar
	 */
	public void setBtnResultadoExamen(JButton btnResultadoExamrn) {
		this.btnResultadoExamen = btnResultadoExamrn;
	}
	/**
	 * Metodo que retorna el valor del atributo btnSubmit
	 * 
	 * @return Contenido del atributo btnSubmit
	 */
	public JButton getBtnSubmit() {
		return btnSubmit;
	}
	/**
	 * Metodo que actualiza el valor del atributo btnSubmit
	 * 
	 * @param btnSubmit valor a actualizar
	 */
	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	/**
	 * Metodo que retorna el valor del atributo btnAtras
	 * 
	 * @return Contenido del atributo btnAtras
	 */
	public JButton getBtnAtras() {
		return btnAtras;
	}
	/**
	 * Metodo que actualiza el valor del atributo btnAtras
	 * 
	 * @param btnAtras valor a actualizar
	 */
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
	

}
