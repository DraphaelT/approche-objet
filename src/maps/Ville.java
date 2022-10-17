package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.Comparable;


public class Ville implements Comparable<Ville>{

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
		/*************************************/
		Collections.sort(ville);
		for(Ville v : ville) {
			System.out.println(v);
			
		}		
		Collections.shuffle(ville);
		/////////////////////////////////
		
		//Collections.sort(ville, new ComparatorHabitant());		
		for(Ville v : ville) {
			System.out.println(v);
			
		}		
		Collections.shuffle(ville);
		
		/***********************************/
		
	    
	}
	
	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}
	
	

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(o.getNom());
	}
	
	
}


/*Collection.sort(liste, new UserAgeComparator());
*
*public int compare(User u,User u2){
* 	return u.getNom().compareTo(u2.getNom());
*}
*
*/