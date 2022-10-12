package fr.diginamic.essais;
import fr.diginamic.entites.Theatre;

public class TestTheatre {
	
	public static void main(String[] args) {
		Theatre theatre = new Theatre("RoueLibre",50,48,50000);
		
		theatre.incrire(1,1000);
		
		System.out.println(theatre.getTotalClient());
		theatre.incrire(1,1000);
		System.out.println(theatre.getTotalClient());
		theatre.incrire(1,100000);
		
		System.out.println(theatre.getTotalClient());
		
		System.out.println(theatre.getRecette());
		
	}
}
