package herencia;

public class Moto extends Noticia {
	
	private String equipo;

	public Moto(String titular, String equipo) {
		super(titular);
		this.equipo=equipo;
		super.puntuacion=3;
		super.precio=100;
		}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getPuntuacion() {
		if (equipo.contains("Honda") || equipo.contains("Yamaha")) {
			puntuacion += 3;
		}
		return puntuacion;
	}

	public int precioNoticia() {

			if (equipo.contains("Honda") || equipo.contains("Yamaha")) {
				precio += 50;
			}
		
		return precio;
	}


}