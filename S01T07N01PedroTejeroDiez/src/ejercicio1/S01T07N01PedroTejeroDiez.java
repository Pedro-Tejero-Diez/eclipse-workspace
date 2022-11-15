package ejercicio1;

public class S01T07N01PedroTejeroDiez {

	public static void main(String[] args) {
		
		Trabajador T1 = new TrabajadorPresencial("piter", "parker", 15);
		Trabajador T2 = new TrabajadorOnline("manolo", "bakes", 14);
		
		/* he creado la clase presencial con la anotación @Override y la online sin la anotación
		 * la diferencia ha sido que cuando he escrito el método con un tipo diferente
		 * del que había en la superclase (double), sin la anotación no ha avisado de ningún problema 
		 * y con la anotación ha señalado el error a corregir.
		 */
		
		System.out.println("el sueldo del trabajador presencial es: "+T1.calcularSou(160)+"\n\n");
		
		System.out.println("el sueldo del trabajador on line es: "+T2.calcularSou(160)+"\n\n");

	}

}
