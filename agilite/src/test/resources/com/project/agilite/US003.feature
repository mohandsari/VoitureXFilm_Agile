Feature: Le nombre de pilote

	Scénario: Compter le nombre de pilotes parmi les acteurs
	  Given un objet Film existant avec 5 acteurs, dont 3 sont des pilotes
	  When j'appelle la méthode comptePilote() sur cet objet
	  Then je devrais avoir un résultat de 3
