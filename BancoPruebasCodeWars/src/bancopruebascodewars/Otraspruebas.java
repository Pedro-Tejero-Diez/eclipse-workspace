package bancopruebascodewars;


public class Otraspruebas {

<<<<<<< HEAD

	  public static boolean validPhoneNumber(String phoneNumber) {
		  
		  char[] seq = phoneNumber.toCharArray();
		  if (seq.length<14 || seq[0] !='(' || seq[4]!=')' || seq[5]!=' ' || seq[9] != '-' ) return false;
		  
		  return true;
	}
=======
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
>>>>>>> 5058d584b6a69d2ab060a4a8d169e4f34f309f36
	}
