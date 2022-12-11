package jeurole;

public class Dragon extends EtreVivant {
	int nbBoulesDeFeu = 10;

	public Dragon(String nom) {
		super(nom, 200);
	}

	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		bataille.ajouter(this);
	}
	
	protected void mourir() {
		livre.ecrire("c'est ainsi que le dragon "+nom+ " mourut.\n");
		bataille.eliminer(this);
	}
	
	public void cracheBouleFeu(Homme homme) {
		if (nbBoulesDeFeu > 0) {
			nbBoulesDeFeu--;
			livre.ecrire(nom + " crache une boule de feu sur " + homme.nom + ".\n");
			homme.subirAttaque(100);	
		} else {
			livre.ecrire(nom + " n'avait plus de feu en lui,  " + homme.nom + " a eu beaucoup de chance ! \n");
		}
	}
}
