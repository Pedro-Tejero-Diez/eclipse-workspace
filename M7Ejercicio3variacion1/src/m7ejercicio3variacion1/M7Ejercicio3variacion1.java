package m7ejercicio3variacion1;

import java.util.Scanner;

public class M7Ejercicio3variacion1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
			
		do {
			System.out.println("Introduzca un numero :");
			numero = sc.nextInt();
						
		} while (numero%2 != 0);
				
			System.out.println("El numero "+numero+" es PAR");

	}
}
