package n1nivel2ejercicio1;


public class N1Nivel2Ejercicio1 {

	public static void main(String[] args) {

		//Creamos la instancia de Smartphone
		Smartphone iphone = new Smartphone ("iphone", "seis");
		
		//llamamos a los método desde la instancia (no son metodos static)
		iphone.LLamar(""
				+ "+34123456789");
		System.out.println("");
		iphone.Alarma();
		System.out.println("");
		iphone.Fotografiar();
		}
	  
	}


