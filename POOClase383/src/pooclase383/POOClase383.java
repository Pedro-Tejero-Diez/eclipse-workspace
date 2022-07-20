package pooclase383;

import java.util.ArrayList;
import java.util.Scanner;

public class POOClase383 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Fernando", "lopez");
		Cliente cliente2 = new Cliente("Maria", "jimenez");
		Cliente cliente3 = new Cliente("Ilunion", "Perez");

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);

		boolean sortir = false;
		int posicion;
		do {
			switch (menu()) {
			case 1:
				posicion = buscarCliente(clientes);
				crearCliente(clientes, posicion);
				verClientes(clientes);
				break;
			case 2:
				eliminarCliente(clientes);
				verClientes(clientes);
				break;
			case 3:
				crearCuentaCliente(clientes);
				verClientes(clientes);
				break;
			case 4:
				ingresarSaldoCuentaCliente(clientes);
				verClientes(clientes);
				break;
			case 5:
				retirarSaldoCuentaCliente(clientes);
				verClientes(clientes);
				break;

			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

		System.out.println(clientes);
	}

	private static int menu() {

		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\n******MENÚ PRINCIPAL*****");
			System.out.println("1. Opció 1. Crear cliente");
			System.out.println("2. Opció 2.Dar de Baja cliente");
			System.out.println("3. Opció 3.Crear Cuenta Cliente");
			System.out.println("4. Opció 4.Ingresar Euros en Cuenta Cliente");
			System.out.println("5. Opció 5.Retirar Euros de Cuenta Cliente");
			System.out.println("0. Sortir de l'aplicació.\n");
			System.out.println("Escoja una opción: ");
			opcio = sc.nextByte();
			sc.nextLine();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escoja una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;

	}

	public static int buscarCliente(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca nombre cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido cliente");
		String lastName = sc.nextLine();
		boolean encontrado = false;
		int posicion = -1;
		int i = 0;
		int size = clientes.size();
		while (i < size && !encontrado) {
			if (clientes.get(i).getName().equalsIgnoreCase(name)
					&& clientes.get(i).getLastName().equalsIgnoreCase(lastName)) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		return posicion;
	}

	private static Cliente buscarCliente(ArrayList<Cliente> clientes, String name, String lastName) {
		int size = clientes.size(), i = 0;
		Cliente clienteBuscado = null;
		while (i < size && clienteBuscado == null) {
			if (clientes.get(i).getName().equalsIgnoreCase(name)
					&& clientes.get(i).getLastName().equalsIgnoreCase(lastName)) {
				clienteBuscado = clientes.get(i);
			}
			i++;
		}
		return (clienteBuscado);
	}

	public static void crearCliente(ArrayList<Cliente> clientes, int posicion) {
		if (posicion == -1) {
			System.out.println("El cliente NO se encuentra en la base de datos, a continucación introduzca los datos:");
			System.out.println("Introduzca Nombre cliente a añadir");
			String name = sc.nextLine();
			System.out.println("Introduzca Apellido cliente a añadir");
			String lastName = sc.nextLine();
			Cliente cliente = new Cliente(name, lastName);
			clientes.add(cliente);
			System.out.println("El cliente " + name + "  " + lastName + " ha sido añadido a nuestra base de datos\n");
		} else
			System.out.println("Este cliente ya se encuentra en nuestra base de datos");
	}

	public static void eliminarCliente(ArrayList<Cliente> clientes) {

		System.out.println("Introduzca Nombre Cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido Cliente");
		String lastName = sc.nextLine();
		if (buscarCliente(clientes, name, lastName) == null) {
			System.out.println("El cliente " + name + "  " + lastName + " NO está en nuestra base de datos\n");
		} else {
			System.out
					.println("El cliente " + name + "  " + lastName + " ha sido eliminado de nuestra base de datos\n");

			clientes.remove(buscarCliente(clientes, name, lastName));

		}
	}

	public static void crearCuentaCliente(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca Nombre Cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido Cliente");
		String lastName = sc.nextLine();
		Cliente cliente = buscarCliente(clientes, name, lastName);

		if (cliente == null) {
			System.out.println("El cliente " + name + "  " + lastName + " NO está en nuestra base de datos\n");
			System.out.println("Deberá crear primero el cliente (opción 1 del menu principal)\n");
		} else {
			System.out.println("Va a crear una cuenta para " + name + "  " + lastName);
			System.out.println("Introduzca número de cuenta: \n");

			int numeroCuenta = sc.nextInt();
			sc.nextLine();
			int numeroCuentaCliente = buscarCuentaCliente(cliente, numeroCuenta);
			if (numeroCuentaCliente == -1) {
				System.out.println("SE va a crear la cuenta para el cliente");
				numeroCuentaCliente = numeroCuenta;
				Cuenta cuenta = new Cuenta(numeroCuentaCliente, 0);
				cliente.agregarCuenta(cuenta);
			} else {
				System.out.println("Este numero de cuenta ya existe para este cliente");
			}

		}
	}

	public static int buscarCuentaCliente(Cliente cliente, int numeroCuenta) {
		ArrayList<Cuenta> cuentas = cliente.getCuentas();
		int size = cuentas.size(), i = 0;
		int cuentaBuscada = -1;
		while (i < size && cuentaBuscada == -1) {
			if (cuentas.get(i).getNumCuenta() == numeroCuenta) {
				cuentaBuscada = i;
			}
			i++;
		}
		return cuentaBuscada;
	}

	public static void ingresarSaldoCuentaCliente(ArrayList<Cliente> clientes) {

		System.out.println("Introduzca Nombre Cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido Cliente");
		String lastName = sc.nextLine();
		Cliente cliente = buscarCliente(clientes, name, lastName);

		if (cliente == null) {
			System.out.println("El cliente " + name + "  " + lastName + " NO está en nuestra base de datos\n");
			System.out.println("Deberá crear primero el Cliente (opción 1 del menu principal)\n");
		} else {
			System.out.println("Va a ingresar dinero a: " + name + "  " + lastName);
			System.out.println("Introduzca el número de cuenta donde quiere ingresarlo: \n");
			int numeroCuenta = sc.nextInt();
			sc.nextLine();
			int numeroCuentaCliente = buscarCuentaCliente(cliente, numeroCuenta);

			if (numeroCuentaCliente == -1) {
				System.out.println("Debe Crear la cuenta para el cliente. Opción 3 del menu principal");

			} else {
				System.out.println("Introduzca el numero de euros que quiere ingresar");
				int numeroEuros = sc.nextInt();
				cliente.getCuentas().get(numeroCuentaCliente).ingresar(numeroEuros);
			}
		}
	}
	
	public static void retirarSaldoCuentaCliente(ArrayList<Cliente> clientes) {

		System.out.println("Introduzca Nombre Cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido Cliente");
		String lastName = sc.nextLine();
		Cliente cliente = buscarCliente(clientes, name, lastName);

		if (cliente == null) {
			System.out.println("El cliente " + name + "  " + lastName + " NO está en nuestra base de datos\n");
			System.out.println("Deberá crear primero el cliente (opción 1 del menu principal)\n");
		} else {
			System.out.println("Va a retirar dinero a: " + name + "  " + lastName);
			System.out.println("Introduzca el número de cuenta donde quiere retirar: \n");
			int numeroCuenta = sc.nextInt();
			sc.nextLine();
			int numeroCuentaCliente = buscarCuentaCliente(cliente, numeroCuenta);

			if (numeroCuentaCliente == -1) {
				System.out.println("Debe Crear la cuenta para el cliente. Opción 3 del menu principal");

			} else {
				System.out.println("Introduzca el numero de euros que quiere retirar");
				int numeroEuros = sc.nextInt();
				cliente.getCuentas().get(numeroCuentaCliente).retirar(numeroEuros);
			}
		}
	}


	public static void verClientes(ArrayList<Cliente> clientes) {
		int size = clientes.size();
		for (int i = 0; i < size; i++) {
			System.out.println(clientes.get(i));
		}
	}
}
