package fr.esiee.pic.esieedesigner.awt.factory.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Component;

import org.junit.Test;

import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.awt.factory.ShapesFactory;

public class ShapesFactoryImplTest {
	
	@Test
	public void testSingleIntance() {
		ShapesFactory sfImpl1 = ShapesFactoryImpl.getInstance();
		ShapesFactory sfImpl2 = ShapesFactoryImpl.getInstance();
		
		assertEquals(sfImpl1, sfImpl2);
	}
	
	@Test
	public void testProductionEllipse() {
		Point p = new Point(100, 100);
		Ellipse e = new Ellipse(p, 100, 100);
		ShapesFactory sf = ShapesFactoryImpl.getInstance();
		Component c = sf.produceEllipse(e);
		assertNotNull(c);
	}
	
	@Test
	public void testProductionCarre() {
		Point p1 = new Point(160, 50);
		Point p2 = new Point(210, 100);
		
		Point[] p = {p1, p2};
		ShapesFactory sf = ShapesFactoryImpl.getInstance();
		sf.produceShapeFromPoints(p);
		assertNotNull(p);
	}

}
