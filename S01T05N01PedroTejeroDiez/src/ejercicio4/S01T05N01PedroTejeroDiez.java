package ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class S01T05N01PedroTejeroDiez {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		if (args.length < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce directorio a listar: ");
			String input = sc.nextLine();
			leerArchivo(input);
			sc.close();

		} else {
			leerArchivo(args[0]);
		}
	}

	public static void leerArchivo(String directorio) throws FileNotFoundException, IOException {
		String linea;
		try (FileReader fr = new FileReader(directorio); BufferedReader br = new BufferedReader(fr)) {

			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		}
	}
}