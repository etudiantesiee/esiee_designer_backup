package fr.esiee.pic.esieedesigner.engine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Contient le moteur d'exécution unique de toute l'application. 
 * 
 * Ce moteur d'exécution étant unique, toutes les figures s'afficheront dans une seule et unique fenêtre.
 * 
 * @author etudiant
 *
 */
public final class ExecutionEngine {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 2759668095433251868L;
	
	/**
	 * Largeur de la fenêtre
	 */
	private static final int WINDOWS_WIDTH = 350;
	
	/**
	 * Longueur de la fenêtre
	 */
	private static final int WINDOWS_HEIGHT = 250;

	/**
	 * Unique instance du moteur d'exécution
	 */
	private static ExecutionEngine instance;
	
	/**
	 * Frame à afficher
	 */
	private JFrame engineFrame;

	/**
	 * Constructeur privé du singleton
	 */
	private ExecutionEngine() {
		super();
		engineFrame = new JFrame();
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
	public void ajouterFigure(JPanel figure) {
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
		engineFrame.setTitle("Esiee Designer Engine");
		engineFrame.setSize(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		engineFrame.setLocationRelativeTo(null);
		engineFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Rend le moteur d'exécution visible
	 * 
	 * @param avecGrille
	 */
	public void afficher(boolean avecGrille) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				engineFrame.setVisible(true);
			}
		});
	}
	
	/**
	 * Masque l'affichage du moteur d'exécution
	 */
	public void masquer() {
		engineFrame.setVisible(false);
	}

}
