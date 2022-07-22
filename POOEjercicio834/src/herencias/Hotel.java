package herencias;

public class Hotel extends Edificio {
	
	private int numHabitaciones;

	public Hotel(String nombre, int numeroPlantas, int superficie, int numHabitaciones) {
		super(nombre, numeroPlantas, superficie);
		this.numHabitaciones = numHabitaciones;
	}

	public int getnumHabitaciones() {
		return numHabitaciones;
	}

	public void setnumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public String calculoPersonas (int numHabitaciones) {
		this.numHabitaciones=numHabitaciones;
		float numeroPersonas = (int)Math.ceil(numHabitaciones)/20;
		int sueldoTotal=(int)numeroPersonas*1000;
		
		return("El número de personas de Servicio necesarias son:"+numeroPersonas+"\n El coste total mensual en personas es:  "+sueldoTotal);
	}
	@Override
	public String calcularCosteVigilancia() {
		super.superficie = superficie;
		float numeroVigilantes = (int) Math.ceil(superficie/1000);
		int costeMensualVigilantes = (int)numeroVigilantes*1800;
		return ("El coste de Vigilancia mensual es de: "+costeMensualVigilantes);
	}

	@Override
	public String toString() {
		return "Hotel \n numHabitaciones=" + numHabitaciones + "\n nombre=" + nombre + "\n numeroPlantas="
				+ numeroPlantas + "\n superficie=" + superficie + "\n getnumHabitaciones()=" + getnumHabitaciones()
				+ "\n calcularCosteVigilancia()=" + calcularCosteVigilancia() + "\n getNombre()=" + getNombre()
				+ "\n getNumeroPlantas()=" + getNumeroPlantas() + "\n getSuperficie()=" + getSuperficie()
				+ "\n toString()=" + super.toString() + "\n getClass()=" + getClass() + "\n hashCode()=" + hashCode()
				+ "]";
	}


	

}
