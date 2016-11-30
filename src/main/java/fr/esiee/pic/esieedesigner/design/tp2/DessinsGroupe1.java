package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe1 extends CreateurDeForme {

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
        Point basGaucheTete = new Point(50,175);
        Point gaucheTete2 = new Point(25,75);

        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(basGaucheTete)
        .ajouter(gaucheTete2)
        .nePasRelierLesPointsExtreme();
	}

}
