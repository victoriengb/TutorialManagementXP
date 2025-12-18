package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerCreationSteps {
    private Joueur joueur;
    private String pseudoToCreate;
    private int pointDeVieToCreate;
    private int manaToCreate;

    @Given("I want to create a player with nickname {string}")
    public void i_want_to_create_a_player_with_nickname(String pseudo) {
        this.pseudoToCreate = pseudo;
    }

    @Given("with {int} health points")
    public void with_health_points(Integer pointDeVie) {
        this.pointDeVieToCreate = pointDeVie;
    }

    @Given("with {int} mana points")
    public void with_mana_points(Integer mana) {
        this.manaToCreate = mana;
    }

    @When("I create the player")
    public void i_create_the_player() {
        joueur = new Joueur();
        joueur.setPseudo(pseudoToCreate);
        joueur.setPointDeVie(pointDeVieToCreate);
        joueur.setMana(manaToCreate);
    }

    @Then("the player's nickname is {string}")
    public void the_player_nickname_is(String pseudo) {
        assertEquals(pseudo, joueur.getPseudo());
    }

    @Then("the player has {int} health points")
    public void the_player_has_health_points(Integer pointDeVie) {
        assertEquals(pointDeVie.intValue(), joueur.getPointDeVie());
    }


}