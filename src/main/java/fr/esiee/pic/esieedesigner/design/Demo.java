package fr.esiee.pic.esieedesigner.design;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;


/**
 * Cette classe une Démo qui présente comment créer des formes graphiques
 * 
 * @author etudiant
 *
 */
public class Demo extends CreateurDeForme {

	@Override
	public void dessiner() {
		
		// Dessinons un cercle blanc
		ajouterEllipse(new Ellipse(100, 100, 100, 100), Couleur.BLANC);
		
		// Dessinons un triangle en 2 étapes
		// Etape 1 : Définition de nos points
		Point pointDuHaut = new Point(600, 300);
		Point pointDeGauche = new Point(300, 600);
		Point pointDeDroite = new Point(900, 600);
		
		// Etape 2 : Création du triangle à partir de l'API
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pointDuHaut)
		.ajouter(pointDeDroite)
		.ajouter(pointDeGauche)
		.colorier(Couleur.GRIS);
		
		// Dessinons un carre
		int coteDuCarre = 200;
		Point pointHautDroit = new Point(900 + coteDuCarre, 300 - coteDuCarre);
		Point pointHautGauche = new Point(900, 300 - coteDuCarre);
		Point pointBasDroite = new Point(900 + coteDuCarre, 300);
		Point pointBasGauche = new Point(900, 300);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pointHautDroit)
		.ajouter(pointHautGauche)
		.ajouter(pointBasGauche)
		.ajouter(pointBasDroite);
	}

}
