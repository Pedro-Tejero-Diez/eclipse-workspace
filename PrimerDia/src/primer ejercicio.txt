package primerdia;

import java.util.Scanner;

public class PrimerDia {

	public static void main(String[] args) {
	
		 Scanner name = new Scanner(System.in);
		 System.out.println("introduce tu nombre : ");
		 String nom = name.nextLine();
		 
		 Scanner surname = new Scanner(System.in);
		 System.out.println("introduce tu apellido : ");
		 String ap = surname.nextLine();
		 
		 Scanner age = new Scanner(System.in);
		 System.out.println("introduce tu edad : ");
		 String edad = age.nextLine();
		 
		 System.out.println("Estos son tus datos : ");
		 System.out.println(nom);
		 System.out.println(ap);
		 System.out.println(edad);
		
	}

}
