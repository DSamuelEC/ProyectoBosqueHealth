package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.HospitalDAO;
import co.edu.unbosque.model.persistence.MapHandler;
import co.edu.unbosque.model.persistence.PersonaDTO;

/**
 * Clase fachada encargada de comunicarse con la persistencia y saber todo lo
 * que se requiere saber del modelo para que el sistema funcione
 * @author Samuel Diaz
 */
public class Hospital {
	/**
	 * Atributo de un arreglo que guarda las personas
	 */
	private ArrayList<Persona> todasPersonas;
	/**
	 * Atributo encaragdo de llamar a HospitalDAO
	 */
	private HospitalDAO hospitalDAO;
	/**
	 * Atributo encargado de llamar la clase Persona
	 */
	private Persona persona;
	/**
	 * Atributo encragado de llamar la clase Actividad
	 */
	private Actividad actividad;
	/**
	 * Constructor de la clase Hospitak
	 */

	public Hospital() {
		this.todasPersonas = new ArrayList<Persona>();
		this.hospitalDAO = new HospitalDAO();
	}
	/**
	 * Atributo encargado de crear a una persona
	 * @param personaDto, datos necesarios para crear una nueva persona
	 * @return la persona creada
	 */
	public boolean crearPersona(PersonaDTO personaDto) {
		persona = MapHandler.convertirPersonaDTOtoPersona(personaDto);
		boolean creado = hospitalDAO.add(persona);
		if (creado == true && !personaDto.getRol().equals("ADMIN")) {
			Admin aux = (Admin) hospitalDAO.find("ADMIN");
			aux.setPacientes(new ArrayList<Paciente>());
			aux.setEspecialistas(new ArrayList<Especialista>());
			aux.agruparPacientesyEspecialistas(hospitalDAO.getAll());
			hospitalDAO.update(aux, aux);
		}
		return creado;
	}
	/**
	 * Metodo encargado de actualizar una persona
	 * @param personaDto, datos necesarios para crear una nueva persona.
	 * @return  la persona actualizada
	 */
	public boolean actualizarPersona(PersonaDTO personaDto) {
		persona = MapHandler.convertirPersonaDTOtoPersona(personaDto);
		System.out.println("llegoooooooooooooooooo" + hospitalDAO.update(persona, persona));
		return hospitalDAO.update(persona, persona);
	}
	/**
	 * Metodo encargado de buscar a la persona para ingresar al sistema
	 * @param nombre, lo busca por nombre
	 * @param cedula, lo busca por cedula
	 * @param rol, lo busca por rol
	 * @return un mensaje dejando entrar o bloquear la entrada al sistema
	 */
	public String find(String nombre, long cedula, String rol) {
		persona = hospitalDAO.find(nombre, cedula);
		if (persona.getRol() == rol) {
			return "ACESSO CONCEDIDO";
		} else {
			return "ACCESO DENEGADO, INTENTE DE NUEVO";
		}
	}
	/**
	 * Metodo encaragdo de poder ver todas las personas
	 */
	public void verTodos() {
		todasPersonas = hospitalDAO.getAll();
		for (Persona persona : todasPersonas) {
			System.out.println(persona.getNombre() + "    " + persona.getRol() + "    " + persona.getCedula());
		}
	}
/**
 * Metodo encragado de obtener a los especialistas disponible
 * @param fecha, especialistas disponibles segun la fecha
 * @param especialidad, especialistas disponibles segun la especialidad
 * @return A los especialistas disponibles
 */
	public ArrayList<Especialista> obtenerEspecialistasDisponibles(LocalDate fecha, String especialidad) {
		ArrayList<Especialista> especialistasDisponibles = new ArrayList<>();

		for (Persona persona : todasPersonas) {
			if (persona instanceof Especialista) {
				Especialista especialista = (Especialista) persona;
				if (especialista.getEspecializacion().equalsIgnoreCase(especialidad)) {
					for (Turno turno : especialista.getTurnos()) {
						if (turno.getFecha().isEqual(fecha)) {
							int citasEnFecha = 0;
							for (Cita cita : especialista.getCitas()) {
								if (cita.getFecha().isEqual(fecha)) {
									citasEnFecha++;
								}
							}
							if (citasEnFecha < 24) {
								especialistasDisponibles.add(especialista);
							}
							break;
						}
					}
				}
			}
		}
		return especialistasDisponibles;
	}
	/**
	 * Metodo encargado de obtener a todos los especialistas en general
	 * @return a todos los especialistas
	 */
	public ArrayList<Especialista> obtenerTodosLosEspecialistas() {
		ArrayList<Especialista> especialistas = new ArrayList<>();

		for (Persona persona : todasPersonas) {
			if (persona instanceof Especialista) {
				Especialista especialista = (Especialista) persona;
				especialistas.add(especialista);
			}
		}
		return especialistas;
	}
	/**
	 * Metodo encargado de actualizar la base de datos 
	 */
	public void actualizarBD() {
		hospitalDAO.actualizarBD();
	}
	/**
	 * Metodo que retorna el valor del atributo persona
	 * 
	 * @return Contenido del atributo persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * Metodo que actualiza el valor del atributo persona
	 * 
	 * @param persona valor a actualizar
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	/**
	 * Metodo que retorna el valor del atributo actividad
	 * 
	 * @return Contenido del atributo actividad
	 */
	public Actividad getActividad() {
		return actividad;
	}
	/**
	 * Metodo que actualiza el valor del atributo actividad
	 * 
	 * @param actividad valor a actualizar
	 */
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	/**
	 * Metodo que retorna el valor del atributo todasPersonas
	 * 
	 * @return Contenido del atributo todasPersonas
	 */
	public ArrayList<Persona> getTodasPersonas() {
		return todasPersonas;
	}
	/**
	 * Metodo que actualiza el valor del atributo todasPersonas
	 * 
	 * @param todasPersonas valor a actualizar
	 */
	public void setTodasPersonas(ArrayList<Persona> todasPersonas) {
		this.todasPersonas = todasPersonas;
	}
	/**
	 * Metodo que retorna el valor del atributo hospitalDAO
	 * 
	 * @return Contenido del atributo hospitalDAO
	 */
	public HospitalDAO getHospitalDAO() {
		return hospitalDAO;
	}
	/**
	 * Metodo que actualiza el valor del atributo hospitalDAO
	 * 
	 * @param hospitalDAO valor a actualizar
	 */
	public void setHospitalDAO(HospitalDAO hospitalDAO) {
		this.hospitalDAO = hospitalDAO;
	}
}