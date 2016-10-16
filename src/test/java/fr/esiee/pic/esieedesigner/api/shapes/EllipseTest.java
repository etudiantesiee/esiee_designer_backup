package fr.esiee.pic.esieedesigner.api.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Test unitaire de la classe 
 * 
 * @author etudiant
 *
 */
public class EllipseTest {
	
	@Test
	public void testConstructeur() {
		Ellipse e = new Ellipse(1, 1, 1, 1);
		assertNotNull(e);
	}
	
	@Test
	public void testConstructeurPoint() {
		Point p = new Point(1, 1);
		Ellipse e = new Ellipse(p, 1, 1);
		assertNotNull(e);
	}

}
