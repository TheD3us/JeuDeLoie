package bo;

public class Case {
	protected int numeroCase;
	protected PlateauJeu plateauJeu;

	public int getNumeroCase() {
		return numeroCase;
	}

	public void setNumeroCase(int numeroCase) {
		this.numeroCase = numeroCase;
	}

	public Case(int numeroCase, PlateauJeu plateauJeu) {
		this.numeroCase = numeroCase;
		this.plateauJeu = plateauJeu;
	}
	
	public void effet(Pion pion) {
		
	}
	
	public void afficher() {
		System.out.print("| " + numeroCase + " |");
	}
}
