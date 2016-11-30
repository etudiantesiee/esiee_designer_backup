package fr.esiee.pic.esieedesigner.design.tp2;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;



/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe1 extends CreateurDeForme {

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
	
		
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal

		int x = 25;		
		//Bras GRAUCHE
		Point debEpauleGauche = new Point(4*x,8*x);
		Point finEpauleGauche = new Point(3*x, 8*x);
		Point coudeGauche1 = new Point(1*x, 10*x);
		Point coudeGauche2 = new Point(2*x, 11*x);
		Point mancheGaucheHaut = new Point(1*x, 12*x);
		Point mancheGaucheBas = new Point(2*x, 12*x);
		Point aisselleGauche = new Point(3*x, 10*x);
		Point tailleGauche = new Point(5*x,11*x);
		Point chevilleGauche1 = new Point(4*x,13*x);
		Point piedGauche1 = new Point(3*x,14*x);
		Point chevilleGauche2 = new Point(5*x,13*x);
		Point piedGauche2 = new Point(6*x,14*x);
		Point piGauche = new Point(6*x,12*x);
		Point piDroite = new Point(8*x,12*x);
		//Point chevilleDroite1 = new Point(8*x,12*x);
		
		
		demarrerNouveauDessinAvecDesPoints()
					.ajouter(debEpauleGauche)
					.ajouter(finEpauleGauche)
					.ajouter(coudeGauche1)
					.ajouter(mancheGaucheHaut)
					.ajouter(mancheGaucheBas)
					.ajouter(coudeGauche2)
					.ajouter(aisselleGauche)
					.ajouter(tailleGauche)
					.ajouter(chevilleGauche1)
					.ajouter(piedGauche1)
					.ajouter(piedGauche2)
					.ajouter(chevilleGauche2)
					.ajouter(piGauche)
					.ajouter(piDroite)
					.nePasRelierLesPointsExtreme();
				
				
		

		
	  Point mentona = new Point(75,175);
	  Point mentonb = new Point(150,250);
	  Point mentonc = new Point(200,250);
	  Point mentond = new Point(275,175);
     
      demarrerNouveauDessinAvecDesPoints()
      		.ajouter(mentona)
      		.ajouter(mentonb)
      		.ajouter(mentonc)
      		.ajouter(mentond)
      		.nePasRelierLesPointsExtreme();

	  
	  
	}
  
}


