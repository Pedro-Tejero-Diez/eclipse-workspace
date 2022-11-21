package ejercicio1;

import java.util.InputMismatchException;

public class S01T02N02PedroTejeroDiez {

	public static void main(String[] args) {
		Boolean error = true;

		while (error) {
			try {
				System.out.println("tu nombre es: " + Entrada.llegirString("Introduce tu nombre: "));
				
				error = false;
				
			} catch (Exception e) {
				System.out.print(e.getMessage());
				}
			}
		error = true;
		while (error)	try {
			System.out.println("¿Eres Mayor de edad?: " + Entrada.llegirSiNo("Introduce S/N: "));
			error = false;
			}
		
		catch (Exception e) {
			System.out.print(e.getMessage());
			}
		error = true;
		while (error)	try {
			System.out.println("tu edad es: " + Entrada.leerInt("Introduce tu edad: "));
			error = false;
			}
		
		catch (InputMismatchException e) {
			System.out.print("Introduce el numero en el formato correcto (sin puntos o comas)"+e);
			}
		error = true;
		while (error)	try {
			System.out.println("tu altura es: " + Entrada.leerFloat("Introduce tu Altura: "));
			error = false;
			}
		
		catch (InputMismatchException e) {
			System.out.print("Introduce la altura en el formato correcto (con un punto para separar los decimales)"+e);
			}
		error = true;
		while (error)	try {
				System.out.println("tu sexo es: " + Entrada.llegirChar("Introduce tu sexo: "));
				error = false;
				}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
			


}


