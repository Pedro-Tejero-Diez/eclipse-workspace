package pooclase1;

import java.util.Scanner;

public class POOClase1 {

	public static void main(String[] args) {
		

			  public static boolean validatePin(String pin) {
			    if (pin.length()==4 || pin.length() ==6) {
			      int i = 0;
			      char caracter = 48;
			      while (i<pin.length() && (caracter >47 && caracter <58 )) {
			    	  caracter = pin.charAt(i);
			        i++;
			      }
			      if (caracter < 47 || caracter >58) {
			        return false;
			      }
			    } else {
			      return false;
			    }
			    return true;
			  }

			}
		
		Scanner sc = new Scanner(System.in);
		
		Coche car1= new Coche("Ford", "mondeo", 60, 200, "negro");
		Coche car2 = new Coche(null, null, 0, 0, null);
		
		System.out.println(car2.toString());
	  
		car2.setMarca("DAcia");
		car2.setColor("verde");
		
		String marca = car1.getMarca();
		System.out.println(marca);
		
		car1.arrancar();
		car2.frenar();
		
		System.out.println(car1.getMarca()+"  "+ car2.getMarca());
		
		if (car1 == car2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

	}

}
