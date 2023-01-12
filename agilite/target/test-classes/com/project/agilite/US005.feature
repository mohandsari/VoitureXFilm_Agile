Feature:  Nombre d'acteur
	Scénario: Afficher le nombre d'acteurs dans un film
	  Given un objet Film existant avec 7 acteurs
	  When j'appelle la méthode getNombreActeur() sur cet objet
	  Then je devrais avoir un résultat de 7
	  

