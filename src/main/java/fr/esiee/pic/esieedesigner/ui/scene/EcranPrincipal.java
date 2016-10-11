package fr.esiee.pic.esieedesigner.ui.scene;

import java.awt.Dimension;

import fr.esiee.pic.esieedesigner.awt.engine.ExecutionEngine;
import fr.esiee.pic.esieedesigner.design.Demo;
import fr.esiee.pic.esieedesigner.design.Grille;
import fr.esiee.pic.esieedesigner.ui.tools.AfficheurDeFormes;

/**
 * Interface graphique principale du programme
 * Affiche tous les élements crées précédemment
 * 
 * @author etudiant
 *
 */
public final class EcranPrincipal {
	
	/**
	 * Construteur par défaut masqué
	 */
	private EcranPrincipal() {
		super();
	}

	/**
	 * Méthod Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instanciation du moteur d'exécution
		ExecutionEngine engine = ExecutionEngine.getInstance();
		
		// Dimension de l'écran
		Dimension dimEcran = engine.getSize();
		double xEcran = dimEcran.getWidth();
		double yEcran = dimEcran.getHeight();
		
		// Utilitaire d'affichage de formes
		AfficheurDeFormes afficheur = AfficheurDeFormes.getInstance();
		
		// Affichage de la démo
		Demo demo = new Demo();
		afficheur.afficher(demo);
		
		// Affichage de la grille
		Grille grille = new Grille(xEcran, yEcran, 50, 50);
		afficheur.afficher(grille);
		
		// Affichage du moteur d'exécution
		engine.afficher(false);
	}

}
