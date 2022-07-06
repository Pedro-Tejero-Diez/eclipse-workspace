package m7ejercicio3;

import java.util.Scanner;

public class M7ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un numero :");
		numero = sc.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("El numero "+numero+" es PAR");
		} else {
			System.out.println("El numero "+numero+" es IMPAR");
		}

	}

}
