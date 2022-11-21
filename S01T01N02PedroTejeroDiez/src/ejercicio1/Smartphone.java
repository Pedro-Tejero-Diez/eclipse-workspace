package ejercicio1;


public class Smartphone extends Telefono implements Camara, Reloj {
	
	public Smartphone (String marca, String modelo) {
		super(marca, modelo);
	}
	
	public void Fotografiar () {
		System.out.println("Se está haciendo una foto");
		
	}
	public void Alarma () {
		System.out.println("Está sonando la Alarma");
	}
}
