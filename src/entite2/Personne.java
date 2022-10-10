package entite2;

import entites.AdressePostale;

public class Personne {
	//Attribut d'une personne
	public String nom ;
	public String prenom;
	public AdressePostale adr;
	
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	public Personne(String nom,String prenom,AdressePostale adr) {
		this.nom = nom;
		this.prenom = prenom;
		this.adr =adr;
		
	}
}
