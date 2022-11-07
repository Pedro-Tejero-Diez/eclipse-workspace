package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Meses {

	private List<String> meses;
	
	public Meses (List<String> meses) {
		
		this.meses = meses;
		
	}

	
	public List<String> crearListaOrdenada (List<String>meses) {
		this.meses = meses;
		
		//el argumento del metodo será un listado de meses desordenados y este método lo ordenará y devolverá el listado ordenado
		List<String> listadoMeses = new ArrayList<String>(12);
		
		int pos1= meses.indexOf("enero");
		listadoMeses.add(meses.get(pos1));
		int pos2= meses.indexOf("febrero");
		listadoMeses.add(meses.get(pos2));
		int pos3= meses.indexOf("marzo");
		listadoMeses.add(meses.get(pos3));
		int pos4= meses.indexOf("abril");
		listadoMeses.add(meses.get(pos4));
		int pos5= meses.indexOf("mayo");
		listadoMeses.add(meses.get(pos5));
		int pos6= meses.indexOf("junio");
		listadoMeses.add(meses.get(pos6));
		int pos7= meses.indexOf("julio");
		listadoMeses.add(meses.get(pos7));
		int pos8= meses.indexOf("agosto");
		listadoMeses.add(meses.get(pos8));
		int pos9= meses.indexOf("septiembre");
		listadoMeses.add(meses.get(pos9));
		int pos10= meses.indexOf("octubre");
		listadoMeses.add(meses.get(pos10));
		int pos11= meses.indexOf("noviembre");
		listadoMeses.add(meses.get(pos11));
		int pos12= meses.indexOf("diciembre");
		listadoMeses.add(meses.get(pos12));
	
		return listadoMeses;
		
	}
}
