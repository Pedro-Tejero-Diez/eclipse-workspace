package bancopruebascodewars;

public class Acum {

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
	}
}
