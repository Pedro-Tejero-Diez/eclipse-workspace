package ejercicio1;

import java.util.Scanner;

public class S03T01N01PedroTejeroDiez {

	public static void main(String[] args) {

		Undo undo = Undo.getInstance();
		String command = "";
		Scanner sc = new Scanner(System.in);
		while (!command.equalsIgnoreCase("SALIR")) {
		System.out.println("introduzca un comando o escriba SALIR");
		command = sc.nextLine();
		
			if (command.equals("undo")) {

				command = undo.provideLast();
				System.out.println(command);

			}else if (command.equals("paste")) {
				undo.getLast(command);
				System.out.println("estoy pegando");

			}
			if (command.equals("copy")) {
				undo.getLast(command);
				System.out.println("estoy copiando");

			}
			if (command.equals("delete")) {
				undo.getLast(command);
				System.out.println("estoy borrando");

			}
			if (command.equals("history")) {
				undo.getLast(command);
				System.out.println(undo.history());

			}
			
	}
		sc.close();
}
}

