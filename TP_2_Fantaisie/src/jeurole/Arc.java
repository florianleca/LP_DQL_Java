package jeurole;

public class Arc extends Arme {
	int nbrFleche;

	public Arc(int nbrFleche) {
		super("arc", 30);
		this.nbrFleche = nbrFleche;
	}

	public void attaquer(Dragon dragon) {
		if (nbrFleche > 0) {
			nbrFleche--;
			super.attaquer(dragon);
		} else {
			System.out.println("Malheureusement " + proprietaire.nom + " ne possédait plus de flèches.");
		}
	}
}
