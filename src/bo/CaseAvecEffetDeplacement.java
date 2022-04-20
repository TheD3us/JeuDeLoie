package bo;

public class CaseAvecEffetDeplacement extends Case {
	
	
	public CaseAvecEffetDeplacement(int numeroCase,PlateauJeu plateauJeu) {
		super(numeroCase, plateauJeu);
		
	}

	@Override
	public void effet(Pion pion, int ligne, int colonne) {
		Case[][] cases = PlateauJeu.getCases();
		pion.setCaseActuelle(cases[ligne][colonne]);
		
		;
		
	}

}
