package projet.controleur;
import projet.modele.ProjetModele;
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

        //TODO rendre cohérent la liste des switch cases et la liste des éléments du menu
        int x;
        do {
            x = pv.menu();

            switch (x) {
                case 1:
                    ajoutVoiture();
                    break;
                case 2:
                    ajoutClient();
                    break;
                case 3:
                    vendreVehicule();
                    break;

                case 4:
                    changementAdresse();
                    break;
                case 5:
                    proprietaire();
                    break;
                case 6:
                    proprietes();
                    break;
                case 7:
                    listeVoitures();
                    break;
                case 8:
                    listeClients();
                    break;

                case 9:
                    gv.affMsg("bye");
                    break;
                default:
                    gv.affMsg("choix invalide");
            }
        } while (x != 9);

    }
    
    
}
