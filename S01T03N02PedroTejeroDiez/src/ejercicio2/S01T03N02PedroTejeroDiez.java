package ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class S01T03N02PedroTejeroDiez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Restaurant> listado = new HashSet<Restaurant>();
		//List<Restaurant> listadoOrdenado = new ArrayList<Restaurant>(listado);
		int contador = 0;

		while (contador < 5) {
			System.out.println("introduzca Nombre Restaurante: ");
			String nombre = sc.nextLine();
			System.out.println("introduzca puntuación Restaurante: ");
			int puntuacion = sc.nextInt();
			sc.nextLine();
			Restaurant rest = new Restaurant(nombre, puntuacion);
			if (!rest.checkLista(listado, rest)) {
				listado.add(rest);
				contador++;
			} else {
				System.out.println("ESte Restaurante está repetido. Introduzca otro");
			}
		}	
			TreeSet<Restaurant> listadoOrdenado = new TreeSet<Restaurant>(listado);
	
			//Collections.sort(listadoOrdenado);
			
			
		System.out.println(listadoOrdenado.descendingSet());
		sc.close();
	}
}