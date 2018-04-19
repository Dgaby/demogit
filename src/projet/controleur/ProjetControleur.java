package projet.controleur;
import java.util.List;

import projet.modele.ProjetModele;
import projet.modele.Vol;
import projet.modele.aeroport;

import projet.vue.ProjetVue;


public class ProjetControleur {
    
    private ProjetModele pm = null;
    private ProjetVue pv = null;
    
    public ProjetControleur(){
        
    }
    
    public ProjetControleur(ProjetModele pm, ProjetVue pv) {
        this.pm = pm;
        this.pv = pv;
    }
    
    public void gestion() {
        int x;
        do {
            x = pv.menu();
            switch (x) {
                case 1:
                    ajoutVol();
                    break;
                case 2:
                    listVol();
                    break;
                case 3:
                    ajoutAeroport();
                    break;
                case 4:
                    listAeroport();
                    break;
                case 5:
                    pv.affMsg("fin");
                    break;
                default:
                    pv.affMsg("erreur trop grand");
            }
        } while (x != 5);
    }
    
    public void ajoutVoiture() {
        Voiture v = gv.encodeVoiture();
        String msg = gm.ajouterVoiture(v);
        gv.affMsg(msg);

    }
    
    public void ajoutVol(){
        Vol v = pv.ajoutVol();
        String msg = pm.ajoutVol(v);
        pv.affMsg(msg);
        
    }
    
    public void listVol(){
        
        
    }
    
    public void ajoutAeroport(){
        
        
    }
    
    public void listAeroport(){
        
        
    }
    
    
    
    public void listeClients() {
        List<Client> lc = gm.tousClients();
        gv.affListe(lc);
    }
    
    
}
