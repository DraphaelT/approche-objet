package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		Personnage p = new Personnage();
		String combat1 = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("START ?");	
		System.out.println("Appuyer sur nimporte quel touche");
		
		String reponse = scan.nextLine();
		
		System.out.println("Les commande sont :\n -combat\n -affiche\n -sortir");
		
		if(reponse != null) {
			p.creationPersonnage(p);
			System.out.println("Vous avez : "+p.getVie()+" PV");
			System.out.println("Vous avez : "+p.getForce()+" Force");
				
			
			 do{
				combat1 = scan.nextLine();
				
				if(p.getVie() >= 0) {	
				if(combat1.equals("combat")) {
					combat(p);
					System.out.println("Il vous reste :"+p.getVie()+" PV");	
				}if(combat1.equals("affiche")) {
					System.out.println(p.getScore());
				}
				
			}else {
				System.exit(0);
			}
		}while(!combat1.equals("sortir"));
		}else {
			System.out.println("Si vous ne voulez pas jouer ne me lancer pas");
		}
		
		
	}
	
	/*
	 * Methode qui commence par appelée la methode pour crée un monstre 
	 * Fait comfrontais  
	 */
	static void combat(Personnage p) {
		Creature c = Creature.invoc();	
		int monstrePV = c.getVie();
		while(monstrePV>0 && p.getVie()>0) {
			
		if(monstrePV > 0) {
			
			if(p.getVie() > 0) {
				
				System.out.println("Il a "+monstrePV+" PV");
				int attSupP = 1+(int) (Math.random() * ( 10 - 1 ));
				int attSupC = 1+(int) (Math.random() * ( 10 - 1 ));
				int degat = (p.getForce()+attSupP)-(c.getForce()+attSupC);
				
				System.out.print((p.getForce()+attSupP)+" Contre "+(c.getForce()+attSupC)+" : ");
				
				if(degat >= 0) {				
					
					monstrePV-=degat;
					System.out.println("Vous avez fait "+degat+"\n");
					
				}if(degat < 0) {
					
					p.degatSubie(degat);
					System.out.println("Vous avez subis "+-degat+"\n");
					
				}
				
			}if(p.getVie() <= 0 ){ 
				
				System.out.println("-------Vous Etes Mort----------");
				System.out.println("Vous avez :"+p.getScore()+" Points");
				System.exit(0);
			}
		}if(monstrePV <= 0) {
			
			System.out.println("Vous avez gagner "+c.getPoint()+ " Points");
			p.gagnerPoint(c.getPoint());
		}
		}
		
	}

}
