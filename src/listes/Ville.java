package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ville {

	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.nbHabitant =nbHabitant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxHab=0;
		String nomVM=null;
		
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800 );
		Ville v3 = new Ville("Narbonne", 53400  );
		Ville v4 = new Ville("Lyon", 484000  );
		Ville v5 = new Ville("Foix", 9700  );
		Ville v6 = new Ville("Pau", 77200  );
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		ArrayList<Ville> ville = new ArrayList<Ville>();
		
		Collections.addAll(ville,v1,v2,v3,v4,v5,v6,v7,v8);
				
		for(Ville i : ville) {
			
			if(i.getNbHabitant() > maxHab) {

				maxHab = i.getNbHabitant();
				nomVM = i.getNom();
			}
		}
		System.out.println(nomVM);	
		
		int Qui = 0;
		for(int i=0;i<ville.size();i++) {
			if(maxHab>ville.get(i).getNbHabitant()) {
				maxHab = ville.get(i).getNbHabitant();
				Qui = i;
			}
		}
		ville.remove(Qui);
		System.out.println(ville.toString());
		
		
		Iterator<Ville> iter = ville.iterator();
		   
	    while(iter.hasNext()) {
	    	Ville nb = iter.next();
	    	if(nb.getNbHabitant()>=100000) {	
	    		nb.setNom(nb.getNom().toUpperCase());
	    	}
	    }
	    System.out.println(ville.toString());
	}
	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}
	
}
