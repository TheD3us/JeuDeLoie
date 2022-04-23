package application;

import bo.De;
import bo.PlateauJeu;

public class JeuOie {

	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		De de = new De();
		plateau.generationPlateau();
		plateau.generationpion(2);
		plateau.afficherPlateau();
		plateau.deplacementPion(de.lancerDeDes(), "J1");
		plateau.afficherPlateau();
	}

}
