package bo;

public class CaseSansEffet extends Case{

	public CaseSansEffet(int numeroCase, PlateauJeu plateauJeu) {
		super(numeroCase, plateauJeu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effet(Pion pion) {
		System.out.println("Vous �tes sur la case " + getNumeroCase());
		
	}
	
}
