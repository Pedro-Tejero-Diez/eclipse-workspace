package ejercicio2;

public class S01T01N01 {

	public static void main(String[] args) {
		//primero creamos objetos de la clase coche y vemos qué tienen
				Coche mustang = new Coche(500);
				Coche cabrio = new Coche (700);
				System.out.println(mustang);
				System.out.println(cabrio);		
				
				//como el método Frenar es static, se tiene que llamar desde la clase y no desde el objeto instanciado
				Coche.Frenar();
				
				//El metodo Acelerar no es estático y por lo tanto se tiene que llamar desde una instancia de la clase coche
				mustang.Acelerar();
				cabrio.Acelerar();
				
				
				/*El único parámetro que no es final es el modelo y por lo tanto se puede cambiar. 
				 * pero como es estático tiene que ser desde la clase y no desde la instancia
				 * y eso hace que cuando se cambia,se cambie para todos los objetos de la clase
				 */
				Coche.setModelo("horses");
				
				System.out.println(mustang);
				System.out.println(cabrio);		
				
				Coche.setModelo("jaguar");
				System.out.println(mustang);
				System.out.println(cabrio);	

	}

}
