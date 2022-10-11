package Geometrie;

public class Rectangle implements ObjetGeometrique{
	private int longueur;
	private int largeur;
	
	Rectangle(int longueur,int largeur){
		this.largeur =largeur;
		this.longueur = longueur;
	}
	
	public double perimetre() {
		return longueur*largeur ;
	}
	public double surface() {
		return (longueur*largeur)*2;
	}
	
}
