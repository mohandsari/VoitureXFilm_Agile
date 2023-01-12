package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Film;
import agilite.Pilote;
import agilite.Voiture;

public class StepDef_US001 {
	
	
		int result;
		Film film;

	
		@Given("j'ai un objet Film existant avec le nom {string}")
		public void j_ai_un_objet_Film_existant_avec_le_nom(String nom) {
		    film = new Film(nom);
		}

		@And("ce film a été visionné {int} fois")
		public void ce_film_a_été_visionné_fois(int visionnage) {
		    film.setNombreVisionnage(visionnage);
		}

		@When("j'appelle la méthode getNombreVisionnage() sur cet objet")
		public void j_appelle_la_méthode_getNombreVisionnage_sur_cet_objet() {
		    result = film.getNombreVisionnage();
		}

		@Then("je devrais avoir un résultat de {int}")
		public void je_devrais_avoir_un_résultat_de(int expected) {
		    assertEquals(expected, result);
		}

}
