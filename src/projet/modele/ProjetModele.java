package projet.modele;

import java.util.*;



public class ProjetModele {
    protected  List<Vol> vols = new ArrayList<>();
    protected  List<aeroport> aeroports = new ArrayList<>();
    
    
    public ProjetModele(){
        
    }
    
    public String ajoutVol(Vol v){
     if(v==null)return "Vol nul";
     
     vols.add(v);
     
     return "ajout voiture effectue";
  }
    
    
    
    
    
    
    
    
    
    
    
}