package herencias;

public abstract class Edificio {

	protected String nombre;
	protected int numeroPlantas;
	protected int superficie;
	
	public Edificio(String nombre, int numeroPlantas, int superficie) {
		this.nombre = nombre;
		this.numeroPlantas = numeroPlantas;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public String limpieza () {
		
		float tiempoLimpieza= (superficie/5)+(numeroPlantas/2);
		float costeMensualLimpieza = tiempoLimpieza*30;
		
		return ("El tiempo de limpieza del Edificio es: "+tiempoLimpieza+" minutos"+"\n El coste mensual de la limpieza es de:"+costeMensualLimpieza+" euros");	
		}

	public abstract String  calcularCosteVigilancia();
	
	@Override
	public String toString() {
		return "Edificio --> nombre=" + nombre + "\n numeroPlantas=" + numeroPlantas + 
				"\n superficie=" + superficie;
	}



	}
