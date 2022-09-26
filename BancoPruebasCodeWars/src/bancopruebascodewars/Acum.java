package bancopruebascodewars;

public class Acum {

	public static String incrementString(String str) {
		String resultado = "";
		int number = 1;
		String numFinal = "";
		String letras = "";
		String numeracion = "";

		if (str == "") {
			resultado = "1";
		} else if (str.length() < 10) {
			letras = str.replaceAll("[0-9]", "");
			numeracion = str.replaceAll("[^0-9]", "");

			if (numeracion != "") {
				number = Integer.parseInt(numeracion) + 1;
				for (int i = 0; i < (numeracion.length() - String.valueOf(number).length()); i++) {
					numFinal += "0";
				}
			} 
			
		} else {
				
				numeracion = str.replaceAll("[^0-9]", "");
				numeracion = str.substring(str.length()-numeracion.length());
				letras = str.substring(0, str.length()-numeracion.length());
				number = Integer.parseInt(numeracion) + 1;
				for (int i = 0; i < (numeracion.length() - String.valueOf(number).length()); i++) {
					numFinal += "0";
				}
			}

			resultado = letras + numFinal + String.valueOf(number);
		
		return resultado;
	}
}