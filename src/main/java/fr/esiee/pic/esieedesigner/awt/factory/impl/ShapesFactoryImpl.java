package fr.esiee.pic.esieedesigner.awt.factory.impl;

import java.awt.Color;
import java.awt.Component;
import java.awt.geom.Point2D;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.awt.factory.ShapesFactory;
import fr.esiee.pic.esieedesigner.awt.shapes.EllipseAWT;
import fr.esiee.pic.esieedesigner.awt.shapes.GeneralShape;

/**
 * Implémentation AWT de la factory de figure
 * 
 * @author etudiant
 *
 */
public final class ShapesFactoryImpl implements ShapesFactory {

	/**
	 * Unique instance de la factory
	 */
	private static ShapesFactoryImpl instance = null;
	
	/**
	 * Constructeur privé
	 */
	private ShapesFactoryImpl() {
		super(); 
	}
	

	/**
	 * Constructeur de l'unique instance du singleton
	 * 
	 * @return
	 */
	public static ShapesFactoryImpl getInstance() {
		if (instance == null) {
			instance = new ShapesFactoryImpl();
		}
		
		return instance;
	}
	
	@Override
	public Component produceEllipse(Ellipse ellipse, Couleur couleur) {
		float x = (float) ellipse.getX();
		float y = (float) ellipse.getY();
		float w = (float) ellipse.getL();
		float h = (float) ellipse.getH();
		
		Color color = null;
		if (couleur != null) {
			color = new Color(couleur.getR(), couleur.getG(), couleur.getB(), couleur.getA());
		}
		
		return new EllipseAWT(x, y, w, h, color);
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points) {
		return this.produceShapeFromPoints(points, null);
	}
	
	@Override
	public Component produceEllipse(Ellipse ellipse) {
		return this.produceEllipse(ellipse, null);
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points, Couleur couleur) {
		return produceShapeFromPoints(points, couleur, null, true);
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points, Couleur couleur,
			boolean closePath) {
		return produceShapeFromPoints(points, couleur, null, false, closePath);
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points, Couleur couleur, Couleur couleurTrait, boolean traitFin) {
		return produceShapeFromPoints(points, couleur, couleurTrait, traitFin, false);
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points, Couleur couleur,
			Couleur couleurTrait, boolean traitFin, boolean closePath) {
		int nbPoints = points.length;
		Point2D[] points2D = new Point2D[nbPoints];
		for(int i = 0; i < nbPoints; i++) {
			Point currentPoint = points[i];
			double x = currentPoint.getX();
			double y = currentPoint.getY();
			
			points2D[i] = new Point2D.Double(x, y);
		}
		
		Color color = null;
		if (couleur != null) {
			color = new Color(couleur.getR(), couleur.getG(), couleur.getB(), couleur.getA());
		}
		
		Color lineColor = null;
		if (couleurTrait != null) {
			lineColor = new Color(couleurTrait.getR(), couleurTrait.getG(), couleurTrait.getB(), couleurTrait.getA());
		}
		
		return new GeneralShape(points2D, color, lineColor, traitFin, closePath);
	}
}
