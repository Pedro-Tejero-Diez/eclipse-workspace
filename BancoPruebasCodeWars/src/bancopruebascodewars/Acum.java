package bancopruebascodewars;

import java.util.ArrayList;
import java.util.HashMap;

public class Acum {

	public static String encrypt(final String text, final int n) {

		if (text.equals(null) || n < 1) {
			return text;
			
		} else {

			ArrayList<Character> odd = new ArrayList<Character>();
			ArrayList<Character> even = new ArrayList<Character>();
			String number = text;

			for (int j = 0; j < n; j++) {
				even.clear();
				odd.clear();
				for (int i = 0; i < number.length(); i++) {
					if (i % 2 == 0) {
						even.add(number.charAt(i));
					} else {
						odd.add(number.charAt(i));
					}
				}
				String pares = even.toString().replaceAll(",", "").replace("[", "").replace("]", "").replace(" ", "");
				String impares = odd.toString().replaceAll(",", "").replace("[", "").replace("]", "").replace(" ", "");
				number = impares + pares;
			}
			return number;
		}
	}

	public static String decrypt(final String encryptedText, final int n) {
		
		if (encryptedText.equals(null) || n < 1) {
			return encryptedText;
		}
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		String encriptado = encryptedText;

		for (int k = 0; k < n; k++) {
			map.clear();

			if (encriptado.length() % 2 == 0) {

				int i = 0, q = 0, j = 1;
				while (i < encriptado.length() / 2 && j < encriptado.length()) {
					map.put(j, encriptado.charAt(i));
					i++;
					j += 2;
				}
				while (i >= encriptado.length() / 2 && q < encriptado.length()) {
					map.put(q, encriptado.charAt(i));
					i++;
					q += 2;
				}
			}

			else {

				int i = 0, q = 0, j = 1;
				while (i < (encriptado.length() - 1) / 2 && j <= encriptado.length()) {
					map.put(j, encriptado.charAt(i));
					i++;
					j += 2;
				}
				while (i >= (encriptado.length() - 1) / 2 && q < encriptado.length()) {
					map.put(q, encriptado.charAt(i));
					i++;
					q += 2;
				}
			}
			
			ArrayList<Character> numero = new ArrayList<Character>();
			for (Integer p : map.keySet()) {
				numero.add(map.get(p));
			}
			encriptado = numero.toString().replaceAll(",", "").replace("[", "").replace("]", "").replace(" ", "");
		}

		return encriptado;
	}
}
