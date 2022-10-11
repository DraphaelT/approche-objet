package Geometrie;

public class Cercle implements ObjetGeometrique{
	private int rayon;
	
	Cercle(int rayon){
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	public double surface() {
		return 2 * (rayon * Math.PI);
	}

}
