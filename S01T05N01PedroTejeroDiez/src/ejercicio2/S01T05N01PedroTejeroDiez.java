package ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class S01T05N01PedroTejeroDiez {

	public static void main(String[] args) {

		if (args.length<1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce directorio a listar: ");
			String input = sc.nextLine();
			listado(input);
			sc.close();

		} else {
			listado(args[0]);
		}
	}

	public static void listado(String directorio) {

		File dir = new File(directorio);
		File[] archivos = dir.listFiles();
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			for (int i = 0; i < archivos.length; i++) {
				File archivo = archivos[i];
				if (archivos[i].isDirectory()) {
					System.out.println(
							String.format("%s (D) ---- %s", archivo.getName(), sdf.format(archivo.lastModified())));
					listado(archivos[i].getAbsolutePath());

				} else
					System.out.println(
							String.format("%s (F) ---- %s", archivo.getName(), sdf.format(archivo.lastModified())));
			}
		}
	}
}
