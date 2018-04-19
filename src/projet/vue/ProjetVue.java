package projet.vue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import projet.modele.Vol;
import projet.modele.aeroport;


public class ProjetVue {
    
    private Scanner sc = new Scanner(System.in);
    
    public int menu(){
        List<String> listeItems = new ArrayList<>(Arrays.asList(
            
            /*"ajouter voyage", 
            "supprimer voyage", 
            "modifier voyage", 
            "liste voyage",
            */
            "ajouter vol",
            //"supprimer vol",
            //"modifier vol",
            "liste vol",
            
            "ajouter aeroport",
            //"supprimer aeroport",
            //"modifier aeroport",
            "liste aeroport",
            
            "fin"));
        affListe(listeItems);
       
        int x;
        do{
            String chs = getMsg("votre choix");
            x = Integer.parseInt(chs);
            if (x > 0 && x <= listeItems.size()) break;
            affMsg("choix incorrect");
        }while (true);
        
        
        return x;
   }
    
    public Vol ajoutVol(){
        String code = getMsg("code du vol : ");
        aeroport depart = getMsg("aeroport de départ : ");
        aeroport arrivee = getMsg("aeroport d'arrivée :");
        Vol av = new Vol(code, depart, arrivee);
        return cl;
    }
    
    public aeroport ajoutAeroport(){
        String code = getMsg("code de l'aeroport : ");
        String nom = getMsg("nom : ");
        String ville = getMsg("ville : ");
        String pays = getMsg("pays : ");
        aeroport aa = new aeroport(code, nom, ville, pays);
        return aa;
    }
    
    
    
    
    
    
    
    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }
    
    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }
    
/*    public aeroport getMsgA(aeroport msg) {
        aeroport gma = new aeroport();
        
        return gma;
    }
    
    public aeroport getMsgA(aeroport msg) {
        affMsg(msg);
        return getMsgA();
    }
*/    
    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    
    
    public void affListe(Collection liste){
      int i=1;
        for(Object o : liste){
          affMsg((i++)+"." + o);
      }
    }
    
}
