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
	
private static final Point origin= new Point(60*25,5*25);


	@Override
	public void dessiner() {
		/*cheveux*/
		Point a= new Point(origin.getX()+50,origin.getY()+0);
		Point b= new Point(origin.getX()+100,origin.getY()+25);
		Point c= new Point(origin.getX()+150,origin.getY()+75);
		Point d= new Point(origin.getX()+150,origin.getY()+200);//pic1
		Point e= new Point(origin.getX()+125,origin.getY()+150);
		Point f= new Point(origin.getX()+125,origin.getY()+100);
		Point g= new Point(origin.getX()+125,origin.getY()+200);
		Point h= new Point(origin.getX()+100,origin.getY()+150);
		Point i= new Point(origin.getX()+100,origin.getY()+125);
		Point j= new Point(origin.getX()+100,origin.getY()+175);
		Point k= new Point(origin.getX()+75,origin.getY()+125);
		Point l= new Point(origin.getX()+75,origin.getY()+100);
		Point m= new Point(origin.getX()+50,origin.getY()+75);
		Point n= new Point(origin.getX()+25,origin.getY()+75);
		Point o= new Point(origin.getX()+0,origin.getY()+50);
		
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
		
		/*visage*/
		Point p= new Point(origin.getX()+75,origin.getY()+200);
		Point q= new Point(origin.getX()+25,origin.getY()+225);
		
		/*dessin visage*/
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(j);
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(q);
		demarrerNouveauDessinAvecDesPoints().ajouter(q).ajouter(getSymetrie(q));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(q)).ajouter(getSymetrie(p));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(p)).ajouter(getSymetrie(j));
		
		/*bouche*/
		Point s= new Point(origin.getX()+75,origin.getY()+150);
		Point t= new Point(origin.getX()+75,origin.getY()+175);
		Point u= new Point(origin.getX()+25,origin.getY()+200);
		
		
		}
	
	
	
	private Point getSymetrie(Point point){
		return new Point(2*origin.getX()-point.getX(), point.getY());
		
	}

}
