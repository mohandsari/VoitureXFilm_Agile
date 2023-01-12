package agilite;

import java.util.*;

public class Film {
	private String nom;
	private String genre;
	private int duree;
	private int note;
	private Acteur[] listActeur;
	private int nbActeur = 0;
	private Voiture[] listVoiture;
	private int nbVoiture = 0;
	private int nombreVisionnage = 0;
	private Film filmSuivant;

	public Film(String nom) {
		this.nom = nom;
		this.genre = null; 
		this.duree = 0;
		this.note = 0;
		this.listActeur = new Acteur[20];	
		this.listVoiture = new Voiture[20];
		this.filmSuivant = null;
	}

	public Film(String nom, String genre, int duree) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = 0;
		this.listActeur = new Acteur[20];
		this.listVoiture = new Voiture[20];	
		this.filmSuivant = null;	
	}

	public Film(String nom, String genre, int duree, int note) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = new Acteur[20];
		this.listVoiture = new Voiture[20];
		this.filmSuivant = null;
	}

	public Film(String nom, String genre, int duree, int note, Acteur[] listActeur, Voiture[] listVoiture) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = listActeur;
		this.nbActeur = listActeur.length;
		this.listVoiture = listVoiture;
		this.nbVoiture = listVoiture.length;
		this.filmSuivant = null;	
	}

	public Film(String nom, String genre, int duree, int note, Acteur[] listActeur, Voiture[] listVoiture, Film filmSuivant) {
		this.nom = nom;
		this.genre = genre; 
		this.duree = duree;
		this.note = note;
		this.listActeur = listActeur;
		this.nbActeur = listActeur.length;
		this.listVoiture = listVoiture;
		this.nbVoiture = listVoiture.length;
		this.filmSuivant = filmSuivant;	
	}

	
	public String getNom() {
		return nom;
	}

	public void afficherNom() {
		System.out.println(nom);
	}

	public Acteur[] getActeur() {
		return listActeur;
	}

	public Voiture[] getVoiture() {
		return listVoiture;
	}

	public int comptePilote() {
		int cpt = 0;
		for (int i = 0; i < listActeur.length; i++) {
			if(listActeur[i].isPilote()) {
				cpt++;
			} 
		}
		return cpt;
	}

	public int getNombreActeur() {
		return nbActeur;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;	
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNote() {
		return note;
	}

	public void afficheNote() {
		System.out.println(note);
	}

	public void setNote(int note) {
		if(note < 1 || note > 10)
			System.out.println("SVP entrez une note valide entre 1 et 10");
		else
			this.note = note;
	}

	public int getNombreVisionnage() {
		return nombreVisionnage;
	}
	
	public void regarder() {
		this.nombreVisionnage++;
	}

	public Film getFilmSuivant() {
		return filmSuivant;
	}

	public void setFilmSuivant(Film filmSuivant) {
		this.filmSuivant = filmSuivant;
	}


	public int getNombreVoiture() {
		return nbVoiture;
	}

	public void addActeur(Acteur newActeur) {
		if(nbActeur >= 20) {
			System.out.println("Plus de place ");
		} else {
			listActeur[nbActeur] = newActeur;
			nbActeur++;
		}
	}

	public void addVoiture(Voiture newVoiture) {
		if(nbVoiture >= 20) {
			System.out.println("Plus de place ");
		} else {
			listVoiture[nbVoiture] = newVoiture;
			nbVoiture++;
		}
	}

	public void setNombreVisionnage(int visionnage) {
		nombreVisionnage=visionnage;
		
	}

}
