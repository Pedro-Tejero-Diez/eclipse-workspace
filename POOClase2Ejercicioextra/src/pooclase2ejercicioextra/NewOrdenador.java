package pooclase2ejercicioextra;

public class NewOrdenador {
		
			private String marca;
			private String modelo;
			private String procesador;
			private int ram;
			private int discoduroMb;
			
			
			public NewOrdenador(String marca, String modelo, String procesador, int ram, int discoduroMb) {
				
				this.marca = marca;
				this.modelo = modelo;
				this.procesador = procesador;
				this.ram = ram;
				this.discoduroMb = discoduroMb;
			}
			public NewOrdenador(String marca, String modelo) {
				
				this.marca = marca;
				this.modelo = modelo;
			}
			
			//getters y setters
			public String getProcesador() {
				return procesador;
			}
			
			public void setProcesador(String procesador) {
				this.procesador = procesador;
			}
			
			public int getRam() {
				return ram;
			}

			public void setRam(int ram) {
				this.ram = ram;
			}

			public int getDiscoduroMb() {
				return discoduroMb;
			}

			public void setDiscoduro(int discoduroMb) {
				this.discoduroMb = discoduroMb;
			}

			public String getMarca() {
				return marca;
			}

			public String getModelo() {
				return modelo;
			}
			
			//metodo de la clase que realiza la accion de imprimir el nombre del programa		
			public void  programa (String programa) {
				System.out.println("Se está ejecutando "+programa);
			}
		
			@Override
			public String toString() {
				return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
						+ ", discoduroMb=" + discoduroMb + "]";
			}
		



		}

