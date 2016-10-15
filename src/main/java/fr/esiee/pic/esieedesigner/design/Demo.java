package fr.esiee.pic.esieedesigner.design;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;


/**
 * Cette classe une Démo qui présente comment créer des formes graphiques
 * 
 * @author etudiant
 *
 */
public class Demo extends CreateurDeForme {
	
	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 50;
	
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	
	/**
	 * Point en bas à gauche de la maison
	 */
	private static final Point BASE_BAS_GAUCHE_MAISON = new Point(300, 800);
	
	/**
	 * Largeur de la maison
	 */
	private static final int LONGUEUR_MAISON = 300;
	
	/**
	 * Longueur de la maison
	 */
	private static final int LARGEUR_MAISON = 200;
	
	/**
	 * Longueur de la base du toit
	 * Doit être supérieure ou égale à la longueur de la masison
	 */
	private static final int LONGUEUR_BASE_TOIT = LONGUEUR_MAISON + 100;
	
	/**
	 * Hauteur du toit
	 */
	private static final int HAUTEUR_BASE_TOIT = LARGEUR_MAISON - 100;
	
	/**
	 * Ecart sur l'axe des abscisses entre 
	 * le point gauche de la base du toit de la maison et le point du haut du toit de la maison
	 */
	private static final int ECART_X_TOIT_MAISON_POINT_HAUT_BASE_GAUCHE = (LONGUEUR_BASE_TOIT / 2);
	
	/**
	 * Longueur de la porte
	 */
	private static final int LONGUEUR_PORTE = (LONGUEUR_MAISON / 3);
	
	/**
	 * Largeur de la porte
	 */
	private static final double LARGEUR_PORTE = (LARGEUR_MAISON / 2.5);
	
	/**
	 * Hauteur du toit de la porte (forme triangle)
	 */
	private static final double HAUTEUR_TOIT_PORTE = LARGEUR_PORTE / 2;
	
	/**
	 * Diametre de la serrure
	 */
	private static final double DIAMETRE_SERRURE = LONGUEUR_PORTE / 10;
	
	/**
	 * Ecart sur l'axe des abscisse entre le point base gauche de la base du toit
	 * et le centre de la serrure.
	 * 
	 */
	private static final double ECART_X_BASE_GAUCHE_PORTE_SERRURE = LONGUEUR_PORTE * 0.80;
	
	/**
	 * Centre du cercle jaune
	 */
	private static final Point CENTRE_CERCLE_JAUNE = new Point(100, 100);
	
	/**
	 * Rayon du cercle jaune
	 */
	private static final double RAYON_DU_CERCLE_JAUNE = 200; 
	
	/**
	 * Point exterieure du pied gauche du manga
	 */
	private static final Point PIED_GAUCHE_EXTERIEURE_MANGA = new Point(900, 800);
	
	/**
	 * Longueure du trait unissantles deux pieds du manga
	 */
	private static final double LONGUEUR_BAS_PIED_MANGA = UNITE_HORIZONTALE * 10;
	
	
	@Override
	public void dessiner() {
		dessinerCercleJaune();
		dessinerMaison();
		dessinerManga();
	}
	
	/**l
	 * Exemple de dessin d'un cercle de couleur jaune
	 */
	public void dessinerCercleJaune() {
		double xCentreCercleJAune = CENTRE_CERCLE_JAUNE.getX();
		double yCentreCercleJAune = CENTRE_CERCLE_JAUNE.getY();
		
		// Pour un clercle la largeur et la hauteur de l'ellipse sont égales.
		Ellipse cercleJaune = new Ellipse(xCentreCercleJAune, yCentreCercleJAune, RAYON_DU_CERCLE_JAUNE, RAYON_DU_CERCLE_JAUNE);
		
		ajouterEllipse(cercleJaune, Couleur.JAUNE);
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
	
	/**
	 * Exemple de dessin de maison
	 */
	public void dessinerMaison() {
		// Dessin du cadre de la maison
		Point baseBasGauche = BASE_BAS_GAUCHE_MAISON;
		Point baseBasDroit = new Point(baseBasGauche.getX() + LONGUEUR_MAISON, baseBasGauche.getY());
		Point baseHautDroit = new Point(baseBasDroit.getX(), baseBasDroit.getY() - LARGEUR_MAISON);
		Point baseHautGauche = new Point(baseBasGauche.getX(), baseBasDroit.getY() - LARGEUR_MAISON);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseBasGauche)
		.ajouter(baseBasDroit)
		.ajouter(baseHautDroit)
		.ajouter(baseHautGauche);
		
		// Construction du toit
		// Les points du toit sont construit à partir des points du haut de la base de la maison
		double ecartLongueurToitMaison = ((LONGUEUR_BASE_TOIT - LONGUEUR_MAISON) / 2);
		Point toitBaseGauche = new Point(baseHautGauche.getX() - ecartLongueurToitMaison, baseHautGauche.getY());
		Point toitBaseDroit = new Point(baseHautDroit.getX() + ecartLongueurToitMaison, baseHautDroit.getY());
		Point toitHaut = new Point(toitBaseGauche.getX() + ECART_X_TOIT_MAISON_POINT_HAUT_BASE_GAUCHE, toitBaseGauche.getY() - HAUTEUR_BASE_TOIT);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(toitBaseGauche)
		.ajouter(toitBaseDroit)
		.ajouter(toitHaut);
		
		// Constuction de la porte
		double ecartBaseGaucheMaisonPorte = ((LONGUEUR_MAISON - LONGUEUR_PORTE) / 2);
		Point baseGauchePorte = new Point(baseBasGauche.getX() + ecartBaseGaucheMaisonPorte, baseBasGauche.getY());
		Point baseDroitePorte = new Point(baseGauchePorte.getX() + LONGUEUR_PORTE, baseGauchePorte.getY());
		Point hautDroitPorte = new Point(baseDroitePorte.getX(), baseDroitePorte.getY() - LARGEUR_PORTE);
		Point hautGauchePorte = new Point(baseGauchePorte.getX(), baseGauchePorte.getY() - LARGEUR_PORTE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(baseGauchePorte)
		.ajouter(baseDroitePorte)
		.ajouter(hautDroitPorte)
		.ajouter(hautGauchePorte);
		
		// Construction du toit de la porte
		double ecartBaseGaucheToitPoitHautToit = LONGUEUR_PORTE / 2;
		Point hautToitPorte = new Point(hautGauchePorte.getX() + ecartBaseGaucheToitPoitHautToit, hautGauchePorte.getY() - HAUTEUR_TOIT_PORTE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauchePorte)
		.ajouter(hautDroitPorte)
		.ajouter(hautToitPorte);
		
		// Construction de la serrure
		double xSerrure = baseGauchePorte.getX() + ECART_X_BASE_GAUCHE_PORTE_SERRURE;
		double ySerrure = baseGauchePorte.getY() - (LARGEUR_PORTE/2);
		Ellipse serrure = new Ellipse(xSerrure, ySerrure, DIAMETRE_SERRURE, DIAMETRE_SERRURE);
		
		ajouterEllipse(serrure, Couleur.GRIS);
	}

}
