package bo;

public class De {
	private  static final int nbFace = 6;
	private static boolean debutPartie = true;
	
	public int lancerDeDes() {
		int resultat1 = (int) (Math.random() * nbFace + 1);
		int resultat2 = (int) (Math.random() * nbFace + 1);
		int total = resultat1 + resultat2;
		if(debutPartie == true) {
			if((resultat1 == 6 && resultat2 == 3)||(resultat1 == 3 && resultat2 == 6)) {
				  total = 26;
				  System.out.println("Bravo vous avez tiré 6 et 3 en début de partie!");
				  System.out.println("Direction case 26 !");
				  debutPartie = false;
				  
			}else if((resultat1 == 4 && resultat2 == 5)||(resultat1 == 5 && resultat2 == 4)) {
				  System.out.println("Bravo vous avez tiré 5 et 4 en début de partie!");
				  System.out.println("Direction case 53 !");
				  total = 53;
				  debutPartie = false;
			}else {
				System.out.println("Vous avez fait " + resultat1 + " et " +  resultat2 + " pour un total de " + total);
				debutPartie = false;
			}
		}else {
			System.out.println("Vous avez fait " + resultat1 + " et " +  resultat2 + " pour un total de " + total);
		}
		
		return total;
	}
	
	
}
