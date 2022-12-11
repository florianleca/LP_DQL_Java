package jeurole;

public class Arme extends EntiteLivre{
	Homme proprietaire;
	String nature;
	int nbDegats;

	public Arme(String nature, int nbDegats) {
		this.nature = nature;
		this.nbDegats = nbDegats;
	}

	public Homme getProprietaire() {
		return proprietaire;
	}

	public String getNature() {
		return nature;
	}

	public boolean estPris() {
		return proprietaire != null;
	}

	public void prendre(Homme proprietaire) {
		this.proprietaire = proprietaire;
	}

	public void lacher() {
		proprietaire = null;
	}
	
	public void attaquer(Dragon dragon) {
		livre.ecrire(proprietaire.nom + " attaque " + dragon.nom + " avec son " + nature + ".\n");
		dragon.subirAttaque(nbDegats);
	}
}
