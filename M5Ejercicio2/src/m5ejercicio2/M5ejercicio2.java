package m5ejercicio2;

import java.util.Scanner;

public class M5ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 0;
			int i, numero1, numero2;
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce el primer numero :");
			numero1 = sc.nextInt();
			sc.nextLine();

			System.out.println("Introduce el segundo numero :");
			numero2 = sc.nextInt();
			sc.nextLine();

			if (numero1 == numero2) {
			//no hacemos nada
			}
			
			else if
			(numero1 < numero2) {
				for (i = numero1; i <= numero2; i++) {
					x += i;
					} 
			}
			else {
									
				for (i = numero2; i <= numero1; i++) {
					x += i;
				
	}
				}
			
			
					System.out.println("La suma de los números comprendidos entre "+numero1+" y "+numero2+" es : "+x);
	}
}


