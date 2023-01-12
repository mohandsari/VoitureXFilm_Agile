package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;
import agilite.Voiture;

public class StepDef_US006 {
	
	Film film;
	String result;

	
	@Given("j'ai un objet Film existant avec une voiture de marque {string}")
	public void j_ai_un_objet_Film_existant_avec_une_voiture_de_marque(String marque) {
	    Voiture[] voitures = new Voiture[1];
	    voitures[0]=new Voiture(marque);
	    film = new Film("FilmTest", null, 0, 0, null, voitures);
	}

	@When("j'appelle la méthode getMarqueVoiture() sur cet objet")
	public void j_appelle_la_méthode_getMarqueVoiture_sur_cet_objet() {
	    result = film.getVoiture()[0].getMarque();
	}

	@Then("je devrais avoir un résultat de {string}")
	public void je_devrais_avoir_un_résultat_de(String expected) {
	    assertEquals(expected, result);
	}

}
