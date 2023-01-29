package S03T02N01PedroTejeroDiez;

public class agenciaTres extends Observador {
	   public agenciaTres(Agente agente){
		      this.agente = agente;
		      this.agente.attach(this);
		   }

	   @Override
	   public void actualizar() {
	      System.out.println( this.toString()+"ALARMA: cambio de estado en la bolsa"+" ACCION: comprar acciones"); 
	   }

	@Override
	public String toString() {
		return "agencia Tres: ";
	}
	   
		}
