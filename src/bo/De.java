package bo;

public class De {
	private  static final int nbFace = 6;
	
	public static int lancerDeDes() {
		int resultat1 = (int) (Math.random() * nbFace + 1);
		int resultat2 = (int) (Math.random() * nbFace + 1);
		int total = resultat1 + resultat2;
		
		System.out.println("Vous avez fait " + resultat1 + " et " +  resultat2 + " pour un total de " + total);
		return total;
	}
	
	
}
