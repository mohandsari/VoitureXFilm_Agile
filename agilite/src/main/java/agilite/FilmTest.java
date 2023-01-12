package agilite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FilmTest {
	@Test
	public void testGetNom() {
		Film film = new Film("Inception");
		String result = film.getNom();
		assertEquals("Inception", result);
	}

	@Test
	public void testSetNom() {
		Film film = new Film("Inception");
		film.setNom("Interstellar");
		String result = film.getNom();
		assertEquals("Interstellar", result);
	}

	@Test
	public void testGetGenre() {
		Film film = new Film("Inception", "Science fiction", 148);
		String result = film.getGenre();
		assertEquals("Science fiction", result);
	}

	@Test
	public void testSetGenre() {
		Film film = new Film("Inception", "Science fiction", 148);
		film.setGenre("Thriller");
		String result = film.getGenre();
		assertEquals("Thriller", result);
	}

	@Test
	public void testGetDuree() {
		Film film = new Film("Inception", "Science fiction", 148);
		int result = film.getDuree();
		assertEquals(148, result);
	}

	@Test
	public void testSetDuree() {
		Film film = new Film("Inception", "Science fiction", 148);
		film.setDuree(169);
		int result = film.getDuree();
		assertEquals(169, result);
	}

	@Test
	public void testGetNote() {
		Film film = new Film("Inception", "Science fiction", 148, 8);
		int result = film.getNote();
		assertEquals(8, result);
	}

	@Test
	public void testSetNote() {
		Film film = new Film("Inception", "Science fiction", 148, 8);
		film.setNote(9);
		int result = film.getNote();
		assertEquals(9, result);
	}

	

	

	

	@Test
	public void testGetFilmSuivant() {
		Film film1 = new Film("Inception");
		Film film2 = new Film("Interstellar");
		film1.setFilmSuivant(film2);
		Film result = film1.getFilmSuivant();
		assertEquals(film2, result);
	}

	@Test
	public void testSetFilmSuivant() {
		Film film1 = new Film("Inception");
		Film film2 = new Film("Interstellar");
		film1.setFilmSuivant(film2);
		Film result = film1.getFilmSuivant();
		assertEquals(film2, result);
	}

}