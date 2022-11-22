package ejercicio1;

import java.util.InputMismatchException;

public class S01T02N02PedroTejeroDiez {

	public static void main(String[] args) {
		
		Boolean error2 = true;
		String mayor = "";
		String nombre = null;
		int edad = 0;
		char sexo = ' ';
		float altura = 0.0f;
		
		while (error2) {
			try {
				if (nombre == null) {
					nombre = Entrada.llegirString("Introduce tu nombre: ");
				}
				if (mayor == "") {
					if (Entrada.llegirSiNo("¿Eres mayor de edad? (+intro): ")) {
						mayor = "Eres mayor de edad";
					} else {
						mayor = "NO eres mayor de edad";
					}
				}
				if (edad == 0) {
					
					edad = Entrada.leerInt("Introduce tu edad(+intro): ");
				}
				if (altura == 0) {
					altura = Entrada.leerFloat("Introduce tu Altura(+intro): ");
				}
				if (sexo == ' ') {
					sexo = Entrada.llegirChar("Introduce tu sexo(+intro): ");

				}
				
				System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nAltura: " + altura + "\nsexo: " + sexo
						+ "\n" + mayor);
				
				error2 = false;
			}
		
		
		
		catch (InputMismatchException e) {
				System.out.print("Introduce el numero en el formato correcto: " + e + "\n");

			}

			catch (Exception e) {
				System.out.print(e.getMessage() + "\n");
			}

		}

	}
}
