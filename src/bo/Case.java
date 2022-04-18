package bo;

public abstract class Case {
	protected int numeroCase;
	protected PlateauJeu plateauJeu;

	public int getNumeroCase() {
		return numeroCase;
	}

	public void setNumeroCase(int numeroCase) {
		this.numeroCase = numeroCase;
	}

	public Case(int numeroCase) {
		this.numeroCase = numeroCase;
	}
	
	public abstract void effet(Pion pion);
	
}
