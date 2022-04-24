package bo;

public class CaseAvecEffetDeplacement extends Case {
	
	private String nomCase;
	
	public CaseAvecEffetDeplacement(int numeroCase,PlateauJeu plateauJeu,  String nomCase) {
		super(numeroCase, plateauJeu);
		this.setNomCase(nomCase);
		
	}


	public String getNomCase() {
		return nomCase;
	}

	public void setNomCase(String nomCase) {
		this.nomCase = nomCase;
	}


	
	@Override
	public void effet(Pion pion, int nbrCase) {

		
	}
	
	@Override
	public void effetDeplacement(Pion pion, Case caseEffet) {
		System.out.println("Vous êtes tombé sur " + getNomCase());
		pion.setCaseActuelle(caseEffet);
	}



}
