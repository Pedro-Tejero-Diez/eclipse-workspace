package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListadoTest {
	
	List<String> listaCosas = new ArrayList<String>();

	@Test
	void testMirarObjetoListaGeneraError() {
		
		listaCosas.add("botella");
		listaCosas.add("cazo");
		listaCosas.add("cuchara");
		listaCosas.add("mazo");
		listaCosas.add("cuchillo");
		listaCosas.add("tenedor");
		listaCosas.add("vaso");
		listaCosas.add("servilleta");
	

		Listado prueba = new Listado(listaCosas);
	
		assertThrows(IndexOutOfBoundsException.class, () -> prueba.mirarObjetoLista(8, listaCosas));
		
	}

}
