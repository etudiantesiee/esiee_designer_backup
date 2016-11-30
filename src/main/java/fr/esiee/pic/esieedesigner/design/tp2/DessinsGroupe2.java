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
	
private static final Point Origin= new Point(350,50);


	@Override
	public void dessiner() {
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
