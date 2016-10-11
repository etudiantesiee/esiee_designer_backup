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
	 * Coloriage de fond
	 */
	private Couleur couleur;
	
	/**
	 * Coloriage des traits
	 */
	private Couleur couleurTraitsLaison;
	
	/**
	 * Indique si l'épaisseur des traits de laison doit être minimal
	 */
	private boolean traitDeLaisonFin;
	
	/**
	 * Constructeur par défaut
	 */
	public CheminDePoints() {
		points = new LinkedList<>();
		traitDeLaisonFin = false;
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
	 * Couleur de fond de la forme
	 * 
	 * @param couleur
	 * @return
	 */
	public CheminDePoints couleurDeFond(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}
	
	/**
	 * Couleur des traits de laisons
	 * 
	 * @param couleur
	 * @return
	 */
	public CheminDePoints couleurDesTrait(Couleur couleurDesTrait) {
		this.couleurTraitsLaison = couleur;
		return this;
	}
	
	public CheminDePoints traitDeLiaisonFin() {
		this.traitDeLaisonFin = true;
		return this;
	}
	
	/**
	 * Retourne la liste de point actuelle sous forme de tableau
	 * 
	 * @return
	 */
	public Point[] toArray() {
		int nbPoint = this.points.size();
		Point[] pointsArray = new Point[nbPoint];
		return this.points.toArray(pointsArray).clone();
	}

	/**
	 * Getter de la couleur
	 * 
	 * @return
	 */
	public Couleur getCouleurDeFond() {
		return couleur;
	}
	
	/**
	 * Getter de la couleur des traits
	 * 
	 * @return
	 */
	public Couleur getCouleurTraits() {
		return couleurTraitsLaison;
	}
	
	/**
	 * Retourne true si les traits de laison entre les points sont fin.
	 * 
	 * @return
	 */
	public boolean aDesTraitsFin() {
		return traitDeLaisonFin;
	}
}
