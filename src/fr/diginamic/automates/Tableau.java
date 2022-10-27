package fr.diginamic.automates;

import java.util.ArrayList;

/**
 * @author Thomas
 *
 */
public class Tableau {
	
	private Cellule[][] t = new Cellule[6][6];
	private Emplacement emplacement;
	
	public Cellule[][] getT() {
		return t;
	}

	/**
	 * @param t
	 */
	public void setT(Cellule[][] t) {
		this.t = t;
	}
	/**
	 * Methode qui fait rentre dans le tableau une cellule
	 * @param c Cellule avec des coordonées
	 */
	public void ajoutCellule(Cellule c) {
		t[c.getPositionX()][c.getPositionY()] = c;
	}
	/**
	 * Affiche le tableau
	 */
	public void afficheTableau(){
		
		for(Cellule[] tab : t) {
			for(Cellule s : tab) {	
				if(s==(null)) {
					System.out.print("|"+" ");
				}
				else{
					System.out.print("|"+"X");
				}
			}
		System.out.print("|"+"\n");
		}
		System.out.println("");
	}
	/**
	 * Recupere une Cellule pour verifier s'il y a d'autre cellule a proximité
	 * @param c Cellule
	 * @return aCote un int qui definit le nombre de cellule a proximité
	 */
	public int check(Cellule c) {
		int aCote=0;
		
		for(int x=-1;x<=1;x++) {
			for(int y=-1;y<=1;y++) {
				if(c.getPositionX()+x != -1 && c.getPositionY()+y != -1) {
					if(t[c.getPositionX()+x][c.getPositionY()+y] != null) {	
						if(x!=0 || y !=0) {
							aCote++;
						}				
					}
					System.out.println();
				}
			}				
		}
		return aCote;		
	}
	
	public void generation(){
		Cellule[] listeMort = new Cellule[t.length];
		int nbMort = 0;
		for(Cellule[] tab : t) {
			for(Cellule s : tab) {	
				if(s==(null)) {
					/*if(check(s)==3){
						naissance(s);
					}*/
				}
				else{					
					if(check(s)>=4 || check(s)<2) {
						//mort(s);
						listeMort[nbMort]=(s);
						nbMort++;
					}		
				}
			}
		}
		mort(listeMort);
	}
	
	//chaque cellule ayant quatre cellules adjacentes ou plus disparaît, ou meurt, par surpopulation à la génération suivante.
	//Chaque cellule ayant strictement moins de 2 cellules adjacentes meurt d'isolement à la génération suivante.
	public void mort(Cellule[] tab) {
		for(Cellule c : tab) {
			if(c != null) {
				t[c.getPositionX()][c.getPositionY()]=null;
			}
		}
	}
		
	//Si un emplacement a exactement trois cellules adjacentes alors une cellule nait à cet emplacement à la génération suivante
	//TODO
	public void naissance(Cellule c){
		
		ajoutCellule(c);
	
	}
}