package livre;

import jeurole.Arc;
import jeurole.Bataille;
import jeurole.Dragon;
import jeurole.Ecran;
import jeurole.EntiteLivre;
//import jeuRole.EntiteLivre;
import jeurole.Epee;
import jeurole.Heros;
import jeurole.Homme;
import jeurole.LancePierre;
import jeurole.Livre;

public class MonHistoire {

	public static void main(String[] args) {

		Livre livre = new Ecran();
//		Livre livre = new Fichier();
		EntiteLivre.setLivre(livre);
		
//
		Bataille bataille = new Bataille();
//
		Dragon dragonRouge = new Dragon("Rougeoyant");
		Dragon dragonet = new Dragon("Dragonet");
		Homme thomas = new Homme("Thomas");
		Heros arthur = new Heros("Arthur");
		Epee excalibur = new Epee("Excalibur");
		Arc transperce = new Arc(3);
		LancePierre lancePierre = new LancePierre(); 
//		
		dragonRouge.rejointBataille(bataille);
		dragonet.rejointBataille(bataille);
		thomas.rejointBataille(bataille);
		arthur.rejointBataille(bataille);
//		
		arthur.prendre(excalibur);
		arthur.combattre(dragonet);
		dragonRouge.cracheBouleFeu(arthur);
		thomas.prendre(excalibur);
		thomas.combattre(dragonRouge);
		thomas.lacher();
		arthur.prendre(excalibur);
		arthur.combattre(dragonRouge);
		thomas.prendre(transperce);
		thomas.combattre(dragonet);
		arthur.combattre(dragonRouge);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.lacher();
		thomas.prendre(lancePierre);
		dragonet.cracheBouleFeu(arthur);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);

		}
}