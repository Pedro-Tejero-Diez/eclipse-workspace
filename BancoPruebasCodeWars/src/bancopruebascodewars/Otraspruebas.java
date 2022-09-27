package bancopruebascodewars;

public class Otraspruebas {

	public static String incrementString(String str) {
		String resultado ="";
		if (str=="") {
			resultado = "1";
		} else {
		int number=1;
		String numFinal="";
		String letras = str.replaceAll("[0-9]", "");
		String numeracion=str.replaceAll("[^0-9]", "");
		if (numeracion != "") {
			number = Integer.parseInt(numeracion) + 1;
			for (int i=0; i<(numeracion.length()- String.valueOf(number).length()); i++) {
				numFinal+= "0";
		} 
		} 
	resultado = letras+numFinal+String.valueOf(number);
		}
		return resultado;
	}
}