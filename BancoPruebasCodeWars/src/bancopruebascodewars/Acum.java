package bancopruebascodewars;

public class Acum {

	public static String incrementString(String str) {
		String numero="0";
		int i= str.length()-1;
		if (i<9) {
		while (str.toCharArray()[i]>47 && str.toCharArray()[i]<58) {
			numero += str.charAt(i);
			i--;
		}
		String letras = str.substring(0, i);
		int number = Integer.parseInt(numero)+1;
		} else {
			numeros = str.
			
			while (numeros[0].>47 && str.toCharArray()[i]<58) {
				numero += str.charAt(i);
				i--;
			}
			String letras = str.substring(0, i);
			int number = Integer.parseInt(numero)+1;
		}
		
		

		return resultado;
	}
}