package moteur_jeu;

public class Grille {
	private Bateau[] flotte = new Bateau[5];
	private int nbBateau = 0;
	//private int nbLigne = 10;
	private int nbColonne = 10;
	
	boolean verifierSortieGrille(Bateau bateau, char sens, char lettre, int chiffre) {
		boolean verifierPremiereCoordonnee = (lettre>='A')&&(lettre<='J')&&(chiffre>=0)&&(chiffre<=nbColonne);
		if (sens=='H') {
			return verifierPremiereCoordonnee&&(chiffre+bateau.getTailleBateau()<nbColonne);
		} else {
			return verifierPremiereCoordonnee&&(lettre+bateau.getTailleBateau()<'J');
		}
	}
	
	boolean verifierSupperpositionBateau(Bateau bateau, char sens, char lettre, int chiffre) {
		for (int i = 0; i < nbBateau; i++) {
			for (int j = 0; j < flotte[i].getTailleBateau(); j++ ) {
				for (int k = 0; k < bateau.getTailleBateau(); k++) {
					if((bateau.bateau[k].chiffre==flotte[i].bateau[j].chiffre)&&(bateau.bateau[k].lettre==flotte[i].bateau[j].lettre)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean placerBateau(Bateau bateau, char lettre, int chiffre, char sens) {
		if (!verifierSortieGrille(bateau, sens, lettre, chiffre)||!verifierSupperpositionBateau(bateau, sens, lettre, chiffre)) {
			return false;
		}
		bateau.placerBateau(lettre, chiffre, sens);
		flotte[nbBateau] = bateau;
		nbBateau++;
		return true;
	}
	
	public static void main(String[] args) {
		Grille grille = new Grille();
		Bateau torpilleur = new Bateau("torpilleur", 3);
//		grille.placerBateau(torpilleur, 'A', 1, 'H');
//		System.out.println("Le torpilleur a-t-il un élément en ('A',2) ? "+ torpilleur.appartientBateau('A', 2));
//		System.out.println("Le torpilleur a-t-il un élément en ('B',2) ? "+ torpilleur.appartientBateau('B', 2));
//		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
		
		System.out.println("Peut-on placer le torpilleur en ('G', 9) horizontalement ? " + grille.placerBateau(torpilleur,'G',9,'H'));
		System.out.println("Peut-on placer le torpilleur en ('E', 4) horizontalement ? " + grille.placerBateau(torpilleur,'E',4,'H'));
		//Bateau croiseur = new Bateau("croiseur", 4);
		System.out.println("Peut-on placer le croiseur en ('C', 4) verticalement ? " + grille.placerBateau(torpilleur,'C',4,'V'));
		System.out.println("Peut-on placer le croiseur en ('B', 1) verticalement ? " + grille.placerBateau(torpilleur,'B',1,'V'));


	}
}
