package org.example;

import java.util.List;
import java.util.Objects;

public class Joueur {

    private String pseudo;
    private int mana;
    private int pointDeVie;
    private Camp camp;

    public Joueur() {
        this.pseudo = "Sacha";
        this.mana = 100;
        this.pointDeVie = 100;
        this.camp = null;
    }

    public Joueur(String pseudo, int pointDeVie, int mana) {
        this.pseudo = pseudo;
        this.pointDeVie = pointDeVie;
        this.mana = mana;
        this.camp = null;
    }

    public int getMana() {
        return this.mana;
    }

    public int getPointDeVie() {
        return this.pointDeVie;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public Camp getCamp() {
        return this.camp;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void setCamp(Camp camp) {
        this.camp = camp;
    }

    public int boostMana() {
        if (this.camp != null && this.camp.getNom().equals("Empire")) {
            this.mana += this.camp.boostMana();
        }
        return this.mana;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.pseudo + " PV " + this.pointDeVie
                + " Mana " + this.mana);
        return s.toString();
    }

    public void attaquer(List<Joueur> joueurs, int degats) {
        for (Joueur joueur : joueurs) {
            joueur.setPointDeVie(joueur.getPointDeVie() - degats);
        }
        decrementMana(30);
    }

    private void decrementMana(int decrement) {
        this.setMana(this.getMana() - decrement);
    }
}