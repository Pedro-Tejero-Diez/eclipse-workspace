package examenejercicio3;

import java.util.ArrayList;

public class ExamenEjercicio3 {

	public static void main(String[] args) {
		//declaración de las arraylists a usar
		ArrayList<String> disponibles = new ArrayList<String>();
		ArrayList<String> deseados = new ArrayList<String>();
		ArrayList<String> comprados = new ArrayList<String>();
		
		//añado los items de las diferentes Array Lists
		disponibles.add("Champu");
		disponibles.add("jabon");
		disponibles.add("patatas");
		disponibles.add("acelgas");
		disponibles.add("limones");
		disponibles.add("fideos");
		disponibles.add("arroz");
		disponibles.add("cafe");
		disponibles.add("chocolate");
		deseados.add("champu");
		deseados.add("chocolate");
		deseados.add("aguacates");
		deseados.add("acelgas");
		deseados.add("limones");
		deseados.add("limonada");
		
		//Calculo y declaro en indices los tamaños de las Array List que tengo para usarlos en los bucles
		int sizeDisponibles = disponibles.size();
		int sizeDeseados = deseados.size();

		/*Hago un bucle para buscar en cada posición del array de deseados 
		 * y dentro del bucle for, un bucle while para que compare cada item de deseados
		 *  con todas las posciones de disponibles y, en caso de que sean iguales, 
		 *  lo añada al array de comprados */
		
		for (int i = 0; i < sizeDeseados; i++) {
			String valor = null;
			int j = 0;
			while (valor == null && j < sizeDisponibles) {
				if (deseados.get(i).equalsIgnoreCase(disponibles.get(j))) {
					valor = disponibles.get(j);
					comprados.add(valor);
				}
				j++;
			}
		}
		System.out.println(comprados);//chequeo que todo ha ido correcto
	}

}
