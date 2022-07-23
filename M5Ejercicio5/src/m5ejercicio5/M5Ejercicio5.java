package m5ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class M5Ejercicio5 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte edad;
		byte contador = 0;
		String lectura, nombre, apellido;
		char titulo, paro;
		final char AFIRMACION = 's';
		final byte MAYOREDAD = 18;
		final byte MAXBECAS = 5;
		ArrayList<String> listabecas = new ArrayList<String>();
		
		do {
			
		System.out.println("Introduce tu edad : ");
		edad = sc.nextByte();
		sc.nextLine(); //esto borra el buffer. como nextbyte no leyo el intro,entonces nextline lo lee y salta a la siguiente
			
		System.out.println("Tienes título universitario? : ");
		lectura = sc.nextLine();
		lectura = lectura.toLowerCase();
		titulo = lectura.charAt(0);
	
		System.out.println("Estas en Paro? : ");
		lectura = sc.nextLine();
		lectura = lectura.toLowerCase();
		paro = lectura.charAt(0);
		
		if (edad >= MAYOREDAD && titulo == AFIRMACION || paro == AFIRMACION) {
			
			System.out.println("Introduce tu nombre: ");
			nombre = sc.nextLine();
			
			System.out.println("Introduce tu Apellido: ");
			apellido = sc.nextLine();
			
			String becario = nombre+"  "+apellido;
			
			listabecas.add(becario);
			
			contador++;
			
			System.out.println("Beca concedida");
		}
		else {
			System.out.println("Beca Denegada");
		}
		
		}
		while (contador <= MAXBECAS);
		
		System.out.println("Los alumnos adimitidos son : "+listabecas);
	}
}



	
