package ejercicio2;

public class S01T07N01PedroTejeroDiez {

	@SuppressWarnings("deprecation")
	//al añadir esta anotación, los avisos que había asociados a la anotación @Deprecated han desaparecido
	
	public static void main(String[] args) {

		Trabajador T1 = new TrabajadorPresencial("piter", "parker", 15);
		Trabajador T2 = new TrabajadorOnline("manolo", "bakes", 14);
		
		//la anotación @Deprecation debe estar en el metodo de la clase madre para funcionar. 
		//a pesar de la alarma, el programa corre normalmente. Sólo avisa durante el desarrollo

		System.out.println("el sueldo del trabajador presencial es: " + T1.calcularSueldo(160) + "\n\n");

		System.out.println("el sueldo del trabajador on line es: " + T2.calcularSueldo(160) + "\n\n");

	}

}
