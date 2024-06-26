/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Personne {
      private String nom;
    private int PV;
    private int PA;
    private int PM;
    private int PMO;
    private boolean estMush;
    private Competence competence1;
    private Competence competence2;
    private Salle   salle;//numéro Salle  dans le quel il se trouve
    private int vaisseau;// numéro vaisseau dans le quel il se trouve 
    private ArrayList<String> inventaire = new ArrayList<>();
    
    public Personne(String nom, int PV, int PA, int PM, int PMO, boolean estMush, Competence competence1, Competence competence2) {
        this.nom = nom;
        this.PV = PV;
        this.PA = PA;
        this.PM = PM;
        this.PMO = PMO;
        this.estMush = estMush;
        this.competence1 = competence1;
        this.competence2 = competence2;
    }
    public Personne(String name,Salle s,int vaisseau){
        this.nom=name;
        this.salle=s;
        this.vaisseau=vaisseau;
        
    }
    @Override
    public String toString(){return this.getNom()+" dans la salle "+this.salle.getnomSalle();}

    public String getNom() {
        return nom;
    }

    public int getPV() {
        return PV;
    }

    public int getPA() {
        return PA;
    }

    public int getPM() {
        return PM;
    }

    public int getPMO() {
        return PMO;
    }

    public boolean estMush() {
        return estMush;
    }
    
     public Competence getCompetence1() {
        return competence1;
    }

    public Competence getCompetence2() {
        return competence2;
    }
    public ArrayList<String> getInventaire() {
        return inventaire;
    }
    public int  getNumsalle(){return this.salle.getID();}
    //pour reduidre les PA du joueur
    public void perdrePV(int p){ 
        this.PV -= p;
        
    }
    //le cout du PA
    public void depenserPa(int d ){
    this.PA -= d;}
    // pour que le joueur puisse se soigner ou soigner un autre
    public int soignerJoueur( ){
       return PA;
        
    }
}
