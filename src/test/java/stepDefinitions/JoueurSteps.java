package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import org.example.Camp;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurSteps {

    private Joueur joueur;
    private Camp camp;
    private String affichage;

    @Given("a new player")
    public void a_new_player() {
        joueur = new Joueur();
    }

    @Then("the player's nickname is {string}")
    public void the_player_nickname_is(String pseudo) {
        assertEquals(pseudo, joueur.getPseudo());
    }

    @Then("the player has {int} health points")
    public void the_player_has_health_points(Integer pointsDeVie) {
        assertEquals(pointsDeVie.intValue(), joueur.getPointDeVie());
    }

    @Then("the player has {int} mana points")
    public void the_player_has_mana_points(Integer mana) {
        assertEquals(mana.intValue(), joueur.getMana());
    }

    @Given("the player joins the {string} camp")
    public void the_player_joins_the_camp(String nomCamp) {
        camp = new Camp();
        camp.setNom(nomCamp);
        joueur.setCamp(camp);
    }

    @When("the player boosts their mana")
    public void the_player_boosts_their_mana() {
        joueur.boostMana();
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