package fr.esiee.pic.esieedesigner.engine;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test unitaire du moteur d'exécution
 * 
 * @author etudiant
 *
 */
public class ExecutionEngineTest {
	
	@Test
	public void testSingleton() {
		ExecutionEngine i1 = ExecutionEngine.getInstance();
		ExecutionEngine i2 = ExecutionEngine.getInstance();
		assertEquals(i1, i2);
	}
	
	@Test
	public void testAffichageAvecGrille() {
		ExecutionEngine i1 = ExecutionEngine.getInstance();
		i1.afficher(true);
	}
	
	@Test
	public void testAffichageSansGrille() {
		ExecutionEngine i1 = ExecutionEngine.getInstance();
		i1.afficher(false);
	}
	
	@Test
	public void testMasquer() {
		ExecutionEngine i1 = ExecutionEngine.getInstance();
		i1.masquer();
	}

}
