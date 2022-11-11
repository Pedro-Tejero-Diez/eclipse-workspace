package ejercicio5;

import java.io.Serializable;

public class Coche implements Serializable {

	/**
	 * version serializable añadida automáticamente
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private String color;

	public Coche(String marca, String color) {
		
		this.marca = marca;
		this.color = color;
	}

	public void arrancar() {
		System.out.println("Estoy Arrancando");
	}

	public void frenar() {
		System.out.println("Estoy Frenando");
	}

	public void acelerar() {
		System.out.println("Estoy acelerando");
	}

	public void girar() {
		System.out.println("Estoy Girando");
	}

	// getter and setters autogenerados con eclipse (menu izqu.source)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + "]";
	}

	}

