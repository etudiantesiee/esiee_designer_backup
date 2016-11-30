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

	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 25;
	
/* point d'origine du  dessin*/
    /* point d'origine qui sert à la réalisation de l'objectif 2 */
	private static final Point ORIGIN= new Point(10*25,5*25);


	/*fonction de dessin du personnage*/
	@Override
	public void dessiner() {

		/*corps*/
		 Point talonDroite = new Point(0+ORIGIN.getX(),UNITE_VERTICALE*14 + ORIGIN.getY());
		 Point boutpiedDroite = new Point((2*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*14 + ORIGIN.getY());
		 Point hautpiedDroite = new Point((1*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*13 + ORIGIN.getY());
		 Point jupebasDroite = new Point((5*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*13 + ORIGIN.getY());
		 Point jupehautDroite = new Point((4*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*11 + ORIGIN.getY());
		 Point aisselleDroite = new Point((4*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*10 + ORIGIN.getY());
		 Point manche1Droite = new Point((5*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*11 + ORIGIN.getY());
		 Point main1Droite = new Point((6*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*12 + ORIGIN.getY());
		 Point main2Droite = new Point((6*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*11 + ORIGIN.getY());
		 Point main3Droite = new Point((7*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*11 + ORIGIN.getY());
		 Point manche2Droite = new Point((6*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*10 + ORIGIN.getY());
		 Point epauleDroite = new Point((4*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*8 + ORIGIN.getY());
		 Point couDroite = new Point((3*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*8 + ORIGIN.getY());
		 Point sysmetriecorpsDroite = new Point((4*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*8 + ORIGIN.getY());

		 /*dessin corps*/
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
		    .ajouter(couDroite)
		    .nePasRelierLesPointsExtreme();
		 
		 /*dessin corps symetrie*/
		 demarrerNouveauDessinAvecDesPoints()
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
			.ajouter(getSymetrie(sysmetriecorpsDroite))
			.ajouter(getSymetrie(couDroite))
			.nePasRelierLesPointsExtreme();

		 /*dessin de la manche droite*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(manche1Droite)
		 .ajouter(manche2Droite);
		 
		 /*dessin de la manche gauche*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(getSymetrie(manche1Droite))
		 .ajouter(getSymetrie(manche2Droite));
		 
		 /*trait jupe*/
		 Point jupehautGauche = new Point((-4*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*11 + ORIGIN.getY());
		 
		 /*dessin trait jupe*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(getSymetrie(jupehautDroite))
		 .ajouter(getSymetrie(jupehautGauche));
		 
		 /*trait talon horizontal*/
		 Point hautpiedGauche = new Point((-1*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*13 + ORIGIN.getY());
		 
		 /*dessin trait talon horizontal*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(getSymetrie(hautpiedDroite))
		 .ajouter(getSymetrie(hautpiedGauche));
		 
		 /*trait talon vertical*/
		 Point chevilleDroite = new Point(0+ORIGIN.getX(),UNITE_VERTICALE*13 + ORIGIN.getY());
		 
		 /*dessin trait talon vertical*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(getSymetrie(chevilleDroite))
		 .ajouter(getSymetrie(talonDroite));
		 
		 /*forme colorisation jupe*/
		 Point jupebasGauche = new Point((-5*UNITE_HORIZONTALE)+ORIGIN.getX(),UNITE_VERTICALE*13 + ORIGIN.getY());
		 
		 /*colorisation jupe*/
		 demarrerNouveauDessinAvecDesPoints()
		 .ajouter(getSymetrie(chevilleDroite))
		 .ajouter(getSymetrie(jupebasDroite))
		 .ajouter(getSymetrie(jupehautDroite))
		 .ajouter(getSymetrie(jupehautGauche))
		 .ajouter(getSymetrie(jupebasGauche))
		 .ajouter(getSymetrie(chevilleDroite))
		 .couleurDeFond(Couleur.GRIS);
		 
		 /*dessin tete*/
		 dessinTete();
	}

	
	/*fonction de dessin de la tete*/
	private void dessinTete(){
		
	

		Point a= new Point(ORIGIN.getX()+50,ORIGIN.getY()+0);
		Point b= new Point(ORIGIN.getX()+100,ORIGIN.getY()+25);
		Point c= new Point(ORIGIN.getX()+150,ORIGIN.getY()+75);
		Point d= new Point(ORIGIN.getX()+150,ORIGIN.getY()+200);
		Point e= new Point(ORIGIN.getX()+125,ORIGIN.getY()+150);
		Point f= new Point(ORIGIN.getX()+125,ORIGIN.getY()+100);
		Point g= new Point(ORIGIN.getX()+125,ORIGIN.getY()+200);
		Point h= new Point(ORIGIN.getX()+100,ORIGIN.getY()+150);
		Point i= new Point(ORIGIN.getX()+100,ORIGIN.getY()+125);
		Point j= new Point(ORIGIN.getX()+100,ORIGIN.getY()+175);
		Point k= new Point(ORIGIN.getX()+75,ORIGIN.getY()+125);
		Point l= new Point(ORIGIN.getX()+75,ORIGIN.getY()+100);
		Point m= new Point(ORIGIN.getX()+50,ORIGIN.getY()+75);
		Point n= new Point(ORIGIN.getX()+25,ORIGIN.getY()+75);
		Point o= new Point(ORIGIN.getX()+0,ORIGIN.getY()+50);
		
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
		.ajouter(getSymetrie(a))
		.couleurDeFond(Couleur.GRIS);
		
		
		/*visage*/
		Point p= new Point(ORIGIN.getX()+75,ORIGIN.getY()+200);
		Point q= new Point(ORIGIN.getX()+25,ORIGIN.getY()+225);
		
		/*dessin visage*/
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(j);
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(q);
		demarrerNouveauDessinAvecDesPoints().ajouter(q).ajouter(getSymetrie(q));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(q)).ajouter(getSymetrie(p));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(p)).ajouter(getSymetrie(j));
		
		/*bouche*/
		Point s= new Point(ORIGIN.getX()+75,ORIGIN.getY()+150);
		Point t= new Point(ORIGIN.getX()+75,ORIGIN.getY()+175);
		Point u= new Point(ORIGIN.getX()+25,ORIGIN.getY()+200);
		
		/*dessin bouche*/
		demarrerNouveauDessinAvecDesPoints().ajouter(s)
		.ajouter(t)
		.ajouter(u)
		.ajouter(getSymetrie(u))
		.ajouter(getSymetrie(t))
		.ajouter(getSymetrie(s));
		
		/*nez*/
		Point v= new Point(ORIGIN.getX()+0,ORIGIN.getY()+125);
		Point w= new Point(ORIGIN.getX()+5,ORIGIN.getY()+130);
		
		/*dessin nez*/
		demarrerNouveauDessinAvecDesPoints().ajouter(w)
		.ajouter(v)
		.ajouter(getSymetrie(w))
		.nePasRelierLesPointsExtreme();
		
		/*yeux*/
		Point x= new Point(ORIGIN.getX()+25,ORIGIN.getY()+100);
		
		/*dessin yeuxout mécanisme formant une image doit être capable de percevoir les différences d'intensité entre les différentes directions d'incidence de la lumière. L'œil doit donc être capable de détecter la lumière, détecter sa direction, et établir une relation hiérarchique entre les signaux provenant des différentes directions.
Coupe transversale d'un œil composé de libellule

La perception de la lumière dans l'œil se fait grâce à des pigments, composés de deux parties liées covalemment : une partie protéique, l'opsine et une partie lipidique dérivée de la vitamine A (11-cis rétinal), le chromophore. Le pigment est disposé dans la membrane des cellules photoréceptrices, et est constituée de sept hélices transmembranaires disposées en cercle dans la membrane autour du chromophore. C'est l'absorption d'un photon par le chromophore, permettant le passage de la configuration 11-cis du chromophore à une configuration all-trans, qui permet la sensibilité à la lumière. Une fois le pigment excité, l'opsine permet l'activation d'une protéine G via une de ses boucles cytoplasmiques, ce qui déclenche ensuite la réponse cellulaire.

La perception de la direction nécessite de concentrer les rayons lumineux provenant d'une même direction de l'espace sur un faible nombre de photorécepteurs de la rétine, lesquels doivent être regroupés spatialement. Il existe de nombreuses manières de regrouper les rayons lumineux d'une même direction dans le monde animal, apparues indépendamment au cours de l'évolution. On peut cependant diviser les différentes méthodes en trois grandes stratégies: les rayons lumineux ne provenant pas de la bonne direction sont éliminés par ombrage d'une autre structure de l'œil sur la rétine, les rayons d'une même direction sont incurvés et orientés vers un même point de la rétine par réfraction, ou les rayons sont dirigés sur les photorécepteurs par réflexion sur un miroir concave disposé derrière la rétine. Ainsi, chaque photorécepteur ou groupe de photorécepteurs détecte la lumière provenant d'une seule direction.

Enfin, la comparaison des intensités lumineuses issues d'une même direction de l'espace nécessite une intégration des signaux électriques fournis par les neurones photorécepteurs. Cette intégration se fait en aval de la rétine. Le signal perçu par le cerveau n'est jamais absolu, et seule la différence d'intensité perçue entre les photorécepteurs est retenue, et non pas le niveau total d'intensité. Ceci permet à l'œil de s'adapter à la luminosité ambiante. En effet, en condition de forte luminosité, une même différence d'intensité entre deux récepteurs paraîtra plus faible, ce qui diminue la qualité de l'image.
*/
		ajouterEllipse(new Ellipse(x, 10, 20), Couleur.NOIR);
		ajouterEllipse(new Ellipse(getSymetrie(x), 10, 20), Couleur.NOIR);	
		
		/*
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 * COMMENTAIRE 
		 */
		
	}
	
	
	/*fonction de symetrie*/
	private Point getSymetrie(Point point){
		return new Point(2*ORIGIN.getX()-point.getX(), point.getY());
		
	}

}
