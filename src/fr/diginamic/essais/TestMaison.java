package fr.diginamic.essais;
import fr.diginamic.maison.*;


public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison();
		
		SalleDeBain sdb = new SalleDeBain(85,0);
		Cuisine cui = new Cuisine(28,3);
		WC wc1 = new WC(300,2);
		Chambre chm = new Chambre(1,2);
		Chambre chm2 = new Chambre(500,0);
		WC wc2 = new WC(482,-1);			//négatif n'existe pas
		Cuisine cui2 = new Cuisine(-70,3);	//négatif n'existe pas
		
		maison.ajouterPiece(sdb);
		maison.ajouterPiece(cui);
		maison.ajouterPiece(wc1);
		maison.ajouterPiece(chm);
		maison.ajouterPiece(chm2);
		maison.ajouterPiece(null);//Faux
		maison.ajouterPiece(wc2);//Faux
		maison.ajouterPiece(cui2);//Faux
		
		System.out.println("Superficie Total : "+maison.superficieTotal());
		System.out.println("Superficie de l'etage : "+maison.superficieEtage(2));
		
		System.out.println(maison.superficiePieceDonnees(cui2));
		
		System.out.println(maison.nbPieceDonnees(chm));
	}

}
