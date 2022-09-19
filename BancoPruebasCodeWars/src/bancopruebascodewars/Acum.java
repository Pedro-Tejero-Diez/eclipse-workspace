package bancopruebascodewars;

public class Acum {

<<<<<<< HEAD
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
=======
	public static String expandedForm(int num) {
		String suma="", cont = "", cont2="";
		char[] numero = String.valueOf(num).toCharArray();
		int size = numero.length;
		for (int i=0; i<size; i++ ) {
			
			for (int j= size; j<=i; j--) {
				cont += "0";
			}
			cont2=numero[i]+cont+"+";
			suma += cont2;
		}
		return suma;
>>>>>>> 5058d584b6a69d2ab060a4a8d169e4f34f309f36
	}
}
