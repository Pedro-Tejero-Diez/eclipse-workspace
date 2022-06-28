package primerdia;

import java.util.Scanner;

public class PrimerDia {

	public static void main(String[] args) {
	
		 Scanner inpt = new Scanner(System.in);
		 String nom, ap;
		 byte edad;
		 
		 System.out.println("introduce tu nombre : ");
		 nom = inpt.nextLine();
		 
		 System.out.println("introduce tu apellido : ");
		 ap = inpt.nextLine();
		 
		 System.out.println("introduce tu edad : ");
		 edad = inpt.nextByte();
		 
		 System.out.println("Estos son tus datos : ");
		 System.out.println(nom);
		 System.out.println(ap);
		 System.out.println(edad);
	
	}

}
