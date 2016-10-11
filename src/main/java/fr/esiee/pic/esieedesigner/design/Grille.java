package fr.esiee.pic.esieedesigner.design;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Grille pour faciliter les calculs
 * 
 * La grille est vu comme un repère avec 
 * 	- une origine : POINT_BORDURE_HAUT_DROIT
 * 	- Une unité de longueur : uniteLongueur
 * 	- Une unité de largeur : uniteLargeur
 * 
 * On pose que la longueur correspond au côté horizontal (l'axe des abscisse)
 * 
 * @author etudiant
 *
 */
public class Grille extends CreateurDeForme {

	/**
	 * Point situé en haut à gauche de la brodure supérieure
	 */
	private static final Point POINT_BORDURE_HAUT_DROIT = new Point(0, 0);
	
	/**
	 * Longeur de l'écran dans lequel sera afficher le cadre
	 */
	private final double longueurEcran;
	
	/**
	 * Largeur de l'écran dans lequel sera afficher le cadre
	 */
	private final double largeurEcran;
	
	/**
	 * Longueur de chaque portion formant la grille
	 */
	private final double uniteLongueur;
	
	/**
	 * Largeur de chaque portion formant la grille
	 */
	private final double uniteLargeur;
	
	/**
	 * Constructeur
	 * 
	 * @param longueurEcran
	 * @param largeurEcran
	 * @param uniteLongueur
	 * @param uniteLargeur
	 */
	public Grille(double longueurEcran, double largeurEcran, double uniteLongueur, double uniteLargeur) {
		this.uniteLongueur = uniteLongueur;
		this.uniteLargeur = uniteLargeur;
		this.longueurEcran = longueurEcran;
		this.largeurEcran = largeurEcran;
	}
	
	@Override
	public void dessiner() {
		// Ajout des points sur l'axe des abscisses
		
		Point pointCourant = POINT_BORDURE_HAUT_DROIT;
		double xPointCourant = pointCourant.getX();
		double yPointCourant = pointCourant.getY();
		
		while (xPointCourant <= longueurEcran) {
			double xSymetriquePointCourant = xPointCourant;
			double ySymetriquePointCourant = yPointCourant + longueurEcran;
			
			Point symetriquePointCourant = new Point(xSymetriquePointCourant, ySymetriquePointCourant);
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(pointCourant)
			.ajouter(symetriquePointCourant)
			.colorier(Couleur.GRIS);
			
			xPointCourant = xPointCourant + this.uniteLongueur;
			
			pointCourant = new Point(xPointCourant, yPointCourant);
		}
	}

}
