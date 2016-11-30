package fr.esiee.pic.esieedesigner.design.tp2;

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
        
    }
    /**
     * dessin 
     */
    public void dessinerJambeD() {
        
    }
	
}
