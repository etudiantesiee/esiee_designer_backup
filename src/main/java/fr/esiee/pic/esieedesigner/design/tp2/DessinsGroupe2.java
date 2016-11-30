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
	private static final double OFFSET = 1050;
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	
	private static final Point Origin= new Point(350,50);


	@Override
	public void dessiner() {

		 Point Talon_droite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point BoutPied_droite = new Point((9*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point HautPied_droite = new Point((8*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 Point JupeBas_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 
		 Point JupeHaut_droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point Aisselle_droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		 
		 Point Manche1_droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point Main1_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*12);
		 Point Main2_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point Main3_droite = new Point((14*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point Manche2_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		
		 
		 Point Epaule_droite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 Point SysmetrieCorps_droite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 demarrerNouveauDessinAvecDesPoints()
      		.ajouter(Talon_droite)
		    .ajouter(BoutPied_droite)
		    .ajouter(HautPied_droite)
		    .ajouter(JupeBas_droite)
		    .ajouter(JupeHaut_droite)
		    .ajouter(Aisselle_droite)
		    .ajouter(Manche1_droite)
		    .ajouter(Main1_droite)
		    .ajouter(Main2_droite)
		    .ajouter(Main3_droite)
		    .ajouter(Manche2_droite)
		    .ajouter(Epaule_droite)
		    .ajouter(SysmetrieCorps_droite);
		 
		
	

		Point A= new Point(Origin.getX()+50,0);
		Point Abis= new Point(Origin.getX()+100,25);
		Point B= new Point(Origin.getX()+150,75);
		Point C= new Point(Origin.getX()+150,200);//pic1
		Point D= new Point(Origin.getX()+125,150);
		Point E= new Point(Origin.getX()+125,100);
		Point F= new Point(Origin.getX()+125,200);
		Point G= new Point(Origin.getX()+100,150);
		Point H= new Point(Origin.getX()+100,125);
		Point I= new Point(Origin.getX()+100,175);
		Point J= new Point(Origin.getX()+75,125);
		Point K= new Point(Origin.getX()+75,100);
		Point L= new Point(Origin.getX()+50,75);
		Point M= new Point(Origin.getX()+25,75);
		Point N= new Point(Origin.getX()+0,50);
		
	
		}
	

	
	private Point getSymetrie(Point point){
		return new Point(Origin.getX()-point.getX(), point.getY());
		
	}

}
