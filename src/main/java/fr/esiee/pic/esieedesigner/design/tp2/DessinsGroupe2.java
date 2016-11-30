package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */



public class DessinsGroupe2 extends CreateurDeForme {
	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 50;
	private static final double OFFSET = 1050;
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 50;
	
	private static final Point origin= new Point(60*25,5*25);


	@Override
	public void dessiner() {


		 Point Talon_droite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point BoutPied_droite = new Point((9*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*14);
		 Point HautPied_droite = new Point((8*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 Point JupeBas_droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*13);
		 
		 
		 Point JupeHaut_droite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point Aisselle_droite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		 
		 Point Manche1_droite = new Point((12*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point Main1_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*12);
		 Point Main2_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 Point Main3_droite = new Point((14*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*11);
		 
		 Point Manche2_droite = new Point((13*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*10);
		
		 
		 Point Epaule_droite = new Point((11*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 Point SysmetrieCorps_droite = new Point((7*UNITE_HORIZONTALE)+OFFSET,UNITE_VERTICALE*8);
		 
		 demarrerNouveauDessinAvecDesPoints()
      		.ajouter(Talon_droite)
		    .ajouter(BoutPied_droite)
		    .ajouter(HautPied_droite)
		    .ajouter(JupeBas_droite)
		    .ajouter(JupeHaut_droite)
		    .ajouter(Aisselle_droite)
		    .ajouter(Manche1_droite)
		    .ajouter(Main1_droite)
		    .ajouter(Main2_droite)
		    .ajouter(Main3_droite)
		    .ajouter(Manche2_droite)
		    .ajouter(Epaule_droite)
		    .ajouter(SysmetrieCorps_droite)
		 
		 	.ajouter(getSymetrie(Talon_droite))
			.ajouter(getSymetrie(BoutPied_droite))
			.ajouter(getSymetrie(HautPied_droite))
			.ajouter(getSymetrie(JupeBas_droite))
			.ajouter(getSymetrie(JupeHaut_droite))
			.ajouter(getSymetrie(Aisselle_droite))
			.ajouter(getSymetrie(Manche1_droite))
			.ajouter(getSymetrie(Main1_droite))
			.ajouter(getSymetrie(Main2_droite))
			.ajouter(getSymetrie(Main3_droite))
			.ajouter(getSymetrie(Manche2_droite))
			.ajouter(getSymetrie(Epaule_droite))
			.ajouter(getSymetrie(SysmetrieCorps_droite));
			
		
	

		
		/*cheveux*/
		Point a= new Point(origin.getX()+50,origin.getY()+0);
		Point b= new Point(origin.getX()+100,origin.getY()+25);
		Point c= new Point(origin.getX()+150,origin.getY()+75);
		Point d= new Point(origin.getX()+150,origin.getY()+200);//pic1
		Point e= new Point(origin.getX()+125,origin.getY()+150);
		Point f= new Point(origin.getX()+125,origin.getY()+100);
		Point g= new Point(origin.getX()+125,origin.getY()+200);
		Point h= new Point(origin.getX()+100,origin.getY()+150);
		Point i= new Point(origin.getX()+100,origin.getY()+125);
		Point j= new Point(origin.getX()+100,origin.getY()+175);
		Point k= new Point(origin.getX()+75,origin.getY()+125);
		Point l= new Point(origin.getX()+75,origin.getY()+100);
		Point m= new Point(origin.getX()+50,origin.getY()+75);
		Point n= new Point(origin.getX()+25,origin.getY()+75);
		Point o= new Point(origin.getX()+0,origin.getY()+50);
		
		/*dessin cheveux*/
		demarrerNouveauDessinAvecDesPoints().ajouter(a)
		.ajouter(b)
		.ajouter(c)
		.ajouter(d)
		.ajouter(e)
		.ajouter(f)
		.ajouter(g)
		.ajouter(h)
		.ajouter(i)
		.ajouter(j)
		.ajouter(k)
		.ajouter(l)
		.ajouter(m)
		.ajouter(n)
		.ajouter(o)
		.ajouter(getSymetrie(n))
		.ajouter(getSymetrie(m))
		.ajouter(getSymetrie(l))
		.ajouter(getSymetrie(k))
		.ajouter(getSymetrie(j))
		.ajouter(getSymetrie(i))
		.ajouter(getSymetrie(h))
		.ajouter(getSymetrie(g))
		.ajouter(getSymetrie(f))
		.ajouter(getSymetrie(e))
		.ajouter(getSymetrie(d))
		.ajouter(getSymetrie(c))
		.ajouter(getSymetrie(b))
		.ajouter(getSymetrie(a));

		
		/*visage*/
		Point p= new Point(origin.getX()+75,origin.getY()+200);
		Point q= new Point(origin.getX()+25,origin.getY()+225);
		
		/*dessin visage*/
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(j);
		demarrerNouveauDessinAvecDesPoints().ajouter(p).ajouter(q);
		demarrerNouveauDessinAvecDesPoints().ajouter(q).ajouter(getSymetrie(q));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(q)).ajouter(getSymetrie(p));
		demarrerNouveauDessinAvecDesPoints().ajouter(getSymetrie(p)).ajouter(getSymetrie(j));
		
		/*bouche*/
		Point s= new Point(origin.getX()+75,origin.getY()+150);
		Point t= new Point(origin.getX()+75,origin.getY()+175);
		Point u= new Point(origin.getX()+25,origin.getY()+200);
		
		
		}
	

	
	
	private Point getSymetrie(Point point){
		return new Point(2*origin.getX()-point.getX(), point.getY());
		
	}

}
