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
public class CouleurTest {
	
	@Test
	public void testConstructeur() {
		Couleur noir = Couleur.NOIR;
		Couleur blanc = Couleur.BLANC;
		Couleur gris = Couleur.GRIS;
		
		assertNotNull(noir);
		assertNotNull(blanc);
		assertNotNull(gris);
	}

}
