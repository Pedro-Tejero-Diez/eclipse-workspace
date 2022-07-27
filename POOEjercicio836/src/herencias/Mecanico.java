package herencias;

public class Mecanico extends Trabajador {
	private boolean estudios;

	public Mecanico(String nombre, String apellido, byte edad, byte antiguedad, boolean estudios) {
		super(nombre, apellido, edad, antiguedad);
		this.estudios = estudios;
	}

	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}

	public int sueldo() {
		int sueldo = SUELDO_BASE + (super.antiguedad * 10000);
		return sueldo;
		//super.setSueldo()
	}

	@Override
	public String toString() {
		return "--> Mecanico,  Nombre = " + super.nombre + ", Apellido =" + super.apellido + ", Estudios superiores ="
				+ estudios + ", Sueldo = " + sueldo() + "\n";
	}

}
