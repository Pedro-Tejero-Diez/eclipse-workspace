package m7ejercicio8;

import java.util.Scanner;

public class M7Ejercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float celsius;
		
		
		System.out.println("Introduzca la temperatura en Grados Centígrados : ");
		celsius = sc.nextFloat();
		farConverter(celsius);
	}

public static void farConverter(float t) {
	float far = (float)t*9/5+32;
	System.out.println("La temperatura "+t+" grados celsius equivale a "+far+" grados Fahrenheit");
}
}
