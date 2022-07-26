package herencias;

public class Piloto extends Trabajador {

	private int altura;
	private int peso;
	
	
	public Piloto(String nombre, String apellido, byte edad, byte antiguedad, int altura, int peso) {
		super(nombre, apellido, edad, antiguedad);
		this.altura = altura;
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int sueldo () {
		final int PELIGROSIDAD = 50000;
		int sueldo = SUELDO_BASE+(super.antiguedad*10000)+PELIGROSIDAD;
		return sueldo;
	}

	@Override
	public String toString() {
		return "Piloto --> Nombre ="+super.getNombre()+", Apellido ="+super.apellido+", Altura= "+ altura + ", Peso=" + peso + ", Sueldo()=" + sueldo();
	}

}



