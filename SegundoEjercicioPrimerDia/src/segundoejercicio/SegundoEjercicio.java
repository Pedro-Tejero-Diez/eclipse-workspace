package segundoejercicio;

import java.util.Scanner;

public class SegundoEjercicio {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int numero1, numero2;
		
		 System.out.println("introduce un número : ");
		 numero1 = number.nextInt();
		
		 System.out.println("introduce otro número : ");
		 numero2 = number.nextInt();

number.close();
System.out.println("El resultado de la suma es : " + (numero1+numero2));
System.out.println("El resultado de la resta es : " + (numero1-numero2));
System.out.println("El resultado de la multiplicacion es : " +numero1*numero2);
System.out.println("El resultado de la division es : " +(float)numero1/numero2);


	}

}
