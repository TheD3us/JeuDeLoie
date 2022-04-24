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

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		PlateauJeu.cases = cases;
	}
	
	public void generationCaseEffetDeplacement() {
		cases[0][6] = new CaseAvecEffetDeplacement(6, this, "Pont");
		cases[6][2] = new CaseAvecEffetDeplacement(42, this,  "Labyrinthe");
		cases[4][2] = new CaseAvecEffetDeplacement(58, this, " Tête de MOOOOOOORT");
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
			cases[ligne][colonne]= new CaseSansEffet(i - 1, this);

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
		ajoutOie();	
		generationCaseEffetDeplacement();
	}
	
	public void ajoutOie() {
		int cote = 8;
		int colonne = 0;
		int ligne = 0;
		
		for(ligne = 0; ligne < cote; ligne++) {
			for(colonne = 0; colonne < cote; colonne++) {
				if(cases[ligne][colonne].getNumeroCase() % 9 == 0 && cases[ligne][colonne].getNumeroCase() != 63) {
					int numero = cases[ligne][colonne].getNumeroCase();
					cases[ligne][colonne] = new CaseOie(numero, this);
					cases[ligne][colonne].setSymboleCase("Oie");
					
					
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
					if(cases[ligne][colonne].getNumeroCase() % 9 == 0 &&cases[ligne][colonne].getNumeroCase() != 63 && joueurPresent == false) {
						System.out.print("|" + cases[ligne][colonne].getSymboleCase() + " |");
					}
					else if(cases[ligne][colonne].getNumeroCase() < 10 && joueurPresent == false) {
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
	
	
	public void deplacementPion(int nbCase, String nom, boolean caseOieAvant) {
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
							if(cases[ligne][colonne] instanceof CaseOie && caseOieAvant == false) {
								pion[i].setCaseActuelle(cases[ligne][colonne]);
								System.out.println("Vous êtes tombé sur une oie !");
								cases[ligne][colonne].effet(pion[i], nbCase);
								System.out.println("On avance d'autant de cases que notre score");
								i = pion.length;
							}else if(noNouvelleCase == 6){
								
								cases[ligne][colonne].effetDeplacement(pion[i], cases[5][7]);
							}else if (noNouvelleCase == 42){
								cases[ligne][colonne].effetDeplacement(pion[i], cases[1][3]);
							}else if(noNouvelleCase == 58){
								cases[ligne][colonne].effetDeplacement(pion[i], cases[0][0]);
							}
								else {
							
							
								pion[i].setCaseActuelle(cases[ligne][colonne]);
							}
						}
						else if(63 < noNouvelleCase) {
							int difference = noNouvelleCase - 63;
							for(ligne = 0; ligne < cote; ligne++) {
								for(colonne = 0; colonne < cote; colonne++) {
									if(cases[ligne][colonne].getNumeroCase() == (63 - difference)) {
										pion[i].setCaseActuelle(cases[ligne][colonne]);

									}
								}
						// A voir si on peut optimiser	
						//	System.out.println(noNouvelleCase);
						//	System.out.println(pion[i].getCaseActuelle().getNumeroCase());
							
						}
					}
				}
			}					
			}
		}
	}
	
	public boolean verifierVictoire() {
		boolean gagner = false;
		for(int i = 0; i < pion.length; i++) {
			if(pion[i].getCaseActuelle().getNumeroCase() == 63) {
				gagner = true;
				System.out.println(pion[i].getNom() + " à gagné");
			}
		}
		return gagner;
	}
}
	
	

	
	

