package segundoejercicio;

import java.util.Scanner;

public class SegundoEjercicio {

	public static void main(String[] args) {
		int no1;
		int no2;
		int suma;
		int resta;
		int por;
		int div;
		
		Scanner numero = new Scanner(System.in);
		 System.out.println("introduce un número : ");
		 no1 = numero.nextInt();
		
		 System.out.println("introduce otro número : ");
		 no2 = numero.nextInt();
		 
		 suma = no1 + no2;
		 resta = no1 - no2;
		 por = no1 * no2;
		 div = no1 / no2;

System.out.println("El resultado de la suma es : " + suma);
System.out.println("El resultado de la resta es : " + resta);
System.out.println("El resultado de la multiplicacion es : " + por);
System.out.println("El resultado de la division es : " + div);


	}

}
