package fr.esiee.pic.esieedesigner.design.exemple;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Demo de création d'un personnage de manga
 * 
 * @author etudiant
 *
 */
public class PersonnageManga extends CreateurDeForme {

	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 50;
	
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	
	/**
	 * Point exterieure du pied gauche du manga
	 */
	private static final Point PIED_GAUCHE_EXTERIEURE_MANGA = new Point(900, 750);
	
	/**
	 * Longueure du trait unissantles deux pieds du manga
	 */
	private static final double LONGUEUR_BAS_PIED_MANGA = UNITE_HORIZONTALE * 10;
	
	
	@Override
	public void dessiner() {
		dessinerManga();
	}
	
	/**
	 * Exemple de dessin d'un personnage de manga
	 */
	public void dessinerManga() {
		
		// Dessin des pieds du manga
		Point piedBasGaucheManga = PIED_GAUCHE_EXTERIEURE_MANGA;
		Point piedBasDroitManga = new Point(PIED_GAUCHE_EXTERIEURE_MANGA.getX() + LONGUEUR_BAS_PIED_MANGA, PIED_GAUCHE_EXTERIEURE_MANGA.getY());
		Point piedHautDroit1 = new Point(piedBasDroitManga.getX() - UNITE_HORIZONTALE, piedBasDroitManga.getY() - UNITE_VERTICALE);
		Point piedHautDroit2 = new Point(piedHautDroit1.getX() - UNITE_HORIZONTALE, piedHautDroit1.getY());
		Point corpsBasDroit = new Point(piedHautDroit2.getX() + UNITE_HORIZONTALE, piedHautDroit2.getY() - 2 * UNITE_VERTICALE);
		Point corpsBasGauche = new Point(piedBasGaucheManga.getX() + UNITE_HORIZONTALE, piedBasGaucheManga.getY() - 3 * UNITE_VERTICALE);
		Point piedHautGauche1 = new Point(corpsBasGauche.getX() + UNITE_HORIZONTALE, corpsBasGauche.getY() + 2 * UNITE_VERTICALE);
		Point piedHautGauche2 = new Point(piedHautGauche1.getX() - UNITE_HORIZONTALE, piedHautGauche1.getY()); 
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(piedBasGaucheManga)
		.ajouter(piedBasDroitManga)
		.ajouter(piedHautDroit1)
		.ajouter(piedHautDroit2)
		.ajouter(corpsBasDroit)
		.ajouter(corpsBasGauche)
		.ajouter(piedHautGauche1)
		.ajouter(piedHautGauche2);
		
		
		// Dessin du corps du manga : coté droit
		Point corpsCoteHautDroit = new Point(corpsBasDroit.getX(), corpsBasDroit.getY() - UNITE_VERTICALE);
		Point brasDroit1 = new Point(corpsCoteHautDroit.getX() + UNITE_HORIZONTALE, corpsCoteHautDroit.getY() + UNITE_VERTICALE);
		Point brasDroit2 = new Point(brasDroit1.getX(), brasDroit1.getY() + UNITE_VERTICALE * 2);
		Point brasDroit3 = new Point(brasDroit2.getX() + UNITE_VERTICALE, brasDroit2.getY());
		Point brasDroit4 = new Point(brasDroit3.getX(), brasDroit3.getY() - 3 * UNITE_VERTICALE);
		Point epauleDroit1 = new Point(brasDroit4.getX() -2 * UNITE_VERTICALE, brasDroit4.getY() - UNITE_HORIZONTALE * 2);
		Point epauleDroit2 = new Point(epauleDroit1.getX() - UNITE_VERTICALE, epauleDroit1.getY());
		
		// Dessin du corps du manga : coté gauche (par symétrie)
		Point corpsCoteHautGauche = new Point(corpsBasGauche.getX(), corpsBasGauche.getY() - UNITE_VERTICALE);
		Point brasGauche1 = new Point(corpsCoteHautGauche.getX() - UNITE_HORIZONTALE, corpsCoteHautGauche.getY() + UNITE_VERTICALE);
		Point brasGauche2 = new Point(brasGauche1.getX(), brasGauche1.getY() + UNITE_VERTICALE * 2);
		Point brasGauche3 = new Point(brasGauche2.getX() - UNITE_HORIZONTALE, brasGauche2.getY());
		Point brasGauche4 = new Point(brasGauche3.getX(), brasGauche3.getY() - 3 * UNITE_VERTICALE);
		Point epauleGauche1 = new Point(brasGauche4.getX() + 2 * UNITE_HORIZONTALE, brasGauche4.getY() - UNITE_HORIZONTALE * 2);
		Point epauleGauche2 = new Point(epauleGauche1.getX() + UNITE_HORIZONTALE, epauleGauche1.getY());
		
		// Dessin de la tête
		Point mentonDroit = new Point(epauleDroit2.getX() - 2 * UNITE_HORIZONTALE, epauleDroit2.getY() + 2 * UNITE_VERTICALE);
		Point mentonGauche = new Point(mentonDroit.getX() - 2 * UNITE_HORIZONTALE, mentonDroit.getY());
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(corpsBasDroit)
		.ajouter(corpsCoteHautDroit)
		.ajouter(brasDroit1)
		.ajouter(brasDroit2)
		.ajouter(brasDroit3)
		.ajouter(brasDroit4)
		.ajouter(epauleDroit1)
		.ajouter(epauleDroit2)
		.ajouter(mentonDroit)
		.ajouter(mentonGauche)
		.ajouter(epauleGauche2)
		.ajouter(epauleGauche1)
		.ajouter(brasGauche4)
		.ajouter(brasGauche3)
		.ajouter(brasGauche2)
		.ajouter(brasGauche1)
		.ajouter(corpsCoteHautGauche)
		.ajouter(corpsBasGauche)
		.couleurDeFond(Couleur.GRIS)
		.nePasRelierLesPointsExtreme();
		
	}
}
