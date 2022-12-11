package moteur_jeu;

public class Element {
	char lettre;
	int chiffre;
	boolean elementTouche = false;

	public Element(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}

	public boolean isElementTouche() {
		return elementTouche;
	}

	public boolean verifierCoordonnee(char lettre, int chiffre) {
		return lettre == this.lettre && chiffre == this.chiffre;
	}

	public void touche() {
		elementTouche = true;
	}

	public static void main(String[] args) {
		Element element = new Element('B', 3);
		System.out.println("L'élement a-t-il pour coordonnée ('A', 3) ? " + element.verifierCoordonnee('A', 3));
		System.out.println("L'élement a-t-il pour coordonnée ('B', 3) ? " + element.verifierCoordonnee('B', 3));
		System.out.println("L'élement est-il touché ? " + element.isElementTouche());
		System.out.println("Attaque de l'élément");
		element.touche();
		System.out.println("L'élement est-il touché ? " + element.isElementTouche());

	}
}
