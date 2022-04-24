package bo;

public class CaseAvecEffetAttente extends Case {
	private boolean estRejoint;
	private String nomCase;
	
	
	public boolean isEstRejoint() {
		return estRejoint;
	}

	public void setEstRejoint(boolean estRejoint) {
		this.estRejoint = estRejoint;
	}

	public CaseAvecEffetAttente(int numeroCase, PlateauJeu plateauJeu, String nomCase) {
		super(numeroCase, plateauJeu);
		this.nomCase = nomCase;

	}

	@Override
	public void effet(Pion pion, int nbrTour) {
		System.out.println("Vous êtes tombé sur " + nomCase);
		pion.setPasseTour(true);
		if(nbrTour > 0) {
			pion.setCompteur(nbrTour);
		}
		
	}

}
