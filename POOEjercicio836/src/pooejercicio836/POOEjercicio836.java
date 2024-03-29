package pooejercicio836;

import java.util.ArrayList;
import java.util.Scanner;

import herencias.Mecanico;
import herencias.Piloto;
import herencias.Trabajador;

public class POOEjercicio836 {
	// usare la entrada de datos a menudo en este programa por eso lo hago static
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * crearé tres escuderias para lo cual necesito un array list de escuderías y
		 * después uno de coches por cada una. El ArrayList de trabajadores de cada una,
		 * lo llenaré a través del método Main, los otros los hago a mano pero los
		 * declaro porque los usare como parámetros
		 */
		ArrayList<Escuderia> escuderias = new ArrayList<Escuderia>();
		ArrayList<Coche> coches1 = new ArrayList<Coche>();
		ArrayList<Trabajador> trabajadores1 = new ArrayList<Trabajador>();
		ArrayList<Coche> coches2 = new ArrayList<Coche>();
		ArrayList<Trabajador> trabajadores2 = new ArrayList<Trabajador>();
		ArrayList<Coche> coches3 = new ArrayList<Coche>();
		ArrayList<Trabajador> trabajadores3 = new ArrayList<Trabajador>();
		// Primero instanciamos los objetos coche
		Coche coche11 = new Coche(2000, 250, "negro", 100000);
		Coche coche12 = new Coche(2500, 300, "amarillo", 200000);
		Coche coche21 = new Coche(2000, 200, "verde", 150000);
		Coche coche22 = new Coche(2750, 275, "granate", 75000);
		Coche coche31 = new Coche(1800, 225, "blanco", 125000);
		Coche coche32 = new Coche(3000, 375, "rojo", 300000);
		// los array list de coches (uno por escuderia con dos coches cada uno):
		coches1.add(coche11);
		coches1.add(coche12);
		coches2.add(coche21);
		coches2.add(coche22);
		coches3.add(coche31);
		coches3.add(coche32);

		// Arraylists de escuderías SIN trabajadores
		Escuderia escuderia1 = new Escuderia("España", 3000000, coches1, trabajadores1);
		Escuderia escuderia2 = new Escuderia("Francia", 6000000, coches2, trabajadores2);
		Escuderia escuderia3 = new Escuderia("Inglaterra", 7500000, coches3, trabajadores3);
		// los añado al ArrayList de escuderias que se llama escuderias
		escuderias.add(escuderia1);
		escuderias.add(escuderia2);
		escuderias.add(escuderia3);

		// ya tengo los array list, comienzo el programa en sí. Lo primero el switch y a
		// continuación el menu de
		// opciones según lo determinado en el switch

		boolean sortir = false;
		do {
			switch (menu()) {
			case 1:
				crearTrabajador(escuderias);
				break;
			case 2:
				eliminarTrabajador(escuderias);
				break;
			case 3:
				mostrarTrabajador(escuderias);
				break;
			case 4:
				mostrarEscuderia(escuderias);
				break;
			case 5:
				mostrarCoche(escuderias);
				break;
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

	private static int menu() {

		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\n******MENÚ PRINCIPAL*****");
			System.out.println("1. Opció 1. Dar de Alta Trabajador");
			System.out.println("2. Opció 2. Dar de Baja Trabajador");
			System.out.println("3. Opció 3. Mostrar Trabajador");
			System.out.println("4. Opció 4. Mostrar Escuderia");
			System.out.println("5. Opció 5. Mostrar Coche");
			System.out.println("0. Sortir de l'aplicació.\n");
			System.out.println("Escoja una opción: ");
			opcio = sc.nextByte();
			sc.nextLine();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;
	}

// este metodo creará un trabajador en la escuderia que se le indique 
	public static void crearTrabajador(ArrayList<Escuderia> escuderias) {

		// primero comprueba si la escuderia esta en la base de datos

		System.out.println("introduzca Pais Escuderia");
		String pais = sc.nextLine();
		Escuderia escuderia = buscarEscuderia(escuderias, pais);
		if (escuderia == null) {
			System.out.println("La escuderia no existe en la base de datos");
		} else {
			// si existe, pedimos los datos del trabajador que queremos introducir
			System.out.println("Introduzca nombre Trabajador");
			String nombre = sc.nextLine();
			System.out.println("Introduzca apellido Trabajador");
			String apellido = sc.nextLine();

			// chequeamos que el trabajador no exista ya en esa escuderia
			Trabajador trabajador = buscarTrabajador(nombre, apellido, escuderia);

			if (trabajador != null) {
				System.out.println("El trabajador ya esta dado de alta en esta escuderia");
			} else {
				System.out.println("Introduzca edad trabajador: ");
				byte edad = sc.nextByte();
				System.out.println("Introduzca antiguedad Trabajador: ");
				byte antiguedad = sc.nextByte();
				sc.nextLine();
				byte opcio;
				final byte MINIMO = 1;
				final byte MAXIMO = 2;

				// hasta aqui tenemos los datos comunes a trabajadores, ahora debemos saber que
				// clase de trabajador querems crear para ello utilizo un mini menu similar al
				// de arriba
				do {
					System.out.println("Introduzca tipo Trabajador: \n opcion 1. Piloto \n Opción 2 Mecánico");
					opcio = sc.nextByte();
					sc.nextLine();
					if (opcio < MINIMO || opcio > MAXIMO) {
						System.out.println("Escoge una opción valida");
					}
				} while (opcio < MINIMO || opcio > MAXIMO);
				switch (opcio) {
				case 1:
					System.out.println("Introduzca Altura en cm");
					int altura = sc.nextInt();
					System.out.println("Introduzca Peso en kg");
					int peso = sc.nextInt();
					Piloto piloto = new Piloto(nombre, apellido, edad, antiguedad, altura, peso);
					escuderia.getTrabajadores().add(piloto);
					break;
				case 2:
					System.out.println("Tienes estudios superiores? S/N");
					String input = sc.nextLine();
					input = input.toLowerCase();
					boolean estudios = false;
					if (input.charAt(0) == 's') {
						estudios = true;
					}
					Mecanico mecanico = new Mecanico(nombre, apellido, edad, antiguedad, estudios);
					escuderia.getTrabajadores().add(mecanico);
					break;
				}
				System.out.println("El trabajador " + nombre + "  " + apellido
						+ " ha sido dado de alta en la escuderia de " + pais);
			}
			System.out.println(escuderia);
		}
	}

	/*
	 * este metodo de más abajo, eliminará el trabajador buscando en todas las
	 * escuderias utilizando el metodo sobrecargado, eliminarTrabajador (con
	 * parametro arraylist al final)
	 */

	public static void eliminarTrabajador(ArrayList<Escuderia> escuderias) {

		System.out.println("Introduzca nombre Trabajador");
		String nombre = sc.nextLine();
		System.out.println("Introduzca apellido Trabajador");
		String apellido = sc.nextLine();
		if (buscarTrabajador(nombre, apellido, escuderias) != null) {
			Escuderia escuderia = buscarTrabajador(nombre, apellido, escuderias);
			Trabajador trabajador = buscarTrabajador(nombre, apellido, escuderia);
			escuderia.getTrabajadores().remove(trabajador);
			System.out.println("El trabajador ha sido dado de baja de la escuderia de:  " + escuderia.getPais());
		} else {
			System.out.println("El trabajador no existe en la base de datos");
		}
	}

	// este metodo busca el trabajador que queremos en todas las bases de datos y te
	// dice dónde esta y sus datos asociados

	public static void mostrarTrabajador(ArrayList<Escuderia> escuderias) {
		System.out.println("Introduzca nombre Trabajador");
		String nombre = sc.nextLine();
		System.out.println("Introduzca apellido Trabajador");
		String apellido = sc.nextLine();
		if (buscarTrabajador(nombre, apellido, escuderias) != null) {
			Escuderia escuderia = buscarTrabajador(nombre, apellido, escuderias);
			Trabajador trabajador = buscarTrabajador(nombre, apellido, escuderia);
			System.out.println("El trabajador que buscas está en la escuderia de " + escuderia.getPais()
					+ " y estos son sus datos:");
			System.out.println(trabajador);
		} else {
			System.out.println("El trabajador no existe en la base de datos");
		}
	}

	public static void mostrarEscuderia(ArrayList<Escuderia> escuderias) {
		System.out.println("introduzca Pais Escuderia");
		String pais = sc.nextLine();
		if (buscarEscuderia(escuderias, pais) != null) {
			System.out.println(buscarEscuderia(escuderias, pais));
		} else
			System.out.println("La escudería indicada no existe en la base de datos");
	}

	// este metodo mostrará los coches de una escuderia concreta
	public static void mostrarCoche(ArrayList<Escuderia> escuderias) {
		System.out.println("introduzca Pais Escuderia");
		String pais = sc.nextLine();
		Escuderia escuderia = null;
		if (buscarEscuderia(escuderias, pais) != null) {
			escuderia = buscarEscuderia(escuderias, pais);
			System.out.println(escuderia.getCoches());
		} else {
			System.out.println("esta escuderia no existe en la base de datos");
		}
	}

	// metodo para buscar un trabajador en una escuderia concreta
	public static Trabajador buscarTrabajador(String Nombre, String Apellido, Escuderia escuderia) {

		Trabajador trabajador = null;
		int size = escuderia.getTrabajadores().size();
		int i = 0;
		while (trabajador == null && i < size) {
			if (size > 0 && (escuderia.getTrabajadores().get(i).getNombre().equalsIgnoreCase(Nombre)
					&& escuderia.getTrabajadores().get(i).getApellido().equalsIgnoreCase(Apellido))) {
				trabajador = escuderia.getTrabajadores().get(i);
			} // la condicion size > 0 es para que no de error cuando la lista esta vacia
			i++;
		}
		return trabajador;
	}

	/*
	 * metodo (sobrecargado) para buscar un trabajador en todas las escuderias la
	 * diferncia con el anterior es el parámetro "escuderias" que es el Array de
	 * escuderias y no un objeto "escuderia" (he sobrecargado el metodo
	 * "buscar trabajador", para que pueda buscar o bien,dentro de una escuderia
	 * concreta, como cuando queremos crear un trabajador o en todas como cuando
	 * buscamos un trabajador concreto)*\
	 */
	public static Escuderia buscarTrabajador(String Nombre, String Apellido, ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		int size = escuderias.size();
		int i = 0, j = 0;
		while (escuderia == null && i < size) {// primer while para seleccionar las diferentes escuderias del Array
			Escuderia escuderia2 = escuderias.get(i);// cogemos el objeto escuderia posicion "i" en el array
			int size2 = escuderia2.getTrabajadores().size();// cogemos el tamaño del array trabajadores de esa escuderia
			if (size2 > 0) {
				/* si no hay ningun trabajador en esa escuderia devuelve null, si no, busca el
				 * trabajador en el array trabajadores de la escuderia que estamos con un
				 * segundo while del que saldra o al terminar de recorrer el array o si
				 * encuentra el trabajador
				 */
				while (j < size2 && escuderia == null) {
					if (escuderia2.getTrabajadores().get(j).getNombre().equalsIgnoreCase(Nombre)
							&& escuderia2.getTrabajadores().get(j).getApellido().equalsIgnoreCase(Apellido)) {
						escuderia = escuderia2;
					}
					j++;
				}
				i++;
				j = 0;
			}
		}
		return escuderia;
	}

	public static Escuderia buscarEscuderia(ArrayList<Escuderia> escuderias, String pais) {

		Escuderia escuderia = null;
		int size = escuderias.size();
		int i = 0;
		while (escuderia == null && i < size) {
			if (escuderias.get(i).getPais().equalsIgnoreCase(pais)) {
				escuderia = escuderias.get(i);
			}
			i++;
		}

		return escuderia;
	}

}
