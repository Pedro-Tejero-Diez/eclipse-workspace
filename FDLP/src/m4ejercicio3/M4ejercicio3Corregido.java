package m4ejercicio3;

import java.util.Scanner;

public class M4ejercicio3Corregido {
	

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			byte edad;
			String lectura;
			char titulo, paro;
			final char AFIRMACION = 's';
			final char MAYOREDAD = 18;
			
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
				System.out.println("Beca concedida");
			}
			else {
				System.out.println("Beca Denegada");
			}
		}

	}

