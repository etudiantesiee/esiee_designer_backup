package fr.esiee.pic.esieedesigner.design.tp2;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;



/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author ady & diane
 *         florian
 *         amineoos &pradhox
 */
public class DessinsGroupe1 extends CreateurDeForme {

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		// variable taille case
		int x = 25;
		


		// Partie Flo
		
        Point basGaucheTete = new Point(50,175);
        Point gaucheTete2 = new Point(25,75);

        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(basGaucheTete)
        .ajouter(gaucheTete2)
        .nePasRelierLesPointsExtreme();
		
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
				

			
		//Bas du corps DROITE
		Point chevilleDroite1 = new Point(9*x,13*x);
		Point piedDroite1 = new Point(8*x,14*x);
		Point piedDroite2 = new Point(11*x,14*x);
		Point chevilleDroite2 = new Point(10*x,13*x);
		Point tailleDroite = new Point(9*x,11*x);
		Point aisselleDroite = new Point(11*x,12*x);
		Point coudeDroite1 = new Point(12*x,13*x);
		Point mancheDroite1 = new Point(12*x,14*x);	
		Point mancheDroite = new Point(13*x,14*x);
		Point coudeDroite2 = new Point(13*x,12*x);
		Point debEpauleDroite = new Point(10*x,10*x);
		Point finEpauleDroite = new Point(11*x, 10*x);

		demarrerNouveauDessinAvecDesPoints()
			.ajouter(chevilleDroite1)
			.ajouter(piedDroite1)
			.ajouter(piedDroite2)
			.ajouter(chevilleDroite2)
			.ajouter(tailleDroite)
			.ajouter(aisselleDroite)
			.ajouter(coudeDroite1)
			.ajouter(mancheDroite1)
			.ajouter(mancheDroite)
			.ajouter(coudeDroite2)
			.ajouter(finEpauleDroite)
			.ajouter(debEpauleDroite)

			//.ajouter(piDroite)
			.nePasRelierLesPointsExtreme();
	
		

//// PARTIE AMINE ET PRADHIBAN

		//menton
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

  
	   // tete
      Point tetea = new Point(75,175);
      Point teteb = new Point(75,75);
      Point tetec = new Point(125,50);
      Point teted = new Point(175,75);
      Point tetee = new Point(225,50);
      Point tetef = new Point(275,75);
      Point teteg = new Point(275,175);
       
        	demarrerNouveauDessinAvecDesPoints()
        		.ajouter(tetea)
        		.ajouter(teteb)
        		.ajouter(tetec)
        		.ajouter(teted)
        		.ajouter(tetee)
        		.ajouter(tetef)
        		.ajouter(teteg)
        		.nePasRelierLesPointsExtreme();
      	
       // lunette rayban aviator
        Point lunettea = new Point(75,100);
        Point lunetteb = new Point(125,125);
        Point lunettec = new Point(175,100);
        Point lunetted = new Point(225,125);
        Point lunettee = new Point(275,100);
	  
       		demarrerNouveauDessinAvecDesPoints()
       			.ajouter(lunettea)
       			.ajouter(lunetteb)
       			.ajouter(lunettec)
       			.ajouter(lunetted)
       			.ajouter(lunettee)
       			.nePasRelierLesPointsExtreme();
       		
       //bouche
         Point bouchea = new Point(150,200);
         Point boucheb = new Point(200,200);
   
            demarrerNouveauDessinAvecDesPoints()
   				.ajouter(bouchea)
   				.ajouter(boucheb)
   				.nePasRelierLesPointsExtreme();
         
              
	}
  
}


