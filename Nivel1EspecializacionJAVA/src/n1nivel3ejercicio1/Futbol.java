package n1nivel3ejercicio1;

public class Futbol extends Noticia {

	private String competicion;
	private String club;
	private String jugador;
	private int puntuacion;
	private int precio;

	public Futbol(String titular, String competicion, String club, String jugador) {

		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;

		puntuacion = 5;
		precio = 300;
		if (competicion.contains("champions")) {
			puntuacion += 3;
			if (competicion.contains("liga")) {
				puntuacion += 2;
				if (club.contains("madrid") || club.contains("barça")) {
					puntuacion += 1;
				if (jugador.contains("Torres") || jugador.contains("Benzema")) {
					puntuacion += 1;
				}
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int precioNoticia() {

		if (competicion.contains("champions")) {
			precio += 100;
			if (club.contains("madrid") || club.contains("barça")) {
				precio += 100;
			}
			if (jugador.contains("Torres") || jugador.contains("Benzema")) {
				precio += 50;
			}
		}
		return precio;
	}
}
