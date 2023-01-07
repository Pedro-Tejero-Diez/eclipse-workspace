package ejercicio1;

import java.util.ArrayList;

public class GestionButaca {

	private ArrayList<Butaca> butacas;

	public GestionButaca() {

		butacas = new ArrayList<Butaca>();

	}

	public ArrayList<Butaca> getButacas() {

		return butacas;
	}

	public void añadirButaca(Butaca b) throws ExcepcionButacaOcupada {
		if (buscarButaca(b) == -1) {
			butacas.add(b);
		} else
			throw new ExcepcionButacaOcupada("Esta butaca está ocupada");

	}

	public void eliminarButaca(int fila, int asiento) throws excepcionButacaLibre {
		boolean libre = false;
		int i = 0;
		do {
			if (butacas.get(i).getFila() == fila) {
				if (butacas.get(i).getAsiento() == asiento) {
					butacas.remove(i);
					System.out.println("Butaca Eliminada");
					libre = true;
				}
			}
			i++;
		} while ( i < butacas.size() || !libre);
		if (!libre && (i==butacas.size()-1)) {
			throw new excepcionButacaLibre("Esta butaca esta libre");
		}
	}

	public int buscarButaca(Butaca b) {
		int posicion = -1;
		int fila = b.getFila();
		int asiento = b.getAsiento();
		int i = 0;
		for (i = 0; i < butacas.size(); i++) {
			if (fila == butacas.get(i).getFila()) {
				if (asiento == butacas.get(i).getAsiento()) {
					posicion = i;
				}
			}
		}
		return posicion;

	}
}
