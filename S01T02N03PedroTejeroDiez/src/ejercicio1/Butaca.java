package ejercicio1;

public class Butaca {
	private int fila;
	private int asiento;
	private String nombre;

	public Butaca(String nombre, int fila, int asiento) {
		this.nombre = nombre;
		this.fila = fila;
		this.asiento = asiento;
	}

	public int getFila() {
		return fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean Equals(Butaca b, Butaca c) {
		boolean iguales = false;
		if (b.asiento == c.asiento && b.fila == c.fila) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return ("fila: " + fila + ", Asiento:" + asiento + ", Persona: " + nombre + "\n");
	}

}
