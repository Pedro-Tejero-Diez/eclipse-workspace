package ejercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class S01T03N01ejercicio3PedroTejeroDiez {

	public static void main(String[] args) throws IOException {
		// declararmos el hashmap que vamos a usar
		HashMap<String, String> map = new HashMap<String, String>();

		// preparamos un buffered reader para poder leer la información del archivo de
		// las capitales
		FileReader f = new FileReader(
				"C:\\Users\\pedro\\eclipse-workspace\\S01T03N01ejercicio3PedroTejeroDiez\\src\\ejercicio3\\countries.txt");
		BufferedReader bf = new BufferedReader(f);

		try {
			
			 /* creamos e inicializamos el array de strings que nos servirá para almacenar 
			 * temporalmente los pares de claves/valores antes de pasarlos al HashMap
			 */
			String[] linea = { "", "" };

			while (linea.length > 1) {
				linea = bf.readLine().split("([ ])");
				int size = linea.length;
				if (size > 1) {
					map.put(linea[size - 1], linea[size - 2]);
				}
			}
		} catch (IOException e) {
			System.out.println("El archivo no existe: \n" + e.getMessage());

		} finally {
			bf.close();
		}
		/* Una vez hemos construido el HashMap, pasamos a realizar el codigo del juego
		 * creando un arraylist con las claves del mapa (capitales), un objeto de la clase random para generar numeros aleatorios y un objeto
		 * Scanner para introducir datos desde la consola además de las variables para contar
		 * las veces que se juega y almacenar el número de aciertos del jugador
		 */
		ArrayList<String> claves = new ArrayList<String>(map.keySet());
		int contador = 0;
		int aciertos = 0;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Bienvenido/a, " + nombre + "!");

		while (contador < 10) {
			/* Aplicamos el metodo random sobre el arraylist de las capitales, lo que nos dará una 
			 * aleatoriamente y de ella obtenemos el valor que es el pais que usamos en la pregunta. 
			 * Si la entrada del usuario coincide con la capital suma un punto, sino no.
			 */
			String claveAzar = claves.get(rnd.nextInt(claves.size()));
			String valor = map.get(claveAzar);
			System.out.println(" Escribe abajo la capital de: " + valor + ":");
			String input = sc.nextLine();
			if (input.equals(claveAzar)) {
				System.out.println("Enhorabuena! Has sumado un punto!");
				aciertos++;
			} else {
				System.out.println("Lo siento, respuesta incorrecta, la capital de " + valor + " es: " + claveAzar);
			}
			contador++;
		} sc.close();
		
		/*Una vez finalizado el juego (10 ciclos), pasamos el nombre y el número de aciertos a un fichero
		 * para lo cual creamos un nuevo objeto de la clase File que crea el archivo y después los objetos 
		 * que nos permiten escribir en ese archivo
		 */
		File archivo = new File(
				"C:\\Users\\pedro\\eclipse-workspace\\S01T03N01ejercicio3PedroTejeroDiez\\src\\ejercicio3\\clasificacion.txt");
		FileWriter fichero = new FileWriter(archivo);
		PrintWriter pw = new PrintWriter(fichero);

		pw.println("Nombre = " + nombre + "\nPuntuación = " + aciertos);
		System.out.println("\nPuntos = " + aciertos + " Nombre = " + nombre
				+ "\n\n Tu resultado se ha guardado en el archivo: clasificacion.txt");
		pw.close();
		

	}
}
