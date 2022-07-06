package m7ejercicio2;

import java.util.Scanner;

public class M7Ejercicio2 {

	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int numNotas;
		
		System.out.println("Introduzca numero de notas a evaluar");
		numNotas = sc.nextInt();
		int total = findTotal(numNotas);

				
		if (total/numNotas < 5) {
			System.out.println("La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més");
		} else if (total/numNotas < 7) {
			System.out.println("\"La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal\"");
		} else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
		}
	}

		public static int findTotal(int x) {
			Scanner sc = new Scanner(System.in);
			int i = 0, nota, total = 0;
			do {
			System.out.println("Introduzca una nota");
			nota = sc.nextInt();
			if (nota >= 0 && nota <=10) {
				total += nota;
				i++;
			} else {
				System.out.println("La nota debe estar entre 0 y 10");
			}
			} while (i < x);
			
			return total;
			
		}
		

	}

