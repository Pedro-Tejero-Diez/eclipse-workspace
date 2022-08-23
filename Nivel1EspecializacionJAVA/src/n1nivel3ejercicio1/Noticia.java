package n1nivel3ejercicio1;

public abstract class Noticia {
	
	private String titular;
	private String texto ="";
	
	public Noticia(String titular) {
		
		this.titular = titular;
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
	
	public abstract int precioNoticia();
	

}
