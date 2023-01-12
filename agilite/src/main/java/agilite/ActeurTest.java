package agilite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ActeurTest {
	@Test
	public void testGetID() {
		Acteur acteur = new Acteur("Leonardo DiCaprio");
		int result = acteur.getID();
		assertEquals(1, result);
	}

	@Test
	public void testSetID() {
		Acteur acteur = new Acteur("Leonardo DiCaprio");
		acteur.setID(2);
		int result = acteur.getID();
		assertEquals(2, result);
	}

	@Test
	public void testGetNom() {
		Acteur acteur = new Acteur("Leonardo DiCaprio");
		String result = acteur.getNom();
		assertEquals("Leonardo DiCaprio", result);
	}

	@Test
	public void testSetNom() {
		Acteur acteur = new Acteur("Leonardo DiCaprio");
		acteur.setNom("Tom Hardy");
		String result = acteur.getNom();
		assertEquals("Tom Hardy", result);
	}

	@Test
	public void testFilmJouee() {
		Film film = new Film("Inception");
		Acteur acteur = new Acteur("Leonardo DiCaprio", film);
		String result = acteur.filmJouee();
		assertEquals("Inception", result);
	}

	@Test
	public void testSetFilm() {
		Film film1 = new Film("Inception");
		Film film2 = new Film("The Revenant");
		Acteur acteur = new Acteur("Leonardo DiCaprio", film1);
		acteur.setFilm(film2);
		String result = acteur.filmJouee();
		assertEquals("The Revenant", result);
	}

	@Test
	public void testIsPilote() {
    	Acteur acteur = new Acteur("Leonardo DiCaprio");
    	boolean result = acteur.isPilote();
    	assertFalse(result);
	}
}
