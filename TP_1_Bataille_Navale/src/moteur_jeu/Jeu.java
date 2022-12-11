package moteur_jeu;

public class Jeu {
	Grille grilleJoueur1 = new Grille();
	Grille grilleJoueur2 = new Grille();

	public void initialiser(int numJoueur, String nomBateau, int tailleBateau, char lettre, int chiffre, char sens) {
		Bateau bateau = new Bateau(nomBateau, tailleBateau);
		switch (numJoueur) {
		case 1:
			grilleJoueur1.placerBateau(bateau, lettre, chiffre, sens);
			break;
		case 2:
			grilleJoueur2.placerBateau(bateau, lettre, chiffre, sens);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + numJoueur);
		}
	}
	
	public String[] nomsBateaux() {
		return EnumNomBateau.enumToArray();
	}
	
	public int nbElementBateau(String nomBateau) {
		int nbElement = 0;
		switch (EnumNomBateau.stringToEnum(nomBateau)) {
		case PORTE_AVION:
			nbElement = 5;
			break;
		case CROISEUR:
			nbElement = 4;
			break;
		case SOUS_MARIN:
			nbElement = 3;
			break;
		case CONTRE_TORPILLEUR:
			nbElement = 3;
			break;
		case TORPILLEUR:
			nbElement = 2;
			break;
		default:
			System.out.println("Erreur de reconnaissance du nom du bateau");
		}
		return nbElement;
	}
	
}
