package m7ejercicio1;

import java.util.Scanner;

public class M7Ejercicio1 {

	public static void main(String[] args) {
		int nota;
		int total = 0;
		byte i = 0;
		float media;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce una nota :");
			nota = sc.nextInt();
			if (nota <=10 && nota >= 0) {
			total += nota;
			i++;
			} else {
				System.out.println("Por favor introduce valores entre 0 y 10");
			}
		} while (i < 3);
		
		media = total/3;
		
		if (media < 5) {
			
			System.out.println("Lo siento no has pasado el curso");
			
		} else if (media >= 5 && media <= 7) {
			
			System.out.println("Enhorabuena, has pasado el curso aunque deberias estudiar más");
			
		} else {
			
			System.out.println("ENHORABUENA, Has pasado el curso. Pasas de nivel");
		}
		}
	}
	

