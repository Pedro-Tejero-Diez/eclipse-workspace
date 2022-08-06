package defherencia;

import java.util.Date;
import java.util.GregorianCalendar;

public class Treballador {
    //Definir Atributs
    private String nomusu;
    private int souusu;
    private Date alta;
    private int idUser;
    private static int IdSeguent = 1;
    
    //Constructor
    
    public Treballador(String nomusu, int sou, int any, int mes, int dia){
        this.nomusu = nomusu;
        souusu = sou;
        GregorianCalendar calendari = new GregorianCalendar(any, (mes-1), dia);
        alta = calendari.getTime();
        idUser = IdSeguent;
        IdSeguent++;
    }
    
    public Treballador(String nomusu){
        this(nomusu,30000,2018,9,13);//
        //this.nomusu = nomusu;
        //Aixo serveix per referenciar un altre constructor i aixi poder emprar els atributs per defecte i no tenir que reescriurels
         //Revisar
    }
   //Fi constructors
    
    //Metodes Getter
    public String getNom(){
        return this.nomusu;
    }
    
    public int getSou(){
        return souusu;
    }
    
    public Date getData(){
        return alta;
    }
    
    public String getInfoUser(){
        return "El treballador " + this.nomusu + " te el id " + idUser + 
                " guanya un sou de " + souusu + " a l'any i es va donar d'alta el " + alta;
    }
    
    //Metodes Setter
    public void setSou(int percentatge){
        int augment = ((souusu*percentatge)/100);
        souusu +=augment;
    }
    
    public static String getIdSeguent(){
        return "El id segÃ¼ent es: " + IdSeguent;
    }
}
