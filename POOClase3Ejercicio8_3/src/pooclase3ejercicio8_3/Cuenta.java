package pooclase3ejercicio8_3;

public class Cuenta {
	

		private int numCuenta;
		private int saldo;

		public Cuenta(int numCuenta, int saldo) {
			super();
			this.numCuenta = numCuenta;
			this.saldo = saldo;
		}

		public int getSaldo() {
			return saldo;
		}

		public int getNumCuenta() {
			return numCuenta;
		}
		public int ingresar (int cantidad) {
			this.saldo = saldo+cantidad;
			return this.saldo;
		}
		
		public void retirar (int cantidad) {
			if (cantidad <= this.saldo) {
				System.out.println("Saldo insuficiente");
			} else 
				this.saldo = saldo-cantidad;
		}

		@Override
		public String toString() {
			return "Cuenta --> numCuenta=" + numCuenta + ", saldo=" + saldo;
		}		

		

	}
