package ejercicio1;

import java.util.List;

public class Venta {

	protected List<Producto> listado;
	protected int sumaTotal = 0;

	public Venta(List<Producto> listado) {

		this.listado = listado;

	}

	public List<Producto> getListado() {
		return listado;
	}

	public void setListado(List<Producto> listado) {
		this.listado = listado;
	}

	public int calcularTotal() throws vendaBuidaException {

		if (listado.size() == 0) {

			throw new vendaBuidaException("Para hacer una venta, primero tienes que añadir productos");
		} else {

			for (int i = 0; i < listado.size(); i++) {
				sumaTotal += listado.get(i).getPrecio();

			}
			return sumaTotal;
		}
	}
}
