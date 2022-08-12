package n1nivel2ejercicio1;

public class Telefono {
	private String marca;
	private String modelo;
	
	public Telefono (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void LLamar (String numero) {
		System.out.println("Se está llamando al número: "+numero+" desde el terminal "+marca+" Modelo "+modelo);
	}

}
