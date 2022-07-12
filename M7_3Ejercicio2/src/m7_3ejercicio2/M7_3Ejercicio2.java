package m7_3ejercicio2;

import java.util.Scanner;

public class M7_3Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra;

		System.out.println("Introduce una palabra o frase");
		palabra = sc.nextLine();
		reversePalabra(palabra);

	}

	public static void reversePalabra(String palabra) {
		int longitud = palabra.length();
		int posicion = longitud - 1;// para que la posicion en el string sea la correcta con arreglo al tamaño
		char caracter = ' ';
		String reverse = "";

		/* este bucle cogerá el valor de cada posicion desde la ultima hasta la primera
		 * (que es la posicion cero) y en cada paso asignara el valor del caracter en
		 * esa posicion a la variable caracter. Después concatenamos ese caracter a la
		 * string reverse que irá acumulando esos caracteres
		 */
		for (int i = posicion; i >= 0; i--) {
			caracter = palabra.charAt(i);
			reverse += caracter;
			//mas facil: reverse += palabra.charAt(i);
		}
		System.out.println(reverse);
	}

}
