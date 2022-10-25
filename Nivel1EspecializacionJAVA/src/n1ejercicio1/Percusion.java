package n1ejercicio1;

public class Percusion extends Instrumento {
	
	public Percusion (String Nombre, int Precio) {
		
	super(Nombre, Precio);

	}
	public void Tocar () {
		System.out.println("Esta sonando un instrumento de Percusion\n");
	}
	@Override
	public String toString() {
		return "Percusión Nombre=" + getNombre() + ", Precio=" + getPrecio()+"\n";
	}
	
	

}
