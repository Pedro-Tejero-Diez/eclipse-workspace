package m5ejercicio4variacion1;

import java.util.Scanner;

public class M5Ejercicio4Variacion1 {
	
				public static void main(String[] args) {
				
					Scanner sc = new Scanner(System.in);
					byte aleatorio = (byte) Math.ceil((Math.random() * 10));
					int numero;
					byte contador = 0;
					
					do {
						
					System.out.println("Introduce un número entre 0 y 10 : ");
					numero = sc.nextByte();
					contador++;
					
					
					if (numero < aleatorio) {
						System.out.println("Tu numero es mas pequeño que la incognita");
					}
						else if (numero > aleatorio){
							System.out.println("Tu numero es mayor que la incognita");
						}
					}
					while (numero != aleatorio && contador <= 3);
					
					if (numero == aleatorio) {
				
							System.out.println("Enhorabuena, has acertado tras "+ contador +" intentos :) el número era "+aleatorio);
					}
					else {
					
							System.out.println("Has utilizado demasiados intentos, el número era "+aleatorio);
					
				}

				}
}


