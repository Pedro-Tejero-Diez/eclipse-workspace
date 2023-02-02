package ejercicio1;

public class TelefonoFactory extends AbstractFactory {
		   @Override
		   public Entrada getData(String dataType){    
		      if(dataType.equalsIgnoreCase("telefono")){
		         return new Telefono();         
		      }else if(dataType.equalsIgnoreCase("direccion")){
		         return new Direccion();
		      }	 
		      return null;
		   }
		}

