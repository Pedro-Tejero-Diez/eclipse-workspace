package Herencia;

	public class Furgoneta extends Cotxe{
	    //Atributs del fill o subclasse
	    private int capacitat_carrega;
	    private int seients_extra;
	    
	    //Metode constructor del fill
	    public Furgoneta(int seients_extra, int capacitat_extra){
	        super(); //Cridem i carraguem el constructor de la classe pare.
	        this.capacitat_carrega = capacitat_extra;
	        this.seients_extra = seients_extra;
	    }
	    
	    //Metodes Getter
	    public String getInfoFurgo(){
	        return "La capacitat de carrega es " + capacitat_carrega + " i les places són " + seients_extra;
	    }
	    
	}


