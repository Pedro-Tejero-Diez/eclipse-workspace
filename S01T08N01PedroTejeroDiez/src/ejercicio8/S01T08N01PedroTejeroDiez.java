package ejercicio8;

import java.util.Scanner;
import java.lang.StringBuilder;

public class S01T08N01PedroTejeroDiez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra a voltear: ");
		String palabra = sc.nextLine();

		darLaVuelta revolver = s -> {
			return new StringBuilder(s).reverse().toString();
		};

		System.out.println(revolver.reverse(palabra));
		sc.close();

	}
}
