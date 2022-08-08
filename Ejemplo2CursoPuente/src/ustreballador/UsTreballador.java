package ustreballador;

import defherencia.Treballador;
import defherencia.Encarregat;

public class UsTreballador {
    public static void main(String[] Args){
        //new Treballador();
        Treballador treballador1 = new Treballador("Josep",27000,2018,12,03);
        System.out.println("Treballador " + treballador1.getSou());
        
        treballador1.setSou(5);
        
        System.out.println("Treballador " + treballador1.getSou());
        System.out.println(treballador1.getInfoUser());
        System.out.println(treballador1.getIdSeguent());
        //treballador1.idUser++;
        //treballador1.idUser=treballador1.idUser+1;
        Treballador treballador2 = new Treballador("Anna",32000,2020,12,03);
        treballador2.setSou(5);
        
        System.out.println("Treballador " + treballador2.getSou());
        System.out.println(treballador2.getInfoUser());
        System.out.println(treballador1.getIdSeguent());
        
        Treballador treballador3 = new Treballador("Lidia");
        
        Encarregat treballador4 = new Encarregat("Ricard",52000,2021,12,03);
        treballador4.setIncentiu(2000);
        System.out.println(treballador4.getSou());
        
        System.out.println(treballador1.getIdSeguent());
    }
}
        /*Encarregat capRRHH = new Encarregat("Julia",48000,2015,06,23);
        capRRHH.setIncentiu(4200);
        Treballador[] treballadors = new Treballador[4];
        treballadors[0] = new Treballador("Anna",32000,2020,12,03);
        treballadors[1] = capRRHH;
        Encarregat capFacturacio = new Encarregat("Ricard",52000,2021,12,03);
        capFacturacio.setIncentiu(4200); //Modificacio per afegir el incentiu
        treballadors[2] = capFacturacio;
        
        //Cast o refundiciÃ³ de Objectes 
        treballadors[3] = new Encarregat("Manel",17000,1997,11,14);
        Encarregat capContabilitat = (Encarregat)treballadors[3];
        
        for(Treballador j: treballadors){
            j.setSou(5); //Crida el Setter
        }
        
        for(Treballador j: treballadors){
            System.out.println("Nom: " + j.getNom() + " Sou: " + j.getSou() 
            + " Data de alta: " + j.getData());
        }
    }
}
*/