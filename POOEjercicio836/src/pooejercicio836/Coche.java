package pooejercicio836;

public class Coche {
	private int potencia;
	private int velMaxima;
	private String color;
	private int precioMercado;

	public Coche(int potencia, int velMaxima, String color, int precioMercado) {
		this.potencia = potencia;
		this.velMaxima = velMaxima;
		this.color = color;
		this.precioMercado = precioMercado;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public String getColor() {
		return color;
	}

	public int getPrecioMercado() {
		return precioMercado;
	}

	@Override
	public String toString() {
		return "Coche --> potencia=" + potencia + ", velMaxima=" + velMaxima + ", color=" + color + ", precioMercado="
				+ precioMercado + "\n";
	}

}
