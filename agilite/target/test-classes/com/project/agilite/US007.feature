Feature: Genre du film
	Scénario: Afficher le genre d'un film
	  Given un objet Film existant avec le genre "Action"
	  When j'appelle la méthode getGenre() sur cet objet
	  Then je devrais avoir un résultat de "Action"
		  

