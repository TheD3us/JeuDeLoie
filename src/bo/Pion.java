package bo;

public class Pion {
	private String nom;
	private Case caseActuelle;
	
	
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
	
	
	
	
}
