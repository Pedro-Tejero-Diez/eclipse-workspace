package ejercicio2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Restaurant implements Comparable<Restaurant>{

	private String nombre;
	private int puntuacion;

	public Restaurant(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public boolean checkLista(HashSet<Restaurant> lista, Restaurant rest) {

		Boolean existe = false;

		for (Restaurant r : lista) {
			if (r.getNombre().equalsIgnoreCase(rest.getNombre())) {
				if (r.getPuntuacion() == rest.getPuntuacion()) {
					existe = true;
				}
			}
		}

		return existe;
	}

	@Override
	public String toString() {
		return "Restaurant= " + nombre + ", puntuacion=" + puntuacion + "\n";
	}

	@Override
	public int compareTo(Restaurant a) {
		
		a.getPuntuacion();

		return 0;
	}

}
