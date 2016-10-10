package fr.esiee.pic.esieedesigner.api.tools;

import java.util.ArrayList;
import java.util.List;

import fr.esiee.pic.esieedesigner.api.shapes.CheminDePoints;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;

/**
 * Classe utilitaire principale pour la création des formes
 * 
 * @author etudiant
 *
 */
public abstract class CreateurDeForme {

	/**
	 * Liste des ellipses composant le dessin
	 */
	private final List<Ellipse> ellipses;
	
	/**
	 * Liste des figures faites à partir de points
	 */
	private final List<CheminDePoints> formesAvecPoints;
	
	/**
	 * Constructeur par defaut
	 */
	public CreateurDeForme() {
		super();
		ellipses = new ArrayList<>();
		formesAvecPoints = new ArrayList<>();
	}
	
	/**
	 * Initialise une nouvelle phase de création d'un dessin à partir de points.
	 * 
	 * @return
	 */
	protected CheminDePoints demarrerNouveauDessinAvecDesPoints() {
		CheminDePoints nouveauChemin = new CheminDePoints();
		this.formesAvecPoints.add(nouveauChemin);
		
		return nouveauChemin;
	}
	
	/**
	 * Ajoute une nouvelle ellipse à la figure en cours de construction.
	 * 
	 * @param ellipse
	 * @return
	 */
	protected CreateurDeForme ajouterEllipse(Ellipse ellipse) {
		this.ellipses.add(ellipse);
		return this;
	}
	
	/**
	 * Méthode à implémenter pour créer un dessiner.
	 */
	public abstract void dessiner();
}
