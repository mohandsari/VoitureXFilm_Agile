package com.project.agilite;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import agilite.Acteur;
import agilite.Film;

public class StepDef_US003 {
	
	int result;
	Film film;
	

	
	@Given("j'ai un objet Film existant avec {int} acteurs, dont {int} sont des pilotes")
	public void j_ai_un_objet_Film_existant_avec_acteurs_dont_sont_des_pilotes(int nbActeur, int nbPilote) {
	    Acteur[] acteurs = new Acteur[nbActeur];
	    for(int i=0;i<nbActeur;i++)
	    {
	        if(i<nbPilote)
	            acteurs[i]=new Acteur("Acteur"+i);
	        else
	            acteurs[i]=new Acteur("Acteur"+i);
	    }
	    film = new Film("FilmTest", null, 0, 0, acteurs, null);
	}

	@When("j'appelle la méthode comptePilote() sur cet objet")
	public void j_appelle_la_méthode_comptePilote_sur_cet_objet() {
	    result = film.comptePilote();
	}

	@Then("je devrais avoir un résultat de {int}")
	public void je_devrais_avoir_un_résultat_de(int expected) {
	    assertEquals(expected, result);
	}

}
