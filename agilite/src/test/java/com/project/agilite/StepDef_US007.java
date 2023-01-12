package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;

public class StepDef_US007 {
	
	Film film;
	String result;

	
	@Given("j'ai un objet Film existant avec le genre {string}")
	public void j_ai_un_objet_Film_existant_avec_le_genre(String genre) {
	    film = new Film("FilmTest", genre, 0, 0, null, null);
	}

	@When("j'appelle la méthode getGenre() sur cet objet")
	public void j_appelle_la_méthode_getGenre_sur_cet_objet() {
	    result = film.getGenre();
	}

	@Then("je devrais avoir un résultat de {string}")
	public void je_devrais_avoir_un_résultat_de(String expected) {
	    assertEquals(expected, result);
	}

}
