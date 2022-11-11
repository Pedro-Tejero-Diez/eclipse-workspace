package ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class S01T05N01PedroTejeroDiez {

	public static void main(String[] args) {

		if (args.length < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce directorio a listar: ");
			String input = sc.nextLine();
			escribirListado(input);
			sc.close();

		} else {
			escribirListado(args[0]);
		}
	}

	public static void escribirListado(String directorio) {

		File dir = new File(directorio);
		File[] archivos = dir.listFiles();
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {

			try (FileWriter fw = new FileWriter(
					"C:\\Users\\pedro\\eclipse-workspace\\S01T05N01PedroTejeroDiez\\src\\ejercicio3\\myfile.txt", true);
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
