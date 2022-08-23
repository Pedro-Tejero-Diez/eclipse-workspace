package n1nivel3ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class N1Nivel3Ejercicio1 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Redactor> redactores = new ArrayList<Redactor>();
	static ArrayList<Noticia> noticias = new ArrayList<Noticia>();

	public static void main(String[] args) {

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
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

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
			System.out.println("5. Opció 6. Calcular puntuación Noticia");
			System.out.println("5. Opció 7. Calcular precio Noticia");
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

	public static Redactor buscarRedactor() {
			Redactor redactor = null;
			System.out.println("Introduzca el Nombre del Redactor/a: ");
			boolean encontrado = false;
			int i=0;
			String nombre = sc.nextLine();
			while (i<redactores.size() && !encontrado ) {
				if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)) {
					redactor = redactores.get(i);
					encontrado = true;
				}
				i++;
			}
			return redactor;
	}
	public static Noticia buscarNoticia() {
		Noticia noticia = null;
		System.out.println("Introduzca el Titular de la Noticia: ");
		boolean encontrado = false;
		int i=0;
		String titular = sc.nextLine();
		while (i<noticias.size() && !encontrado ) {
			if (noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
				noticia = noticias.get(i);
				encontrado = true;
			}
			i++;
		}
		return noticia;
	}

	public static void crearRedactor() {
		
		if (buscarRedactor()==null) {
			System.out.println("Introduzca el Nombre del Redactor/a: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el DNI del redactor/a: ");
			String DNI = sc.nextLine();
			Redactor redactor = new Redactor(nombre, DNI);
			redactores.add(redactor);
			System.out.println("El redactor: " + nombre + " con DNI " + DNI + " ha sido creado");
		} else {
			System.out.println("El nombre ya existe en nuestra base de datos");
		}
	}

	public static void eliminarRedactor() {

		if (buscarRedactor()==null) {
			System.out.println("El redactor no se encuentra en la base de datos");
		} else {
			redactores.remove(buscarRedactor());
			System.out.println("El redactor ha sido eliminado de la base de datos");
		}
	
	}
	public static void calcularPuntuacion() {
		if (buscarNoticia()==null) {
			System.out.println("La noticia no figura en la base de datos");
		} else {
			System.out.println("La puntuación de la noticia es: "+buscarNoticia().getTitular());
		}
	}

}
