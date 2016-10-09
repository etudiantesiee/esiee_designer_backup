package fr.esiee.pic.esieedesigner.api.shapes;

/**
 * Représente un point 2D en terme de figure gémétrique
 * 
 * Un poin possède un abscisse X et une ordonnée Y.
 * 
 * @author etudiant
 * 
 */
public final class Point {

	/**
	 * Abscisse du point
	 */
	private final double x;

	/**
	 * Ordonnée du point
	 */
	private final double y;

	/**
	 * Constructeur
	 * 
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter pour X
	 * 
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter pour Y
	 * 
	 * @return
	 */
	public double getY() {
		return y;
	}
}
