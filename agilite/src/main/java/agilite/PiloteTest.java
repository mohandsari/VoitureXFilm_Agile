package agilite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PiloteTest {
    @Test
    public void testGetNom() {
        Pilote pilote = new Pilote("Hamilton");
        String result = pilote.getNom();
        assertEquals("Hamilton", result);
    }

    @Test
    public void testSetNom() {
        Pilote pilote = new Pilote("Hamilton");
        pilote.setNom("Vettel");
        String result = pilote.getNom();
        assertEquals("Vettel", result);
    }

    @Test
    public void testGetPrenom() {
        Pilote pilote = new Pilote("Hamilton", "Lewis", null, null);
        String result = pilote.getPrenom();
        assertEquals("Lewis", result);
    }

    @Test
    public void testSetPrenom() {
        Pilote pilote = new Pilote("Hamilton", "Lewis", null, null);
        pilote.setPrenom("Sebastian");
        String result = pilote.getPrenom();
        assertEquals("Sebastian", result);
    }

    @Test
    public void testGetVoiture() {
        Voiture voiture = new Voiture("Mercedes", "F1 W09", 360);
        Pilote pilote = new Pilote("Hamilton", "Lewis", voiture, null);
        Voiture result = pilote.getVoiture();
        assertEquals(voiture, result);
    }

    @Test
    public void testSetVoiture() {
        Voiture voiture1 = new Voiture("Mercedes", "F1 W09", 360);
        Voiture voiture2 = new Voiture("Ferrari", "SF90", 350);
        Pilote pilote = new Pilote("Hamilton", "Lewis", voiture1, null);
        pilote.setVoiture(voiture2);
        Voiture result = pilote.getVoiture();
        assertEquals(voiture2, result);
    }

    @Test
    public void testIsPilote() {
        Pilote pilote = new Pilote("Hamilton", "Lewis", null, null);
        boolean result = pilote.isPilote();
        assertTrue(result);
    }
    
    @Test
    public void testGetFilm() {
        Film film = new Film("Rush");
        Pilote pilote = new Pilote("Hamilton", "Lewis", null, film);
        Film result = pilote.getFilm();
        assertEquals(film, result);
    }
}
