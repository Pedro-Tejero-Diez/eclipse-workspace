package n1ejercicio1;

import javax.swing.JOptionPane;

public class N1Ejercicio1 {

	public static void main(String[] args) {

		String opcion = (JOptionPane.showInputDialog("Introduce cero para llamar a un miembro estatico o uno para crear una instancia"));

		if (opcion.equals("cero")) {
			//Aqui pedimos el valor de la variable estatica "valor" y eso ya llama a la clase instrumento sin instanciar nada

			System.out.println("La variable \"valor\" es ="+Viento.valor);

			Viento trompeta = new Viento("Trompeta", 500);
			trompeta.Tocar();

			Cuerda guitarra = new Cuerda("Guitarra", 200);
			guitarra.Tocar();

			Percusion tambor = new Percusion("tambor", 400);
			tambor.Tocar();
		} else {
			/*Aqui instanciamos solamente un objeto de la clase hija para comprobar que se carga 
			 * la clase (ejecuta bloque estatico) y después al instanciar el objeto, aparece primero
			 * el bloque de inicialización
			 */			
			Viento tuba = new Viento("tuba", 1500);
			System.out.println(tuba);
		}

	}

}
