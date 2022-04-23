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
	// Ici je créer les pions que je met dans un tableau
	public void generationpion(int nbPion) {
		pion = new Pion[nbPion];
		for(int i = 1; i < nbPion + 1; i++) {
			if(cases[0][0] == null) {
				System.out.println("Cases non générées");
			}else {
				pion[i - 1]= new Pion("J" + i, cases[0][0]);
			}
			
		}
	}

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
		
		
		

		
	}
	
	// Je déplace mon pion en additionnant le numéro de la case du pion avec le nombre 
	// reçu
	
	
	public void afficherPlateau() {
		int cote = 8;
		int colonne = 0;
		int ligne = 0;
		
		//j'affiche le plateau de jeu
		
		
		boolean joueurPresent = false;

		for(ligne = 0; ligne < cote; ligne++) {
			for(colonne = 0; colonne < cote; colonne++) {
				joueurPresent = false;
					for(int i = 0; i < pion.length; i++) {
						if(pion[i].getCaseActuelle().equals(cases[ligne][colonne])) {
							System.out.print("| " + pion[i].getNom() + " |");
							i = pion.length;
							joueurPresent = true;
						}
					}
					if(cases[ligne][colonne].getNumeroCase() < 10 && joueurPresent == false) {
					System.out.print("| " + cases[ligne][colonne].getNumeroCase() + "  |");
					}else if(joueurPresent == false){
				cases[ligne][colonne].afficher();
				}
			
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
	}
	
	
	public void deplacementPion(int nbCase, String nom) {
	int cote = 8;
	int colonne = 0;
	int ligne = 0;
	int noNouvelleCase = 0;
	
	
		
	
		for(int i = 0; i < pion.length ; i++) {
			if(pion[i].getNom().equalsIgnoreCase(nom)) {
				noNouvelleCase = pion[i].getCaseActuelle().getNumeroCase() + nbCase;
				for(ligne = 0; ligne < cote; ligne++) {
					for(colonne = 0; colonne < cote; colonne++) {	
						if(cases[ligne][colonne].getNumeroCase() == noNouvelleCase) {
								
								pion[i].setCaseActuelle(cases[ligne][colonne]);
								ligne = cote;
								colonne = cote;
								i= pion.length;
						}					
					}
				}
			}					
			
		}
	}
}
	
	

	
	

