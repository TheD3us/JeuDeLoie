package bo;

public class CaseAvecEffetDeplacement extends Case {
	private int effetCase;
	
	public CaseAvecEffetDeplacement(int numeroCase) {
		super(numeroCase);
		
	}

	@Override
	public void effet(Pion pion) {
		Case[] cases = plateauJeu.getCases();
		pion.setCaseActuelle(cases[effetCase]);
		
	}

}
