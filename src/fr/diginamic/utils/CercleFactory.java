package fr.diginamic.utils;
import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle Creation(double r){
		int conv = (int) Math.round(r);
		return new Cercle(conv);
	}

}
