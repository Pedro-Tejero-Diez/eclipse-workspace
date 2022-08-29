package herencia;

public class F1 extends Noticia{
	
	private String escuderia;

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
		super.puntuacion=4;
		super.precio = 100;
	}	

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getPuntuacion() {
		if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
			puntuacion += 2;
		}
		return puntuacion;
	}

	public int precioNoticia() {

			if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
				precio += 50;
			}
		
		return precio;
	}

}
