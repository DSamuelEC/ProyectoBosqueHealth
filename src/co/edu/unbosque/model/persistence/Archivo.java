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

public class Archivo {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File ubicacionArchivo; // = new File("data/dataTexto.txt");

	public Archivo(String ubicacion) {
		ubicacionArchivo = new File(ubicacion);
		if (!ubicacionArchivo.exists()) {
			try {
				ubicacionArchivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void escribirArchivoBinario(ArrayList<Persona> personas) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivo));
			ArrayList<PersonaDTO> datos = MapHandler.convertirPersonastoPersonasDTO(personas);
			salida.writeObject(datos);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String escribirArchivoTxt(String frase) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader linea = new BufferedReader(isr);
			FileWriter lineatx = new FileWriter(ubicacionArchivo);
			String linea_arch = frase;
			lineatx.write(linea_arch + "\r\n");
			lineatx.close();
			return "Linea ingresada con exito";
		} catch (IOException e) {
			return "No se pudo escribir en el archivo";
		}

	}

	public ArrayList<Persona> leerArchivoBinario() {
		ArrayList<Persona> clientes = null;

		if (ubicacionArchivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivo));
				ArrayList<PersonaDTO> datos = (ArrayList<PersonaDTO>) entrada.readObject();
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

	public String leerArchivoTxt() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader linea;
		try {
			fis = new FileInputStream(ubicacionArchivo);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);

			if (ubicacionArchivo.exists()) {
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
			} else {//le agregue lo de abajo porque salia una sugerencia de eso
//				linea.close();
				return "El archivo no existe";
			}
		} catch (IOException e) {
			return "No se pudo leer el archivo";
		}
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

	public File getUbicacionArchivo() {
		return ubicacionArchivo;
	}

	public void setUbicacionArchivo(File ubicacionArchivo) {
		this.ubicacionArchivo = ubicacionArchivo;
	}

}
