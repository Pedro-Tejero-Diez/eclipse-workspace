package ejercicio1;

public class NoGenericMethods {

	private Object n1;
	private Object n2;
	private Object n3;
	
	public NoGenericMethods(Object n1, Object n2, Object n3) {
		
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}

	public Object getN1() {
		return n1;
	}

	public void setN1(Object n1) {
		this.n1 = n1;
	}

	public Object getN2() {
		return n2;
	}

	public void setN2(Object n2) {
		this.n2 = n2;
	}

	public Object getN3() {
		return n3;
	}

	public void setN3(Object n3) {
		this.n3 = n3;
	}

	@Override
	public String toString() {
		return "BOX: ("+ n1 + "," + n2 + "," + n3 + ")";
	}
	
	

}