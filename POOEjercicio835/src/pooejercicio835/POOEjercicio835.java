package pooejercicio835;

import java.util.Scanner;

public class POOEjercicio835 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("introduzca la posición x del circulo 1:");
		double x1 = sc.nextDouble();
		System.out.println("introduzca la posición y del circulo 1:");
		double y1 = sc.nextDouble();
		System.out.println("introduzca el RAdio del circulo 1:");
		double r1 = sc.nextDouble();
		System.out.println("introduzca la posición x del circulo 2:");
		double x2 = sc.nextDouble();
		System.out.println("introduzca la posición y del circulo2:");
		double y2 = sc.nextDouble();
		System.out.println("introduzca el RAdio del circulo 2:");
		double r2 = sc.nextDouble();
		
		Punto punto1 = new Punto(x1, y1);
		Punto punto2 = new Punto (x2, y2);
		Circulo circulo1 = new Circulo(r1, punto1);
		Circulo circulo2 = new Circulo (r2, punto2);
		
		
		System.out.println("La distancia entre los centros de los circulos es: "+circulo1.distanciaCentros(circulo2));
		
		if (circulo1.equals(circulo2)) {
			System.out.println("El circulo 1 y el circulo 2 SON iguales");
			} else
				System.out.println("El circulo 1 y el circulo 2 NO son iguales");
		
		if (!circulo1.sonConcentricos(circulo2)) {
		System.out.println("El circulo 1 y el circulo 2 NO son concentricos");
		} else
			System.out.println("El circulo 1 y el circulo 2 SON concentricos");
		
		if (circulo1.tienenIgualRadio(circulo2)) {
			System.out.println("El circulo 1 y el circulo 2 tienen la misma longitud de radio");
			} else
				System.out.println("El circulo 1 y el circulo 2 NO tienen la misma longitud del radio");
		
		if (circulo1.sonTangentes(circulo2)) {
			System.out.println("El circulo 1 y el circulo 2 SON tangentes");
			} else
				System.out.println("El circulo 1 y el circulo 2 NO son tangentes");
		
		if (circulo1.sonSecantes(circulo2)) {
			System.out.println("El circulo 1 y el circulo 2 SON secantes");
			} else
				System.out.println("El circulo 1 y el circulo 2 NO son secantes");
		
		if (circulo1.noSeTocan(circulo2)) {
			System.out.println("El circulo 1 y el circulo 2 no se tocan");
			} else
				System.out.println("El circulo 1 y el circulo 2 se tocan");
		
	}

}
