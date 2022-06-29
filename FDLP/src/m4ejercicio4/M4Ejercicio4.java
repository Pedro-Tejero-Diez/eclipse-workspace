package m4ejercicio4;

import java.util.Scanner;

public class M4Ejercicio4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	byte mes;
	String mensaje;
	
	System.out.println("introduzca número de mes : ");
	mes = sc.nextByte();
	
	switch(mes) {
		case 1:
			mensaje = "El mes de Enero tiene 31 dias";
			break;
		case 2:
			mensaje = "El mes de Febrero tiene 28/29 dias";
			break;
		case 3:
			mensaje = "El mes de Marzo tiene 31 dias";
			break;
		case 4:
			mensaje = "El mes de Abril tiene 30 dias";
			break;
		case 5:
			mensaje = "El mes de Mayo tiene 31 dias";
			break;
		case 6:
			mensaje = "El mes de Junio tiene 30 dias";
			break;
		case 7:
			mensaje = "El mes de Julio tiene 31 dias";
			break;
		case 8:
			mensaje = "El mes de Agosto tiene 31 dias";
			break;
		case 9:
			mensaje = "El mes de Septiembre tiene 30 dias";
			break;
		case 10:
			mensaje = "El mes de Octubre tiene 31 dias";
			break;
		case 11:
			mensaje = "El mes de Noviembre tiene 30 dias";
			break;
		case 12:
			mensaje = "El mes de Diciembre tiene 31 dias";
			break;
			default:
				mensaje = "No es un número de mes";
				break;
	}
	
	System.out.println(mensaje);

	}

}
