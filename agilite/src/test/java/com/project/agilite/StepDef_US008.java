package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;

public class StepDef_US008 {
	
	Film film;
	int result;

	
	@Given("j'ai un objet Film existant avec une durée de {int} minutes")
	public void j_ai_un_objet_Film_existant_avec_une_durée_de(int duree) {
	    film = new Film("FilmTest", null, duree, 0, null, null);
	}

	@When("j'appelle la méthode getDuree() sur cet objet")
	public void j_appelle_la_méthode_getDuree_sur_cet_objet() {
	    result = film.getDuree();
	}

	@Then("je devrais avoir un résultat de {int} minutes")
	public void je_devrais_avoir_un_résultat_de_minutes(int expected) {
	    assertEquals(expected, result);
	}

}
