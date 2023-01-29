package S03T02N01PedroTejeroDiez;

public class agenciaDos extends Observador{
	   public agenciaDos (Agente agente){
		      this.agente = agente;
		      this.agente.attach(this);
		   }
	   @Override
	   public void actualizar() {
	      System.out.println( this.toString()+"ALARMA: cambio de estado en la bolsa"+" ACCION: cerrar tabla diaria" ); 
	   }

	@Override
	public String toString() {
		return "agencia Dos: ";
	}
	   
		}
