package m7_3ejercicio5;

import java.util.Scanner;

public class M7_3Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		// control de errores usuario: debe introducir alguna letra al menos
		do {
			System.out.println("Introduzca una frase");
			input = sc.nextLine();
		} while (input.isEmpty());
		
		//guardo en variables la misma String en Mayusculas y minusculas
		String inputMay = input.toUpperCase(), inputMin = input.toLowerCase();

		if (input.equals(inputMin)) {
			System.out.println("Esta frase son todo minusculas");
		} else if (input.equals(inputMay)) {
			System.out.println("Esta frase son todo Mayusculas");
		} else
			System.out.println("Esta frase contiene Mayusculas y minusculas");
	}
}
