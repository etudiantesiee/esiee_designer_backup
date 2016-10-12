package fr.esiee.pic.esieedesigner.awt.engine;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * Fenetre contenant les composants à afficher
 * 
 * @author etudiant
 *
 */
public class MainFrameComponent extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2359696097105731809L;
	
	/**
	 * All component to print
	 */
	private List<Component> components;
	
	/**
	 * Default constructor
	 * 
	 * @throws HeadlessException
	 */
	public MainFrameComponent() {
		super();
		this.components = new ArrayList<>();
	}

	@Override
	public void paint(Graphics g) {
		
		for (Component c : components) {
			// Dessin du composant
			c.paint(g);
		}
	}
	
	@Override
	public Component add(Component c) {
		// Définition (pour la grille)
		c.setSize(getSize());
		
		// Ajout du composant
		this.components.add(c);
		return c;
	}

}
