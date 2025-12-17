package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;  // ← AJOUTE CETTE LIGNE

public class JoueurTest {

    private Joueur sacha;
    private Camp empire;

    public JoueurTest() {
    }

    @BeforeEach
    public void setUp() {
        sacha = new Joueur();
        empire = new Camp();
        sacha.setCamp(empire);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testToString() {
        Joueur sacha = new Joueur();
        assertEquals("Sacha PV 100 Mana 100", sacha.toString());
    }

    @Test
    public void testBoostMana() {
        assertEquals(150, sacha.boostMana());
    }
}