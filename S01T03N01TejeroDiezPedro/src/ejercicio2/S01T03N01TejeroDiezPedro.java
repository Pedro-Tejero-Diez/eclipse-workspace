package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class S01T03N01TejeroDiezPedro {

	public static void main(String[] args) {
		//declaramos las listas que usaremos
		List <Integer> lista1 = new ArrayList<Integer>();
		List <Integer> lista2 = new ArrayList<Integer>();
		
		//rellenamos las listas con números
		for (int i =0; i<11; i++) {
			lista1.add(i);
		}
		for (int i =50; i<61; i++) {
			lista2.add(i);
		}
		//miramos el contenido de las listas para poder comparar el resultado
		System.out.println(lista1);
		System.out.println(lista2);
		
		//creamos el objeto "iterator" que usaremos en el ejercicio
		ListIterator<Integer> it1 = lista1.listIterator();

		//colocamos el cursor en la última posición del iterador para empezar por el final en el siguiente paso
		while (it1.hasNext()) {
			it1.next();
		}
		
		//insertamos a la segunda lista los elementos de la primera en sentido inverso
		while (it1.hasPrevious()) {
			lista2.add(it1.previous());
		}
		//comprobamos resultado
		System.out.println("\n"+lista2);
	}

}
