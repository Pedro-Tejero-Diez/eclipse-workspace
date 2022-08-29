package bancopruebascodewars;

import java.util.ArrayList;
import java.util.HashMap;

public class Otraspruebas {

	public static String encrypt(final String text, int n) {

		String todo;

		if (text == null || n < 1) {
			return text;

		} else {

			ArrayList<Character> odd = new ArrayList<Character>();
			ArrayList<Character> even = new ArrayList<Character>();
			String number = text;
			String total = "";

			for (int i = 0; i < number.length(); i++) {

				if (i % 2 == 0) {
					even.add(number.charAt(i));
				} else {
					odd.add(number.charAt(i));
				}
			}

			for (char a : odd) {
				total += a;
			}
			for (char a : even) {
				total += a;
			}
			todo = total;
		}

		return encrypt(todo, --n);
	}

	public static String decrypt(final String encryptedText, int n) {


            if (n <= 0 || encryptedText == null || encryptedText.isEmpty()) {
                    return encryptedText;
            }

            StringBuilder text = new StringBuilder();
            final int half = encryptedText.length() / 2;
            for (int i = 0; i < half; i++) {
                    text.append(encryptedText.charAt(half + i)).append(encryptedText.charAt(i));
            }
            if (encryptedText.length() % 2 == 1) {
                    text.append(encryptedText.charAt(encryptedText.length() - 1));
            }

            return decrypt(text.toString(), --n);
	}
}
