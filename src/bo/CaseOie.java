package bo;

public class CaseOie extends CaseSansEffet {

	public CaseOie(int numeroCase, PlateauJeu plateauJeu) {
		super(numeroCase, plateauJeu);
		// TODO Auto-generated constructor stub
	}
	
	public void effet(Pion pion, int nbrCase) {
		plateauJeu.deplacementPion(nbrCase, pion.getNom(), true);
	}
}