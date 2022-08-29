package nivel1especializacionejercicio3;

import java.util.ArrayList;
import java.util.Scanner;
import herencia.Basket;
import herencia.F1;
import herencia.Futbol;
import herencia.Moto;
import herencia.Noticia;
import herencia.Tenis;

public class Nivel1EspecializacionEjercicio3 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Redactor> redactores = new ArrayList<Redactor>();

	public static void main(String[] args) {
		// Creamos varios redactores para no tener que empezar de cero cada vez que se
		// ejecuta
		Redactor r1 = new Redactor("Pepe", "123456789J");
		Redactor r2 = new Redactor("Juan", "123456789J");
		Redactor r3 = new Redactor("Manolo", "123456789J");

		redactores.add(r1);
		redactores.add(r2);
		redactores.add(r3);
		
		// Creamos el menú con llamadas a los métodos que ejecutarán las acciones:
		boolean sortir = false;
		do {
			switch (menu()) {
			case 1:
				crearRedactor();
				break;
			case 2:
				eliminarRedactor();
				break;
			case 3:
				introducirNoticia();

				break;
			case 4:
				eliminarNoticia();
				break;
			case 5:
				mostrarNoticia();
				break;
			case 6:
				calcularPuntuacion();
				break;
			case 7:
				calcularPrecio();
				break;
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

	// creamos el menu que saldrá por pantalla con las opciones a ejecutar
	private static int menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 7;

		do {
			System.out.println("\n******MENÚ PRINCIPAL*****");
			System.out.println("1. Opció 1. Introducir Redactor/a");
			System.out.println("2. Opció 2. Dar de Baja Redactor/a");
			System.out.println("3. Opció 3. Introducir Noticia a Redactor/a");
			System.out.println("4. Opció 4. Eliminar Noticia");
			System.out.println("5. Opció 5. Mostrar Noticias por Redactor/a");
			System.out.println("6. Opció 6. Calcular puntuación Noticia");
			System.out.println("7. Opció 7. Calcular precio Noticia");
			System.out.println("0. Salir de la aplicación.\n");
			System.out.println("Escoja una opción: ");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	/*A continuación, los métodos que ejecuttarán las acciones. Primero creamos métodos
	 * que utilizaremos en los otros métodos como buscar redactor o buscar noticia */
	public static Redactor buscarRedactor(String nombre) {

		Redactor redactor = null;
		boolean encontrado = false;
		int i = 0;

		while (i < redactores.size() && !encontrado) {
			if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				redactor = redactores.get(i);
				encontrado = true;
			}
			i++;
		}
		return redactor;
	}

	public static Noticia buscarNoticia(String titular) {
		Noticia noticia = null;
		boolean encontrado = false;
		int i = 0;
		while (i < redactores.size() && !encontrado) {
			int j = 0;
			while (j < redactores.get(i).noticias.size() && !encontrado) {
				if (redactores.get(i).noticias.get(j).getTitular().equalsIgnoreCase(titular)) {
					noticia = redactores.get(i).noticias.get(j);
					encontrado = true;
				}
				j++;
			}
			i++;
		}
		return noticia;
	}

	public static void crearRedactor() {
		System.out.println("Introduzca el Nombre del Redactor/a: ");
		String nombre = sc.nextLine();
		Redactor redactor = buscarRedactor(nombre);
		if (redactor == null) {
			System.out.println("Introduzca el DNI del redactor/a: ");
			String DNI = sc.nextLine();
			redactor = new Redactor(nombre, DNI);
			redactores.add(redactor);
			System.out.println("El redactor: " + nombre + " con DNI " + DNI + " ha sido creado");
		} else {
			System.out.println("El nombre ya existe en nuestra base de datos");
		}
	}

	public static void eliminarRedactor() {
		System.out.println("Introduzca el Nombre del Redactor/a: ");
		String nombre = sc.nextLine();
		Redactor redactor = buscarRedactor(nombre);
		if (redactor == null) {
			System.out.println("El redactor no se encuentra en la base de datos");
		} else {
			redactores.remove(redactor);
			System.out.println("El redactor ha sido eliminado de la base de datos");
		}

	}

	public static void introducirNoticia() {
		System.out.println("Introduzca el Nombre del Redactor/a: ");
		String nombre = sc.nextLine();
		Redactor redactor = buscarRedactor(nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe");
		} else {

			System.out.println("Introduzca el Titular de la Noticia: ");
			String titular = sc.nextLine();
			Noticia noticia = buscarNoticia(titular);
			;
			if (noticia != null) {
				System.out.println("la noticia ya se encuentra en la base de datos");
			} else {

				System.out.println("Introduzca el tipo de noticia: 1.futbol, 2.Basket, 3.Tenis, 4.Formula1, 5.Motos:");
				byte tipo = sc.nextByte();
				sc.nextLine();
				switch (tipo) {
				case 1:
					System.out.println("introduzca Competicion: ");
					String competicion = sc.nextLine();
					System.out.println("introduzca Club: ");
					String club = sc.nextLine();
					System.out.println("introduzca jugador: ");
					String jugador = sc.nextLine();
					Futbol futbol = new Futbol(titular, competicion, club, jugador);
					System.out.println("introduzca texto Noticia: ");
					String textofutbol = sc.nextLine();
					futbol.setTexto(textofutbol);
					redactor.setNoticia(futbol);

					break;
				case 2:
					System.out.println("introduzca Competicion: ");
					String liga = sc.nextLine();
					System.out.println("introduzca Club: ");
					String equipo = sc.nextLine();
					Basket basket = new Basket(titular, liga, equipo);
					System.out.println("introduzca texto Noticia: ");
					String textobasket = sc.nextLine();
					basket.setTexto(textobasket);
					redactor.setNoticia(basket);
					break;
				case 3:
					System.out.println("introduzca Competicion: ");
					String compet = sc.nextLine();
					System.out.println("introduzca Club: ");
					String tenistas = sc.nextLine();
					Tenis tenis = new Tenis(titular, compet, tenistas);
					System.out.println("introduzca texto Noticia: ");
					String textotenis = sc.nextLine();
					tenis.setTexto(textotenis);
					redactor.setNoticia(tenis);
					break;
				case 4:
					System.out.println("introduzca Escuderia: ");
					String escuderia = sc.nextLine();
					F1 formula1 = new F1(titular, escuderia);
					System.out.println("introduzca texto Noticia: ");
					String textoF1 = sc.nextLine();
					formula1.setTexto(textoF1);
					redactor.setNoticia(formula1);
					break;
				case 5:
					System.out.println("introduzca Equipo: ");
					String equipoGP = sc.nextLine();
					Moto moto = new Moto(titular, equipoGP);
					System.out.println("introduzca texto Noticia: ");
					String textoMoto = sc.nextLine();
					moto.setTexto(textoMoto);
					redactor.setNoticia(moto);
					break;
				default:
					System.out.println("Introduzca un numero valido");
				}
				System.out.println("La noticia ha sido creada para el redactor/a:  " + redactor.getNombre());

			}

		}
	}

	public static void eliminarNoticia() {
		System.out.println("Introduzca el Nombre del Redactor/a: ");
		String nombre = sc.nextLine();
		Redactor redactor = buscarRedactor(nombre);
		if (redactor != null) {
			System.out.println("Introduzca titular de la noticia: ");
			String titular = sc.nextLine();
			Noticia noticia = buscarNoticia(titular);
			if (noticia != null) {
				redactor.noticias.remove(noticia);
				System.out.println("La noticia ha sido eliminada del redactor: " + redactor.getNombre());
			} else {
				System.out.println("Noticia no encontrada para el redactor/a: " + redactor.getNombre());
			}
		} else
			System.out.println("Redactor/a no encontrado");
	}

	public static void mostrarNoticia() {
		System.out.println("Introduzca el Nombre del Redactor/a: ");
		String nombre = sc.nextLine();
		Redactor redactor = buscarRedactor(nombre);
		if (redactor == null || redactor.noticias.size() == 0) {
			System.out.println("Redactor/a o noticia no encontrado");
		} else {
			System.out.println(redactor.getNombre());
			for (int i = 0; i < redactor.noticias.size(); i++) {
				System.out.println(redactor.noticias.get(i).getTitular() + " Texto noticia: "
						+ redactor.noticias.get(i).getTexto());
			}
		}
	}

	public static void calcularPuntuacion() {
		System.out.println("Introduzca titular de la noticia: ");
		String titular = sc.nextLine();
		Noticia noticia = buscarNoticia(titular);
		if (noticia != null) {
			System.out.println("La puntuacion de esta noticia es: " + noticia.getPuntuacion());
		} else {
			System.out.println("La noticia no se haya en la base de datos");
		}
	}

	public static void calcularPrecio() {
		System.out.println("Introduzca titular de la noticia: ");
		String titular = sc.nextLine();
		Noticia noticia = buscarNoticia(titular);
		if (noticia != null) {
			System.out.println("El precio de esta noticia es: " + noticia.precioNoticia());
		} else
			System.out.println("La noticia no se haya en la base de datos");

	}

}
