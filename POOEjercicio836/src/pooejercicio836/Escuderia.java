package pooejercicio836;

import java.util.ArrayList;

import herencias.Trabajador;

public class Escuderia {
	private String pais;
	private int presupuesto;
	private ArrayList<Coche> coches;
	private ArrayList<Trabajador> trabajadores;

	public Escuderia(String pais, int presupuesto, ArrayList<Coche> coches, ArrayList<Trabajador> trabajadores) {
		super();
		this.pais = pais;
		this.presupuesto = presupuesto;
		this.coches = coches;
		this.trabajadores = trabajadores;
	}

	public String getPais() {
		return pais;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	@Override
	public String toString() {
		return "Escuderia -->" + pais + ": \n presupuesto=" + presupuesto + "\n coches=" + coches + "\n trabajadores="
				+ trabajadores;
	}

}
