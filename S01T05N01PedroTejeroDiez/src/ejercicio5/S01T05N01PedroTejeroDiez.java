package ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class S01T05N01PedroTejeroDiez {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Coche coche = new Coche("ferrari", "rojo");

		FileOutputStream fileOutputStream = new FileOutputStream(
				"C:\\Users\\pedro\\eclipse-workspace\\S01T05N01PedroTejeroDiez\\src\\ejercicio5\\coche3.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(coche);
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\pedro\\eclipse-workspace\\S01T05N01PedroTejeroDiez\\src\\ejercicio5\\coche3.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Coche coche2 = (Coche) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(coche2);

	}

}
