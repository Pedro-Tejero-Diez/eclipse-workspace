package ejercicio1;

import javax.swing.JOptionPane;

public class S01T01N01 {

	public static void main(String[] args) {
		String opcion = (JOptionPane.showInputDialog("Introduce cero para llamar a un miembro estatico "
				+ "o uno para crear objetos"));

		if (opcion.equals("cero") || opcion.equals("0")) {
			/*Aqui pedimos el valor de la variable estatica "valor" y
			 *  eso ya llama a la clase instrumento sin instanciar nada
			 *  por lo que aparecerá el mensaje del bloque estático primero
			 */

			System.out.println("La variable \"valor\" es ="+Viento.valor);
		
			
		} else {
			/* cada vez que crea un instrumento ejecuta el bloque de inicialización
			 *  e imprimira el mensaje pero no vuelve a cargar la clase por eso el 
			 *  mensaje del bloque estático no se carga de nuevo
			 */
			Viento trompeta = new Viento("Trompeta", 500);
			trompeta.Tocar();
			System.out.println(trompeta);
		

			Cuerda guitarra = new Cuerda("Guitarra", 200);
			guitarra.Tocar();
			System.out.println(guitarra);
	

			Percusion tambor = new Percusion("tambor", 400);
			tambor.Tocar();
			System.out.println(tambor);
			
			Viento tuba = new Viento("tuba", 1500);
			tuba.Tocar();
			System.out.println(tuba);

	}

}
	
	
}

