package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/***
 * Represente le concept de Ville avec un nom et un nombre d'habitant
 * @author Thomas
 *
 */
public class Ville{
	/**Nom de la Ville   */
	private String nom;
	
	/**Nombre d'habitant */ 
	private int nbHabitant;
	
	private EnumContinent continent;
	
	/**
	 * Constructeur
	 * 
	 * @param nom nom de la ville
	 * @param nbHabitant nombre d'habitant
	 */
	public Ville(String nom, int nbHabitant,EnumContinent continent) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.nbHabitant =nbHabitant;
		this.continent = continent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxHab=0;
		String nomVM=null;
	
		Ville v1 = new Ville("Nice", 343000,continent.EUROPE);
		Ville v2 = new Ville("Carcassonne", 47800,continent.EUROPE);
		Ville v3 = new Ville("Narbonne", 53400 ,continent.OCEANIE);
		Ville v4 = new Ville("Lyon", 484000 ,continent);
		Ville v5 = new Ville("Foix", 9700 ,continent);
		Ville v6 = new Ville("Pau", 77200,continent );
		Ville v7 = new Ville("Marseille", 850700,continent);
		Ville v8 = new Ville("Tarbes", 40600,continent);
		
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

	/**
	 * @param nbHabitant
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Ville [nom=" + nom + ", nbHabitant=" + nbHabitant +", Continent="+continent+"]");
		
		return str.toString();
	}
	/**
	 * 
	 * return true si l'objet et la ville ont les memes parametres 
	 * @param abj autre objet 
	 * @return true ou false
	 */
	@Override
	public boolean equals(Object obj) {
		//Regarde si l'objet est une Ville  ///////A retenir
		if(!(obj instanceof Ville)) {
			return false;
		}
		Ville v = (Ville) obj;				///////A retenir aussi
		//Verifie Que les Valeur de la ville sont identique
		if(this.nom .equals(v.getNom()) && this.nbHabitant == v.getNbHabitant()) {
			return true;			
		}
		return false;
	}

	public EnumContinent getContinent() {
		return continent;
	}

	public void setContinent(EnumContinent continent) {
		this.continent = continent;
	}
	
	
	
}


/*Collection.sort(liste, new UserAgeComparator());
*
*public int compare(User u,User u2){
* 	return u.getNom().compareTo(u2.getNom());
*}
*
*/