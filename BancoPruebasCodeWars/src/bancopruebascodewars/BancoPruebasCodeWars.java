package bancopruebascodewars;

import java.util.Scanner;

public class BancoPruebasCodeWars {

	public static void main(String[] Args){
		
		String numero = "";
		do {
		System.out.println("escribe el numero de telefono:");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextLine();
		} while (!Otraspruebas.validPhoneNumber(numero));
		System.out.println("El numero es correcto");
	}
			
	}

