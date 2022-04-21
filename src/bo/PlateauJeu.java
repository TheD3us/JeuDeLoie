package bo;

public class PlateauJeu {
	private static Case[][] cases = new Case[8][8];
	private Pion[] pion;


	public PlateauJeu(Pion[] pion) {
		this.pion = pion;
	}

	public Pion[] getPion() {
		return pion;
	}

	public void setPion(Pion[] pion) {
		this.pion = pion;
	}

	public static Case[][] getCases() {
		return cases;
	}

	public static void setCases(Case[][] cases) {
		PlateauJeu.cases = cases;
	}

	public PlateauJeu() {
		
	}
	
	public void generationPlateau(int nbPion) {
		System.out.println("🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆Plateau Jeu de l'oie🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆");
		int cote = 8;
		int colonneRestante = cote - 1;
		int ligneRestante = cote - 1;
		int colonne = 0;
		int ligne = 0;
		boolean mouvementHorizontal = true;
		char bouge = 'd' ;
		

		
		for(int i = 1; i < cote * cote + 1 ; i++) {
			cases[ligne][colonne]= new Case(i - 1, this);

			switch(bouge) {
				case 'd':{
					colonne += 1;
					break;
				}
				case 'g':{
					colonne -=1;
					break;
				}
				case 'h':{
					ligne -= 1;
					break;
				}
				case 'b':{
					ligne += 1;
					break;
				}
			}
			if(colonneRestante == i) {
				colonneRestante += ligneRestante;
				if(mouvementHorizontal == true) {
					mouvementHorizontal = false;
				}else {
					mouvementHorizontal = true;
					ligneRestante-=1;
				}
					switch(bouge) {
					case 'd':{
						bouge = 'b';
						break;
					}
					case 'g':{
						bouge = 'h';
						break;
					}
					case 'h':{
						bouge = 'd';
						break;
					}
					case 'b':{
						bouge = 'g';
						break;
					}
					
				}
				
			}
		
		
		
		}
		pion = new Pion[nbPion];
		for(int i = 0; i < nbPion; i++) {
			pion[i]= new Pion("J" + i, cases[0][0]);
		}
		for(ligne = 0; ligne < cote; ligne++) {
			for(colonne = 0; colonne < cote; colonne++) {
				
					if(cases[ligne][colonne].getNumeroCase() < 10) {
					System.out.print("| " + cases[ligne][colonne].getNumeroCase() + "  |");
					}else {
				cases[ligne][colonne].afficher();
				}
			
			}
			System.out.println("");
		}
		
	}
			


	public void positionPion() {
	int cote = 8;
	int colonne = 0;
	int ligne = 0;
	
	
		for(ligne = 0; ligne < cote; ligne++) {
			for(colonne = 0; colonne < cote; colonne++) {		
				for(int i = 0; i < pion.length; i++) {
					if(cases[ligne][colonne].getNumeroCase() == pion[i].getCaseActuelle().getNumeroCase() ) {
						System.out.print("| " + "J" + i + " |");
					}
				}				
			}
		}
	}
}
	
	

	
	

