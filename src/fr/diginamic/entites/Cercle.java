package fr.diginamic.entites;

public class Cercle{
	private int rayon;
	
	public Cercle(int rayon){
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	public double surface() {
		return  (rayon *rayon) * Math.PI;
	}

}
