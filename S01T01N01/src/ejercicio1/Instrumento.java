package ejercicio1;

public abstract class Instrumento {
	
	private String Nombre;
	private int Precio;
	//bloque estatico para señalar cuándo se carga la clase madre
	static {
		System.out.println("He cargado la clase instrumento\n");
	}
	//bloque de inicialización que se cargará cada vez que se instancia un objeto de la madre o hijas
	{
		System.out.println("Estoy creando un instrumento\n");
	}
	
	public Instrumento (String Nombre, int Precio ) {
		this.Nombre = Nombre;
		this.Precio = Precio;
	}
	
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getPrecio() {
		return Precio;
	}


	public void setPrecio(int precio) {
		Precio = precio;
	}


	public abstract void Tocar ();
	
	

}
