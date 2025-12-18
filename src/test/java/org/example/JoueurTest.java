package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Joueur class.
 * Tests player actions, mana management, and camp interactions.
 */
public class JoueurTest {

    private Joueur sacha;
    private Camp empire;

    @BeforeEach
    public void setUp() {
        sacha = new Joueur();
        empire = new Camp();
        sacha.setCamp(empire);
    }

    @AfterEach
    public void tearDown() {
        sacha = null;
        empire = null;
    }

    @Test
    public void testToString() {
        Joueur joueur = new Joueur();
        assertEquals("Sacha PV 100 Mana 100", joueur.toString());
    }

    @Test
    public void testBoostMana() {
        assertEquals(150, sacha.boostMana(),
                "Mana should be boosted to 150 for Empire camp");
    }

    @Test
    public void testBoostManaNonEmpireCamp() {
        Camp otherCamp = new Camp();
        otherCamp.setNom("Rebellion");
        sacha.setCamp(otherCamp);

        int initialMana = sacha.getMana();
        int boostedMana = sacha.boostMana();

        assertEquals(initialMana, boostedMana,
                "Mana should not be boosted for non-Empire camps");
    }

    @Test
    public void testAttaquer() {
        List<Joueur> joueurs = new ArrayList<>();
        Joueur pierre = new Joueur("Pierre", 100, 100);
        Joueur zelios = new Joueur("Zelios", 100, 100);

        joueurs.add(pierre);
        joueurs.add(zelios);

        sacha.attaquer(joueurs, 30);

        assertEquals(70, pierre.getPointDeVie(),
                "Pierre should have 70 HP after attack");
        assertEquals(70, zelios.getPointDeVie(),
                "Zelios should have 70 HP after attack");
        assertEquals(70, sacha.getMana(),
                "Sacha should have 70 mana after attack");
    }

    @Test
    public void testAttaquerEmptyList() {
        List<Joueur> emptyList = new ArrayList<>();
        int initialMana = sacha.getMana();

        sacha.attaquer(emptyList, 30);

        assertEquals(initialMana - 30, sacha.getMana(),
                "Mana should be decremented even with empty target list");
    }

    @Test
    public void testManaNegativeAfterMultipleAttacks() {
        List<Joueur> joueurs = new ArrayList<>();
        Joueur pierre = new Joueur("Pierre", 100, 100);
        joueurs.add(pierre);

        sacha.attaquer(joueurs, 10);
        sacha.attaquer(joueurs, 10);
        sacha.attaquer(joueurs, 10);
        sacha.attaquer(joueurs, 10);

        assertTrue(sacha.getMana() < 0,
                "Mana can become negative after multiple attacks");
        assertEquals(-20, sacha.getMana(),
                "Mana should be -20 after 4 attacks (100 - 4*30)");
    }
}