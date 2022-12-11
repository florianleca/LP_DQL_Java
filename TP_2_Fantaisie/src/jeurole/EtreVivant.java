package jeurole;

public abstract class EtreVivant extends EntiteLivre{
	protected int qteVie;
	protected String nom;
	protected Bataille bataille;

	protected EtreVivant(String nom, int qteVie) {
		this.nom = nom;
		this.qteVie = qteVie;
	}

	public String getNom() {
		return nom;
	}
	
	public void subirAttaque(int forceAttaque) {
		qteVie-=forceAttaque;
		livre.ecrire(nom + " subit une violente attaque, ");
		if(qteVie<=0) {
			
			livre.ecrire("trop violente pour survivre." + "\n");
			mourir();
		}
		else {
			livre.ecrire("mais il parvient à se relever."+ "\n");

		}
	}
	
	protected void rejointBataille(Bataille bataille) {
		this.bataille = bataille;
	}

	protected abstract void mourir();
	
}
