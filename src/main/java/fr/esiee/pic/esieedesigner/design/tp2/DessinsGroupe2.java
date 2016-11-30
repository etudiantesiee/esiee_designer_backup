package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
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
	private static final double UNITE_HORIZONTALE = 25;
	private static final double OFFSET = 1050;
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 25;
	
	private static final Point origin= new Point(60*25,5*25);


	@Override
	public void dessiner() {


		 Point talonDroite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point boutpiedDroite = new Point((9*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point hautpiedDroite = new Point((8*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 Point jupebasDroite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 
		 Point jupehautDroite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point aisselleDroite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		 
		 Point manche1Droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point main1Droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*12);
		 Point main2Droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point main3Droite = new Point((14*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point manche2Droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		
		 
		 Point epauleDroite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 Point sysmetriecorpsDroite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 Point oeildroitPoint = new Point((8*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*5);
		 Ellipse oeilDroit = new Ellipse(oeildroitPoint, 10, 20);
		 
		 Point oeilgauchePoint = new Point((10*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*5);
		 Ellipse oeilGauche = new Ellipse(oeilgauchePoint, 10, 20);
			
			
		 ajouterEllipse(oeilDroit, Couleur.NOIR);
		 ajouterEllipse(oeilGauche, Couleur.NOIR);
		 
		 
		 demarrerNouveauDessinAvecDesPoints()
      		.ajouter(talonDroite)
		    .ajouter(boutpiedDroite)
		    .ajouter(hautpiedDroite)
		    .ajouter(jupebasDroite)
		    .ajouter(jupehautDroite)
		    .ajouter(aisselleDroite)
		    .ajouter(manche1Droite)
		    .ajouter(main1Droite)
		    .ajouter(main2Droite)
		    .ajouter(main3Droite)
		    .ajouter(manche2Droite)
		    .ajouter(epauleDroite)
		    .ajouter(sysmetriecorpsDroite)
		 
		 	.ajouter(getSymetrie(talonDroite))
			.ajouter(getSymetrie(boutpiedDroite))
			.ajouter(getSymetrie(hautpiedDroite))
			.ajouter(getSymetrie(jupebasDroite))
			.ajouter(getSymetrie(jupehautDroite))
			.ajouter(getSymetrie(aisselleDroite))
			.ajouter(getSymetrie(manche1Droite))
			.ajouter(getSymetrie(main1Droite))
			.ajouter(getSymetrie(main2Droite))
			.ajouter(getSymetrie(main3Droite))
			.ajouter(getSymetrie(manche2Droite))
			.ajouter(getSymetrie(epauleDroite))
			.ajouter(getSymetrie(sysmetriecorpsDroite));
			
		
	

		
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
