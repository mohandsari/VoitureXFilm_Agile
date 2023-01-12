Feature: Nombre de visionnage du film

  Scénario: Compter le nombre de fois où un film a été vu
  Given un objet Film existant avec le nom "The Godfather"
  And que ce film a été visionné 10 fois
  When j'appelle la méthode getNombreVisionnage() sur cet objet
  Then je devrais avoir un résultat de 10
    