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
	private static final double UNITE_HORIZONTALE = 50;
	private static final double OFFSET = 1050;
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	

	

   private static final Point Origin= new Point(60*25,5*25);



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
		 
		 Point oeildroitPoint = new Point((10*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*3);
		 Ellipse oeilDroit = new Ellipse(oeil_droit_point, 10, 20);
		 
		 Point oeilgauchePoint = new Point((8*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*3);
		 Ellipse oeilGauche = new Ellipse(oeil_gauche_point, 10, 20);
			
			
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
