package projet.modele;


import java.util.*;

public class aeroport extends Vol {
    
    private String code ;
    private String nom ;
    private String ville ;
    private String pays ;
    
    public aeroport(){  //constru vide
    }
    
    public aeroport(String code, String nom, String ville, String pays){ //constru full
        this.code = code ;
        this.nom = nom ;
        this.ville = ville ;
        this.pays = pays ;
    }

    
//----------------GETTER---------------------
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }
//-----------------SETTER--------------------
    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
    
    

}