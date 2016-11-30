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
<<<<<<< HEAD
    	Point mentonBasGauche = new Point(POINT_DEPART.getX() + 3 * UNITE_HORIZONTALE, POINT_DEPART.getY() - 2 * UNITE_VERTICALE);
=======
    
>>>>>>> 20bd8280219886311a3ed41478ebd21486d565f3
        
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
     Point lunette2 = new Point(lunette1.getX() + UNITE_HORIZONTALE, lunette1.getY() -UNITE_VERTICALE);
     Point lunette3 = new Point(lunette1.getX() + 6*UNITE_HORIZONTALE, lunette2.getY());
     
     demarrerNouveauDessinAvecDesPoints()
          
     .ajouter(lunette1)
     .ajouter(lunette2)
     .ajouter(lunette3);
     
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
        
    }
	
}
