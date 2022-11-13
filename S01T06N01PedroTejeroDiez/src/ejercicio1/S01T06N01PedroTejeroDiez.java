package ejercicio1;

public class S01T06N01PedroTejeroDiez {

	public static void main(String[] args) {

		Integer number1 = 1;
		Integer number2 = 2;
		Integer number3 = 3;

		String linea1 = "Hola";
		String linea2 = "mundo";
		String linea3 = "mundial";

		//pruebas de orden de los objetos en el constructor
		NoGenericMethods box1 = new NoGenericMethods(number1, number2, number3);

		System.out.println(box1);

		NoGenericMethods box2 = new NoGenericMethods(number3, number2, number1);

		System.out.println(box2);

		NoGenericMethods box3 = new NoGenericMethods(number2, number1, number3);

		System.out.println(box3);
		
		
		//pruebas de orden de los objetos en el constructor con el otro tipo de objetos
		NoGenericMethods caja1 = new NoGenericMethods(linea1, linea2, linea3);

		System.out.println(caja1);

		NoGenericMethods caja2 = new NoGenericMethods(linea2, linea3, linea1);

		System.out.println(caja2);

		NoGenericMethods caja3 = new NoGenericMethods(linea3, linea1, linea2);

		System.out.println(caja3);
		
		//prueba para ver si se pueden mezclar diferentes tipos de objetos en el constructor
		
		NoGenericMethods caja4 = new NoGenericMethods(linea3, number1, linea2);

		System.out.println(caja4);
	}

}
