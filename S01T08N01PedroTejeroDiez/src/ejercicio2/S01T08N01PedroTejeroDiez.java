package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class S01T08N01PedroTejeroDiez {

	public static void main(String[] args) {
	
				
				ArrayList<String> listado = new ArrayList<String>();
				List<String> lista = Arrays.asList("patata", "Zanahoria", "remolacha", "acelga", "nabo", "coliflor", "brocoli",
						"apio");
				Predicate<String> contieneO = s -> s.contains("o");
				Predicate<String> masde5 = s -> s.length()>5;
				Consumer<String> funcion1 = s -> listado.add(s);

				lista.stream().filter(contieneO).filter(masde5).forEach(funcion1);

				System.out.println(listado);
}

}
