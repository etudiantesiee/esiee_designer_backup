package fr.esiee.pic.esieedesigner.awt.engine;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Contient le moteur d'exécution unique de toute l'application.
 * 
 * Ce moteur d'exécution étant unique, toutes les figures s'afficheront dans une
 * seule et unique fenêtre.
 * 
 * @author etudiant
 * 
 */
public final class ExecutionEngine {

	/**
	 * Serial version UID
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 2759668095433251868L;

	/**
	 * Nombre de ligne de la grille
	 */
	private static final int GRID_NB_ROWS = 30;

	/**
	 * Nombre de colonne de la grille
	 */
	private static final int GRID_NB_COLS = 30;

	/**
	 * Unique instance du moteur d'exécution
	 */
	private static ExecutionEngine instance;

	/**
	 * Frame à afficher
	 */
	private JFrame engineFrame;

	/**
	 * Grille pour faciliter le dessin des figures
	 */
	private GridsCanvas grid;

	/**
	 * Constructeur privé du singleton
	 */
	private ExecutionEngine() {
		super();
		engineFrame = new JFrame();
		grid = new GridsCanvas(GRID_NB_ROWS, GRID_NB_COLS);
		initUI();
	}

	/**
	 * Retourne l'unique instance du moteur d'exécution
	 * 
	 * @return
	 */
	public static ExecutionEngine getInstance() {
		if (instance == null) {
			instance = new ExecutionEngine();
		}

		return instance;
	}

	/**
	 * Ajout d'une figure au moteur d'exécution
	 * 
	 * @param figure
	 */
	public void ajouterFigure(Component figure) {
		engineFrame.add(figure);
	}

	/**
	 * Supprime une figure au moteur d'exécution
	 * 
	 * @param figure
	 */
	public void supprimerFigure(JPanel figure) {
		engineFrame.remove(figure);
	}

	/**
	 * Initialisation du moteur d'exécution
	 */
	private void initUI() {
		// Ajout de la grille en mode invisible
		this.ajouterFigure(grid);

		engineFrame.setTitle("Esiee Designer Engine");
		engineFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		engineFrame.setLocationRelativeTo(null);
		engineFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				engineFrame.setVisible(false);
			}
		});
	}

	/**
	 * Rend le moteur d'exécution visible
	 * 
	 * @param avecGrille
	 */
	public void afficher(boolean avecGrille) {
		grid.setVisible(avecGrille);
		engineFrame.setVisible(true);
	}

	/**
	 * Masque l'affichage du moteur d'exécution
	 */
	public void masquer() {
		engineFrame.setVisible(false);
	}
}
