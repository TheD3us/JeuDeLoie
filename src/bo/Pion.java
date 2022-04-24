package bo;

public class Pion {
	private String nom;
	private Case caseActuelle;
	private boolean passeTour = false;
	private int compteur = 0;
	
	
	
	public boolean isPasseTour() {
		return passeTour;
	}

	public void setPasseTour(boolean passeTour) {
		this.passeTour = passeTour;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Case getCaseActuelle() {
		return caseActuelle;
	}

	public void setCaseActuelle(Case caseActuelle) {
		this.caseActuelle = caseActuelle;
	}

	public Pion(String nom, Case caseActuelle) {
		this.nom = nom;
		this.caseActuelle = caseActuelle;
	}

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	

	
	
}
