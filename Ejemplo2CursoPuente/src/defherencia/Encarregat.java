package defherencia;

public class Encarregat extends Treballador {
    //Atributs definir
    private int incentiu;
    //Constructor
    public Encarregat(String nom,int sou,int any,int mes,int dia){
        super(nom,sou,any,mes,dia);
        
    }
    
    //Metode Setter
    public void setIncentiu(int extra){
        incentiu = extra;
    }
    
    //Metode Getter que sobreescriurÃ  el metode getSou() del pare, nomÃ©s per aquesta classe filla
    public int getSou(){
        int souCap = super.getSou(); //Aixo crida el metode del pare per obtenir el que retorna aquest.. o sigui el souusu.
        return souCap + incentiu;
    }
    
    //El fer servir super, li indica que vol fer referencia al pare. 
    //En cas contrari, faria referencia el metode fill que sobreescriu el del pare.
}