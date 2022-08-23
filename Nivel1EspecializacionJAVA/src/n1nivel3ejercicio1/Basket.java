package n1nivel3ejercicio1;

public class Basket {
	private String competicion;
	private String club;
	private int puntuacion;
	private int precio;

	public Basket(String titular, String competicion, String club) {
		super();
		this.competicion = competicion;
		this.club = club;
		puntuacion = 4;
		precio = 250;
		if (competicion.contains("euroliga")) {
			puntuacion += 3;
			if (competicion.contains("ACB")) {
				puntuacion += 2;
				if (club.contains("madrid") || club.contains("barça")) {
					puntuacion += 1;
			}
		}
	}
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
		return puntuacion;
	}

	public int precioNoticia() {

		if (competicion.contains("euroliga")) {
			precio += 75;
			if (club.contains("madrid") || club.contains("barça")) {
				precio += 75;
			}
		}
		return precio;
	}
}

