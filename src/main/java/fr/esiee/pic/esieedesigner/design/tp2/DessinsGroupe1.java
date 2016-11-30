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
	  Point mentona = new Point(75,175);
	  Point mentonb = new Point(150,250);
	  Point mentonc = new Point(200,250);
	  Point mentond = new Point(275,175);
     
      	demarrerNouveauDessinAvecDesPoints()
      		.ajouter(mentona)
      		.ajouter(mentonb)
      		.ajouter(mentonc)
      		.ajouter(mentond)
      		.nePasRelierLesPointsExtreme();

	  
	  
	}
  
}
