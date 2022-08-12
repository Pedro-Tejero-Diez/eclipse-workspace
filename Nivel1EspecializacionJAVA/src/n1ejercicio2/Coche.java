package n1ejercicio2;

public class Coche {

	private static final String marca = "SEAT";
	private static String modelo;
	private final int potencia;

	public Coche() {
		potencia = 1500;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void Acelerar() {
		System.out.println("Estoy acelerando");
		System.out.println("");
	}

	public static void Frenar() {
		System.out.println("Estoy Frenando");
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Coche   "+marca+"\n Modelo "+modelo+" \n potencia=" + potencia+"\n";
	}

}
