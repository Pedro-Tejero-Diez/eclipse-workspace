package S03T02N01PedroTejeroDiez;

import java.util.ArrayList;
import java.util.List;

public class Agente {
		
	   private List<Observador> Observadores = new ArrayList<Observador>();
	   private int estado;

	   public int getState() {
	      return estado;
	   }

	   public void setState(int estado) {
	      this.estado = estado;
	      notifyAllObservadors();
	   }

	   public void attach(Observador Observador){
	      Observadores.add(Observador);		
	   }

	   public void notifyAllObservadors(){
	      for (Observador Observador : Observadores) {
	         Observador.actualizar();
	      }
	   } 	
	}


