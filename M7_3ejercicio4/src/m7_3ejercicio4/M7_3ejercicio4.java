package m7_3ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class M7_3ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String documento, documentoLimpio, documentoMay;
		int numeroDni;
		char letraDni, letraCorrecta;

		/*array list con los valores de las letras ordenadas de forma que la posición
		 * coincide con el valor del resto que deben dar al dividir el número del DNI x 23
		 */

		ArrayList<Character> serieLetras = new ArrayList<Character>();
		serieLetras.add('T');
		serieLetras.add('R');
		serieLetras.add('W');
		serieLetras.add('A');
		serieLetras.add('G');
		serieLetras.add('M');
		serieLetras.add('Y');
		serieLetras.add('F');
		serieLetras.add('P');
		serieLetras.add('D');
		serieLetras.add('X');
		serieLetras.add('B');
		serieLetras.add('N');
		serieLetras.add('J');
		serieLetras.add('Z');
		serieLetras.add('S');
		serieLetras.add('Q');
		serieLetras.add('V');
		serieLetras.add('H');
		serieLetras.add('L');
		serieLetras.add('C');
		serieLetras.add('E');

		// control de errores del usuario: bucle do while
		do {
			System.out.println("Introduzca su DNI con letra al final");
			documento = sc.nextLine();
			if (documento.length() != 9) {
				System.out.println("Por favor introduzca un DNI valido (9 posiciones)");
			}
		} while (documento.length() != 9);

		// control errores usuario, en caso de que la metan en minusculas
		documentoMay = documento.toUpperCase();

		// guarda la letra del DNI (ya en mayusculas) introducido en una variable char
		letraDni = documentoMay.charAt(8);

		// eliminamos la letra del string
		documentoLimpio = documento.substring(0, 8);

		// pasamos la string al número correspondiente entero
		numeroDni = Integer.parseInt(documentoLimpio);

		/*
		 * dividimos el numero del DNI por 23 y buscamos en el ArrayList la letra que
		 * corresponde al valor de este resto
		 */
		letraCorrecta = serieLetras.get(numeroDni % 23);

		if (letraDni == letraCorrecta) {
			System.out.println("DNI Correcto");
		} else {
			System.out.println("La letra de tu DNI es incorrecta. La letra correcta es: " + letraCorrecta);
		}
	}
}
