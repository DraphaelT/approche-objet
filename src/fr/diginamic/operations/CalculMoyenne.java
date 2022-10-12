package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] tabD = new double[0];
	//Ajoute une Valeur au tableau en créen un nv 
	public void Ajout(double newV) {
		
		double[] newtabD = Arrays.copyOf(tabD, tabD.length+1);
		tabD = newtabD;
		tabD[tabD.length-1]=newV;
		
	}
	/*Calcul La moyenne du tableau 
	 * @tabD
	*/
	public double calcul(){
		double moyenne = 0;
		for(int loop=1;loop<=tabD.length;loop++) {
			moyenne+=tabD[loop-1];
		}
		moyenne=moyenne/tabD.length;
		return moyenne;
	}
	
}
