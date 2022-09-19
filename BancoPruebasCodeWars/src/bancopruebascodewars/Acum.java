package bancopruebascodewars;

public class Acum {

	public static String dashatize(int num) {
		String result = "";
		if (num < 0) {
			num = num * -1;
		}

		char[] numero = String.valueOf(num).toCharArray();
		for (int i = 0; i < numero.length; i++) {
			if (numero.length > 2) {
				if (numero[i] % 2 != 0) {
					if (i == 0) {
						result += numero[i] + "-";
					} else if (i == numero.length - 1) {
						if (numero[i - 1] % 2 != 0) {
							result += numero[i];
						} else {
							result += "-" + numero[i];
						}
					} else if (numero[i - 1] % 2 != 0) {
						result += numero[i] + "-";
					} else {
						result += "-" + numero[i] + "-";
					}
				} else {
					result += numero[i];
				}
			} else {
				result += numero[i];
			}

		}
		return result;
	}
}
