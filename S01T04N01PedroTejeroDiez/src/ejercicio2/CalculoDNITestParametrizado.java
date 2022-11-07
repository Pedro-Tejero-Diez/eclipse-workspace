package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDNITestParametrizado {
	//añado las anotaciones necesarias para indicar que es un test parametrizado y de dónde sacaremos los parámetros
	@ParameterizedTest
	@MethodSource("getData")
	void letraCorrectaTest(char expected, int numero) {

		CalculoDNI numeroDNI = new CalculoDNI();
		char resultado = numeroDNI.letraCorrecta(numero);

		assertEquals(expected, resultado);

	}
	//este método es el que proveera los 10 argumentos del test de prueba 
	public static List<Object[]> getData() {
		return Arrays.asList(new Object[][] { { 'Z', 12345678 }, { 'X', 25647816 }, { 'N', 47851236 },
			{ 'C', 58462547 }, { 'Y', 45213659 }, { 'Y', 23658726 }, { 'C', 36598425 }, { 'N', 65873415 },
			{ 'V', 97841235 }, { 'V', 69854743 } });
	}

}
