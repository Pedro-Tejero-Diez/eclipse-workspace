package pooclase2ejerciciolibre;

import java.util.ArrayList;

public class Persona {
	
	String name;
	String lastName;
	String dni;
	
	public Persona (String name, String lastName, String dni) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDni() {
		return dni;
	}
	public boolean checkDni (String dni, ArrayList<Character> listado) {
		String dniMay = dni.toUpperCase();
		char letraDni = dniMay.charAt(8);
		String dniSinletra = dni.substring(0, 8);
		int dniNum = Integer.parseInt(dniSinletra);
		char letraCorrecta = listado.get(dniNum%23);
		boolean correcto;
		if (letraDni == letraCorrecta) {
			correcto = true;
		} else {
			correcto = false;				
			}
		return correcto;
		}

	@Override
	public String toString() {
		return "---->  Persona [name=" + name + ", lastName=" + lastName + ", dni=" + dni + "]";
	}
	}
