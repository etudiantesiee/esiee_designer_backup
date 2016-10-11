package fr.esiee.pic.esieedesigner.awt.factory;

import java.awt.Component;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;

/**
 * 
 * Factory de production des figures à dessinner via le moteur d'exécution
 * 
 * @author etudiant
 *
 */
public interface ShapesFactory {
	
	/**
	 * Construit une ellipse AWT 2D
	 * 
	 * @param ellipse
	 * @return
	 */
	Component produceEllipse(Ellipse ellipse);
	
	/**
	 * Construit une ellipse AWT 2D
	 * 
	 * @param ellipse
	 * @return
	 */
	Component produceEllipse(Ellipse ellipse, Couleur couleur);
	
	/**
	 * Construit une figure géométrique à partir de points
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points);
	
	/**
	 * Construit une figure géométrique à partir de points
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur);
	
	/**
	 * Construit une figure géométrique à partir de points.
	 * On fournit également des informations sur le style de traits (couleur, épaisseur...)
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur, Couleur couleurTrait, boolean traitFin);
}
