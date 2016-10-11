package fr.esiee.pic.esieedesigner.api.shapes;

/**
 * Réprésente une couleur RGB à ajouter dans une figure géométrique
 * 
 * @author etudiant
 *
 */
public enum Couleur {
	
	/**
	 * Couleur noir
	 */
	NOIR(0f, 0f, 0f, 0.5f),
	
	/**
	 * Couleur Blanche
	 */
	BLANC(1f, 1f, 1f, 0.5f),
	
	/**
	 * Couleur Grise
	 */
	GRIS(0.5f, 0.5f, 0.5f, 0.5f);
	
	private final float r, g, b, a;
	
	/**
	 * Construit une couleur RGB à partir des valeurs de Rouge, Vert et bleu précisées. 
	 * La valeur a correspond à la transparence.
	 * 
	 * Ces valeurs sont comprises entre 0.0 et 1.0 (inclu)
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 */
	private Couleur(float r, float g, float b, float a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}

	/**
	 * Getter de Rouge
	 * 
	 * @return
	 */
	public float getR() {
		return r;
	}

	/**
	 * Getter de Vert
	 * 
	 * @return
	 */
	public float getG() {
		return g;
	}

	/**
	 * Getter de Bleue
	 * 
	 * @return
	 */
	public float getB() {
		return b;
	}

	/**
	 * Getter de transparence
	 * 
	 * @return
	 */
	public float getA() {
		return a;
	}
}
