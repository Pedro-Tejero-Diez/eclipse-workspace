package ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		//declaramos la lista que utilizaremos para ordenar alfabeticamente
		List<String> listaficheros = new ArrayList<String>();
		// Creamos un objeto de la clase File para manipular la información del
		// directorio con los métodos de esa clase
		File dir = new File(directorio);
		
		//El metodo list() nos permite crear un array con los nombres de los ficheros y carpetas 
		//en el directorio pero para poder ordenarlo alfabeticamente necesitamos pasarlo a un objeto List 
		listaficheros = Arrays.asList(dir.list());
		
		//Ahora aplicamos el metodo estatico sort al arraylist
		Collections.sort(listaficheros);
		
		//Sacamos la información por consola
		for (int i = 0; i < listaficheros.size(); i++) {
			System.out.println(listaficheros.get(i));
		}
		
	}

}
