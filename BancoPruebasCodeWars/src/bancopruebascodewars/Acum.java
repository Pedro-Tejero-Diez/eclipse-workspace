package bancopruebascodewars;

public class Acum {

<<<<<<< HEAD
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
=======
	  public static String Factorial(int n) {
		  MathUtils.factorial
		    return "";
		  }

		}
>>>>>>> c0400bb2516615e1d32f21728d48d12a1e546b65
