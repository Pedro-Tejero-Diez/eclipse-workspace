package m7_2ejercicio7;

import java.util.Scanner;

public class M7_2Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el año");
		int year = sc.nextInt();
		esBisiesto(year);
		
		if (esBisiesto(year)) {
			System.out.println("El año "+year+" es Bisiesto");
		} else {
			System.out.println("El año "+year+" NO es Bisiesto");
		}
	}
public static boolean esBisiesto(int year) {
	
	boolean bisiesto = false;
	
	if (year%400 ==0) {
		bisiesto = true;
		
	}else if (year%4==0 && year%100!=0) {
		bisiesto = true;
	}
	
	return bisiesto;
}
}
