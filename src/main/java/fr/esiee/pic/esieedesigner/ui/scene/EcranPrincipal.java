package fr.esiee.pic.esieedesigner.ui.scene;

import java.util.ArrayList;
import java.util.List;

import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.design.exemple.MaisonAvecCercleEtEllipse;
import fr.esiee.pic.esieedesigner.design.exemple.PersonnageManga;
import fr.esiee.pic.esieedesigner.design.shared.Grille;
import fr.esiee.pic.esieedesigner.ui.tools.AfficheurDeFormes;

/**
 * Interface graphique principale du programme
 * Affiche les élements crées précédemment
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
	 * Liste des dessin à afficher sur l'écran
	 */
	private final List<CreateurDeForme> listDeDessins;
	
	/**
	 *  Utilitaire d'affichage de formes
	 */
	private final AfficheurDeFormes afficheur;
	
	/**
	 * Construteur par défaut masqué
	 */
	private EcranPrincipal(AfficheurDeFormes afficheur, boolean afficherGrille) {
		super();
		listDeDessins = new ArrayList<>();
		this.afficheur = afficheur;
		
		init();
		
		// Initialisation des formes à afficher
		if (afficherGrille) {
			afficherGrille();
		}
		
	}
	
	/**
	 * Ajoute la grille aux éléments à afficher
	 */
	private final void afficherGrille() {
		// Affichage de la grille
		double longueurEcran = this.afficheur.getLongueurAffichage();
		double largeurEcran = this.afficheur.getLargeurAffichage();
		Grille grille = new Grille(longueurEcran, largeurEcran, UNITE_HORIZONTALE_GRILLE, UNITE_VERTIACLE_GRILLE);
		listDeDessins.add(grille);
	}
	
	/**
	 * Initialisation des formes à dessiner
	 */
	private final void init() {
		// Affichage de la démo : maison, soleil, lune...
		MaisonAvecCercleEtEllipse demoMaison = new MaisonAvecCercleEtEllipse();
		listDeDessins.add(demoMaison);
		
		// Affichage de la démo : personnage manga
		PersonnageManga demoManga = new PersonnageManga();
		listDeDessins.add(demoManga);
	}
	
	/**
	 * Affichage des dessins
	 */
	public final void afficherDessin() {
		for (CreateurDeForme dessin : this.listDeDessins) {
			afficheur.afficher(dessin);
		}
	}

	/**
	 * Méthod Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AfficheurDeFormes afficheur = AfficheurDeFormes.getInstance();
		
		// Affichage de la grille ?
		boolean afficherGrille = true;
		
		EcranPrincipal e = new EcranPrincipal(afficheur, afficherGrille);
		e.afficherDessin();
	}

}
