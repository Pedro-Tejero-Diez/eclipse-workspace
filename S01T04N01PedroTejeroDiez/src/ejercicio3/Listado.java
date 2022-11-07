package ejercicio3;



import java.util.List;

public class Listado {
	
	List<String> listaCosas;
	

	public Listado(List<String> listaCosas) {
		
		this.listaCosas = listaCosas;
	}



	public String mirarObjetoLista(int posicion, List<String> listaCosas) {

		
		String objeto = listaCosas.get(posicion);
		

		return objeto;
	}
}
