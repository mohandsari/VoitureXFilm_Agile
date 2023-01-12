Feature: Afficher la durée du film
	Scénario: Savoir la durée d'un film
		Given un objet Film existant avec le nom "The Lord of the Rings: The Return of the King" 
		And une durée de 201 minutes
		When j'appelle la méthode getDuree() sur cet objet
		Then je devrais avoir un résultat de 201
		  

