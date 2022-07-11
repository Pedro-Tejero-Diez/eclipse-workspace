package m7ejercicio7;

import java.util.Scanner;

public class M7Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String caracter;

		// entrada de datos

		System.out.println("Introduczca un numero (lado del cuadrado)");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduczca el caracter");
		caracter = sc.nextLine();

		// con los datos trabajara el metodo:

		/*esta es la solucion que encontre en la clase (Do while), más abajo está la solucion del profesor
		 * que utiliza una concatenación que se va acumulando en la variable resultat. Dijo que este metodo
		 * es mejor en javascript porque así no imprimes por pantalla todo el rato pero para JAVA
		 * es mejor usar el método print (lo que yo hice) porque no ocupa espacio de memoria la variable 
		 * y el resultado (cuadrado) no lo necesitamos más una vez terminado
		 * 
		 * } este do while fue la solución que yo encontré pero es mejor usar dos bucles
		 * for (uno dentro de otro) porque con el do while te arriesgas a que haya un
		 * bucle infinito si no lo haces bien
		 * 
		 * public static void printSquare(int x, String e){ int i=0,j; do { for (j=1; j
		 * <=x; j++) { System.out.print(e); } i++; System.out.println(); } while (i<=x);
		 */
		String resultat="";
		for (int i=1; i<=numero;i++) {
			for (int j=1; j<=numero;j++) {
				resultat += caracter;
			}
			resultat +="\n";
		}
		System.out.println(resultat);
	}
}
