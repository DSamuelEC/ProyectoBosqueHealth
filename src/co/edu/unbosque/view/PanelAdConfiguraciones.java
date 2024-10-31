package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase encargada de mostrar y almacenar los cambios de las configuraciones
 * (archivos properties)
 * 
 * @author Samuel Diaz
 */
public class PanelAdConfiguraciones extends JPanel {
	/**
	 * Atributo encargado de mostrar un texto de informacion para los turnos
	 */
	private JLabel lblTurnos;
	/**
	 * Atributo encargado de mostrar un texto con el estado actual del valor de la
	 * propiedad para la cantidad de turnos, a medida que se aumenta o disminuye
	 * este estado cambia
	 */
	private JLabel lblEstadoTurnos;
	/**
	 * Atributo encargado de mostrar un boton para disminuir la cantidad de turnos
	 * de los especialistas al mes
	 */
	private JButton btnMenosTurnos;
	/**
	 * Atributo encargado de mostrar un boton para aumentar la cantidad de turnos de
	 * los especialistas al mes
	 */
	private JButton btnMasTurnos;
	/**
	 * Atributo encargado de mostrar un texto de informacion para los especialistas
	 */
	private JLabel lblEspecialistas;
	/**
	 * Atributo encargado de mostrar un texto con el estado actual del valor de la
	 * propiedad para la cantidad de especialistas, a medida que se aumenta o
	 * disminuye este estado cambia
	 */
	private JLabel lblEstadoEspecialistas;
	/**
	 * Atributo encargado de mostrar un boton para disminuir la cantidad de
	 * especialistas de cada area
	 */
	private JButton btnMenosEspecialistas;
	/**
	 * Atributo encargado de mostrar un boton para aumentar la cantidad de
	 * especialistas de cada area
	 */
	private JButton btnMasEspecialistas;
	/**
	 * Atributo encargado de mostrar un texto de informacion para los dias
	 */
	private JLabel lblDias;
	/**
	 * Atributo encargado de mostrar un texto con el estado actual del valor de la
	 * propiedad para la cantidad de dias de recordatorio, a medida que se aumenta o
	 * disminuye este estado cambia
	 */
	private JLabel lblEstadoDias;
	/**
	 * Atributo encargado de mostrar un boton para disminuir la cantidad de dias de
	 * recordatorio
	 */
	private JButton btnMenosDias;
	/**
	 * Atributo encargado de mostrar un boton para aumentar la cantidad de dias de
	 * recordatorio
	 */
	private JButton btnMasDias;
	/**
	 * Atributo encargado de mostrar un boton para ir a atras, o en su defecto,
	 * volver al "menu" principal del admin
	 */
	private JButton btnAtras;
	/**
	 * Atributo encargado de mostrar un boton para capturar y enviar la informacion
	 * para configurar las properties
	 */
	private JButton btnSubmit;

	/**
	 * Metodo Constructor de la clase
	 */
	public PanelAdConfiguraciones() {
		setSize(1300, 700);
		setLayout(null);

		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Metodo encargado de inicializar todos los atributos de la clase
	 */
	public void inicializarComponentes() {
		lblTurnos = new JLabel("Número de turnos al mes");
		lblTurnos.setBounds(550, 100, 400, 100);

		lblEstadoTurnos = new JLabel("1");
		lblEstadoTurnos.setBounds(550, 100, 400, 100);

		btnMenosTurnos = new JButton("Menos");
		btnMenosTurnos.setBounds(570, 250, 150, 60);
		btnMenosTurnos.setActionCommand("P_AD_CONFIGURACIONES_MENOS_TURNOS");

		btnMasTurnos = new JButton("Más");
		btnMasTurnos.setBounds(570, 250, 150, 60);
		btnMasTurnos.setActionCommand("P_AD_CONFIGURACIONES_MAS_TURNOS");

		lblEspecialistas = new JLabel("Número de especialistas por área");
		lblEspecialistas.setBounds(550, 100, 400, 100);

		lblEstadoEspecialistas = new JLabel("1");
		lblEstadoEspecialistas.setBounds(550, 100, 400, 100);

		btnMenosEspecialistas = new JButton("Menos");
		btnMenosEspecialistas.setBounds(570, 250, 150, 60);
		btnMenosEspecialistas.setActionCommand("P_AD_CONFIGURACIONES_MENOS_TURNOS");

		btnMasEspecialistas = new JButton("Más");
		btnMasEspecialistas.setBounds(570, 250, 150, 60);
		btnMasEspecialistas.setActionCommand("P_AD_CONFIGURACIONES_MAS_TURNOS");

		lblDias = new JLabel("Número de días para el recordatorio");
		lblDias.setBounds(550, 100, 400, 100);

		lblEstadoDias = new JLabel("1");
		lblEstadoDias.setBounds(550, 100, 400, 100);

		btnMenosDias = new JButton("Menos");
		btnMenosDias.setBounds(570, 250, 150, 60);
		btnMenosDias.setActionCommand("P_AD_CONFIGURACIONES_MENOS_DIAS");

		btnMasDias = new JButton("Más");
		btnMasDias.setBounds(570, 250, 150, 60);
		btnMasDias.setActionCommand("P_AD_CONFIGURACIONES_MAS_DIAS");

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(570, 250, 150, 60);
		btnAtras.setActionCommand("P_AD_CONFIGURACIONES_ATRAS");

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(570, 250, 150, 60);
		btnSubmit.setActionCommand("P_AD_CONFIGURACIONES_SUBMIT");

		add(lblTurnos);
		add(lblEstadoTurnos);
		add(btnMenosTurnos);
		add(btnMasTurnos);
		add(lblEspecialistas);
		add(lblEstadoEspecialistas);
		add(btnMenosEspecialistas);
		add(btnMasEspecialistas);
		add(lblDias);
		add(lblEstadoDias);
		add(btnMenosDias);
		add(btnMasDias);
		add(btnAtras);
		add(btnSubmit);
	}

	/**
	 * Metodo que retorna el valor del atributo lblTurnos
	 * 
	 * @return contenido del atributo lblTurnos
	 */
	public JLabel getLblTurnos() {
		return lblTurnos;
	}

	/**
	 * Metodo que actualiza el atributo lblTurnos
	 * 
	 * @param lblTurnos valor a actualizar
	 */
	public void setLblTurnos(JLabel lblTurnos) {
		this.lblTurnos = lblTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEstadoTurnos
	 * 
	 * @return contenido del atributo lblEstadoTurnos
	 */
	public JLabel getLblEstadoTurnos() {
		return lblEstadoTurnos;
	}

	/**
	 * Metodo que actualiza el atributo lblEstadoTurnos
	 * 
	 * @param lblEstadoTurnos valor a actualizar
	 */
	public void setLblEstadoTurnos(JLabel lblEstadoTurnos) {
		this.lblEstadoTurnos = lblEstadoTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMenosTurnos
	 * 
	 * @return contenido del atributo btnMenosTurnos
	 */
	public JButton getBtnMenosTurnos() {
		return btnMenosTurnos;
	}

	/**
	 * Metodo que actualiza el atributo btnMenosTurnos
	 * 
	 * @param btnMenosTurnos valor a actualizar
	 */
	public void setBtnMenosTurnos(JButton btnMenosTurnos) {
		this.btnMenosTurnos = btnMenosTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMasTurnos
	 * 
	 * @return contenido del atributo btnMasTurnos
	 */
	public JButton getBtnMasTurnos() {
		return btnMasTurnos;
	}

	/**
	 * Metodo que actualiza el atributo btnMasTurnos
	 * 
	 * @param btnMasTurnos valor a actualizar
	 */
	public void setBtnMasTurnos(JButton btnMasTurnos) {
		this.btnMasTurnos = btnMasTurnos;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEspecialistas
	 * 
	 * @return contenido del atributo lblEspecialistas
	 */
	public JLabel getLblEspecialistas() {
		return lblEspecialistas;
	}

	/**
	 * Metodo que actualiza el atributo lblEspecialistas
	 * 
	 * @param lblEspecialistas valor a actualizar
	 */
	public void setLblEspecialistas(JLabel lblEspecialistas) {
		this.lblEspecialistas = lblEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEstadoEspecialistas
	 * 
	 * @return contenido del atributo lblEstadoEspecialistas
	 */
	public JLabel getLblEstadoEspecialistas() {
		return lblEstadoEspecialistas;
	}

	/**
	 * Metodo que actualiza el atributo lblEstadoEspecialistas
	 * 
	 * @param lblEstadoEspecialistas valor a actualizar
	 */
	public void setLblEstadoEspecialistas(JLabel lblEstadoEspecialistas) {
		this.lblEstadoEspecialistas = lblEstadoEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMenosEspecialistas
	 * 
	 * @return contenido del atributo btnMenosEspecialistas
	 */
	public JButton getBtnMenosEspecialistas() {
		return btnMenosEspecialistas;
	}

	/**
	 * Metodo que actualiza el atributo btnMenosEspecialistas
	 * 
	 * @param btnMenosEspecialistas valor a actualizar
	 */
	public void setBtnMenosEspecialistas(JButton btnMenosEspecialistas) {
		this.btnMenosEspecialistas = btnMenosEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMasEspecialistas
	 * 
	 * @return contenido del atributo btnMasEspecialistas
	 */
	public JButton getBtnMasEspecialistas() {
		return btnMasEspecialistas;
	}

	/**
	 * Metodo que actualiza el atributo btnMasEspecialistas
	 * 
	 * @param btnMasEspecialistas valor a actualizar
	 */
	public void setBtnMasEspecialistas(JButton btnMasEspecialistas) {
		this.btnMasEspecialistas = btnMasEspecialistas;
	}

	/**
	 * Metodo que retorna el valor del atributo lblDias
	 * 
	 * @return contenido del atributo lblDias
	 */
	public JLabel getLblDias() {
		return lblDias;
	}

	/**
	 * Metodo que actualiza el atributo lblDias
	 * 
	 * @param lblDias valor a actualizar
	 */
	public void setLblDias(JLabel lblDias) {
		this.lblDias = lblDias;
	}

	/**
	 * Metodo que retorna el valor del atributo lblEstadoDias
	 * 
	 * @return contenido del atributo lblEstadoDias
	 */
	public JLabel getLblEstadoDias() {
		return lblEstadoDias;
	}

	/**
	 * Metodo que actualiza el atributo lblEstadoDias
	 * 
	 * @param lblEstadoDias valor a actualizar
	 */
	public void setLblEstadoDias(JLabel lblEstadoDias) {
		this.lblEstadoDias = lblEstadoDias;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMenosDias
	 * 
	 * @return contenido del atributo btnMenosDias
	 */
	public JButton getBtnMenosDias() {
		return btnMenosDias;
	}

	/**
	 * Metodo que actualiza el atributo btnMenosDias
	 * 
	 * @param btnMenosDias valor a actualizar
	 */
	public void setBtnMenosDias(JButton btnMenosDias) {
		this.btnMenosDias = btnMenosDias;
	}

	/**
	 * Metodo que retorna el valor del atributo btnMasDias
	 * 
	 * @return contenido del atributo btnMasDias
	 */
	public JButton getBtnMasDias() {
		return btnMasDias;
	}

	/**
	 * Metodo que actualiza el atributo btnMasDias
	 * 
	 * @param btnMasDias valor a actualizar
	 */
	public void setBtnMasDias(JButton btnMasDias) {
		this.btnMasDias = btnMasDias;
	}

	/**
	 * Metodo que retorna el valor del atributo btnAtras
	 * 
	 * @return contenido del atributo btnAtras
	 */
	public JButton getBtnAtras() {
		return btnAtras;
	}

	/**
	 * Metodo que actualiza el atributo btnAtras
	 * 
	 * @param btnAtras valor a actualizar
	 */
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}

	/**
	 * Metodo que retorna el valor del atributo btnSubmit
	 * 
	 * @return contenido del atributo btnSubmit
	 */
	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	/**
	 * Metodo que actualiza el atributo btnSubmit
	 * 
	 * @param btnSubmit valor a actualizar
	 */
	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
}
