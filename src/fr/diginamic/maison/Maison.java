package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	Piece[] tabPiece =new Piece[0];
	
	//Ajoute une piece 
	//Crée une copy du tableau avec une taille supérieurs puis remplace l'autre tableau
	public void ajouterPiece(Piece piece){
		if(piece == null) {	
			System.out.println("Il n'y a pas de piece a ajouter");
		}
		else {
			if(piece.getEtage()>=0 && piece.getSuperficie() >= 1){
			Piece[] remplace= Arrays.copyOf(tabPiece, tabPiece.length + 1);
			tabPiece=remplace;
			tabPiece[tabPiece.length-1]=piece;	
			System.out.println("Ajout de la piece");
			}
			else {
				System.out.println("Une Piece ou un Etage qui est négatif n'existe pas");
			}
		}
	}
	
	public int superficieTotal(){
		int total=0;
		for(int loop=1;loop<tabPiece.length;loop++) {
			total+=tabPiece[loop].getSuperficie();
		}
		return total;
	}
	
	public int superficieEtage(int etage){
		int total=0;
		
		for(int loop=1;loop<tabPiece.length;loop++) {
			if(tabPiece[loop].getEtage() == etage){
				
				total+=tabPiece[loop].getSuperficie();
		
			}
		}
		return total;
	}	
	
	/*	superficiePieceDonnees calcul le total de la superficie d'un type de piece
	 * .getClass recupére le type de classe est la piece mais la donne en format pack
	 * .getSimpleName met le type de classe en claire
	 */
	public int superficiePieceDonnees(Piece p) {
		Class piece = p.getClass();
		int total=0;
		for(int loop=1;loop<tabPiece.length;loop++) {
			Class pieceTab = tabPiece[loop].getClass();
			if(pieceTab.getSimpleName() == piece.getSimpleName()){
				
				total+=tabPiece[loop].getSuperficie();
				
			}
		}
		System.out.print("La superficie de toute les "+piece.getSimpleName()+" : ");
		return total;
	}	
	/*	nbPieceDonnees est une methode qui compte le nombre de piece du type donnée 
	 *  la méthode utilisé est presque pareil que la méthode superficiePieceDonnees
	 *  mais on compte combien il y a de piece a la place
	 */
	public int nbPieceDonnees(Piece p) {
		Class piece = p.getClass();
		int total=0;
		for(int loop=1;loop<tabPiece.length;loop++) {
			Class pieceTab = tabPiece[loop].getClass();
			if(pieceTab.getSimpleName() == piece.getSimpleName()){
				
				total++;
				
			}
		}
		System.out.print("Nombre de "+piece.getSimpleName()+" : ");
		return total;
	}	
	
}
