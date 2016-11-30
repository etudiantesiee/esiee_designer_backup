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
public class DessinsGroupe1 extends CreateurDeForme {

	/**
	 *  Methode de dessin du personnage du groupe 1  
	 */
	
	// variable taille case
	public static final int x = 25;
	
	@Override
	public void dessiner() {

		
		// Partie Flo 
		dessinerCheveux();
		dessinerNez();
		
   //// PARTIE AMINE ET PRADHIBAN

		dessinerTete();
		dessinerRayban();
		dessinerBouche();
         

        		
      

		// TETE
        //On a intégré votre code dans le notre

  
		
		// yeux gauche
		Point centreOeilGauche = new Point(150, 100);
		Ellipse oeilGauche = new Ellipse(centreOeilGauche, 5, 5);
		ajouterEllipse(oeilGauche, Couleur.NOIR);
		
		// yeux droit
		Point centreOeilDroit = new Point(200, 100);
		Ellipse oeilDroit = new Ellipse(centreOeilDroit, 5, 5);
		ajouterEllipse(oeilDroit, Couleur.NOIR);

		
		
		
		
		// PARTIE A&D
		
		Point mentona = new Point(75,175);
		Point mentonb = new Point(150,250);
		Point mentonc = new Point(200,250);
		Point mentond = new Point(275,175);
		
		// Main
		dessinerMainGauche();
		dessinerMainDroite();
		
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
				
						
					
				//Bas du corps DROITE
				Point chevilleDroite1 = new Point(9*x,13*x);
				Point piedDroite1 = new Point(8*x,14*x);
				Point piedDroite2 = new Point(11*x,14*x);
				Point chevilleDroite2 = new Point(10*x,13*x);
				Point tailleDroite = new Point(9*x,11*x);
				Point aisselleDroite = new Point(11*x,10*x);
				Point coudeDroite1 = new Point(12*x,11*x);
				Point mancheDroite1 = new Point(12*x,12*x);	
				Point mancheDroite = new Point(13*x,12*x);
				Point coudeDroite2 = new Point(13*x,10*x);
				Point debEpauleDroite = new Point(10*x,8*x);
				Point finEpauleDroite = new Point(11*x, 8*x);
				

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
		Point mainGauche1 = new Point(1*x,13*x);
		Point mainGauche2 = new Point(2*x,13*x);
		Point mancheGaucheHaut = new Point(1*x, 12*x);
		Point mancheGaucheBas = new Point(2*x, 12*x);
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(mancheGaucheHaut)
			.ajouter(mainGauche1)
			.ajouter(mainGauche2)
			.ajouter(mancheGaucheBas)
			.nePasRelierLesPointsExtreme();
		
		//Doigts gauche
		Point doigtG1a = new Point(1*x + l,13*x);
		Point doigtG1b = new Point(1*x + l,12.75*x);
		Point doigtG2a = new Point(1*x + 2*l,13*x);
		Point doigtG2b = new Point(1*x + 2*l,12.75*x);
		Point doigtG3a = new Point(1*x + 3*l,13*x);
		Point doigtG3b = new Point(1*x + 3*l,12.75*x);

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
		
		Point mainDroite1 = new Point(12*x,13*x);
		Point mainDroite2 = new Point(13*x,13*x);
		Point mancheDroite1 = new Point(12*x,12*x);	
		Point mancheDroite = new Point(13*x,12*x);
		
		demarrerNouveauDessinAvecDesPoints()
			.ajouter(mancheDroite1)
			.ajouter(mainDroite1)
			.ajouter(mainDroite2)
			.ajouter(mancheDroite)
			.nePasRelierLesPointsExtreme();
		
		
		// doigts de la main droite
		Point doigtD1a = new Point(12*x + l,13*x);
		Point doigtD1b = new Point(12*x + l,12.75*x);
		Point doigtD2a = new Point(12*x + 2*l,13*x);
		Point doigtD2b = new Point(12*x + 2*l,12.75*x);
		Point doigtD3a = new Point(12*x + 3*l,13*x);
		Point doigtD3b = new Point(12*x + 3*l,12.75*x);

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
		Point basGaucheTete = new Point(2*x,7*x);
        Point gaucheTete2 = new Point(x,3*x);
        Point gaucheTete3 = new Point(x,x);
        Point gaucheTete4 = new Point(2*x,0);
        Point hautDroite = new Point(12*x,0);
        Point hautDroite2 = new Point(13*x,x);
        Point hautDroite3 = new Point(13*x,3*x);
        Point hautDroite4 = new Point(12*x,7*x);
        Point basDroite = new Point(11*x,7*x);
        Point basGauche = new Point(3*x,7*x);     

        
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
        Point basGaucheNez = new Point(6.75*x,5.25*x);
        Point centreHautNez = new Point(7*x,5*x);
        Point basDroiteNez = new Point(7.25*x,5.25*x);
        
        demarrerNouveauDessinAvecDesPoints()
        .ajouter(basGaucheNez)
        .ajouter(centreHautNez)
        .ajouter(basDroiteNez)
        .nePasRelierLesPointsExtreme();
	}
	
	public void dessinerTete(){
		
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
	}
	
	public void dessinerRayban(){
		Point lunettea = new Point(75,100);
        Point lunetteb = new Point(125,125);
        Point lunettec = new Point(175,100);
        Point lunetted = new Point(225,125);
        Point lunettee = new Point(275,100);
        Point lunettef = new Point(75,75);
        Point lunetteg = new Point(125,50);
        Point lunetteh = new Point(175,75);
        Point lunettei = new Point(225,50);
        Point lunettej = new Point(275,75);
	  
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
        Point bouchea = new Point(150,200);
        Point boucheb = new Point(200,200);
        	
        	demarrerNouveauDessinAvecDesPoints()
  				.ajouter(bouchea)
  				.ajouter(boucheb)
  				.nePasRelierLesPointsExtreme();
        
      
		
	}

	
	public void dessinerYeux(){
		
	}
	public void dessinerCorps(){

			
	}


}


