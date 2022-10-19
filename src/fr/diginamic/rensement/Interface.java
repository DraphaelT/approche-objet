package fr.diginamic.rensement;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
	
	public void Accueil() throws IOException{
		System.out.println("Choisir entre 1-9 :");
		
		Scanner scan = new Scanner(System.in);
		//TODO Problem
		Scanner scan2 = new Scanner(System.in);
		Recensement r = new Recensement();
		int obtion = scan.nextInt();
		scan.close();
		switch(obtion) {
		
		case 1 : System.out.println("Population d’une ville donnée");
			System.out.println("Quel Ville ?");
			
			String nom = scan2.nextLine();
			
			r.quelVillePopu(nom);			
		break;
		
		case 2 : 
			Departement d = new Departement(null, 0);
			System.out.println("Population d’un département donné");
			System.out.println("Quel Département ?");
			
			String dep = scan2.nextLine();
			
			d.populationDep(dep);
		break;
		
		case 3 : 
			Region region = new Region(0, 0);
			System.out.println("Population d’une région donnée");
			System.out.println("Quel region ?");
			
			int reg = scan2.nextInt();
			
			region.populationReg(reg);			
		break;
		
		case 4 : System.out.println("Afficher les 10 régions les plus peuplées");
			Region region1 = new Region(0, 0);
			
		
			region1.CalculPopulation();
			
		break;
		
		case 5 : System.out.println("Afficher les 10 départements les plus peuplés");
		break;
		case 6 : System.out.println("Afficher les 10 villes les plus peuplées d’un département");
		break;
		case 7 : System.out.println("Afficher les 10 villes les plus peuplées d’une région");
		break;
		case 8 : System.out.println("Afficher les 10 villes les plus peuplées de France");
		break;
		
		case 9 : System.out.println("Sortir");
		System.exit(obtion);
		break;
		default: System.out.println("Je n'ai pas compris");
		break;
		}
	}
	
	
}
