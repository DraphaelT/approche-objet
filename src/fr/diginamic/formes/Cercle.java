package fr.diginamic.formes;

public class Cercle implements Forme{
	
	private double rayon;
	
	public Cercle (double rayon){
		this.rayon=rayon;
	}
	
	@Override
	public double calculerSurface() {
		return (rayon *rayon) * Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return (2 * rayon )* Math.PI ;
	}

}
