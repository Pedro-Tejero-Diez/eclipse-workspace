package herencia;

	public abstract class Noticia {
		/*para que las clases hijas puedan acceder a las variables y no haya conflictos
		 * con el resto de clases del proyecto, colocamos la super clase y sus hijas en un
		 * paquete "herencia" y asi podemos hacer las variables "protected" sin conflictos*/
		protected String titular;
		protected String texto;
		protected int puntuacion;
		protected int precio;

		/*Para crear una notica (clase super) sólo pedimos el titular en el constructor 
		 * porque el resto de parámetros ya los sabemos y los parámetros de cada clase hija
		 * los pediremos en el constructor de esa clase*/
		public Noticia(String titular) {
			
			this.titular = titular;
			this.texto ="";
			this.puntuacion=0;
			this.precio=0;
		}


		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}
		/*Además de hacer abstract el método precioNoticia, como indica el enunciado, necesitamos también que lo sea
		 * el método de calcular la puntuación puesto que cuando buscamos la noticia no sabemos
		 *  a priori el tipo de noticia que buscamos y de esta manera, como el método está en 
		 * la clase madre (en forma abstract), lo puedo usar haciendo referencia a la clase madre. Podría hacer lo mismo
		 * haciéndolo static pero como cada clase hija tiene diferente forma de calcular la puntuación
		 * creo que es mejor así*/
		public abstract int getPuntuacion();
		
		public abstract int precioNoticia();
		
	}

