package ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

public class Cine {
	static Scanner sc = new Scanner(System.in);
	private static int numeroFilas;
	private static int numeroButacas;
	private GestionButaca gestion;

	public Cine() {

		gestion = new GestionButaca();
		pedirDatosIniciales();

	}

	public void iniciar() throws excepcionFilaIncorrecta, excepcionAsientoIncorrecto, ExcepcionNombrePersonaIncorrecto {
		boolean salir = false;
		do {
			switch (menu()) {
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				salir = true;
				break;
			case 1:
				mostrarButacas();
				break;
			case 2:
				mostrarButacasPersona();
				break;
			case 3:
				reservarButaca();
				break;
			case 4:
				anularReserva();
				break;
			case 5:
				try {
					anularReservaPersona();
				} catch (ExcepcionNombrePersonaIncorrecto e) {
					e.printStackTrace();
				}
				break;
			}
		} while (!salir);

	}

	public byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;
		do {
			System.out.println("Escoja la opción deseada:");

			System.out.println("\n1. Mostrar todas las butacas reservadas\n"
					+ "2. Mostrar las butacas reservadas por una persona\n" + "3. Reservar una butaca\n"
					+ "4. Anular la reserva de una butaca\n" + "5. Anular todas las reservas de una persona\n"
					+ "0. salir");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);

		return opcion;

	}

	public void mostrarButacas() {
		if (gestion.getButacas().isEmpty()) {
			System.out.println("No hay ninguna butaca reservada");
		} else
			System.out.println(gestion.getButacas().toString());

	}

	public void mostrarButacasPersona() throws ExcepcionNombrePersonaIncorrecto {

		String nombre = introducirPersona();
		String buffer = "";
		for (int i = 0; i < gestion.getButacas().size(); i++) {
			if (nombre.equals(gestion.getButacas().get(i).getNombre())) {
				buffer = gestion.getButacas().get(i).getNombre();
				System.out.println(gestion.getButacas().get(i));
			}
		}
		if (buffer.equals("")) {
			System.out.println("No se encuentra el nombre en la base de datos\n");
		}
	}

	public void reservarButaca() throws excepcionFilaIncorrecta, excepcionAsientoIncorrecto, ExcepcionNombrePersonaIncorrecto {

		int numeroFila = introducirFila();
		int numeroAsiento = introducirAsiento();
		String nombre = introducirPersona();

		Butaca butaca = new Butaca(nombre, numeroFila, numeroAsiento);

		try {
			gestion.añadirButaca(butaca);

		} catch (ExcepcionButacaOcupada e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void anularReserva() {
		try {
			int fila = introducirFila();
			int asiento = introducirAsiento();
			gestion.eliminarButaca(fila, asiento);
		} catch (excepcionFilaIncorrecta e) {
			System.out.println(e.getMessage());
		} catch (excepcionAsientoIncorrecto e) {
			System.out.println(e.getMessage());
		} catch (excepcionButacaLibre e) {
			System.out.println(e.getMessage());
		}
	}

	public void anularReservaPersona() throws ExcepcionNombrePersonaIncorrecto{
		
		String buffer = "";
		String nombre = introducirPersona();

		Iterator<Butaca> listado = gestion.getButacas().iterator();
		
		while (listado.hasNext()) {
			Butaca b = listado.next();
			if (nombre.equals(b.getNombre())) {
				listado.remove();
				buffer = "eliminado";
			}
		}
		if (buffer.equals("")) {
			System.out.println("Ese nombre no existe en la base de datos");
		}

	}

	public void pedirDatosIniciales() {
		System.out.println("Introduzca numero de filas: ");
		int numeroFilas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca numero de butacas: ");
		int numeroButacas = sc.nextInt();
		sc.nextLine();

		Cine.numeroFilas = numeroFilas;
		Cine.numeroButacas = numeroButacas;
	}

	public int introducirFila() throws excepcionFilaIncorrecta {
		System.out.println("Introduzca Numero Fila: ");
		int fila = sc.nextInt();
		sc.nextLine();
		if (fila < 1 || fila > Cine.numeroFilas) {
			throw new excepcionFilaIncorrecta("La fila introducida no existe");
		}

		return fila;
	}

	public int introducirAsiento() throws excepcionAsientoIncorrecto {
		System.out.println("Introduzca Numero Asiento: ");
		int asiento = sc.nextInt();
		sc.nextLine();
		if (asiento < 1 || asiento > Cine.numeroButacas) {
			throw new excepcionAsientoIncorrecto("El Asiento introducido no existe");
		}

		return asiento;
	}

	public String introducirPersona()  throws ExcepcionNombrePersonaIncorrecto {
		System.out.println("Introduzca Nombre persona: ");
		String nombre = sc.nextLine();
		if (nombre.matches(".*\\d.*")) {
			throw new ExcepcionNombrePersonaIncorrecto("No se admiten numeros en el nombre");
		}
		return nombre;
	}

}
