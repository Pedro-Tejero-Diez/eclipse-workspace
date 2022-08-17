package bancopruebascodewars;

import java.util.Scanner;

public class BancoPruebasCodeWars {

	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
			System.out.println("introduce varias letras");
		String serie = sc.nextLine();
		
		System.out.println(Acum.accum(serie));
	}
	
		
	}


