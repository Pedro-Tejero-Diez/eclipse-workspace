package m5ejercicio3;

import java.util.Scanner;

public class M5ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		byte aleatorio = (byte) Math.ceil((Math.random() * 10));
		int numero;
		
		do {
		System.out.println("Introduce un número entre 0 y 10 : ");
		numero = sc.nextByte();
		sc.nextLine();
		}
		while (numero != aleatorio);
		
		System.out.println("Enhorabuena, has acertado :) el número era "+numero);
		

	}

}
