package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.Joueur;
import org.example.Camp;
import static org.junit.jupiter.api.Assertions.*;

public class CampBonusSteps {

    private Joueur joueur;
    private Camp camp;

    @Given("a player in the {string} camp with {int} mana")
    public void aPlayerInTheCampWithMana(String nomCamp, Integer manaInitial) {
        joueur = new Joueur();
        joueur.setMana(manaInitial);
        camp = new Camp();
        camp.setNom(nomCamp);
        joueur.setCamp(camp);
    }

    @When("the player boosts their mana")
    public void thePlayerBoostsTheirMana() {
        joueur.boostMana();
    }

    @Then("the player has {int} mana points")
    public void thePlayerHasManaPoints(Integer mana) {
        assertEquals(mana, joueur.getMana(),
                "Player should have " + mana + " mana points");
    }

    @Then("the player still has {int} mana points")
    public void thePlayerStillHasManaPoints(Integer mana) {
        assertEquals(mana, joueur.getMana(),
                "Player mana should remain " + mana);
    }
}