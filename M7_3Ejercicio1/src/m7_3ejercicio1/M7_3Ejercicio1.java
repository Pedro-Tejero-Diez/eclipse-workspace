package m7_3ejercicio1;

import java.util.Scanner;

public class M7_3Ejercicio1 {

	public static void main(String[] args) {
		// metodo main copiado del archivo java "menu" de recursos del Moodle
		boolean sortir = false;

		do {
			switch (menu()) {
			case 1:
				isSquare();
				sortir = true;
				break;
			case 2:
				isTriangle();
				sortir = true;
				break;
			case 3:
				isRectangle();
				sortir = true;
				break;
			case 4: isCircle();
				sortir = true;
				break;

			case 0:
				System.out.println("Gràcies per utilitzar l'aplicaciò");
				sortir = true;
				break;
			}
		} while (!sortir);
	}
// metodo menu copiado de archivo menu en recursos del Moodle
	public static byte menu() {
		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1. Opciò 1 Cuadrado");
			System.out.println("2. Opciò 2 Triángulo");
			System.out.println("3. Opciò 3 Rectángulo");
			System.out.println("4. Opciò 4 Círculo");
			System.out.println("0. Sortir de l'aplicaciò.\n");
			opcio = sc.nextByte();

			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una Opciò vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;
	}

	public static void isSquare() {
		Scanner sc = new Scanner(System.in);
		int lado, area;

		System.out.println("Introduzca el lado del cuadrado");
		lado = sc.nextInt();
		area = lado * lado;
		System.out.println("El área del cuadrado es: " + area + " m2");
	}

	public static void isTriangle() {
		Scanner sc = new Scanner(System.in);
		float base, altura, area;

		System.out.println("Introduzca la base del triángulo");
		base = sc.nextFloat();
		System.out.println("Introduzca la altura del triángulo");
		altura = sc.nextFloat();
		area = (base / 2) * altura;
		System.out.println("El área del triangulo es: " + area + " m2");
	}

	public static void isRectangle() {
		Scanner sc = new Scanner(System.in);
		int ladoA, ladoB, area;

		System.out.println("Introduzca la base del rectángulo");
		ladoA = sc.nextInt();
		System.out.println("Introduzca la altura del rectángulo");
		ladoB = sc.nextInt();
		area = ladoA * ladoB;
		System.out.println("El área del triangulo es: " + area + " m2");
	}

	public static void isCircle() {
		Scanner sc = new Scanner(System.in);
		final float PI = 3.1416f;
		float radio, area;

		System.out.println("Introduzca el Radio del circulo");
		radio = sc.nextInt();
		area = (float) Math.PI * (radio * radio);
		System.out.println("El área del circulo es: " + area + " m2");
	}

}
