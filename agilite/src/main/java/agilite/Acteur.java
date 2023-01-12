package agilite;

public class Acteur { 
	public static int compteur = 0;
	private int id;
	protected String nom;
	protected Film film; 
	// ou une liste avec plusieurs films auquel il a joué??
	
	public Acteur() {
		this.nom = null;
		this.film = null;
		compteur++;
		this.id = compteur;
	}
	
	
	public Acteur(String nom) {
		this.nom = nom;
		this.film = null;
		compteur++;
		this.id = compteur;
	}

	public Acteur(String nom, Film film) {
		this.nom = nom;
		this.film = film;
		compteur++;
		this.id = compteur;
	}
	

	public int getID() {
		return id;
	}


	public void setID(int iD) {
		id = iD;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

// getFilm = film jouee
	public String filmJouee() {
		return this.film.getNom();
	}


	public void setFilm(Film film) {
		this.film = film;
	}

	public boolean isPilote() {
		return false;
	}

}
