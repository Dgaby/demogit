package projet.modele;

import java.util.*;

public class Vol extends deplacement {
    
    private String code;
    private aeroport depart;
    private aeroport arrivee;
    
    public Vol() {   //constru par defaut
    }
    
    public Vol(String code, aeroport depart, aeroport arrivee){   //constru general sans extend
        this.code = code;
        this.depart = depart;
        this.arrivee = arrivee;
    }

//--------------------GETTER---------------------
    public String getCode() {
        return code;
    }

    public aeroport getDepart() {
        return depart;
    }

    public aeroport getArrivee() {
        return arrivee;
    }
//------------------SETTER------------------------
    public void setCode(String code) {
        this.code = code;
    }

    public void setDepart(aeroport depart) {
        this.depart = depart;
    }

    public void setArrivee(aeroport arrivee) {
        this.arrivee = arrivee;
    }
    
    
    


}