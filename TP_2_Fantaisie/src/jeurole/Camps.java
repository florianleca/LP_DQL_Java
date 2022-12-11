package jeurole;

import java.util.Vector;

public class Camps {
	private Vector<EtreVivant> compagnons = new Vector<EtreVivant>();

	public void ajouterEtreVivant(EtreVivant compagnon) {
		compagnons.add(compagnon);
	}

	public void supprimerCompagnon(EtreVivant compagnon) {
		compagnons.remove(compagnon);
	}

	public int nbCompagnon() {
		return compagnons.size();
	}
	
	//TODO Ajout Graphique
	public EtreVivant getCompagnon(int indice){
		return this.compagnons.get(indice);
	}
	public Vector<String> nomsCompagnons() {
		Vector<String> noms = new Vector<String>();
		for (EtreVivant etre : compagnons) {
			noms.add(etre.getNom());
		}
		return noms;
	}
	
	public boolean isDansCamps(EtreVivant etre){
		return this.compagnons.contains(etre);
	}
}
