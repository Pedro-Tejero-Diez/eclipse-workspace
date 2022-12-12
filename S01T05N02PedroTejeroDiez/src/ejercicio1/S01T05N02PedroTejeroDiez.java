package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class S01T05N02PedroTejeroDiez {

	public static void main(String[] args) {


		if (args.length < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce directorio a listar: ");
			String input = sc.nextLine();
			escribirListado(input);
			sc.close();

		} else {
			try {
				InputStream configInput = new FileInputStream("config.properties");
				Properties config = new Properties();
				config.load(configInput);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error cargando configuración\n" + e.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			escribirListado(args[0]);
		}
	}

	public static String loadDirectorioOrigen(String directorio) {
		String origen = "";
		try {
			Properties config = new Properties();
			config.load(new FileInputStream(
					"C:\\Users\\pedro\\eclipse-workspace\\S01T03N02PedroTejeroDiez\\config.properties"));
			origen = config.getProperty("directorio_origen");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error cargando configuración\n" + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		return origen;
	}

	public static void escribirListado(String directorio) {

		File dir = new File(directorio);
		// write directorio en properties como directorio_origen
		File[] archivos = dir.listFiles();
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {

			try (FileWriter fw = new FileWriter(config.getProperty(directorio_destino), true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				for (int i = 0; i < archivos.length; i++) {
					File archivo = archivos[i];
					out.println(String.format("%s (%s) - %d - %s", archivo.getName(),
							archivo.isDirectory() ? "Carpeta" : "Archivo", archivo.length(),
							sdf.format(archivo.lastModified())));
				}
			} catch (IOException e) {

			}

		}
	}

}
