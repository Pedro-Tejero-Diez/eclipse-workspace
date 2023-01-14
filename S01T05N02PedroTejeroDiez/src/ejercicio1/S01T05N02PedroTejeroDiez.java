package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.swing.JOptionPane;

public class S01T05N02PedroTejeroDiez {

	public static void main(String[] args) {

		String origen = "";
		Properties config = new Properties();
		try {
			
			config.load(new FileInputStream(new File("C:\\Users\\pedro\\eclipse-workspace\\S01T05N02PedroTejeroDiez\\src\\ejercicio1\\S01T05N02.properties")));
			origen = config.getProperty("DIRECTORIO_ENTRADA");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error cargando configuración\n" + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		File dir = new File(origen);
	
		File[] archivos = dir.listFiles();
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {
		
			try (FileWriter fw = new FileWriter(config.getProperty("DIRECTORIO_SALIDA"), true);
					BufferedWriter bw = new BufferedWriter(fw)) {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				for (int i = 0; i < archivos.length; i++) {
					File archivo = archivos[i];
					bw.write(String.format("%s (%s) - %d - %s\n", archivo.getName(),
							archivo.isDirectory() ? "Carpeta" : "Archivo", archivo.length(),
							sdf.format(archivo.lastModified())));
				}
			} catch (IOException e) {

			}

		}
	}

}
