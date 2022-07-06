package m4ejercicioextra3;

import java.util.Scanner;

public class M4EjercicioExtra3 {

	public static void main(String[] args) {
		
		int tunum, pcnum;
		Scanner sc = new Scanner(System.in);
		
		pcnum = (int)(Math.random() * 3) + 1; 
		
		System.out.println("Introduce un numero del 1 al 3 (1:Piedra, 2:Papel, 3:Tijera");
		tunum = sc.nextInt();
		sc.nextLine();
		
		if (tunum < 1 || tunum > 3) {
			System.out.println("Parece que no quieres jugar ahora....");
		} else {
			switch (pcnum) {
			case 1:
				if (tunum =1) {
					System.out.println("Piedra empata con Piedra");
					else c
				}
			}
		}
		
	}

}
