package ejercicio1;

public class S01T06N02PedroTejeroDiez {

	public static void main(String[] args) {

		Persona p1 = new Persona("Peter", "Parker", 35);
		int i = 25;
		String linea = "buenos dias";

		GenericMethods<Object> genericMethods = new GenericMethods<Object>();

		// con los metodos genericos puedo usar raw types y no la clase wrap como en no
		// genericos
		genericMethods.generico(p1, i, linea);

		// prueba con diferente orden de los argumentos
		genericMethods.generico(linea, i, p1);
	}

}
