package fr.esiee.pic.esieedesigner.api.shapes;

import java.util.LinkedList;
import java.util.List;

/**
 * Définit un chemin formé à partir de points.
 * 
 * Tous les points de la liste sont ordonnés et reliés entre eux du premier au dernier.
 * 
 * @author etudiant
 *
 */
public final class CheminDePoints {
	
	/**
	 * List de points ordonnés
	 */
	private final List<Point> points;
	
	/**
	 * Constructeur par défaut
	 */
	public CheminDePoints() {
		points = new LinkedList<>();
	}
	
	/**
	 * Ajout d'un nouveau point à relier au précédent.
	 * 
	 * @param point
	 * @return
	 */
	public CheminDePoints ajouter(Point point) {
		this.points.add(point);
		return this;
	}
	
	/**
	 * Retourne la liste de point actuelle sous forme de tableau
	 * 
	 * @return
	 */
	public Point[] toArray() {
		return (Point[]) this.points.toArray().clone();
	}

}
