package m6ejercicio1;

import java.util.Scanner;

public class M6Ejercicio1 {

	public static void suma(int num1, int num2) {
		int x = num1 + num2;
		System.out.println("La suma es : " + x);
	}

	public static void resta(int num1, int num2) {
		int x = num1 - num2;
		System.out.println("La resta es : " + x);
	}

	public static void mult(int num1, int num2) {
		int x = num1 * num2;
		System.out.println("La multiplicacion es : " + x);
	}

	public static void div(double num1, double num2) {
		double x = num1 / num2;
		System.out.println("La division es : " + x);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String operacion;
		char operador;

		System.out.println("Introduzca numero 1 :");
		a = sc.nextInt();

		System.out.println("Introduzca numero 2 :");
		b = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca operacion: suma, resta, multiplicación, división :");
		operacion = sc.nextLine();
		operador = operacion.charAt(0);

		switch (operador) {
		case 's':
			suma(a, b);
			break;

		case 'r':
			resta(a, b);
			break;
		case 'm':
			mult(a, b);
			break;
		case 'd':
			div(a, b);
			break;
		default:
			System.out.println("Por favor, introduzca unicamente uno de los operadores");

		}

	}

}
