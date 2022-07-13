package m7_3ejercicio4;

import java.util.Scanner;

public class M7_3ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String documento;
		int longitud, numerodni, resto;
		int j=0;
		char letradni, caracter;
		boolean encontrado = false;
		
		do {
		System.out.println("Introduzca su DNI con letra al final");
		documento = sc.nextLine();
		longitud = documento.length();
		if (longitud !=9) {
			System.out.println("Por favor introduzca un DNI valido (9 posiciones)");
		} while (longitud != 9)
		
		letradni = documento.charAt(8);
		
		for (int i=0; i<longitud;i++) {
			caracter=documento.charAt(i);
			numerodni +=  caracter;
		}
			
			while (!encontrado && j <23) {
				resto = numerodni%23;
			}
		}
		
	}

}
