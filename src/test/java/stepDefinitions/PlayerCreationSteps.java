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
    public void iWantToCreateAPlayerWithNickname(String pseudo) {
        this.pseudoToCreate = pseudo;
    }

    @Given("with {int} health points")
    public void withHealthPoints(Integer pointDeVie) {
        this.pointDeVieToCreate = pointDeVie;
    }

    @Given("with {int} mana points")
    public void withManaPoints(Integer mana) {
        this.manaToCreate = mana;
    }

    @When("I create the player")
    public void iCreateThePlayer() {
        joueur = new Joueur();
        joueur.setPseudo(pseudoToCreate);
        joueur.setPointDeVie(pointDeVieToCreate);
        joueur.setMana(manaToCreate);
    }

    @Then("the player's nickname is {string}")
    public void thePlayersNicknameIs(String pseudo) {
        assertEquals(pseudo, joueur.getPseudo(),
                "Player nickname should be " + pseudo);
    }

    @Then("the player has {int} health points")
    public void thePlayerHasHealthPoints(Integer pointDeVie) {
        assertEquals(pointDeVie, joueur.getPointDeVie(),
                "Player should have " + pointDeVie + " health points");
    }
}