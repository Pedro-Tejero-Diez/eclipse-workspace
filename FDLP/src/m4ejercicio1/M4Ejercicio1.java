package m4ejercicio1;

	import java.util.Scanner;

	public class M4Ejercicio1 {

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
			 
			 if (edad >= 18) {
				 System.out.println(nom+" "+ap+"  ets MAJOR d'edat"); }
			 
				 else {
					 System.out.println(nom+" "+ap+"  ets MENOR d'edat");
		
		}

	}

}