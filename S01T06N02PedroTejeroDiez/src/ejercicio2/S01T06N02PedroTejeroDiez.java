package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import ejercicio1.Persona;

public class S01T06N02PedroTejeroDiez {

	public static void main(String[] args) {

		Persona p1 = new Persona("Peter", "Parker", 35);
		Persona p2 = new Persona("Juan", "Parker", 25);
		Persona p3 = new Persona("Noa", "Parker", 55);
		String linea1 = "buenos dias";
		String linea2 = "mundo";
		String linea3 = "mundial";
		int n1 = 10;
		int n2 = 20;
		int n3 = 25;
				
		List<Persona> personas = new ArrayList<> ();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		List<Integer> numbers = new ArrayList<> ();
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		
		List<String> palabras = new ArrayList<> ();
		palabras.add(linea1);
		palabras.add(linea2);
		palabras.add(linea3);
		/*Ahora probamos que el metodo generico puede aceptar como argumento
		 * una lista del tipo que sea*/
		GenericMethods GM = new GenericMethods();
		
		GM.generico(palabras);
		GM.generico(numbers);
		GM.generico(personas);
	}

}
