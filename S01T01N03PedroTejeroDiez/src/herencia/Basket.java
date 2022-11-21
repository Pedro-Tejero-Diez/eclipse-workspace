package herencia;

public class Basket extends Noticia {
	private String competicion;
	private String club;

	public Basket(String titular, String competicion, String club) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
		super.puntuacion = 4;
		super.precio = 250;
	}	



	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int getPuntuacion() {
		if (competicion.contains("euroliga")) 	puntuacion += 3;
		if (competicion.contains("ACB")) 	puntuacion += 2;
		if (club.contains("madrid") || club.contains("barça")) 	puntuacion += 1;
		
		return puntuacion;
	}

	public int precioNoticia() {

		if (competicion.contains("euroliga")) precio += 75;
		if (club.contains("madrid") || club.contains("barça")) 	precio += 75;
		
		return precio;
	}
}