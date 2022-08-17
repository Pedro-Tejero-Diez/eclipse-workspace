package bancopruebascodewars;

public class Acum {
	

	public static String accum(String s) {
		
		String sMay = s.toUpperCase();
		String 	totalAcum = "";
		
		for (int i = 0; i<sMay.length();i++) {
			String acum ="";
			for (int j=0; j<=i; j++) {
				char c = sMay.charAt(i);
				acum += c;
			}
			String acumMay = acum.charAt(0)+acum.substring(0, (acum.length()-1)).toLowerCase();
			totalAcum += acumMay+"-";
		}
		String finalAcum= totalAcum.substring(0, (totalAcum.length()-1));
		return finalAcum;
	}

}
