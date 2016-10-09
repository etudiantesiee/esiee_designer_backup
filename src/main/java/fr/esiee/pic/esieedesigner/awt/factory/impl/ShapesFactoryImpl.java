package fr.esiee.pic.esieedesigner.awt.factory.impl;

import java.awt.Component;

import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.awt.factory.ShapesFactory;

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
	public Component produceEllipse(Ellipse ellipse) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Component produceShapeFromPoints(Point[] points) {
		// TODO Auto-generated method stub
		return null;
	}
}
