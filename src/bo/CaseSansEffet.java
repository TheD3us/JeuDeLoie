package bo;

public class CaseSansEffet extends Case{

	public CaseSansEffet(int numeroCase) {
		super(numeroCase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effet(Pion pion) {
		System.out.println("Vous êtes sur la case " + getNumeroCase());
		
	}
	
}
