package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MesesTest {
	//esta clase va a poner a prueba el metodo crearListaOrdenada() de la clase Meses realizando los tests solicitados
	@Test
	void sizeMesestest() {
		//creamos un objeto de la clase para poder ejectuar el metodo que queremos probar
		Meses lista = new Meses(null);
		//ahora creamos un array de meses desordenado para alimentar el método a prueba
		List<String> mesesDesordenada = new ArrayList<String>();
		mesesDesordenada.add("agosto");
		mesesDesordenada.add("febrero");
		mesesDesordenada.add("marzo");
		mesesDesordenada.add("junio");
		mesesDesordenada.add("abril");
		mesesDesordenada.add("enero");
		mesesDesordenada.add("diciembre");
		mesesDesordenada.add("julio");
		mesesDesordenada.add("septiembre");
		mesesDesordenada.add("mayo");
		mesesDesordenada.add("octubre");
		mesesDesordenada.add("noviembre");
		//con los datos creados, ya podemos poner a prueba el test, en este caso, el tamaño que debe tener el listado final
		int resultado = lista.crearListaOrdenada(mesesDesordenada).size();
		int esperado = 12;
		assertEquals(resultado, esperado);

	}

	@Test
	void notNullMesestest() {

		Meses lista = new Meses(null);

		List<String> mesesDesordenada = new ArrayList<String>();
		mesesDesordenada.add("agosto");
		mesesDesordenada.add("febrero");
		mesesDesordenada.add("marzo");
		mesesDesordenada.add("junio");
		mesesDesordenada.add("abril");
		mesesDesordenada.add("enero");
		mesesDesordenada.add("diciembre");
		mesesDesordenada.add("julio");
		mesesDesordenada.add("septiembre");
		mesesDesordenada.add("mayo");
		mesesDesordenada.add("octubre");
		mesesDesordenada.add("noviembre");
		
		assertTrue(lista.crearListaOrdenada(mesesDesordenada) != null);
		//con los datos creados, ya podemos poner a prueba el test, en este caso, que el listado final no sea nulo

	}

	@Test
	void posicionCorrectaMesestest() {

		Meses lista = new Meses(null);

		List<String> mesesDesordenada = new ArrayList<String>();
		mesesDesordenada.add("agosto");
		mesesDesordenada.add("febrero");
		mesesDesordenada.add("marzo");
		mesesDesordenada.add("junio");
		mesesDesordenada.add("abril");
		mesesDesordenada.add("enero");
		mesesDesordenada.add("diciembre");
		mesesDesordenada.add("julio");
		mesesDesordenada.add("septiembre");
		mesesDesordenada.add("mayo");
		mesesDesordenada.add("octubre");
		mesesDesordenada.add("noviembre");

		assertTrue(lista.crearListaOrdenada(mesesDesordenada).get(7).equals("agosto"));
		// en este caso, que el listado final contenga el mes agosto en la posición 8 del listado (7 del array)
	}

}
