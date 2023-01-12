package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;

public class StepDef_US002 {
	
	Film film;
	int result;

	
	@Given("j'ai un objet Film existant avec une note de {int}")
	public void j_ai_un_objet_Film_existant_avec_une_note_de(int note) {
	    film = new Film("FilmTest", null, 0, note, null, null);
	}

	@When("j'appelle la méthode getNote() sur cet objet")
	public void j_appelle_la_méthode_getNote_sur_cet_objet() {
	    result = film.getNote();
	}

	@Then("je devrais avoir un résultat de {int} comme note")
	public void je_devrais_avoir_un_résultat_de_comme_note(int expected) {
	    assertEquals(expected, result);
	}
}
