package stepDefinitions;

import io.cucumber.java.PendingException;
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

    @Given("the player's nickname is created with (.*)")
    public void playerCreatedWithPseudo (String pseudo) {
        joueur.setPseudo(pseudo);
    }

    @Given("the player is created with (\\d+) health points")
    public void playerCreatedWithPointDeVie (int pointDeVie) {
        joueur.setPointDeVie(pointDeVie);
    }

    @Given("the player is created with (\\d+) mana points")
    public void playerCreatedWithMana (int mana) {
        joueur.setMana(mana);
    }

    /*
    @When("the player is created with nickname, health points, and mana points")
    public void thePlayerIsCreatedWithNicknamePseudoHealthPointsPointDeVieAndManaPointsMana() {
        this.joueur.setPseudo(pseudo);
        this.joueur.setPointDeVie(pointDeVie);
        this.joueur.setMana(mana);
    }

    @Then("the player's nickname is {string}")
    public void the_player_nickname_is(String pseudo) {
        assertEquals(pseudo, joueur.getPseudo());
    }

    @And("the player has {int} health points")
    public void the_player_has_health_points(Integer pointsDeVie) {
        assertEquals(pointsDeVie.intValue(), joueur.getPointDeVie());
    }

    @And("the player has {int} mana points")
    public void the_player_has_mana_points(Integer mana) {
        assertEquals(mana.intValue(), joueur.getMana());
    }

    /*
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

     */

    @When("I display the player information")
    public void i_display_the_player_information() {
        affichage = joueur.toString();
    }

    @Then("I get {string}")
    public void i_get(String resultatAttendu) {
        assertEquals(resultatAttendu, affichage);
    }

    /*
    @When("the player joins the camp l'Empire")
    public void thePlayerJoinsTheCampLEmpire() {
        this.camp = new Camp();
        this.camp.setNom("Empire");
        this.joueur.setCamp(camp);
    }

    @Then("the player has a boost in {int} of 50 points as he is in {string}")
    public void thePlayerHasABoostInManaOfPointsAsHeIsInCamp() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /*
    @When("the player joins the <camp> l'Empire")
    public void thePlayerJoinsTheCampLEmpire() {
        this.joueur.setCamp(camp);
    }

    @Then("the player has a boost in <mana> of {int} points")
    public void thePlayerHasABoostInManaOfPoints() {
        assertEquals(150, joueur.getMana());
    }

     */
}