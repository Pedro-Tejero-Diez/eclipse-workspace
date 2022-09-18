package bancopruebascodewars;


public class Otraspruebas {

		public static String expandedForm(int num) {
			String suma="", cont="";
			char[] numero = String.valueOf(num).toCharArray();
			int size = numero.length-1;
			for (int i= 0; i<numero.length;i++) {
				if((Character.getNumericValue(numero[i]))*(int) Math.pow(10, (size-i)) !=0) {
			cont = String.valueOf((Character.getNumericValue(numero[i]))*(int) Math.pow(10, (size-i)));
			suma += cont+" + ";
			}
			}
			return suma.replaceAll("\\ $", "").replaceAll("\\+$", "").replaceAll("\\ $", "");
		}
	}
