package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.Spring;

public class Entrada {

	static Scanner sc = new Scanner(System.in);

	public static Byte leerByte(String x) throws InputMismatchException {
		System.out.println(x);
		Byte y = sc.nextByte();
		sc.nextLine();
		return y;
	}
	
	public static int leerInt(String x) throws InputMismatchException {
		int y = sc.nextInt();
		sc.nextLine();
		return y;
	}
	
	public static float leerFloat(String x) throws InputMismatchException {
		float y = sc.nextFloat();
		sc.nextLine();
		return y;
	}
	public static double leerDouble(String x) throws InputMismatchException {
		double y = sc.nextDouble();
		sc.nextLine();
		return y;
	}
	
	public static char llegirChar(String missatge) throws Exception {
		
		System.out.println(missatge);
		String sexo= sc.nextLine();
		if (sexo.equalsIgnoreCase("h")||sexo.equalsIgnoreCase("m")) {
			char sex = sexo.charAt(0);
			return sex;
		} else {
			throw new Exception("Error: Por favor, introduce H/M\n");
			
		}
	}

	public static String llegirString(String missatge) throws Exception {
		
		System.out.println(missatge);
		String nombre= sc.nextLine();
		if (nombre.length()<9) {
			
			return nombre;
		} else {
			throw new Exception("El nombre debe tener máximo 10 letras\n");
		}
		
	}

	public static boolean llegirSiNo(String missatge) throws Exception {
	
		String y = sc.nextLine();
		sc.nextLine();
		if (y.equalsIgnoreCase("s")) {
		return true;
		} if (y.equalsIgnoreCase("n")) {
			return false;
		} else {
			throw new Exception("introduce S/N\n");
		}
	
	}

}
