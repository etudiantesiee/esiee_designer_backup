package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;



/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author ady & diane
 *         florian
 *         amineoos &pradhox
 */
public class DessinsGroupe1 extends CreateurDeForme{

	/**
	 *  Methode de dessin du personnage du groupe 1  
	 */
	
	// variable taille case
	public static final int X = 25;
	
	@Override
	public void dessiner() {

		
		// Partie Flo 
		dessinerCheveux();
		dessinerNez();
		
   //// PARTIE AMINE ET PRADHIBAN

		dessinerTete();
		dessinerRayban();
		dessinerBouche();
		dessinerYeuxGauche();
		dessinerYeuxDroit();
 
		
		// PARTIE A&D
		
		Point mentona = new Point(75,175);
		Point mentonb = new Point(150,250);
		Point mentonc = new Point(200,250);
		Point mentond = new Point(275,175);
		
		// Main
		dessinerMainGauche();
		dessinerMainDroite();
		
		//Bras GRAUCHE
				Point debEpauleGauche = new Point(4*X,8*X);
				Point finEpauleGauche = new Point(3*X, 8*X);
				Point coudeGauche1 = new Point(1*X, 10*X);
				Point coudeGauche2 = new Point(2*X, 11*X);
				Point mancheGaucheHaut = new Point(1*X, 12*X);
				Point mancheGaucheBas = new Point(2*X, 12*X);
				Point aisselleGauche = new Point(3*X, 10*X);
				Point tailleGauche = new Point(5*X,11*X);
				Point chevilleGauche1 = new Point(4*X,13*X);
				Point piedGauche1 = new Point(3*X,14*X);
				Point chevilleGauche2 = new Point(5*X,13*X);
				Point piedGauche2 = new Point(6*X,14*X);
				Point piGauche = new Point(6*X,12*X);
				Point piDroite = new Point(8*X,12*X);
				
						
					
				//Bas du corps DROITE
				Point chevilleDroite1 = new Point(9*X,13*X);
				Point piedDroite1 = new Point(8*X,14*X);
				Point piedDroite2 = new Point(11*X,14*X);
				Point chevilleDroite2 = new Point(10*X,13*X);
				Point tailleDroite = new Point(9*X,11*X);
				Point aisselleDroite = new Point(11*X,10*X);
				Point coudeDroite1 = new Point(12*X,11*X);
				Point mancheDroite1 = new Point(12*X,12*X);	
				Point mancheDroite = new Point(13*X,12*X);
				Point coudeDroite2 = new Point(13*X,10*X);
				Point debEpauleDroite = new Point(10*X,8*X);
				Point finEpauleDroite = new Point(11*X, 8*X);
				

				demarrerNouveauDessinAvecDesPoints()
					.ajouter(mentond)
		  			.ajouter(mentonc)
		  			.ajouter(mentonb)
		  			.ajouter(mentona)
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
					.couleurDeFond(Couleur.GRIS)
					.nePasRelierLesPointsExtreme();
	}
	
	
	public void dessinerMainGauche(){
		
		  
		double l = 6.25;
		//Main gauche
		Point mainGauche1 = new Point(1*X,13*X);
		Point mainGauche2 = new Point(2*X,13*X);
		Point mancheGaucheHaut = new Point(1*X, 12*X);
		Point mancheGaucheBas = new Point(2*X, 12*X);
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(mancheGaucheHaut)
			.ajouter(mainGauche1)
			.ajouter(mainGauche2)
			.ajouter(mancheGaucheBas)
			.nePasRelierLesPointsExtreme();
		
		//Doigts gauche
		Point doigtG1a = new Point(1*X + l,13*X);
		Point doigtG1b = new Point(1*X + l,12.75*X);
		Point doigtG2a = new Point(1*X + 2*l,13*X);
		Point doigtG2b = new Point(1*X + 2*l,12.75*X);
		Point doigtG3a = new Point(1*X + 3*l,13*X);
		Point doigtG3b = new Point(1*X + 3*l,12.75*X);

		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtG1a)
			.ajouter(doigtG1b)
			.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtG2a)
			.ajouter(doigtG2b)
			.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtG3a)
			.ajouter(doigtG3b)
			.nePasRelierLesPointsExtreme();
		
		
	}
	
	public void dessinerMainDroite(){
		// MAIN DROITE
	
		  
		double l = 6.25;
		
		Point mainDroite1 = new Point(12*X,13*X);
		Point mainDroite2 = new Point(13*X,13*X);
		Point mancheDroite1 = new Point(12*X,12*X);	
		Point mancheDroite = new Point(13*X,12*X);
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(mancheDroite1)
			.ajouter(mainDroite1)
			.ajouter(mainDroite2)
			.ajouter(mancheDroite)
			.nePasRelierLesPointsExtreme();
		
		
		// doigts de la main droite
		Point doigtD1a = new Point(12*X + l,13*X);
		Point doigtD1b = new Point(12*X + l,12.75*X);
		Point doigtD2a = new Point(12*X + 2*l,13*X);
		Point doigtD2b = new Point(12*X + 2*l,12.75*X);
		Point doigtD3a = new Point(12*X + 3*l,13*X);
		Point doigtD3b = new Point(12*X + 3*l,12.75*X);

		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtD1a)
			.ajouter(doigtD1b)
			.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtD2a)
			.ajouter(doigtD2b)
			.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(doigtD3a)
			.ajouter(doigtD3b)
			.nePasRelierLesPointsExtreme();
	}
	
	public void dessinerCheveux(){
		Point basGaucheTete = new Point(2*X,7*X);
        Point gaucheTete2 = new Point(X,3*X);
        Point gaucheTete3 = new Point(X,X);
        Point gaucheTete4 = new Point(2*X,0);
        Point hautDroite = new Point(12*X,0);
        Point hautDroite2 = new Point(13*X,X);
        Point hautDroite3 = new Point(13*X,3*X);
        Point hautDroite4 = new Point(12*X,7*X);
        Point basDroite = new Point(11*X,7*X);
        Point basGauche = new Point(3*X,7*X);     

        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(basGauche)
        .ajouter(basGaucheTete)
        .ajouter(gaucheTete2)
        .ajouter(gaucheTete3)
        .ajouter(gaucheTete4)
        .ajouter(hautDroite)
        .ajouter(hautDroite2)
        .ajouter(hautDroite3)
        .ajouter(hautDroite4)
        .ajouter(basDroite)
        .nePasRelierLesPointsExtreme();
		}
	
	public void dessinerNez(){   
        Point basGaucheNez = new Point(6.75*X,5.25*X);
        Point centreHautNez = new Point(7*X,5*X);
        Point basDroiteNez = new Point(7.25*X,5.25*X);
        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(basGaucheNez)
        .ajouter(centreHautNez)
        .ajouter(basDroiteNez)
        .nePasRelierLesPointsExtreme();
	}
	
	public void dessinerTete(){
		
		Point tetea = new Point(825,175);
	    Point teteb = new Point(825,75);
	    Point tetec = new Point(875,50);
	    Point teted = new Point(925,75);
	    Point tetee = new Point(975,50);
	    Point tetef = new Point(1025,75);
	    Point teteg = new Point(1025,175);
	        
	    demarrerNouveauDessinAvecDesPoints()
	    .ajouter(tetea)
	    .ajouter(teteb)
	    .ajouter(tetec)
	    .ajouter(teted)
	    .ajouter(tetee)
	    .ajouter(tetef)
	    .ajouter(teteg)
	   .nePasRelierLesPointsExtreme();
	}
	
	public void dessinerRayban(){
		Point lunettea = new Point(750+75,100);
        Point lunetteb = new Point(750+125,125);
        Point lunettec = new Point(750+175,100);
        Point lunetted = new Point(750+225,125);
        Point lunettee = new Point(750+275,100);
        Point lunettef = new Point(750+75,75);
        Point lunetteg = new Point(750+125,50);
        Point lunetteh = new Point(750+175,75);
        Point lunettei = new Point(750+225,50);
        Point lunettej = new Point(750+275,75);
	  
       		demarrerNouveauDessinAvecDesPoints()
       			.ajouter(lunettea)
       			.ajouter(lunetteb)
       			.ajouter(lunettec)
       			.ajouter(lunetted)
       			.ajouter(lunettee)
       			.ajouter(lunettej)
       			.ajouter(lunettei)
       			.ajouter(lunetteh)
       			.ajouter(lunetteg)
       			.ajouter(lunettef)
       			.couleurDeFond(Couleur.GRIS)
       			.nePasRelierLesPointsExtreme();
	}
	
	public void dessinerBouche(){
        Point bouchea = new Point(750+150,200);
        Point boucheb = new Point(750+200,200);
        	
        	demarrerNouveauDessinAvecDesPoints()
  				.ajouter(bouchea)
  				.ajouter(boucheb)
  				.nePasRelierLesPointsExtreme();
        
      
		
	}

	
	public void dessinerYeuxGauche(){
		
		Point centreOeilGauche = new Point(150, 100);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 5, 5);
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
	}
	
public void dessinerYeuxDroit(){

		Point centreOeilDroit = new Point(200, 100);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, 5, 5);
		ajouterEllipse(oeilDroit, Couleur.NOIR);
		
	}
	public void dessinerCorps(){
		
			
	}


}


