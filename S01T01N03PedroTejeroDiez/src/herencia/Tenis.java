package herencia;

public class Tenis extends Noticia{
	
	private String competicion;
	private String tenistas;

	public Tenis(String titular, String competicion, String tenistas) {
		super(titular);
		this.competicion = competicion;
		this.tenistas = tenistas;
		super.puntuacion = 4;
		super.precio = 150;
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
		
		if (tenistas.contains("Federer") || tenistas.contains("Nadal") || tenistas.contains("Djokovic")) {
			puntuacion += 4;
		}
		return puntuacion;
	}

	public int precioNoticia() {

			if (tenistas.contains("Federer") || tenistas.contains("Nadal") || tenistas.contains("Djokovic")) {
				precio += 100;
			}
		
		return precio;
	}

}

