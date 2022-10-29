package ejercicio1;

import java.util.ArrayList;

public class Venta {

	protected ArrayList<Producto> listado;
	protected int sumaTotal = 0;

	public Venta(ArrayList<Producto> listado) {

		this.listado = listado;

	}

	public ArrayList<Producto> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Producto> listado) {
		this.listado = listado;
	}

	public int calcularTotal() throws vendaBuidaException {
		
		if (listado.size()==0) {
			
			throw new vendaBuidaException("Para hacer una venta, primero tienes que añadir productos");
		} else {
		
			for (int i = 0; i < listado.size(); i++) {
				sumaTotal += listado.get(i).getPrecio();

			}
		return sumaTotal;
	}
	}
}
