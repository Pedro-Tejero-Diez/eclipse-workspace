package m7ejercicio5variacion1;

import java.util.Scanner;

public class M7Ejercicio5Variacion1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduzca el numero inicial :");
		num1 = sc.nextInt();

		System.out.println("Introduzca el numero final :");
		num2 = sc.nextInt();

		printEven(num1, num2);
	}

	public static void printEven(int num1, int num2) {
		int auxiliar, i;

		if (num1 < num2) {
			auxiliar = num2;
			num2 = num1;
			num1 = auxiliar;
		} else if (num1 == num2) {
			System.out.println("Los numeros no pueden ser iguales");
		}
		
		for (i = num1; i >= num2; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
