package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota1, nota2, nota3;
		
		System.out.println("introduzca la primera nota : ");
		nota1 = sc.nextInt();
		
		
		System.out.println("introduzca la segunda nota : ");
		nota2 = sc.nextInt();
		
		System.out.println("introduzca la tercera nota : ");
		nota3 = sc.nextInt();

		System.out.println("La media de sus notas es: "+(((float)nota1+nota2+nota3)/3));
		sc.close();
	}


}
