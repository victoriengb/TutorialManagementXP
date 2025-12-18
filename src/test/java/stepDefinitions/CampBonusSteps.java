package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import org.example.Camp;
import static org.junit.jupiter.api.Assertions.*;

public class CampBonusSteps {
    private Joueur joueur;
    private Camp camp;

    @Given("a player in the {string} camp")
    public void a_player_in_the_camp(String nomCamp) {
        joueur = new Joueur();
        camp = new Camp();
        camp.setNom(nomCamp);
        joueur.setCamp(camp);
    }

    @When("the player boosts their mana")
    public void the_player_boosts_their_mana() {
        joueur.boostMana();
    }

    @Then("the player has {int} mana points")
    public void the_player_has_mana_points(Integer mana) {
        assertEquals(mana.intValue(), joueur.getMana());
    }
}

