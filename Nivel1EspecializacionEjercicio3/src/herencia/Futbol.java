package herencia;

public class Futbol extends Noticia {

	private String competicion;
	private String club;
	private String jugador;

	public Futbol(String titular, String competicion, String club, String jugador) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
		super.puntuacion = 5;
		super.precio = 300;
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
		if (competicion.contains("champions"))
			puntuacion += 3;
		if (competicion.contains("liga"))
			puntuacion += 2;
		if (club.contains("madrid") || club.contains("barça"))
			puntuacion += 1;
		if (jugador.contains("Torres") || jugador.contains("Benzema"))
			puntuacion += 1;
		return puntuacion;
	}

	public int precioNoticia() {

		if (competicion.contains("liga de campeones")) {
			precio += 100;
		}
		if (club.contains("madrid") || club.contains("barça")) {
			precio += 100;
		}
		if (jugador.contains("Torres") || jugador.contains("Benzema")) {
			precio += 50;
		}

		return precio;
	}

}