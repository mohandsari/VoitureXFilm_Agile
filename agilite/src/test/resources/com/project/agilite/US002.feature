
Feature: Notation du film

	Scénario: Afficher la note d'un film
	  Given un objet Film existant avec le nom "The Shawshank Redemption" et une note de 9
	  When j'appelle la méthode getNote() sur cet objet
	  Then je devrais avoir un résultat de 9