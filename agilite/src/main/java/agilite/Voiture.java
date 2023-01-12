package agilite;



public class Voiture {
    private String marque;
    private String modele;
    private int vitesseMax;
    
    public Voiture(String marque) {
        this.marque = marque;
      }
  
    public Voiture(String marque, String modele, int vitesseMax) {
      this.marque = marque;
      this.modele = modele;
      this.vitesseMax = vitesseMax;
    }
  
    public String getMarque() {
      return marque;
    }

    public void afficherMarque() {
      System.out.println(marque);
    }
  
    public void setMarque(String marque) {
      this.marque = marque;
    }
  
    public String getModele() {
      return modele;
    }
  
    public void setModele(String modele) {
      this.modele = modele;
    }
  
    public int getVitesseMax() {
      return vitesseMax;
    }
  
    public void setVitesseMax(int vitesseMax) {
      this.vitesseMax = vitesseMax;
    }
  }
  


  
  