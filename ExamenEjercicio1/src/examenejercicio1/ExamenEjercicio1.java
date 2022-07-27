package examenejercicio1;

import java.util.ArrayList;

public class ExamenEjercicio1 {

	public static void main(String[] args) {
		// En primer lugar, declaramos los ArrayList que usaremos. Usamos float porque el cambio a Dolar tiene decimales
		ArrayList<Float> listadoPreciosEuros = new ArrayList<Float>();
		ArrayList<Float> listadoPreciosDolares = new ArrayList<Float>();
		
		//Añadimos los datos de base que nos dan
		listadoPreciosEuros.add(15.0f);
		listadoPreciosEuros.add(16.0f);
		listadoPreciosEuros.add(8.0f);
		listadoPreciosEuros.add(2.0f);
		listadoPreciosEuros.add(4.0f);
		listadoPreciosEuros.add(6.0f);
		listadoPreciosEuros.add(2.0f);
		
		//Para cada posición en el Arraylist de euros, realizamos la operación y el resultado se añade a la lista Dolares
		for (float valor : listadoPreciosEuros) {
			valor = valor * 1.2f;
			listadoPreciosDolares.add(valor);
		}
		
		//para comprobar que esta correcto. El enunciado no pide redondear así que no uso Math.ceil o floor, lo dejo como sale
		System.out.println(listadoPreciosDolares);

	}

}
