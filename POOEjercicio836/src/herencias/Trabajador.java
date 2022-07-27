package herencias;

public abstract class Trabajador {
	protected String nombre;
	protected String apellido;
	protected byte edad;
	protected byte antiguedad;
	protected final int SUELDO_BASE = 50000;

	public Trabajador(String nombre, String apellido, byte edad, byte antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.antiguedad = antiguedad;
	}

	public Trabajador() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public byte getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(byte antiguedad) {
		this.antiguedad = antiguedad;
	}

	public abstract int sueldo();
}
