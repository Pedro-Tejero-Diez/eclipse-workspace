package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S01T08N02PedroTejeroDiez {

	public static void main(String[] args) {

		List<String> listado = new ArrayList<>();
		listado.add("Anastasia");
		listado.add("Alfredo");
		listado.add("Julian");
		listado.add("Vicente");
		listado.add("Jose Maria");
		listado.add("Ana");

		System.out.println(empiezaporA(listado));

	}

	public static List<String> empiezaporA(List<String> listado) {

		return listado.stream().filter(s -> s.matches("A..")).collect(Collectors.toList());

	}

}
