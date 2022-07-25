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
	public String calculoPersonas () {
		float numeroPersonas = (int)Math.ceil(numHabitaciones)/20;
		int sueldoTotal=(int)numeroPersonas*1000;
		
		return("El número de personas de Servicio necesarias son:"+numeroPersonas+"\n El coste total mensual en personas es:  "+sueldoTotal);
	}
	@Override
	public String calcularCosteVigilancia() {
		float numeroVigilantes = (int) Math.ceil((float) superficie/1000);
		int costeMensualVigilantes = (int)numeroVigilantes*1800;
		return ("El coste de Vigilancia mensual es de: "+costeMensualVigilantes+" euros");
	}




	

}
