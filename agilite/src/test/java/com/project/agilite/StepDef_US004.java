package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;

public class StepDef_US004 {
	
	Film film;
	String result;

	
	@Given("j'ai un objet Film existant avec le nom {string}")
	public void j_ai_un_objet_Film_existant_avec_le_nom(String nom) {
	    film = new Film(nom);
	}

	@When("j'appelle la méthode getNom() sur cet objet")
	public void j_appelle_la_méthode_getNom_sur_cet_objet() {
	    result = film.getNom();
	}

	@Then("je devrais avoir un résultat de {string}")
	public void je_devrais_avoir_un_résultat_de(String expected) {
	    assertEquals(expected, result);
	}
}
