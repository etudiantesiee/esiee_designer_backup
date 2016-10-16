package fr.esiee.pic.esieedesigner.ui.scene;

import java.awt.Dimension;

import fr.esiee.pic.esieedesigner.awt.engine.ExecutionEngine;
import fr.esiee.pic.esieedesigner.design.exemple.MaisonAvecSoleilEtLune;
import fr.esiee.pic.esieedesigner.design.exemple.PersonnageManga;
import fr.esiee.pic.esieedesigner.design.shared.Grille;
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
	 * Unite sur l'axe des abscisse
	 */
	private static final int UNITE_HORIZONTALE_GRILLE = 50;
	
	/**
	 * Unité sur l'axe des ordonnées
	 */
	private static final int UNITE_VERTIACLE_GRILLE = 50;
	
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
		
		// Affichage de la démo : maison, soleil, lune...
		MaisonAvecSoleilEtLune demoMaison = new MaisonAvecSoleilEtLune();
		afficheur.afficher(demoMaison);
		
		// Affichage de la démo : personnage manga
		PersonnageManga demoManga = new PersonnageManga();
		afficheur.afficher(demoManga);
		
		// Affichage de la grille
		Grille grille = new Grille(xEcran, yEcran, UNITE_HORIZONTALE_GRILLE, UNITE_VERTIACLE_GRILLE);
		afficheur.afficher(grille);
		
		// Affichage du moteur d'exécution
		engine.afficher();
	}

}
