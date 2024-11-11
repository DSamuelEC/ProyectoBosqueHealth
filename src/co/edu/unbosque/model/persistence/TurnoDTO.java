package co.edu.unbosque.model.persistence;
/**
 * Clase encargada representar el turno y almacenar sus datos
 * @author Samuel Diaz
 */
public class TurnoDTO extends ActividadDTO {
	/**
	 * Identificador único de versión para la serialización de esta clase.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo del estado del turno
	 */
	private String estado;
	/**
	 * Metodo que retorna el valor del atributo estado
	 * 
	 * @return Contenido del atributo estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * Metodo que actualiza el valor del atributo estado
	 * 
	 * @param estado valor a actualizar
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}