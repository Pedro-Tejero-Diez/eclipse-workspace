package m72ejercicio1;

import java.util.Scanner;

public class M72Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lineas;

		System.out.println("Introduzca el numero de lineas del árbol");
		lineas = sc.nextInt();
		printTree(lineas);

	}

	public static void printTree(int x) {
		String ast = "*";
		String suma = "";

		for (int i = 1; i <= x; i++) {

			/*
			 * for (int j=1; j<=i; j++) { System.out.print(ast); } System.out.println();
			 esta fue mi solucion. A continuación la del profe*/
			for (int j = 1; j <= x; j++) {
				suma += ast;
			}
			suma += "\n";
		}
		System.out.println(suma);
	}

}
