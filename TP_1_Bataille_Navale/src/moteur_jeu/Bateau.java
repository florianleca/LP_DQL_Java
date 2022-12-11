package moteur_jeu;

public class Bateau {
	//private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	public Element[] bateau;

	public int getTailleBateau() {
		return tailleBateau;
	}

	public char getEtatBateau() {
		return etatBateau;
	}
	
	public Bateau(String nom, int tailleBateau) {
		//this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau];
	}

	void placerBateau(char lettre, int chiffre, char sens) {
		for (int i = 0; i < bateau.length; i++) {
			if (sens == 'H') {
				bateau[i] = new Element(lettre, chiffre + i);
			} else if (sens == 'V') {
				bateau[i] = new Element((char) (lettre + i), chiffre);
			}
		}
	}

	boolean appartientBateau(char lettre, int chiffre) {
		for (int i = 0; i < bateau.length; i++) {
			if (bateau[i].verifierCoordonnee(lettre, chiffre)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		 Bateau torpilleur = new Bateau("torpilleur", 2);
		 torpilleur.placerBateau('A', 1, 'H');
		 System.out.println("Le torpilleur a-t-il un élément en ('A',2) ? "+ torpilleur.appartientBateau('A', 2));
		 System.out.println("Le torpilleur a-t-il un élément en ('B',2) ? "+ torpilleur.appartientBateau('B', 2));
		 System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
	}



}
