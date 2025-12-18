package org.example;

import java.util.List;

/**
 * Represents a player with health points, mana, and camp affiliation.
 * Can perform attacks and receive mana boosts from their camp.
 */
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

    /**
     * Applies a mana boost if the player belongs to the "Empire" camp.
     *
     * @return The updated mana value after boost
     */
    public int boostMana() {
        if (this.camp != null && this.camp.getNom().equals("Empire")) {
            this.mana += this.camp.boostMana();
        }
        return this.mana;
    }

    @Override
    public String toString() {
        return this.pseudo + " PV " + this.pointDeVie + " Mana " + this.mana;
    }

    /**
     * Attacks a list of players, dealing damage to each and consuming mana.
     *
     * @param joueurs The list of players to attack
     * @param degats  The amount of damage to deal to each player
     */
    public void attaquer(List<Joueur> joueurs, int degats) {
        for (Joueur joueur : joueurs) {
            joueur.setPointDeVie(joueur.getPointDeVie() - degats);
        }
        decrementMana(30);
    }

    private void decrementMana(int decrement) {
        this.mana -= decrement;
    }
}