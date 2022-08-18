package bancopruebascodewars;

import java.util.Scanner;

public class BancoPruebasCodeWars {

	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
			System.out.println("introduce varios numeros");
		int serie = sc.nextInt();
		
		System.out.println(Acum.squareDigits(serie));
	}
	
		
	}


