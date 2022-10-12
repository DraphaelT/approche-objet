package fr.diginamic.formes;

public class Carre extends Rectangle{
	
	int longueur;
	
	public Carre(int longueur){
		super(longueur, longueur);
		this.longueur=longueur;
	}
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur*4;
	}
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return longueur*longueur;
	}
}
