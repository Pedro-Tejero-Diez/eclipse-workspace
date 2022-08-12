package n1ejercicio2;

public class N1Ejercicio2 {

	public static void main(String[] args) {
		
		//primero creamos un objeto de la clase coche y vemos qué tiene
		Coche mustang = new Coche();
		System.out.println(mustang);
		
		//como el método Frenar es static, se tiene que llamar desde la clase y no desde el objeto instanciado
		Coche.Frenar();
		
		//El metodo Acelerar no es estático y por lo tanto se tiene que llamar desde una instancia de la clase coche
		mustang.Acelerar();
		
		/*El único parámetro que no es final es el modelo y por lo tanto se puede cambiar. 
		 * pero como es estático tiene que ser desde la clase y no desde la instancia
		 */
		Coche.setModelo("horses");
		
		System.out.println(mustang);
	}

}
