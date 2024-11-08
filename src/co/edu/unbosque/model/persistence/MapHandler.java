package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Turno;

public class MapHandler {
	public static ArrayList<Cita> convertirCitaDTOtoCita(ArrayList<CitaDTO> citasDTOs) {
		Cita x;
		ArrayList<Cita> citas = new ArrayList<Cita>();

		for (CitaDTO y : citasDTOs) {
			x = new Cita(y.getFecha(), y.getHoraInicio(), y.getHoraFinal(), y.getNombrePaciente(),
					y.getCorreoPaciente(), y.getNombreEspecialista(), y.getCorreoEspecialista(), y.getEspecialidad(),
					y.getTratamiento(), y.getDiagnostico(), y.getExamenes());
			citas.add(x);
		}
		return citas;
	}

	public static ArrayList<CitaDTO> convertirCitaToCitaDTO(ArrayList<Cita> citas) {
		ArrayList<CitaDTO> citasDTO = new ArrayList<>();
		for (Cita cita : citas) {
			CitaDTO citaDTO = new CitaDTO();
			citaDTO.setFecha(cita.getFecha());
			citaDTO.setHoraInicio(cita.getHoraInicio());
			citaDTO.setHoraFinal(cita.getHoraFinal());
			citaDTO.setNombrePaciente(cita.getNombrePaciente());
			citaDTO.setCorreoPaciente(cita.getCorreoPaciente());
			citaDTO.setNombreEspecialista(cita.getNombreEspecialista());
			citaDTO.setCorreoEspecialista(cita.getCorreoEspecialista());
			citaDTO.setEspecialidad(cita.getEspecialidad());
			citaDTO.setTratamiento(cita.getTratamiento());
			citaDTO.setDiagnostico(cita.getDiagnostico());
			citaDTO.setExamenes(cita.getExamenes());
			citasDTO.add(citaDTO);
		}
		return citasDTO;
	}

	public static ArrayList<Turno> convertirTurnoDTOtoTurno(ArrayList<TurnoDTO> turnosDTOs) {
		Turno x;
		ArrayList<Turno> turnos = new ArrayList<Turno>();

		for (TurnoDTO t : turnosDTOs) {
			x = new Turno(t.getFecha(), t.getHoraInicio(), t.getHoraFinal(), t.getEstado());
			turnos.add(x);
		}
		return turnos;
	}

	public static ArrayList<TurnoDTO> convertirTurnoToTurnoDTO(ArrayList<Turno> turnos) {
		ArrayList<TurnoDTO> turnosDTO = new ArrayList<>();
		for (Turno turno : turnos) {
			TurnoDTO turnoDTO = new TurnoDTO();
			turnoDTO.setFecha(turno.getFecha());
			turnoDTO.setHoraInicio(turno.getHoraInicio());
			turnoDTO.setHoraFinal(turno.getHoraFinal());
			turnoDTO.setEstado(turno.getEstado());
			turnosDTO.add(turnoDTO);
		}
		return turnosDTO;
	}

	// para admin
	public static ArrayList<Paciente> convertirPacientesDTOtoPacientes(ArrayList<PacienteDTO> pacientesDTO) {
		ArrayList<Paciente> pacientes = new ArrayList<>();
		for (PacienteDTO dto : pacientesDTO) {
			Paciente paciente = new Paciente(dto.getNombre(), dto.getCedula(), dto.getCorreo(), dto.getSexo(),
					dto.getEdad());
			paciente.setCitas(convertirCitaDTOtoCita(dto.getCitas()));
			paciente.setExamenes(convertirCitaDTOtoCita(dto.getExamenes()));
			pacientes.add(paciente);
		}
		return pacientes;
	}

	public static ArrayList<PacienteDTO> convertirPacientesToPacientesDTO(ArrayList<Paciente> pacientes) {
		ArrayList<PacienteDTO> pacientesDTO = new ArrayList<>();
		for (Paciente paciente : pacientes) {
			pacientesDTO.add((PacienteDTO) convertirPersonatoPersonaDTO(paciente));
		}
		return pacientesDTO;
	}

// para admin
	public static ArrayList<Especialista> convertirEspecialistasDTOtoEspecialistas(
			ArrayList<EspecialistaDTO> especialistasDTO) {
		ArrayList<Especialista> especialistas = new ArrayList<>();
		for (EspecialistaDTO dto : especialistasDTO) {
			Especialista especialista = new Especialista(dto.getNombre(), dto.getCedula(), dto.getCorreo(),
					dto.getSexo(), dto.getEdad(), dto.getEspecializacion());
			especialista.setCitas(convertirCitaDTOtoCita(dto.getCitas()));
			especialista.setTurnos(convertirTurnoDTOtoTurno(dto.getTurnos()));
			especialistas.add(especialista);
		}
		return especialistas;
	}

	public static ArrayList<EspecialistaDTO> convertirEspecialistasToEspecialistasDTO(
			ArrayList<Especialista> especialistas) {
		ArrayList<EspecialistaDTO> especialistasDTO = new ArrayList<>();
		for (Especialista especialista : especialistas) {
			especialistasDTO.add((EspecialistaDTO) convertirPersonatoPersonaDTO(especialista));
		}
		return especialistasDTO;
	}

	public static Persona convertirPersonaDTOtoPersona(PersonaDTO pDTO) {
		Persona x = null;
		switch (pDTO.getRol()) {
		case "PACIENTE":
			PacienteDTO y = (PacienteDTO) pDTO;
			Paciente p = new Paciente(y.getNombre(), y.getCedula(), y.getCorreo(), y.getSexo(), y.getEdad());
			p.setCitas(convertirCitaDTOtoCita(y.getCitas()));
			p.setExamenes(convertirCitaDTOtoCita(y.getExamenes()));
			x = p;
			break;
		case "ESPECIALISTA":
			EspecialistaDTO eD = (EspecialistaDTO) pDTO;
			Especialista e = new Especialista(eD.getNombre(), eD.getCedula(), eD.getCorreo(), eD.getSexo(),
					eD.getEdad(), eD.getEspecializacion());
			e.setCitas(convertirCitaDTOtoCita(eD.getCitas()));
			e.setTurnos(convertirTurnoDTOtoTurno(eD.getTurnos()));
			x = e;
			break;
		case "ADMIN":
			AdminDTO z = (AdminDTO) pDTO;
			Admin a = new Admin(z.getNombre(), z.getCedula(), z.getCorreo(), z.getSexo(), z.getEdad());
			a.setPacientes(convertirPacientesDTOtoPacientes(z.getPacientes()));
			a.setEspecialistas(convertirEspecialistasDTOtoEspecialistas(z.getEspecialistas()));
			x = a;
			break;
		default:
			break;
		}
		return x;
	}

	public static PersonaDTO convertirPersonatoPersonaDTO(Persona persona) {
		PersonaDTO x = null;
		switch (persona.getRol()) {
		case "PACIENTE":
			Paciente p = (Paciente) persona;
			PacienteDTO pD = new PacienteDTO();
			pD.setNombre(p.getNombre());
			pD.setCedula(p.getCedula());
			pD.setCorreo(p.getCorreo());
			pD.setSexo(p.getSexo());
			pD.setEdad(p.getEdad());
			pD.setRol("PACIENTE");
			pD.setCitas(convertirCitaToCitaDTO(p.getCitas()));
			pD.setExamenes(convertirCitaToCitaDTO(p.getExamenes()));
			x = pD;
			break;
		case "ESPECIALISTA":
			Especialista e = (Especialista) persona;
			EspecialistaDTO eD = new EspecialistaDTO();
			eD.setNombre(e.getNombre());
			eD.setCedula(e.getCedula());
			eD.setCorreo(e.getCorreo());
			eD.setSexo(e.getSexo());
			eD.setEdad(e.getEdad());
			eD.setRol("ESPECIALISTA");
			eD.setEspecializacion(e.getEspecializacion());
			eD.setCitas(convertirCitaToCitaDTO(e.getCitas()));
			eD.setTurnos(convertirTurnoToTurnoDTO(e.getTurnos()));
			x = eD;
			break;
		case "ADMIN":
			Admin a = (Admin) persona;
			AdminDTO aD = new AdminDTO();
			aD.setNombre(a.getNombre());
			aD.setCedula(a.getCedula());
			aD.setCorreo(a.getCorreo());
			aD.setSexo(a.getSexo());
			aD.setEdad(a.getEdad());
			aD.setRol("ADMIN");
			aD.setPacientes(convertirPacientesToPacientesDTO(a.getPacientes()));
			aD.setEspecialistas(convertirEspecialistasToEspecialistasDTO(a.getEspecialistas()));
			x = aD;
			break;
		default:
			break;
		}
		return x;
	}

	public static ArrayList<Persona> convertirPersonasDTOtoPersonas(ArrayList<PersonaDTO> personasDTO) {
		Persona aux = null;
		ArrayList<Persona> x = new ArrayList<Persona>();
		for (PersonaDTO pDTO : personasDTO) {
			aux = convertirPersonaDTOtoPersona(pDTO);
			x.add(aux);
		}
		return x;
	}

	public static ArrayList<PersonaDTO> convertirPersonastoPersonasDTO(ArrayList<Persona> personas) {
		PersonaDTO aux = null;
		ArrayList<PersonaDTO> x = new ArrayList<PersonaDTO>();
		for (Persona p : personas) {
			aux = convertirPersonatoPersonaDTO(p);
			x.add(aux);
		}
		return x;
	}
}