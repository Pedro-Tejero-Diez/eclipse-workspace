package S03T02N01PedroTejeroDiez;

public class S03T02N01PedroTejeroDiez {

	public static void main(String[] args) {
//creamos la instancia del objeto que será observado por las agencias
Agente broker1 = new Agente();
//creamos una instancia de cada agencia que estará observando 
agenciaUno agency1 = new agenciaUno(broker1);
agenciaDos agency2 = new agenciaDos(broker1);
agenciaTres agency3 = new agenciaTres(broker1);

System.out.println("Cambio mercado a DEFCON 2\n");
//comprobamos que el cambio de estado hace su efecto sobre las agencias observadoras
broker1.setState(2);

	}

}
