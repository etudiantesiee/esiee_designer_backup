package fr.esiee.pic.esieedesigner.design.tp2;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;



/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author ady & diane
 *         florian
 *         amineoos &pradhox
 */
public class DessinsGroupe1 extends CreateurDeForme {

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
	  
		
		//menton
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

	   // tete
      Point tetea = new Point(75,175);
      Point teteb = new Point(75,75);
      Point tetec = new Point(125,50);
      Point teted = new Point(175,75);
      Point tetee = new Point(225,50);
      Point tetef = new Point(275,75);
      Point teteg = new Point(275,175);
       
        	demarrerNouveauDessinAvecDesPoints()
        		.ajouter(tetea)
        		.ajouter(teteb)
        		.ajouter(tetec)
        		.ajouter(teted)
        		.ajouter(tetee)
        		.ajouter(tetef)
        		.ajouter(teteg)
        		.nePasRelierLesPointsExtreme();
      	
       // lunette rayban aviator
        Point lunettea = new Point(75,100);
        Point lunetteb = new Point(125,125);
        Point lunettec = new Point(175,100);
        Point lunetted = new Point(225,125);
        Point lunettee = new Point(275,100);
	  
       		demarrerNouveauDessinAvecDesPoints()
       			.ajouter(lunettea)
       			.ajouter(lunetteb)
       			.ajouter(lunettec)
       			.ajouter(lunetted)
       			.ajouter(lunettee)
       			.nePasRelierLesPointsExtreme();
              
	}
  
}
