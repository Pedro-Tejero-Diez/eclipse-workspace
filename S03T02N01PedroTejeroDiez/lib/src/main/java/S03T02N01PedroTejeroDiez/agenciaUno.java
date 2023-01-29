package S03T02N01PedroTejeroDiez;

public class agenciaUno  extends Observador{

		   public agenciaUno(Agente agente){
		      this.agente = agente;
		      this.agente.attach(this);
		   }

		   @Override
		   public void actualizar() {
		      System.out.println( this.toString()+"ALARMA: cambio de estado en la bolsa"+" ACCION: vender acciones" ); 
		   }

		@Override
		public String toString() {
			return "agencia Uno: ";
		}
		   
		}


