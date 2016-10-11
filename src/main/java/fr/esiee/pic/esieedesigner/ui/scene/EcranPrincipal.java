package fr.esiee.pic.esieedesigner.ui.scene;

import fr.esiee.pic.esieedesigner.awt.engine.ExecutionEngine;
import fr.esiee.pic.esieedesigner.design.Demo;
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
		// Utilitaire d'affichage de formes
		AfficheurDeFormes afficheur = AfficheurDeFormes.getInstance();
		
		// Affichage de la démo
		Demo demo = new Demo();
		afficheur.afficher(demo);
		
		// Affichage du moteur d'exécution
		ExecutionEngine engine = ExecutionEngine.getInstance();
		engine.afficher(false);
	}

}
