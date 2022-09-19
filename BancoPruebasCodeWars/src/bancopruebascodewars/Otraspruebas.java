package bancopruebascodewars;


public class Otraspruebas {


	  public static boolean validPhoneNumber(String phoneNumber) {
		  
		  char[] seq = phoneNumber.toCharArray();
		  if (seq.length<14 || seq[0] !='(' || seq[4]!=')' || seq[5]!=' ' || seq[9] != '-' ) return false;
		  
		  return true;
	}
	}
