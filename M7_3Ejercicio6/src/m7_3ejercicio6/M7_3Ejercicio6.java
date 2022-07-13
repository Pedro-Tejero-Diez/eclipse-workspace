package m7_3ejercicio6;

import java.util.ArrayList;

public class M7_3Ejercicio6 {

	public static void main(String[] args) {

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		int numero, sumaPar = 0, sumaImpar = 0;
		listaNumeros.add(3);
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(6);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(9);
		listaNumeros.add(10);
		listaNumeros.add(11);
		listaNumeros.add(12);
		listaNumeros.add(13);
		listaNumeros.add(14);
		listaNumeros.add(15);
		listaNumeros.add(16);
		listaNumeros.add(17);
		listaNumeros.add(18);
		listaNumeros.add(19);
		/*
		 * mejor usar una variable en lugar de un metodo en el loop!! para que no ocupe
		 * tiempo de procesador cada vez que visita el loop. Seria mejor
		 * delcarar tamaño=listaNumeros.size y usar "tamaño" en el loop
		 */
		for (int i = 0; i < listaNumeros.size(); i++) {
			numero = listaNumeros.get(i);
			if (numero % 2 == 0) {
				sumaPar += numero;
			} else {
				sumaImpar += numero;
			}
		}
		System.out.println("la suma de los números del Array es la siguiente");
		System.out.println("Suma números Pares: " + sumaPar);
		System.out.println("Suma números Pares: " + sumaImpar);
	}
}
