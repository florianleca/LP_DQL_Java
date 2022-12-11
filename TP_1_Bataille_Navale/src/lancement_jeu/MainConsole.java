package lancement_jeu;

import interaction_console.Interaction;
import moteur_jeu.Jeu;

public class MainConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Interaction(new Jeu());
	}

}
