package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
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
	private static final Point POINT_DEPART = new Point(UNITE_HORIZONTALE*20, UNITE_VERTICALE*10);

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
    	Point mentonBasGauche = new Point(POINT_DEPART.getX() + 3 * UNITE_HORIZONTALE, POINT_DEPART.getY() - 2 * UNITE_VERTICALE); 
    	Point mentonHautGauche = new Point(mentonBasGauche.getX() - 2 * UNITE_HORIZONTALE, mentonBasGauche.getY() - 2 * UNITE_VERTICALE);
    	
    	demarrerNouveauDessinAvecDesPoints()
    	
    	.ajouter(mentonBasGauche)
    	.ajouter(mentonHautGauche);
    }
    /**
     * dessin 
     */
    public void dessinerYeuxD() {
        
    }
    /**
     * dessin 
     */
    public void dessinerYeuxG() {
        
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
     demarrerNouveauDessinAvecDesPoints()
          
     .ajouter(lunette1)
     .ajouter(lunette2)
     .ajouter(lunette3)
     .ajouter(lunette4)
     .ajouter(lunette5)     
     .ajouter(lunette6);
     
    }

    /**
     * dessin 
     */
    public void dessinerNez() {
        
    }

    /**
     * dessin 
     */
    public void dessinerBouche() {
        
    }

    /**
     * dessin 
     */
    public void dessinerMenton() {
        
    }

    /**
     * dessin 
     */
    public void dessinerCheveux1() {
        
    }

    /**
     * dessin 
     */
    public void dessinerCheveux2() {
        
    }
    /**
     * dessin 
     */
    public void dessinerCheveux3() {
        
    }
    /**
     * dessin 
     */
    public void dessinerBrasG() {
        
    }
    /**
     * dessin 
     */
    public void dessinerBrasD() {
        
    }
    /**
     * dessin 
     */
    public void dessinerJambeG() {
        
	   Point JambeG1 = new Point (POINT_DEPART.getX(),POINT_DEPART.getY());
	   Point JambeG2 = new Point (JambeG1.getX() +3*UNITE_HORIZONTALE,JambeG1.getY());
	   Point JambeG3 = new Point (JambeG2.getX() -UNITE_HORIZONTALE,JambeG2.getY() - UNITE_VERTICALE);
	   Point JambeG4 = new Point (JambeG3.getX() +UNITE_HORIZONTALE,JambeG3.getY() - UNITE_VERTICALE);
	   Point JambeG5 = new Point (JambeG4.getX() -UNITE_HORIZONTALE,JambeG4.getY() - UNITE_VERTICALE);
	   Point JambeG6 = new Point (JambeG5.getX() -UNITE_HORIZONTALE,JambeG5.getY() + 2*UNITE_VERTICALE);
	   
	   demarrerNouveauDessinAvecDesPoints()
	   .ajouter(JambeG1)
	   .ajouter(JambeG2)
	   .ajouter(JambeG3)
	   .ajouter(JambeG4)
	   .ajouter(JambeG5)
	   .ajouter(JambeG6)
	   .couleurDeFond(Couleur.GRIS);
    }
    /**
     * dessin 
     */
    public void dessinerJambeD() {
 	   Point JambeD1 = new Point (POINT_DEPART.getX()+5*UNITE_HORIZONTALE,POINT_DEPART.getY());
 	   Point JambeD2 = new Point (JambeD1.getX() +3*UNITE_HORIZONTALE,JambeD1.getY());
 	   Point JambeD3 = new Point (JambeD2.getX() -UNITE_HORIZONTALE,JambeD2.getY() - UNITE_VERTICALE);
 	   Point JambeD4 = new Point (JambeD3.getX() -UNITE_HORIZONTALE,JambeD3.getY() - 2*UNITE_VERTICALE);
 	   Point JambeD5 = new Point (JambeD4.getX() -UNITE_HORIZONTALE,JambeD4.getY() + UNITE_VERTICALE);
 	   Point JambeD6 = new Point (JambeD5.getX() +UNITE_HORIZONTALE,JambeD5.getY() + UNITE_VERTICALE);
 	   
 	   demarrerNouveauDessinAvecDesPoints()
 	   .ajouter(JambeD1)
 	   .ajouter(JambeD2)
 	   .ajouter(JambeD3)
 	   .ajouter(JambeD4)
 	   .ajouter(JambeD5)
 	   .ajouter(JambeD6)
 	   .couleurDeFond(Couleur.GRIS);        
    }
	
}
