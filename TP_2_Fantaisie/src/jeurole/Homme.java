package jeurole;

public class Homme extends EtreVivant {
	private Arme maPossession;

	public Homme(String nom) {
		super(nom, 100);
	}

	public void parler(String texte) {
		livre.ecrire(nom + " : " + texte);
	}

	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		bataille.ajouter(this);
	}

	protected void mourir() {
		bataille.eliminer(this);
		
		if (maPossession != null) {
			lacher();
		}
		livre.ecrire("C'est ainsi que le courageux " + nom + " mourut.\n");
	}

	public void lacher() {
		livre.ecrire(nom + " a lâché " + maPossession.nature+ " \n");
		maPossession.proprietaire = null;
		maPossession = null;
	}

	public void prendre(Arme arme) {
		if (maPossession != null) {
			maPossession.lacher();
		}
		if (arme.proprietaire != null) {
			Homme proprietaire = arme.proprietaire;
			parler(proprietaire.nom + ", peux-tu me laisser ton " + arme.nature + " ?\n");
			proprietaire.parler("Pas de soucis, cela me permettra de reprendre mon souffle.\n");
			proprietaire.lacher();
		}
		if (arme instanceof Epee) {
			prendreEpee((Epee)arme);
		} else {
			parler("Je prends " + arme.nature + ".\n");
		}
		
		maPossession = arme;
		maPossession.proprietaire = this;
	}

	public void combattre(Dragon dragon) {
		if (maPossession == null) {
			mourir();
		} else {
			maPossession.attaquer(dragon);
		}
	}
	
	public void prendreEpee(Epee epee) {
		qteVie -=10;
		parler("Je prends l'épée même si pour cela je dois perdre des forces.\n");
		if (qteVie<=0) {
			livre.ecrire(nom + " a voulu prendre l'épée mais son état de fatigue ne lui permettait pas cet ultime effort, il en est mort.\n");
			mourir();
		}
	}
}
