Feature: Marque de voiture
Scénario: Afficher la marque de la voiture dans un film
  Given un objet Film existant avec une voiture de marque "Ferrari"
  When j'appelle la méthode getMarqueVoiture() sur cet objet
  Then je devrais avoir un résultat de "Ferrari"
	  

