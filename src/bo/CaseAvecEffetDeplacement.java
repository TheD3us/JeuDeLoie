package bo;

public class CaseAvecEffetDeplacement extends Case {
	
	
	public CaseAvecEffetDeplacement(int numeroCase,PlateauJeu plateauJeu) {
		super(numeroCase, plateauJeu);
		
	}

	@Override
	public void effet(Pion pion, int nbrCase) {
		Case[][] cases = plateauJeu.getCases();
		int cote = 8;
		int colonne = 0;
		int ligne = 0;
		pion.setCaseActuelle(cases[ligne][colonne]);
		
		;
		
	}

}
