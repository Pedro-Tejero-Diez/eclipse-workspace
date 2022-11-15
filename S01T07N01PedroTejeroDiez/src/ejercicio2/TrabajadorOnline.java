package ejercicio2;

public class TrabajadorOnline extends Trabajador {

	private final int WIFI = 200;

	public TrabajadorOnline(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);
	}


	public int calcularSueldo(int numeroHoras) {

		int sou = numeroHoras *precioHora + WIFI;

		return sou;
	}
}
