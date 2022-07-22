package ejercicioEXTRA_2;

import java.util.Scanner;

public class Ejercicioextra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero entero: ");
		int numero = sc.nextInt();

		int varInt = (numero<10)? numero: 1;
		System.out.println(varInt);
	}

}
