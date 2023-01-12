package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;

public class StepDef_US009 {
	
	Film film;
	String result;

	
	@Given("j'ai un objet Film existant avec un film suivant {string}")
	public void j_ai_un_objet_Film_existant_avec_un_film_suivant(String nomFilmSuivant) {
	    film = new Film("FilmTest", null, 0, 0, null, null);
	    film.setFilmSuivant(new Film(nomFilmSuivant, null, 0, 0, null, null));
	}

	@When("j'appelle la méthode getFilmSuivant() sur cet objet")
	public void j_appelle_la_méthode_getFilmSuivant_sur_cet_objet() {
	    result = film.getFilmSuivant().getNom();
	}

	@Then("je devrais avoir un résultat de {string} comme film suivant")
	public void je_devrais_avoir_un_résultat_de_comme_film_suivant(String expected) {
	    assertEquals(expected, result);
	}

}
