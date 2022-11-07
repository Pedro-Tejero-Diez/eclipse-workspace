package ejercicio2;

import java.util.ArrayList;

public class CalculoDNI {

	private int documento;

	public CalculoDNI() {

	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public char letraCorrecta(int documento) {
		// creamos el array de caracteres con las letras asignadas de la página del DNI
		ArrayList<Character> serieLetras = new ArrayList<Character>();
		serieLetras.add('T');
		serieLetras.add('R');
		serieLetras.add('W');
		serieLetras.add('A');
		serieLetras.add('G');
		serieLetras.add('M');
		serieLetras.add('Y');
		serieLetras.add('F');
		serieLetras.add('P');
		serieLetras.add('D');
		serieLetras.add('X');
		serieLetras.add('B');
		serieLetras.add('N');
		serieLetras.add('J');
		serieLetras.add('Z');
		serieLetras.add('S');
		serieLetras.add('Q');
		serieLetras.add('V');
		serieLetras.add('H');
		serieLetras.add('L');
		serieLetras.add('C');
		serieLetras.add('E');
		// el resto de la división del número de documento entre 23, nos da la posición de la letra que corresponda
		return serieLetras.get(documento % 23);

	}

}
