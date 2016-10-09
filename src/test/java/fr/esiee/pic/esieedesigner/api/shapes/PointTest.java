package fr.esiee.pic.esieedesigner.api.shapes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test unitaire de la classe point 
 * 
 * @author etudiant
 *
 */
public class PointTest {
	
	@Test
	public void testConstructeur() {
		Point p = new Point(1, 1);
		assertNotNull(p);
	}

}
