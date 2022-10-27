package fr.diginamic.automates;

public class JeuDeLaVie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellule c = new Cellule(1,1);
		Cellule c2 = new Cellule(1,2);
		Cellule c3 = new Cellule(1,3);
		
		Tableau t = new Tableau();
		
		t.ajoutCellule(c);
		t.ajoutCellule(c2);
		t.ajoutCellule(c3);

		t.afficheTableau();
		
		t.generation();
		
		t.afficheTableau();
	}
	
	

}
