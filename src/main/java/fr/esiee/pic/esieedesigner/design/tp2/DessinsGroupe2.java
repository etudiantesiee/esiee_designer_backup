package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */



public class DessinsGroupe2 extends CreateurDeForme {
	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 50;
	private static final double OFFSET = ;
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	
	private static final Point Origin= new Point(350,50);

	@Override
	public void dessiner() {
		
		 Point Talon_droite = new Point(7*UNITE_HORIZONTALE,UNITE_VERTICALE*14);
		 Point BoutPied_droite = new Point(9*UNITE_HORIZONTALE,UNITE_VERTICALE*14);
		 Point HautPied_droite = new Point(8*UNITE_HORIZONTALE,UNITE_VERTICALE*13);
		 
		 
		 demarrerNouveauDessinAvecDesPoints()
      		.ajouter(Talon_droite)
		    .ajouter(BoutPied_droite)
		    .ajouter(HautPied_droite);
		 
		
	}
	
	private Point getSymetrie(Point point){
		return new Point(Origin.getX()-point.getX(), point.getY());
		
	}

}
