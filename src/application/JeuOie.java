package application;

import java.util.Scanner;

import bo.De;
import bo.PlateauJeu;

public class JeuOie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlateauJeu plateau = new PlateauJeu();
		De de = new De();

		plateau.generationPlateau();
		plateau.generationpion(2);
		plateau.afficherPlateau();
		while(plateau.verifierVictoire() == false) {
			
		
		System.out.println("Joueur 1, êtes vous prêt à lancer les dés ? o/n");
		String choix = sc.nextLine();
		if(choix.equalsIgnoreCase("o")) {
			plateau.deplacementPion(de.lancerDeDes(), "J1");
			plateau.afficherPlateau();
			
		}
		else {
			System.out.println("Il faut lancer pour jouer");
		}
		
		System.out.println("Joueur 2, êtes vous prêt à lancer les dés ? o/n");
		choix = sc.nextLine();
		if(choix.equalsIgnoreCase("o")) {
			plateau.deplacementPion(de.lancerDeDes(), "J2");
			plateau.afficherPlateau();
			
		}
		else {
			System.out.println("Il faut lancer pour jouer");
		}
		}
		sc.close();
		
	}

}
