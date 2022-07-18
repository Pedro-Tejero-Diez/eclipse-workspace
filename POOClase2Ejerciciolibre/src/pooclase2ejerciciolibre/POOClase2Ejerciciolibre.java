package pooclase2ejerciciolibre;

import java.util.ArrayList;
import java.util.Scanner;

import pooclase2.Ordenador;

public class POOClase2Ejerciciolibre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, lastName, dni, tamaño;
		int i=0;
		boolean encontrado = false;
		ArrayList<Character> serieLetras = new ArrayList<Character>();
		serieLetras.add('T');
		serieLetras.add('R');
		serieLetras.add('W');
		serieLetras.add('A');
		serieLetras.add('G');
		serieLetras.add('M');
		serieLetras.add('Y');
		serieLetras.add('F');
		serieLetras.add('P');
		serieLetras.add('D');
		serieLetras.add('X');
		serieLetras.add('B');
		serieLetras.add('N');
		serieLetras.add('J');
		serieLetras.add('Z');
		serieLetras.add('S');
		serieLetras.add('Q');
		serieLetras.add('V');
		serieLetras.add('H');
		serieLetras.add('L');
		serieLetras.add('C');
		serieLetras.add('E');
		ArrayList<Persona> listado = new ArrayList<Persona>();
		
			Persona pax1 = new Persona("Pepito", "Delospalotes","012345678Z");
			
			listado.add(pax1);
		
			System.out.println("Introduzca Nombre:");
			name = sc.nextLine();
			System.out.println("Introduzca 1er Apellido:");
			lastName = sc.nextLine();
		
		do {
				System.out.println("Introduzca su DNI con letra al final");
				dni = sc.nextLine();
				if (dni.length() != 9) {
					System.out.println("Por favor introduzca un DNI valido (9 posiciones)");
				}
			} while (dni.length() != 9);
		
		if (checkDni(dni, listado) {
			
		}
		
		
		
		
			tamaño = listado.size();
			while (i<tamaño && !encontrado) {
			if (listado.get(i).getMarca().equalsIgnoreCase(marca) && listado.get(i).getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;
			}
			i++;
			}
			
			if (encontrado) {
				System.out.println("Tenemos el Modelo y Marca que está buscando");
			} else
				System.out.println("Lo sentimos, no tenemos el modelo y Marca que busca");

	}

}
