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
	
private static final Point Origin= new Point(60*25,5*25);


	@Override
	public void dessiner() {
		/*cheveux*/
		Point a= new Point(Origin.getX()+50,0);
		Point b= new Point(Origin.getX()+100,25);
		Point c= new Point(Origin.getX()+150,75);
		Point d= new Point(Origin.getX()+150,200);//pic1
		Point e= new Point(Origin.getX()+125,150);
		Point f= new Point(Origin.getX()+125,100);
		Point g= new Point(Origin.getX()+125,200);
		Point h= new Point(Origin.getX()+100,150);
		Point i= new Point(Origin.getX()+100,125);
		Point j= new Point(Origin.getX()+100,175);
		Point k= new Point(Origin.getX()+75,125);
		Point l= new Point(Origin.getX()+75,100);
		Point m= new Point(Origin.getX()+50,75);
		Point n= new Point(Origin.getX()+25,75);
		Point o= new Point(Origin.getX()+0,50);
		
		/*dessin cheveux*/
		demarrerNouveauDessinAvecDesPoints().ajouter(a)
		.ajouter(b)
		.ajouter(c)
		.ajouter(d)
		.ajouter(e)
		.ajouter(f)
		.ajouter(g)
		.ajouter(h)
		.ajouter(i)
		.ajouter(j)
		.ajouter(k)
		.ajouter(l)
		.ajouter(m)
		.ajouter(n)
		.ajouter(o)
		.ajouter(getSymetrie(n))
		.ajouter(getSymetrie(m))
		.ajouter(getSymetrie(l))
		.ajouter(getSymetrie(k))
		.ajouter(getSymetrie(j))
		.ajouter(getSymetrie(i))
		.ajouter(getSymetrie(h))
		.ajouter(getSymetrie(g))
		.ajouter(getSymetrie(f))
		.ajouter(getSymetrie(e))
		.ajouter(getSymetrie(d))
		.ajouter(getSymetrie(c))
		.ajouter(getSymetrie(b))
		.ajouter(getSymetrie(a));
		
		}
	
	
	
	private Point getSymetrie(Point point){
		return new Point(2*Origin.getX()-point.getX(), point.getY());
		
	}

}
