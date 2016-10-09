package fr.esiee.pic.esieedesigner.awt.shapes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Figure géométrique Ellipse avec JAVA 2D
 * 
 * @author etudiant
 *
 */
public final class Ellipse extends Component {

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 7763441664778118431L;
	
	/**
	 * Abscisse de l'ellipse
	 */
	private final float x;
	
	/**
	 * Ordonnée de l'ellipse
	 */
	private final float y;
	
	/**
	 * Largeur de l'ellipse
	 */
	private final float w;
	
	/**
	 * Hauteur de l'ellipse
	 */
	private final float h;
	
	/**
	 * Couleur de l'ellipse
	 */
	private final Color color;
	
	/**
	 * Constructeur
	 * 
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param color
	 */
	public Ellipse(float x, float y, float w, float h, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = color;
	}
	
	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		if (this.color != null) {
			g2d.setPaint(this.color);
		}
		
		// Construction de l'ellipse
		Ellipse2D ellipse = new Ellipse2D.Double(this.x, this.y, this.w, this.h);
		g2d.draw(ellipse);
	}
}
