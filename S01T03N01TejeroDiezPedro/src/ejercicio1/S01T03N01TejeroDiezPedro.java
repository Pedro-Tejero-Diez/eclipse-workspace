package ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class S01T03N01TejeroDiezPedro {

	public static void main(String[] args) {
		// Inicializamos en arraylist y creamos los objetos "Month"
		ArrayList<Month> calendario = new ArrayList<>(12);
		Month m1 = new Month("Enero");
		Month m2 = new Month("Febrero");
		Month m3 = new Month("Marzo");
		Month m4 = new Month("Abril");
		Month m5 = new Month("Mayo");
		Month m6 = new Month("Junio");
		Month m7 = new Month("Julio");
		Month m8 = new Month("Agosto");
		Month m9 = new Month("Septiembre");
		Month m10 = new Month("Octubre");
		Month m11 = new Month("Noviembre");
		Month m12 = new Month("Diciembre");
		// Añadimos los meses en orden excepto Agosto
		calendario.add(m1);
		calendario.add(m2);
		calendario.add(m3);
		calendario.add(m4);
		calendario.add(m5);
		calendario.add(m6);
		calendario.add(m7);
		calendario.add(m9);
		calendario.add(m10);
		calendario.add(m11);
		calendario.add(m12);
		// comprabamos lista
		System.out.println(calendario);
		
		// introducimos Agosto en la posición adecuada y comprobamos
		calendario.set(7, m8);
		System.out.println(calendario);

		// Convertimos calendario en un Hashset
		HashSet<Month> calSet = new HashSet<Month>(calendario);
		
		// añado dos objetos Month para comprobar que el
		// que se repite no aparece y el que no se repite, si se añade
		Month m13 = new Month("capricornio");
		calSet.add(m8);
		calSet.add(m13);
		System.out.println(calSet+"\n");
		
		//Creamos un iterador para el hashset y lo recorremos con un for
		Iterator<Month> itr = calSet.iterator();
		for (Month i: calSet) {
		System.out.println(itr.next());
		}
		
	}

}
