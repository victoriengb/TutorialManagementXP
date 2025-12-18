package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testAttaquer() {
        List<Joueur> joueurs = new ArrayList<>();
        Joueur pierre = new Joueur("Pierre", 100, 100);
        Joueur zelios = new Joueur("Zelios", 100, 100);

        joueurs.add(pierre);
        joueurs.add(zelios);

        sacha.attaquer(joueurs, 30);

        assertEquals(70, pierre.getPointDeVie());
        assertEquals(70, zelios.getPointDeVie());
        assertEquals(70, sacha.getMana());
    }
}