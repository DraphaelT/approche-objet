package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
	
	public static void main(String[] args) {
		String chaine= "Durand;Marcel;2523.5";
		// charAt(int index) Permet d'avoir le caractere selectionner a l'aide de l'index
		System.out.println(chaine.charAt(0));
		// length() Permet d'avoir la longueur de la chaine de caractére
		System.out.println(chaine.length());
		// indexOf(char c) afficher l’index du premier «;» contenu dans la chaine de caractères
		System.out.println(chaine.indexOf(';'));
		// substring(int start,  int  end) permet  d’extraire  une  portion  de  chaine  de caractères comprise entre un index de début (inclus) et unindex de fin (exclu)
		System.out.println(chaine.substring(0, 6));
		// toUpperCase() mettre en MAJ
		System.out.println(chaine.substring(0, 6).toUpperCase());
		// toLowerCase() mettre en min
		System.out.println(chaine.substring(0, 6).toLowerCase());
		// split
		String[] exer = chaine.split(";");		
		for(int loop=1;loop<=exer.length;loop++) {
			System.out.println(exer[loop-1]);
		}
		//Exercice Salarie
		
		Salarie s1 = new Salarie(exer[0],exer[1],Double.parseDouble(exer[2].replace(" ", "")));
		
		System.out.println(s1.toString());
		
	}
	
}
