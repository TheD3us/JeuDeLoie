package bo;

public class PlateauJeu {
	private static Case[][] cases = new Case[8][8];

	public static Case[][] getCases() {
		return cases;
	}

	public static void setCases(Case[][] cases) {
		PlateauJeu.cases = cases;
	}

	public PlateauJeu() {
		
	}
	
	public void generationPlateau() {
		System.out.println("🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆Plateau Jeu de l'oie🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆");
		int cote = 8;
		
		int colonneRestante = cote - 1;
		int ligneRestante = cote - 1;
		int colonne = 0;
		int ligne = 0;
		boolean mouvementHorizontal = true;
		char bouge = 'd' ;
		
		for(int i = 1; i < cote * cote + 1 ; i++) {
			cases[ligne][colonne]= new Case(i, this);

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
	
}
