package n1nivel3ejercicio1;

public class Tenis {
	
	private String competicion;
	private String tenistas;
	private int puntuacion;
	private int precio;

	public Tenis(String titular, String competicion, String tenistas) {
		super();
		this.competicion = competicion;
		this.tenistas = tenistas;
		puntuacion = 4;
		precio = 150;
		if (tenistas.contains("Federer") || tenistas.contains("Nadal") || tenistas.contains("Djokovic")) {
			puntuacion += 4;
		}
	}	


	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getTenistas() {
		return tenistas;
	}

	public void setTenistas(String tenistas) {
		this.tenistas = tenistas;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int precioNoticia() {

			if (tenistas.contains("Federer") || tenistas.contains("Nadal") || tenistas.contains("Djokovic")) {
				precio += 100;
			}
		
		return precio;
	}

}
