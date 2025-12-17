package stepDefinitions;

import io.cucumber.java.fr.*;
import org.example.Joueur;
import org.example.Camp;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurSteps {

    private Joueur joueur;
    private Camp camp;
    private String affichage;

    @Étantdonné("un nouveau joueur")
    public void un_nouveau_joueur() {
        joueur = new Joueur();
    }

    @Alors("le pseudo du joueur est {string}")
    public void le_pseudo_du_joueur_est(String pseudo) {
        assertEquals(pseudo, joueur.getPseudo());
    }

    @Alors("le joueur a {int} points de vie")
    public void le_joueur_a_points_de_vie(Integer pointsDeVie) {
        assertEquals(pointsDeVie.intValue(), joueur.getPointDeVie());
    }

    @Alors("le joueur a {int} points de mana")
    public void le_joueur_a_points_de_mana(Integer mana) {
        assertEquals(mana.intValue(), joueur.getMana());
    }

    @Étantdonné("le joueur rejoint le camp {string}")
    public void le_joueur_rejoint_le_camp(String nomCamp) {
        camp = new Camp();
        camp.setNom(nomCamp);
        joueur.setCamp(camp);
    }

    @Quand("le joueur booste son mana")
    public void le_joueur_booste_son_mana() {
        joueur.boostMana();
    }

    @Quand("j'affiche les informations du joueur")
    public void j_affiche_les_informations_du_joueur() {
        affichage = joueur.toString();
    }

    @Alors("j'obtiens {string}")
    public void j_obtiens(String resultatAttendu) {
        assertEquals(resultatAttendu, affichage);
    }
}