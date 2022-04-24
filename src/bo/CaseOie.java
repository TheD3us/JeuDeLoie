package bo;

public class CaseOie extends CaseSansEffet {

	public CaseOie(int numeroCase, PlateauJeu plateauJeu) {
		super(numeroCase, plateauJeu);
		// TODO Auto-generated constructor stub
	}
	
	public void effet(Pion pion, int nbrCase) {
		Case[][] cases = plateauJeu.getCases();
		int cote = 8;
		int colonne = 0;
		int ligne = 0;
		if(pion.getCaseActuelle().getNumeroCase() + nbrCase < 63) {
			for(ligne = 0; ligne < cote; ligne++) {
				for(colonne = 0; colonne < cote; colonne++) {
					if(cases[ligne][colonne].getNumeroCase() == pion.getCaseActuelle().getNumeroCase() + nbrCase) {
					pion.setCaseActuelle(cases[ligne][colonne]);
					System.out.println("On se déplace d'autant de cases que l'on a joué");
					}	
				}
			}
		}else{
			int difference = pion.getCaseActuelle().getNumeroCase() + nbrCase - 63;
			for(ligne = 0; ligne < cote; ligne++) {
				for(colonne = 0; colonne < cote; colonne++) {
					if(cases[ligne][colonne].getNumeroCase() == (63 - difference)) {
						pion.setCaseActuelle(cases[ligne][colonne]);
						System.out.println("On se déplace d'autant de cases que l'on a joué");
					}
				}
		// A voir si on peut optimiser	
		//	System.out.println(noNouvelleCase);
		//	System.out.println(pion[i].getCaseActuelle().getNumeroCase());
			
		}
	}
	}
}