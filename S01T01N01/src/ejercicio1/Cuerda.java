package ejercicio1;

public class Cuerda extends Instrumento {
	
	public Cuerda (String Nombre, int Precio) {
		
	super(Nombre, Precio);

	}
	
	public void Tocar () {
		System.out.println("Esta sonando un instrumento de Cuerda\n");
	}

	@Override
	public String toString() {
		return "Cuerda Nombre=" + getNombre() + ", Precio=" + getPrecio()+"\n";
	}
	

}
