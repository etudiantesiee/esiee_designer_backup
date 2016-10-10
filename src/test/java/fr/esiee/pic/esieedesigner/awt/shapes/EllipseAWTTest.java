package fr.esiee.pic.esieedesigner.awt.shapes;

import java.awt.Color;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de test unitaire des ellipses AWT
 * 
 * @author etudiant
 *
 */
public class EllipseAWTTest {
	
	@Test
	public void testConstructeur() {
		EllipseAWT e = new EllipseAWT(0, 0, 0, 0, Color.BLACK);
		assertNotNull(e);
	}

}
