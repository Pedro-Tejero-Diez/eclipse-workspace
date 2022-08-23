package n1nivel3ejercicio1;

public class F1 {
	
	private String escuderia;
	private int puntuacion;
	private int precio;

	public F1(String titular, String escuderia) {
		super();
		this.escuderia = escuderia;
		
		puntuacion = 4;
		precio = 100;
		if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
			puntuacion += 2;
		}
	}	

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int precioNoticia() {

			if (escuderia.contains("Ferrari") || escuderia.contains("Mercedes")) {
				precio += 50;
			}
		
		return precio;
	}


}
