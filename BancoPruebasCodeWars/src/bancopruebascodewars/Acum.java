package bancopruebascodewars;

public class Acum {

	public static boolean alphanumeric(String s) {

		char[] letras = s.replaceAll("[0-9]", "").toCharArray();
		int i = 0;

		if (s.length() == 0) {
			return false;
		} else {

			while (i < letras.length && ((letras[i] > 64 && letras[i] < 91) || (letras[i] > 96 && 
					letras[i] < 123))) {
				i++;
			}
			if (i == (letras.length)) {
				return true;
			} else
				return false;
		}
	}
}