package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe3 extends CreateurDeForme {
	/**
	 * Unite de dessin Horizontale
	 */
	private static final double UNITE_HORIZONTALE = 50;
	
	/**
	 * Unite de dessin Verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	/**
	 * Point de depart du dessin
	 */
	private static final Point POINT_DEPART = new Point(UNITE_HORIZONTALE*15, UNITE_VERTICALE*16);

    /**
     * dessin
     */
	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerContour();
		dessinerYeuxD();
		dessinerYeuxG();
		dessinerLunette();
		dessinerNez();
		dessinerBouche();
		dessinerMenton();
		dessinerCheveux1();
		dessinerCheveux2();
		dessinerCheveux3();		
		dessinerBrasG();
		dessinerBrasD();
		dessinerJambeG();
		dessinerJambeD();		
		
	}


    /**
     * dessin  
     */
    public void dessinerContour() {
    	Point mentonBasGauche = new Point (POINT_DEPART.getX() + 3 * UNITE_HORIZONTALE, POINT_DEPART.getY() - 2 * UNITE_VERTICALE); 
    	Point mentonHautGauche = new Point (mentonBasGauche.getX() - 2 * UNITE_HORIZONTALE, mentonBasGauche.getY() - 2 * UNITE_VERTICALE);
    	Point joueBasGauche = new Point (mentonHautGauche.getX() - UNITE_HORIZONTALE, mentonHautGauche.getY() - 3 * UNITE_VERTICALE);
    	Point joueHautGauche = new Point (joueBasGauche.getX(), joueBasGauche.getY() - 2 * UNITE_VERTICALE);
    	Point frontGauche = new Point (joueHautGauche.getX() + UNITE_HORIZONTALE, joueHautGauche.getY() - 2 * UNITE_VERTICALE);
    	Point frontHautGauche = new Point (frontGauche.getX() + 2 * UNITE_HORIZONTALE , frontGauche.getY() - UNITE_VERTICALE);
    	Point frontHautDroite = new Point (frontHautGauche.getX() + 2 * UNITE_HORIZONTALE, frontHautGauche.getY() );
    	Point frontDroite = new Point (frontHautDroite.getX() + 2 * UNITE_HORIZONTALE, frontHautDroite.getY() + UNITE_VERTICALE);
    	Point joueHautDroite = new Point (frontDroite.getX() + UNITE_HORIZONTALE, frontDroite.getY() + 2 * UNITE_VERTICALE);
    	Point joueBasDroite = new Point (joueHautDroite.getX() , joueHautDroite.getY() + 2 * UNITE_VERTICALE);
    	Point mentonHautDroite = new Point (joueBasDroite.getX() - UNITE_HORIZONTALE, joueBasDroite.getY() + 3 * UNITE_VERTICALE);
    	Point mentonBasDroite = new Point (mentonHautDroite.getX() - 2 * UNITE_HORIZONTALE, mentonHautDroite.getY() + 2 * UNITE_VERTICALE);
    	
    	
    	demarrerNouveauDessinAvecDesPoints()
    	
    	.ajouter(mentonBasGauche)
    	.ajouter(mentonHautGauche)
    	.ajouter(joueBasGauche)
    	.ajouter(joueHautGauche)
    	.ajouter(frontGauche)
    	.ajouter(frontHautGauche)
    	.ajouter(frontHautDroite)
    	.ajouter(frontDroite)
    	.ajouter(joueHautDroite)
    	.ajouter(joueBasDroite)
    	.ajouter(mentonHautDroite)
    	.ajouter(mentonBasDroite);
    	
    }
    /**
     * dessin oeil droit
     */
    public void dessinerYeuxD() {
    	Point centreOeilDroite = new Point(POINT_DEPART.getX() + 5*UNITE_HORIZONTALE, POINT_DEPART.getY() -8*UNITE_VERTICALE);
		Ellipse oeilDroite = new Ellipse(centreOeilDroite, 10, 20);
		
		ajouterEllipse(oeilDroite, Couleur.NOIR);
    }
    /**
     * dessin oeil gauche
     */
    public void dessinerYeuxG() {
    	Point centreOeilGauche = new Point(POINT_DEPART.getX() + 3*UNITE_HORIZONTALE, POINT_DEPART.getY() -8*UNITE_VERTICALE);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 10, 20);
		
		ajouterEllipse(oeilGauche, Couleur.NOIR);
        
    }
    /**
     * dessin des lunettes
     */
    public void dessinerLunette() {
    	
     Point lunette1 = new Point(POINT_DEPART.getX() + UNITE_HORIZONTALE, POINT_DEPART.getY() -8*UNITE_VERTICALE);
     Point lunette2 = new Point(lunette1.getX() , lunette1.getY() -UNITE_VERTICALE);
     Point lunette3 = new Point(lunette2.getX() + 6*UNITE_HORIZONTALE, lunette2.getY());
     Point lunette4 = new Point(lunette3.getX(), lunette3.getY() +UNITE_VERTICALE);
     Point lunette5 = new Point(lunette4.getX() -UNITE_HORIZONTALE, lunette4.getY() +UNITE_VERTICALE);
     Point lunette6 = new Point(lunette5.getX() -UNITE_HORIZONTALE, lunette5.getY() );
     Point lunette7 = new Point(lunette6.getX() -UNITE_HORIZONTALE, lunette6.getY() -UNITE_VERTICALE);
     Point lunette8 = new Point(lunette7.getX() -UNITE_HORIZONTALE, lunette7.getY() +UNITE_VERTICALE);
     Point lunette9= new Point(lunette8.getX()-UNITE_HORIZONTALE , lunette8.getY() );
     
          
     demarrerNouveauDessinAvecDesPoints()
          
     .ajouter(lunette1)
     .ajouter(lunette2)
     .ajouter(lunette3)
     .ajouter(lunette4)
     .ajouter(lunette5)     
     .ajouter(lunette6)
     .ajouter(lunette7)
     .ajouter(lunette8)
     .ajouter(lunette9);
     
    }

    /**
     * dessin 
     */
    public void dessinerNez() {
    	
        
    }

    /**
     * dessin de la bouche 
     */
    public void dessinerBouche() {
    	 Point bouche1 = new Point(POINT_DEPART.getX() + 2*UNITE_HORIZONTALE, POINT_DEPART.getY() -5*UNITE_VERTICALE);
    	 Point bouche2 = new Point(bouche1.getX() + 4*UNITE_HORIZONTALE, bouche1.getY() );
    	 Point bouche3 = new Point(bouche2.getX() -UNITE_HORIZONTALE, bouche2.getY() +2*UNITE_VERTICALE);
    	 Point bouche4 = new Point(bouche3.getX() -2*UNITE_HORIZONTALE, bouche3.getY() );
    	  demarrerNouveauDessinAvecDesPoints()
          
    	     .ajouter(bouche1)
    	     .ajouter(bouche2)
    	     .ajouter(bouche3)
    	     .ajouter(bouche4);
    	
    }

    /**
     * dessin 
     */
    public void dessinerMenton() {
    	double untier = 16.6;
    	double longueurmenton = 20;
    	Point menton1 = new Point(POINT_DEPART.getX() -untier+ 4*UNITE_HORIZONTALE, POINT_DEPART.getY() -2*UNITE_VERTICALE-untier);
    	Point menton2 = new Point(menton1.getX() +longueurmenton, menton1.getY());
    	demarrerNouveauDessinAvecDesPoints()
        
	     .ajouter(menton1)
	     .ajouter(menton2)
	    ;
    	
    }

    /**
     * dessin 
     */
    public void dessinerCheveux1() {
       double troisquart = 75;
 	   Point cheveux11 = new Point (POINT_DEPART.getX() + UNITE_HORIZONTALE,POINT_DEPART.getY() - 11*UNITE_VERTICALE);
 	   Point cheveux12 = new Point (cheveux11.getX() + 2*UNITE_HORIZONTALE,cheveux11.getY() + UNITE_VERTICALE );
 	   Point cheveux13 = new Point (cheveux12.getX()- UNITE_HORIZONTALE, cheveux12.getY() - troisquart);
 	  
	   demarrerNouveauDessinAvecDesPoints()
 	   .ajouter(cheveux11)
 	   .ajouter(cheveux12)
 	   .ajouter(cheveux13)   
 	   .couleurDeFond(Couleur.GRIS);  	 
        
    }

    /**
     * dessin 
     */
    public void dessinerCheveux2() {
   	   Point cheveux21 = new Point (POINT_DEPART.getX() + 3*UNITE_HORIZONTALE,POINT_DEPART.getY() - 12*UNITE_VERTICALE);
   	   Point cheveux22 = new Point (cheveux21.getX() + UNITE_HORIZONTALE,cheveux21.getY() + 2*UNITE_VERTICALE );
   	   Point cheveux23 = new Point (cheveux22.getX()+ UNITE_HORIZONTALE, cheveux22.getY() - 2*UNITE_VERTICALE );
   	  
  	   demarrerNouveauDessinAvecDesPoints()
   	   .ajouter(cheveux21)
   	   .ajouter(cheveux22)
   	   .ajouter(cheveux23)   
   	   .couleurDeFond(Couleur.GRIS);        
    }
    /**
     * dessin 
     */
    public void dessinerCheveux3() {
        double troisquart = 75;
  	   Point cheveux31 = new Point (POINT_DEPART.getX() + 7*UNITE_HORIZONTALE,POINT_DEPART.getY() - 11*UNITE_VERTICALE);
  	   Point cheveux32 = new Point (cheveux31.getX() - 2*UNITE_HORIZONTALE,cheveux31.getY() + UNITE_VERTICALE );
  	   Point cheveux33 = new Point (cheveux32.getX()+ UNITE_HORIZONTALE, cheveux32.getY() - troisquart);
  	  
 	   demarrerNouveauDessinAvecDesPoints()
  	   .ajouter(cheveux31)
  	   .ajouter(cheveux32)
  	   .ajouter(cheveux33)   
  	   .couleurDeFond(Couleur.GRIS);  	         
    }
    /**
     * dessin 
     */
    public void dessinerBrasG() {
    	double deuxtier = 33.3;
 	   Point brasG1 = new Point (POINT_DEPART.getX() + UNITE_HORIZONTALE,POINT_DEPART.getY() - 3*UNITE_VERTICALE);
 	   Point brasG2 = new Point (brasG1.getX() - 3*UNITE_HORIZONTALE,brasG1.getY() );
 	   Point brasG3 = new Point (brasG2.getX()+ UNITE_HORIZONTALE, brasG2.getY() - UNITE_VERTICALE);
 	   Point brasG4 = new Point (brasG3.getX(),brasG3.getY() - UNITE_VERTICALE);
 	   Point brasG5 = new Point (brasG4.getX() + UNITE_HORIZONTALE,brasG4.getY() - 2*UNITE_VERTICALE);
 	   Point brasG6 = new Point (brasG5.getX() + deuxtier,brasG5.getY() + 2*UNITE_VERTICALE);
 	   Point brasG7 = new Point (brasG6.getX() - deuxtier,brasG6.getY());
	   Point brasG8 = new Point (brasG7.getX(),brasG7.getY()+ UNITE_VERTICALE);
 
	   demarrerNouveauDessinAvecDesPoints()
 	   .ajouter(brasG1)
 	   .ajouter(brasG2)
 	   .ajouter(brasG3)
 	   .ajouter(brasG4)
 	   .ajouter(brasG5)
 	   .ajouter(brasG6)
 	   .ajouter(brasG7)
 	   .ajouter(brasG8) 	   
 	   .couleurDeFond(Couleur.GRIS);  	         
    }
    /**
     * dessin 
     */
    public void dessinerBrasD() {
    	double deuxtier = 33.3;
 	   Point brasD1 = new Point (POINT_DEPART.getX() + 7*UNITE_HORIZONTALE,POINT_DEPART.getY() - 3*UNITE_VERTICALE);
 	   Point brasD2 = new Point (brasD1.getX() + 3*UNITE_HORIZONTALE,brasD1.getY() );
 	   Point brasD3 = new Point (brasD2.getX()- UNITE_HORIZONTALE, brasD2.getY() - UNITE_VERTICALE);
 	   Point brasD4 = new Point (brasD3.getX() ,brasD3.getY() - UNITE_VERTICALE);
 	   Point brasD5 = new Point (brasD4.getX() - UNITE_HORIZONTALE,brasD4.getY() - 2*UNITE_VERTICALE);
 	   Point brasD6 = new Point (brasD5.getX() - deuxtier,brasD5.getY() + 2*UNITE_VERTICALE);
 	   Point brasD7 = new Point (brasD6.getX() + deuxtier,brasD6.getY());
	   Point brasD8 = new Point (brasD7.getX(),brasD7.getY()+ UNITE_VERTICALE);
 
	   demarrerNouveauDessinAvecDesPoints()
 	   .ajouter(brasD1)
 	   .ajouter(brasD2)
 	   .ajouter(brasD3)
 	   .ajouter(brasD4)
 	   .ajouter(brasD5)
 	   .ajouter(brasD6)
 	   .ajouter(brasD7)
 	   .ajouter(brasD8) 	   
 	   .couleurDeFond(Couleur.GRIS);  	   
    }
    /**
     * dessin 
     */
    public void dessinerJambeG() {
        
	   Point jambeG1 = new Point (POINT_DEPART.getX(),POINT_DEPART.getY());
	   Point jambeG2 = new Point (jambeG1.getX() +3*UNITE_HORIZONTALE,jambeG1.getY());
	   Point jambeG3 = new Point (jambeG2.getX() -UNITE_HORIZONTALE,jambeG2.getY() - UNITE_VERTICALE);
	   Point jambeG4 = new Point (jambeG3.getX() +UNITE_HORIZONTALE,jambeG3.getY() - UNITE_VERTICALE);
	   Point jambeG5 = new Point (jambeG4.getX() -UNITE_HORIZONTALE,jambeG4.getY() - UNITE_VERTICALE);
	   Point jambeG6 = new Point (jambeG5.getX() -UNITE_HORIZONTALE,jambeG5.getY() + 2*UNITE_VERTICALE);
	   
	   demarrerNouveauDessinAvecDesPoints()
	   .ajouter(jambeG1)
	   .ajouter(jambeG2)
	   .ajouter(jambeG3)
	   .ajouter(jambeG4)
	   .ajouter(jambeG5)
	   .ajouter(jambeG6)
	   .couleurDeFond(Couleur.GRIS);
    }
    /**
     * dessin 
     */
    public void dessinerJambeD() {
 	   Point jambeD1 = new Point (POINT_DEPART.getX()+5*UNITE_HORIZONTALE,POINT_DEPART.getY());
 	   Point jambeD2 = new Point (jambeD1.getX() +3*UNITE_HORIZONTALE,jambeD1.getY());
 	   Point jambeD3 = new Point (jambeD2.getX() -UNITE_HORIZONTALE,jambeD2.getY() - UNITE_VERTICALE);
 	   Point jambeD4 = new Point (jambeD3.getX() -UNITE_HORIZONTALE,jambeD3.getY() - 2*UNITE_VERTICALE);
 	   Point jambeD5 = new Point (jambeD4.getX() -UNITE_HORIZONTALE,jambeD4.getY() + UNITE_VERTICALE);
 	   Point jambeD6 = new Point (jambeD5.getX() +UNITE_HORIZONTALE,jambeD5.getY() + UNITE_VERTICALE);
 	   
 	   demarrerNouveauDessinAvecDesPoints()
 	   .ajouter(jambeD1)
 	   .ajouter(jambeD2)
 	   .ajouter(jambeD3)
 	   .ajouter(jambeD4)
 	   .ajouter(jambeD5)
 	   .ajouter(jambeD6)
 	   .couleurDeFond(Couleur.GRIS);        
    }
	
}
