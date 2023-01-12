package agilite;


public class Pilote extends Acteur {
    private String prenom;
    private Voiture voiture;
    
    public Pilote() {
    	super();
        this.prenom = null;
        this.voiture = null;
    }
    
    public Pilote(String nom) {
    	super(nom);
        this.prenom = null;
        this.voiture = null;
    }
  
    public Pilote(String nom, String prenom, Voiture voiture, Film film) {
      super(nom, film);
      this.prenom = prenom;
      this.voiture = voiture;
    }
  
    public String getNom() {
      return nom;
    }
  
    public void setNom(String nom) {
      this.nom = nom;
    }
  
    public String getPrenom() {
      return prenom;
    }
  
    public void setPrenom(String prenom) {
      this.prenom = prenom;
    }

  
    public Voiture getVoiture() {
      return voiture;
    }
  
    public void setVoiture(Voiture voiture) {
      this.voiture = voiture;
    }

    public boolean isPilote() {
      return true;
    }
    
    public Film getFilm() {
    	return film;
    }
  }
  