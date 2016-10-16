package fr.esiee.pic.esieedesigner.api.shapes;

/**
 * Réprésente la figure géométrique 2D ellipse
 * 
 * Une ellipse se définit à partir des éléments ci-dessous :
 * 	- Une abscisse : celle du centre de l'ellipe
 *  - Une ordonnée : celle du centre de l'éllipse
 *  - Une largeur
 *  - une hauteur
 *  
 * Si la largeur = hauteur
 * 	- l'éllipse devient un cercle.
 * 	- largeur devient le diametre
 * 	- hauteur : devient le diametre
 * 
 * @author etudiant
 *
 */
public final class Ellipse {
	
	/**
	 * L'abscisse du centre de l'éllipse
	 */
	private final double x;
	
	/**
	 * L'ordonnée du centre de l'éllipse
	 */
	private final double y;
	
	/**
	 * La largeur de l'éllipse
	 */
	private final double l;
	
	/**
	 * La hauteur de l'éllipse
	 */
	private final double h;

	/**
	 * Construit une éllipse à partir de :
	 * 	- des corrdonnées de son centre : x (abscisse) et y (ordonnée)
	 * 	- sa largeur l
	 * 	- de sa hauteur h
	 * Si la h = l
	 * 	- l'éllipse devient un cercle.
	 * 	- l devient le diametre
	 * 	- h : devient le diametre
	 * 
	 * @param x
	 * @param y
	 * @param l
	 * @param h
	 */
	public Ellipse(double x, double y, double l, double h) {
		super();
		this.x = x;
		this.y = y;
		this.l = l;
		this.h = h;
	}

	/**
	 * Getter de l'abscisse
	 * 
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter de l'ordonnée
	 * 
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * Getter de la largeur
	 * 
	 * @return
	 */
	public double getL() {
		return l;
	}

	/**
	 * Getter de la hauteur
	 * 
	 * @return
	 */
	public double getH() {
		return h;
	}
}
