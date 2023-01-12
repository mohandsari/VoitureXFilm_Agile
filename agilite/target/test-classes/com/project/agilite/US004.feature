Feature: Le nom du film

	Scénario: Afficher le nom d'un film
	  Given un objet Film existant avec le nom "The Dark Knight"
	  When j'appelle la méthode getNom() sur cet objet
	  Then je devrais avoir un résultat de "The Dark Knight"
  

