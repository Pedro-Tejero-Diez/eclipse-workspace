package n1nivel3ejercicio1;

public class Moto {
	
	private String equipo;
	private int puntuacion;
	private int precio;

	public Moto(String titular, String equipo) {
		super();
		this.equipo = equipo;
		
		puntuacion = 3;
		precio = 100;
		if (equipo.contains("Honda") || equipo.contains("Yamaha")) {
			puntuacion += 3;
		}
	}	

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int precioNoticia() {

			if (equipo.contains("Honda") || equipo.contains("Yamaha")) {
				precio += 50;
			}
		
		return precio;
	}


}

