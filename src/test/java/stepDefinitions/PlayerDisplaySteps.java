package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerDisplaySteps {
    private Joueur joueur;
    private String affichage;

    @Given("a player with nickname {string}, {int} PV, and {int} Mana")
    public void a_player_with_stats(String pseudo, Integer pv, Integer mana) {
        joueur = new Joueur();
        joueur.setPseudo(pseudo);
        joueur.setPointDeVie(pv);
        joueur.setMana(mana);
    }

    @When("I display the player information")
    public void i_display_the_player_information() {
        affichage = joueur.toString();
    }

    @Then("I get {string}")
    public void i_get(String resultatAttendu) {
        assertEquals(resultatAttendu, affichage);
    }
}

