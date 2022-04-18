package bo;

public class CaseAvecEffetAttente extends Case {
	private boolean estRejoint;
	
	
	public boolean isEstRejoint() {
		return estRejoint;
	}

	public void setEstRejoint(boolean estRejoint) {
		this.estRejoint = estRejoint;
	}

	public CaseAvecEffetAttente(int numeroCase, boolean estRejoint) {
		super(numeroCase);
		this.estRejoint = estRejoint;
	}

	@Override
	public void effet(Pion pion) {
		
	}

}
