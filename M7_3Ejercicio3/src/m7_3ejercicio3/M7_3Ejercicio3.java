package m7_3ejercicio3;

import java.util.Scanner;

public class M7_3Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase;
		int longitud, bucle;
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		longitud = frase.length() - 1;
		bucle = longitud/2;
		int i=0;
		boolean encontrado = true;
		
		while (i< bucle && encontrado) {
		
			if (frase.charAt(i)!=frase.charAt(longitud -i)) {
				encontrado = false;
			}
			i++;
		}
		if (encontrado) {
			System.out.println("La frase ES un palíndromo");
		} else {
			System.out.println("La frase NO es un palíndromo");
		}
	
	}

}
