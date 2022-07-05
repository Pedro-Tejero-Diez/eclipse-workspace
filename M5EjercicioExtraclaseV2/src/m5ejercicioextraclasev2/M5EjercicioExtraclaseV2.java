package m5ejercicioextraclasev2;

import java.util.ArrayList;
import java.util.Scanner;

public class M5EjercicioExtraclaseV2 {
	
	 public static void main(String[] args) {
		  
		    Scanner sc = new Scanner(System.in);
		    String marca, item;
		    byte i = 0;
		    
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Dacia");
		    cars.add("Renault");
		    cars.add("Seat");
		    cars.add("Fiat");
		    
		    System.out.println("Introduce la marca del coche que buscas : ");
		    marca = sc.nextLine();
		    
		    do {
		    	item = cars.get(i);
		    	i++;
		    }
		    while (!item.equals(marca) && i < cars.size());
		    
		    	if (item.equals(marca)) {
		    		
		    		System.out.println("La marca "+marca+" esta en nuestro concesionario");
	    		
		    	} else
		    
		    		System.out.println("Lo siento, la marca que busca no está en el concesionario");
		    
		  }

}
