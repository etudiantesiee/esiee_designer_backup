package fr.esiee.pic.esieedesigner.awt.shapes;

import java.awt.Color;
import java.awt.geom.Point2D;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test unitaire de GeneralShape
 * 
 * @author etudiant
 *
 */
public class GeneralShapeTest {

	@Test
	public void testConstructeur() {
		GeneralShape gs = new GeneralShape(new Point2D[10], Color.BLACK);
		assertNotNull(gs);
	}
}
