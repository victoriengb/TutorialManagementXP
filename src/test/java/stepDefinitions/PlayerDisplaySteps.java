package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerDisplaySteps {

    private Joueur joueur;
    private String affichage;

    @Given("a player with nickname {string}, {int} PV, and {int} Mana")
    public void aPlayerWithStats(String pseudo, Integer pv, Integer mana) {
        joueur = new Joueur();
        joueur.setPseudo(pseudo);
        joueur.setPointDeVie(pv);
        joueur.setMana(mana);
    }

    @When("I display the player information")
    public void iDisplayThePlayerInformation() {
        affichage = joueur.toString();
    }

    @Then("I get {string}")
    public void iGet(String resultatAttendu) {
        assertEquals(resultatAttendu, affichage,
                "Display should match expected format");
    }
}