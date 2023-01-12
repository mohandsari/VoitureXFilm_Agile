package agilite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VoitureTest {
    @Test
    public void testGetMarque() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        String result = voiture.getMarque();
        assertEquals("Peugeot", result);
    }

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        voiture.setMarque("Renault");
        String result = voiture.getMarque();
        assertEquals("Renault", result);
    }

    @Test
    public void testGetModele() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        String result = voiture.getModele();
        assertEquals("208", result);
    }

    @Test
    public void testSetModele() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        voiture.setModele("Clio");
        String result = voiture.getModele();
        assertEquals("Clio", result);
    }

    @Test
    public void testGetVitesseMax() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        int result = voiture.getVitesseMax();
        assertEquals(180, result);
    }

    @Test
    public void testSetVitesseMax() {
        Voiture voiture = new Voiture("Peugeot", "208", 180);
        voiture.setVitesseMax(200);
        int result = voiture.getVitesseMax();
        assertEquals(200, result);
    }
}