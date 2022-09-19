package bancopruebascodewars;

public class Otraspruebas {

	public static String incrementString(String str) {
		int number=0;
		String letras = str.replaceAll("[1-9]", "");
		String numero = str.replaceAll("[^0-9]", "");
		if (numero != "") {
			number = Integer.parseInt(numero) + 1;
		} else {
			number = 1;
		}
		String resultado = letras+String.valueOf(number);

		return resultado;
	}
}