package n1ejercicio2;

public class Coche {
	//la variable marca no se puede modificar. Al ser static y final sólo se puede cambiar modificando la clase
	private static final String marca = "SEAT";
	private static String modelo = "seiscientos";
	private final int potencia;
	private int valor=0;

	/*pongo la variable valor en el constructor para poder fijar la potencia en cada instancia, ya que
	 * no se le puede dar un valor en la clase al no ser static, pero al ser final, no deja hacer setter
	 * por eso se puede modificar en cada instancia pero sólo al ser creado el objeto
	 */
	public Coche(int valor) {
	
		potencia = valor;
		
	}
	
	public static String getModelo() {
		return modelo;
	}
	/* la variable modelo al ser static se puede modificar desde la instancia 
	 * pero llamando a la clase
	 */
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
