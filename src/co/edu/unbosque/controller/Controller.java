package co.edu.unbosque.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.Hospital;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.persistence.AdminDTO;
import co.edu.unbosque.model.persistence.EspecialistaDTO;
import co.edu.unbosque.model.persistence.MapHandler;
import co.edu.unbosque.model.persistence.PacienteDTO;
import co.edu.unbosque.model.persistence.PersonaDTO;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanasEmergentes;

/**
 * Controlador principal de la aplicacion, encargado de gestionar la creacion de
 * usuarios, el inicio y cierre de sesion, y la actualizacion de informacion en
 * la persistencia de datos. Ademas, coordina la logica entre los controladores secundarios.
 * 
 * @author Samuel Diaz
 */
public class Controller {

    /**
     * Ventana principal de la interfaz grafica, que contiene los paneles de cada
     * perfil y otros elementos de la interfaz de usuario.
     */
    private VentanaPrincipal ventanaP;

    /**
     * Ventana de dialogos emergentes para mostrar mensajes informativos o de error.
     */
    private VistaVentanasEmergentes vistaE;

    /**
     * Controlador encargado de gestionar los accesos en el sistema.
     */
    private ControllerAccesos controllerAccesos;

    /**
     * Controlador encargado de gestionar las acciones y funcionalidades especificas
     * del perfil de paciente.
     */
    private ControllerPaciente controllerPaciente;

    /**
     * Controlador encargado de gestionar las acciones y funcionalidades especificas
     * del perfil de especialista.
     */
    private ControllerEspecialista controllerEspecialista;

    /**
     * Controlador encargado de gestionar las acciones y funcionalidades especificas
     * del perfil de administrador.
     */
    private ControllerAdmin controllerAdmin;

    /**
     * Objeto Hospital que representa la logica del modelo y el acceso a la base de datos.
     */
    private Hospital hospital;

    /**
     * Servicio de correo electronico para enviar notificaciones y mensajes.
     */
    private EmailService envioCorreos;

    /**
     * Constructor de la clase Controller. Inicializa los atributos y los
     * controladores secundarios, y configura el servicio de correo electronico.
     */
    public Controller() {
        hospital = new Hospital();
        ventanaP = new VentanaPrincipal();
        vistaE = new VistaVentanasEmergentes();
        envioCorreos = new EmailService("smtp.gmail.com", 587, "bosquehealthapp8@gmail.com", "nljl rlsz mods rpov");
        controllerAccesos = new ControllerAccesos(this, ventanaP);
        controllerPaciente = new ControllerPaciente(this, ventanaP, vistaE);
        controllerEspecialista = new ControllerEspecialista(this, ventanaP, vistaE);
        controllerAdmin = new ControllerAdmin(this, ventanaP, vistaE);
    }

    /**
     * Metodo de inicio de la aplicacion. Actualiza la base de datos del hospital
     * y muestra la informacion de todas las personas registradas.
     */
    public void run() {
        hospital.actualizarBD();
        hospital.verTodos();
    }

    /**
     * Captura los datos para crear un nuevo usuario (paciente, especialista o admin),
     * crea el objeto correspondiente en la base de datos, y envia un correo de confirmacion.
     * 
     * @param nombre Nombre de la persona
     * @param cedula Cedula de la persona
     * @param correo Correo electronico de la persona
     * @param sexo Sexo de la persona
     * @param edad Edad de la persona
     * @param rol Rol de la persona (PACIENTE, ESPECIALISTA, ADMIN)
     * @param especialidad Especialidad del especialista, en caso de que aplique
     */
    public void capturarDatosCrearPersonas(String nombre, long cedula, String correo, String sexo, int edad, String rol,
                                           String especialidad) {
        PersonaDTO personadto;
        ArrayList<String> correos = new ArrayList<>();
        correos.add(correo);
        switch (rol) {
            case "PACIENTE":
                personadto = new PacienteDTO();
                personadto.setNombre(nombre);
                personadto.setCedula(cedula);
                personadto.setCorreo(correo);
                personadto.setSexo(sexo);
                personadto.setEdad(edad);
                personadto.setRol(rol);
                if (hospital.crearPersona(personadto)) {
                    String mensaje = envioCorreos.enviarCorreoPersonalizado(correos, "Creacion de cuenta",
                            "Bienvenido a BosqueHealth! Por favor logueese " + nombre);
                    vistaE.mostrarInformacion(mensaje, 1);
                    controllerAccesos.cambiarPanel(2);
                }
                break;
            case "ESPECIALISTA":
                EspecialistaDTO especialistaDto = new EspecialistaDTO();
                especialistaDto.setNombre(nombre);
                especialistaDto.setEspecializacion(especialidad);
                especialistaDto.setCedula(cedula);
                especialistaDto.setCorreo(correo);
                especialistaDto.setSexo(sexo);
                especialistaDto.setEdad(edad);
                especialistaDto.setRol(rol);
                personadto = especialistaDto;
                if (hospital.crearPersona(personadto)) {
                    String mensaje = envioCorreos.enviarCorreoPersonalizado(correos, "Creacion de cuenta",
                            "Bienvenido a BosqueHealth! " + nombre);
                    vistaE.mostrarInformacion(mensaje, 1);
                    controllerAdmin.cambiarPanel(1);
                }
                break;
            case "ADMIN":
                personadto = new AdminDTO();
                personadto.setNombre(nombre);
                personadto.setCedula(cedula);
                personadto.setCorreo(correo);
                personadto.setSexo(sexo);
                personadto.setEdad(edad);
                personadto.setRol(rol);
                if (hospital.crearPersona(personadto)) {
                    vistaE.mostrarInformacion("Se creo con exito un ADMIN, por favor logueese", 2);
                    controllerAccesos.cambiarPanel(2);
                }
                break;
            default:
                break;
        }
    }

    /**
     * Captura los datos de inicio de sesion, verifica el acceso en la base de datos,
     * y cambia la interfaz de usuario segun el rol de la persona que accede.
     * 
     * @param nombre Nombre de la persona
     * @param cedula Cedula de la persona
     * @param rol Rol de la persona (PACIENTE, ESPECIALISTA, ADMIN)
     * @param index Indice del panel de la interfaz que se debe mostrar
     */
    public void capturarDatosLogin(String nombre, long cedula, String rol, int index) {
        String mensaje = hospital.find(nombre, cedula, rol);
        if (mensaje.equals("ACESSO CONCEDIDO")) {
            vistaE.mostrarInformacion(mensaje, 2);
            controllerAccesos.cambiarPanel(1);
            ventanaP.cambiarVisibilidad(index);
            switch (rol) {
                case "PACIENTE":
                    controllerPaciente.setearDatosPaciente((Paciente) hospital.getPersona());
                    break;
                case "ESPECIALISTA":
                    controllerEspecialista.setearDatosEspecialista((Especialista) hospital.getPersona());
                    break;
                case "ADMIN":
                    controllerAdmin.setearDatosAdmin((Admin) hospital.getPersona());
                    break;
                default:
                    break;
            }
        } else {
            vistaE.mostrarInformacion(mensaje, 1);
        }
    }

    /**
     * Cierra la sesion del usuario actual y muestra un mensaje de despedida.
     * 
     * @param index Indice del panel de la interfaz que se debe mostrar
     */
    public void cerrarSesiones(int index) {
        vistaE.mostrarInformacion("Cerrando sesion, hasta la proxima...", 1);
        ventanaP.cambiarVisibilidad(index);
    }

    /**
     * Actualiza la base de datos con la informacion de los especialistas, incluidos
     * los turnos asignados.
     * 
     * @param especialistas Lista de especialistas con sus datos actualizados
     */
    public void actualizarLaDBConEspecialistas(ArrayList<Especialista> especialistas) {
        int bandera = 1;
        PersonaDTO personadto;
        EspecialistaDTO especialistaDto = new EspecialistaDTO();
        for (Especialista especialista : especialistas) {
            especialistaDto.setNombre(especialista.getNombre());
            especialistaDto.setEspecializacion(especialista.getEspecializacion());
            especialistaDto.setCedula(especialista.getCedula());
            especialistaDto.setCorreo(especialista.getCorreo());
            especialistaDto.setSexo(especialista.getSexo());
            especialistaDto.setEdad(especialista.getEdad());
            especialistaDto.setRol(especialista.getRol());
            especialistaDto.setTurnos(MapHandler.convertirTurnoToTurnoDTO(especialista.getTurnos()));
            personadto = especialistaDto;

            if (hospital.actualizarPersona(personadto)) {
                System.out.println("SE ASIGNARON TURNOS AUTOMATICAMENTE!!!");
                bandera++;
                vistaE.mostrarInformacion("Se actualizo correctamente a " + especialista.getNombre(), 2);
            }
        }
    }

    /**
     * Obtiene una lista de especialistas disponibles para una fecha y especialidad especificas.
     * 
     * @param fechaABuscar Fecha en la que se requiere la disponibilidad
     * @param especialidad Especialidad del especialista requerido
     * @return Lista de especialistas disponibles
     */
    public ArrayList<Especialista> traerEspecialistasToPaciente(LocalDate fechaABuscar, String especialidad) {
        return hospital.obtenerEspecialistasDisponibles(fechaABuscar, especialidad);
    }

    /**
     * Obtiene la lista de todos los especialistas registrados en el sistema.
     * 
     * @return Lista de todos los especialistas
     */
    public ArrayList<Especialista> traerTodosLosEspecialistas() {
        return hospital.obtenerTodosLosEspecialistas();
    }

    /**
     * Actualiza la informacion de una persona en la base de datos.
     * 
     * @param persona Persona con los datos actualizados
     */
    public void actualizarPersona(Persona persona) {
        PersonaDTO personadto = null;
        if (persona instanceof Especialista) {
            EspecialistaDTO especialistaDto = new EspecialistaDTO();
            especialistaDto.setNombre(persona.getNombre());
            especialistaDto.setEspecializacion(((Especialista) persona).getEspecializacion());
            especialistaDto.setCedula(persona.getCedula());
            especialistaDto.setCorreo(persona.getCorreo());
            especialistaDto.setSexo(persona.getSexo());
            especialistaDto.setEdad(persona.getEdad());
            especialistaDto.setRol(persona.getRol());
            especialistaDto.setTurnos(MapHandler.convertirTurnoToTurnoDTO(((Especialista) persona).getTurnos()));
            especialistaDto.setCitas(MapHandler.convertirCitaToCitaDTO(((Especialista) persona).getCitas()));
            personadto = especialistaDto;
        } else if (persona instanceof Paciente) {
            PacienteDTO pacienteDto = new PacienteDTO();
            pacienteDto.setNombre(persona.getNombre());
            pacienteDto.setCedula(persona.getCedula());
            pacienteDto.setCorreo(persona.getCorreo());
            pacienteDto.setSexo(persona.getSexo());
            pacienteDto.setEdad(persona.getEdad());
            pacienteDto.setRol(persona.getRol());
            pacienteDto.setCitas(MapHandler.convertirCitaToCitaDTO(((Paciente) persona).getCitas()));
            pacienteDto.setExamenes(MapHandler.convertirCitaToCitaDTO(((Paciente) persona).getExamenes()));
            personadto = pacienteDto;
        }
        if (hospital.actualizarPersona(personadto)) {
            System.out.println("SE ASIGNARON TURNOS AUTOMATICAMENTE!!!");
            vistaE.mostrarInformacion("Se agrego correctamente la cita", 2);
        }
    }
}
