package jeurole;

public class Heros extends Homme {

	public Heros(String nom) {
		super(nom);
		qteVie = 150;
	}

	public void parler(String texte) {
		livre.ecrire("Le héros ");
		super.parler(texte);
	}
	
	public static void main(String[] args) {
		Heros marc = new Heros("Marc");
		marc.parler("Salut");
	}
	
	public void prendreEpee(Epee epee) {
		parler("Je prends " + epee.nom + ".\n");
	}
}
