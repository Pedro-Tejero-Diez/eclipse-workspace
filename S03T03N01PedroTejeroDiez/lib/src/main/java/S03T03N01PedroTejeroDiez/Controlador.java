package S03T03N01PedroTejeroDiez;

import java.util.Scanner;

public class Controlador {
	
		private static Scanner sc = new Scanner(System.in);
	   private Floristeria floristeria;
	   private VistaFloristeria vista;

	   public Controlador(Floristeria floristeria, VistaFloristeria vista){
	      this.floristeria = floristeria;
	      this.vista = vista;
	   }

	   public void setNombreFloristeria(String name){
		   floristeria.setNombre(name);		
	   }

	   public String getNombre(){
	      return floristeria.getNombre();		
	   }

	   public String crearFloristeria(){
	     System.out.println("Introduzca nombre Floristeria: ");	
	     String name = sc.nextLine();
	     setNombreFloristeria (name);
	     vista.mostrarFloristeria(floristeria);
	   }

	   public String getStudentRollNo(){
	      return model.getRollNo();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(model.getName(), model.getRollNo());
	   }	
	}
}
