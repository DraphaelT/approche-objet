package fr.diginamic.formes;

public class Rectangle implements Forme{
	
	private int longueur;
	private int largeur;
	
	public Rectangle(int longueur,int largeur){
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return (longueur*largeur);
	}
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return (longueur+largeur)*2;
	}
	
	

}
