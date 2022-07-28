package examenejercicio2;

import java.util.ArrayList;

public class ExamenEjercicio2 {
	/* ENUNCIADO: Donat el següent arraylist de nombres: [15,16, 19, 66, 88, 79, 97] 
	 * Crea un altre arraylist amb els nombres primers que hi ha en el primer arraylist.
	 */

	public static void main(String[] args) {
		//declaramos los arraylist que usaremos
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();

		//añadimos los numeros del enunciado al array list de numeros
		numeros.add(15);
		numeros.add(16);
		numeros.add(19);
		numeros.add(66);
		numeros.add(88);
		numeros.add(79);
		numeros.add(97);

		/*para cada posición del array list de numeros miramos si el resto de la división entre
		 * el numero y todos los que hay debajo que el es cero (si no es divisible nada más que por
		 * el y el uno, es un numero primo) 
		*/
		for (int valor : numeros) {
			int i = valor - 1;
			boolean primo = true;
			while (primo && i > 1) {
				if (valor % i == 0) {
					primo = false;
				}
				i--;
			}
			if (primo) {
				numerosPrimos.add(valor);
			}
		}
		System.out.println(numerosPrimos);
	}
}
