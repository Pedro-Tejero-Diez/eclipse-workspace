package n1ejercicio2;

public class Coche {

	private static final String marca = "SEAT";
	private static String modelo;
	private final int potencia;
	private int valor;

	/*pongo un valor en el constructor para demostrar que la potencia es una variable constante 
	 * solo para el objeto al no ser static, es decir, cada instancia puede tener una potencia
	 * diferente pero que es fija y no se puede cambiar para ese objeto (DUDA: si no ponemos setter
	 * para un parámetro, ¿¿obtenemos el mismo resultado?
	 */
	public Coche(int valor) {
		potencia = valor+500;
		
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
