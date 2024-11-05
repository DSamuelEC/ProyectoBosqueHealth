package co.edu.unbosque.model.persistence;

public class TurnoDTO extends ActividadDTO {
	private static final long serialVersionUID = 1L;
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}