package ejercicio2;

public class TrabajadorPresencial extends Trabajador {

	private static int gas = 500;

	public TrabajadorPresencial(String nombre, String apellido, int precioHora) {

		super(nombre, apellido, precioHora);
	}


	public int calcularSueldo(int numeroHoras) {

		int sou = numeroHoras * precioHora + gas;

		return sou;
	}
}
