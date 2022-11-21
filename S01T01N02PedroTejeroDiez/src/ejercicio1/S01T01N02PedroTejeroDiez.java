package ejercicio1;

public class S01T01N02PedroTejeroDiez {

	public static void main(String[] args) {
		// Creamos la instancia de Smartphone
		Smartphone iphone = new Smartphone("iphone", "seis");

		// llamamos a los métodos desde la instancia (no son metodos static)
		iphone.LLamar("+34123456789");
		System.out.println("");
		iphone.Alarma();
		System.out.println("");
		iphone.Fotografiar();

	}

}
