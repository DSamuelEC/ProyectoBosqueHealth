package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

/**
 * Clase encargada de manejar los archivos
 * 
 * @author Samuel Diaz
 */
public class Archivo {
	/**
	 * Atributo que representa el valor de entrada
	 */
	private ObjectInputStream entrada;
	/**
	 * Atributo que representa el valor de salida
	 */
	private ObjectOutputStream salida;
	/**
	 * Atributo que almacena la ubicacion del archivo de texto
	 */
	private File ubicacionArchivoTxt = new File("data/dataTexto.txt");
	/**
	 * Atributo que almacena la ubicacion del archivo binario
	 */
	private File ubicacionArchivoBinario = new File("data/dataBinaria.dat");

	/**
	 * Constructor de la clase
	 */
	public Archivo() {
		if (!ubicacionArchivoTxt.exists() && !ubicacionArchivoBinario.exists()) {
			try {
				ubicacionArchivoTxt.createNewFile();
				ubicacionArchivoBinario.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Metodo encargado de la escritura del archivo binario
	 * 
	 * @param personas Valor/es a escribir
	 */
	public void escribirArchivoBinario(ArrayList<Persona> personas) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivoBinario));
			ArrayList<PersonaDTO> datosDTO = MapHandler.convertirPersonastoPersonasDTO(personas);

			for (PersonaDTO dto : datosDTO) {
				if (dto.getRol() == null) {
					System.out.println("Error: PersonaDTO sin rol al escribir en archivo.");
				}
			}
			salida.writeObject(datosDTO);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo encargado de la escritura del archivo de texto
	 * 
	 * @param frase Valor/es a escribir
	 * @return Valor que indica si se pudo o no hacer la escritura
	 */
	public String escribirArchivoTxt(String frase) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader linea = new BufferedReader(isr);
			FileWriter lineatx = new FileWriter(ubicacionArchivoTxt);
			String linea_arch = frase;
			lineatx.write(linea_arch + "\r\n");
			lineatx.close();
			return "Linea ingresada con exito";
		} catch (IOException e) {
			return "No se pudo escribir en el archivo";
		}

	}

	/**
	 * Metodo encargado de la lectura del archivo binario
	 * 
	 * @return Valor/es en el archivo
	 */
	public ArrayList<Persona> leerArchivoBinario() {
		ArrayList<Persona> clientes = null;

		if (ubicacionArchivoBinario.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivoBinario));
				ArrayList<PersonaDTO> datos = (ArrayList<PersonaDTO>) entrada.readObject();
				// Comprobación para verificar que todos los PersonaDTO tienen el rol
				// configurado
				for (PersonaDTO dto : datos) {
					if (dto.getRol() == null) {
						System.out.println("Error: Rol no configurado en PersonaDTO");
					}
				}
				clientes = MapHandler.convertirPersonasDTOtoPersonas(datos);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

	/**
	 * Metodo encargado de leer el archivo de texto
	 * 
	 * @return Valor/es en el archivo
	 */
	public String leerArchivoTxt() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader linea;
		try {
			fis = new FileInputStream(ubicacionArchivoTxt);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);

			if (ubicacionArchivoTxt.exists()) {
				String linea_arch = linea.readLine();
				String archivo_total = linea_arch;
				while (linea_arch != null) {
					linea_arch = linea.readLine();
					if (linea_arch != null) {
						archivo_total = archivo_total + "\n" + linea_arch;
					}
				}
				linea.close();
				return archivo_total;
			} else {// le agregue lo de abajo porque salia una sugerencia de eso
//				linea.close();
				return "El archivo no existe";
			}
		} catch (IOException e) {
			return "No se pudo leer el archivo";
		}
	}

	/**
	 * Metodo que retorna el valor del atributo entrada
	 * 
	 * @return contenido del atributo entrada
	 */
	public ObjectInputStream getEntrada() {
		return entrada;
	}

	/**
	 * Metodo que actualiza el atributo entrada
	 * 
	 * @param entrada valor a actualizar
	 */
	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	/**
	 * Metodo que retorna el valor del atributo salida
	 * 
	 * @return contenido del atributo salida
	 */
	public ObjectOutputStream getSalida() {
		return salida;
	}

	/**
	 * Metodo que actualiza el atributo salida
	 * 
	 * @param salida valor a actualizar
	 */
	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

	/**
	 * Metodo que retorna el valor del atributo ubicacionArchivoTxt
	 * 
	 * @return contenido del atributo ubicacionArchivoTxt
	 */
	public File getUbicacionArchivoTxt() {
		return ubicacionArchivoTxt;
	}

	/**
	 * Metodo que actualiza el atributo ubicacionArchivoTxt
	 * 
	 * @param ubicacionArchivoTxt valor a actualizar
	 */
	public void setUbicacionArchivoTxt(File ubicacionArchivoTxt) {
		this.ubicacionArchivoTxt = ubicacionArchivoTxt;
	}

	/**
	 * Metodo que retorna el valor del atributo ubicacionArchivoBinario
	 * 
	 * @return contenido del atributo ubicacionArchivoBinario
	 */
	public File getUbicacionArchivoBinario() {
		return ubicacionArchivoBinario;
	}

	/**
	 * Metodo que actualiza el atributo ubicacionArchivoBinario
	 * 
	 * @param ubicacionArchivoBinario valor a actualizar
	 */
	public void setUbicacionArchivoBinario(File ubicacionArchivoBinario) {
		this.ubicacionArchivoBinario = ubicacionArchivoBinario;
	}
}