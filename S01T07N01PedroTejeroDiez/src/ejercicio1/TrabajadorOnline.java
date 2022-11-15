package ejercicio1;

public class TrabajadorOnline extends Trabajador {

	private final double WIFI = 200;

	public TrabajadorOnline(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);
	}
	
	public double calcularSou(double numeroHoras) {

		double sou = numeroHoras *precioHora + WIFI;

		return sou;
	}
}
