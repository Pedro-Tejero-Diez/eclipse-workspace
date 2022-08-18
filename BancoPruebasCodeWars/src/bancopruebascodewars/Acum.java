package bancopruebascodewars;

public class Acum {

		  public static int squareDigits(int n) {
			   
			String number=  Integer.toString(n);
			int size = number.length();
			String numeros = "", x;
			int numbers, y;
			
			for (int i= 0; i<size;i++) {
				y = (int) Character.getNumericValue(number.charAt(i));
				int y2 = y*y;
				x = Integer.toString(y2);
				numeros += x;
			}
			numbers = Integer.parseInt(numeros);
			return numbers;
			  
		  }
}
