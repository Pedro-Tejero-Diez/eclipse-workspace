package pooejercicio835;

public class Circulo {

	private double radio;
	private Punto coordenadasCentro;

	public Circulo(double radio, Punto coordenadasCentro) {
		this.radio = radio;
		this.coordenadasCentro = coordenadasCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Punto getCoordenadasCentro() {
		return coordenadasCentro;
	}

	public void setCoordenadasCentro(Punto coordenadasCentro) {
		this.coordenadasCentro = coordenadasCentro;
	}

	public double distanciaCentros(Circulo circulo) {
		
		// lo hago con las variables, x1, y1, etc para que no sea demasiado lioso el código
		double x1 = this.coordenadasCentro.getX();
		double x2 = circulo.getCoordenadasCentro().getX();
		double y1 = this.coordenadasCentro.getY();
		double y2 = circulo.getCoordenadasCentro().getY();

		double distancia = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));

		return distancia;
	}

	public boolean equals(Circulo circulo) {

		boolean iguales = false;
		if (this.coordenadasCentro.getX() == circulo.getCoordenadasCentro().getX()
				&& this.coordenadasCentro.getY() == circulo.getCoordenadasCentro().getY() && this.radio == circulo.getRadio()) {
			iguales = true;
		}
		return iguales;
	}

	public boolean sonConcentricos(Circulo circulo) {

		boolean concentricos = false;
		if (this.coordenadasCentro.getX() == circulo.getCoordenadasCentro().getX()
				&& this.coordenadasCentro.getY() == circulo.getCoordenadasCentro().getY()
				&& this.radio != circulo.getRadio()) {
			concentricos = true;
		}

		return concentricos;
	}

	public boolean tienenIgualRadio(Circulo circulo) {

		boolean igualRadio = false;

		if (this.radio == circulo.getRadio()) {
			igualRadio = true;
		}
		return igualRadio;
	}

	public boolean sonTangentes(Circulo circulo) {

		boolean sonTangentes = false;
		if (distanciaCentros(circulo) == (this.radio + circulo.getRadio()) && distanciaCentros(circulo) != 0) {
			sonTangentes = true;
		}
		
		return sonTangentes;
	}

	public boolean sonSecantes(Circulo circulo) {

		boolean sonSecantes = false;
		if (distanciaCentros(circulo) < (this.radio + circulo.getRadio())) {
			sonSecantes = true;
		}
		return sonSecantes;
	}

	public boolean noSeTocan(Circulo circulo) {

		boolean noSeTocan = false;
		if (distanciaCentros(circulo) > (this.radio + circulo.getRadio())) {
			noSeTocan = true;
		}
		return noSeTocan;
	}

}