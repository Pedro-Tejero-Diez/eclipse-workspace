package nivel1especializacionejercicio3;

import java.util.ArrayList;
import herencia.Noticia;

public class Redactor {
		
		private String nombre;
		private final String DNI;
		private static int sueldo = 1500;
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		
		public Redactor (String nombre, String DNI) {
			this.nombre = nombre;
			this.DNI = DNI;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public static int getSueldo() {
			return sueldo;
		}

		public static void setSueldo(int sueldo) {
			Redactor.sueldo = sueldo;
		}

		public ArrayList<Noticia> getNoticias() {
			return noticias;
		}

		public void setNoticia(Noticia noticia) {
			noticias.add(noticia);
		}

		public String getDNI() {
			return DNI;
		}

		@Override
		public String toString() {
			return "Redactor -> nombre=" + nombre + "\" DNI=" + DNI +
					"Sueldo = "+sueldo+"\" noticias=" + noticias.toString();
		}

		

	}