package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class S01T02N01TEJERODIEZPEDROmain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Primero creamos el array list y los productos que añadiremos al mismo desde la consola
		ArrayList<Producto> listado = new ArrayList<Producto>();
		
		System.out.println("Quieres introducir productos? S/N ");
		String fin = sc.nextLine();
		
		while (!fin.equalsIgnoreCase("N")) {
			
			System.out.println("Introduce el nombre del producto: ");
			String n1 = sc.nextLine();
			System.out.println("Introduce el precio del producto: ");
			int p1 = sc.nextInt();
			sc.nextLine();
			
			Producto pr1 = new Producto (n1, p1);
			listado.add(pr1);
			
			System.out.println("Quieres seguir introduciendo productos? S/N ");
			fin = sc.nextLine();
		}

		//instanciamos un objeto de la clase venta para poder obtener la suma total de lo introducido
		Venta venta = new Venta(listado);
			
		// en el bloque de codigo dentro de la palabra clave try definimos qué hacer con los datos introducidos
		try {
		
			if (listado.size()>0) {
				//còdigo para crear la posibilidad de un error "index out of bounds"
				System.out.println("Introduce el índice del producto del que quieres información: ");
				int i = sc.nextInt();
				sc.nextLine();
				
				System.out.println("la información del producto con indice: "+i+" es la siguiente\n"+
				listado.get(i));
				

				
			} else
			/*codigo para crear la posibilidad de generar la excepción personalizada. 
			 * Si no hay productos saltará la excepción y será captada por el bloque 
			 * catch correspondiente.
			 */
			System.out.println("La venta total de los productos introducidos es: "+venta.calcularTotal()+" euros");
		
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Indice del producto fuera del limite del listado: JAVA error: " + e.getMessage());
		} 
		
		catch (vendaBuidaException e) {
			System.out.println("ERROR: "+e.getMessage()+"\n");
		} 
		
		finally {
			sc.close();
			if (listado.size()==0) {
				System.out.println("El listado de productos está vacío");
			} else System.out.println("Programa finalizado");
		}
	}
}
