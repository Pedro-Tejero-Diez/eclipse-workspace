package ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S01T08N01PedroTejeroDiez {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("12345", "Zanahoria", "56584", "acelga", "45789", "coliflor", "23", "apio");

		Comparator<String> comparar = (a, b) -> a.length() - b.length();

		lista.sort(comparar);

		System.out.println(lista);
	}

}
