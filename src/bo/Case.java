package bo;

public class Case {
	protected int numeroCase;
	protected String symboleCase;
	protected PlateauJeu plateauJeu;
	
	
	public int getNumeroCase() {
		return numeroCase;
	}

	public void setNumeroCase(int numeroCase) {
		this.numeroCase = numeroCase;
	}
	
	

	public String getSymboleCase() {
		return symboleCase;
	}

	public void setSymboleCase(String symboleCase) {
		this.symboleCase = symboleCase;
	}

	public Case(int numeroCase, PlateauJeu plateauJeu) {
		this.numeroCase = numeroCase;
		this.plateauJeu = plateauJeu;
	}
	
	public void effet(Pion pion, int nbrCase) {
		
	}
	
	public void afficher() {
		System.out.print("| " + numeroCase + " |");
	}
}
