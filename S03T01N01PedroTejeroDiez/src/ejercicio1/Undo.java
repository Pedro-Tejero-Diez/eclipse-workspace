package ejercicio1;

import java.util.ArrayList;

public class Undo {

	static ArrayList<String> comandos = new ArrayList<>();
	private static Undo deshacer = new Undo();

	private Undo() {

	}

	public static Undo getInstance() {
		
		return deshacer;
	}

	public void getLast(String command) {

		comandos.add(command);
	}

	public  String provideLast() {
		String list = comandos.get(comandos.size()-2);
		return list;
	}

	public  ArrayList<String> history() {

		return comandos;
	}
}
