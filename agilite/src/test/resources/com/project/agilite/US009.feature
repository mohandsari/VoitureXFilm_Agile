Feature: Connaître le film suivant
	Scénario: Trouver le film suivant d'une série
		Given un objet Film existant avec le nom "Harry Potter and the Sorcerer's Stone"
		And que ce film a un film suivant dans la série "Harry Potter and the Chamber of Secrets"
		When j'appelle la méthode getFilmSuivant() sur cet objet
		Then je devrais avoir un résultat de "Harry Potter and the Chamber of Secrets"
		  

