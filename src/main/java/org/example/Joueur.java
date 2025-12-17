package org.example;

public class Joueur {

    private String pseudo;
    private int mana;
    private int pointDeVie;
    private Camp camp;

    public Joueur () {
        this.pseudo = "Sacha";
        this.mana = 100;
        this.pointDeVie = 100;
        this.camp = null;
    }

    public int getMana () {
        return this.mana;
    }
    
    public int getPointDeVie () {
        return this.pointDeVie;
    }
    
    public String getPseudo () {
        return this.pseudo;
    }
    
    public Camp getCamp () {
        return this.camp;
    }
    
    public void setCamp (Camp camp) {
        this.camp = camp;
    }
    
    public int boostMana () {
        if (this.camp.getNom() == "Empire") {
            this.mana += this.camp.boostMana();
        }
        return this.mana;
    }

    public String toString () {
        StringBuilder s = new StringBuilder(this.pseudo + " PV " + this.pointDeVie +
        " Mana " + this.mana);
        return s.toString();
    }
}