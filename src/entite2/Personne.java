package entite2;

import entites.AdressePostale;

public class Personne {
	//Attribut d'une personne
	public String nom ;
	public String prenom;
	public AdressePostale adr;
	//Contructeur Avec nom et prenom
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		
	}
	//Contructeur Avec tout les paramétre (nom, prenom et adresse)
	public Personne(String nom,String prenom,AdressePostale adr) {
		this.nom = nom;
		this.prenom = prenom;
		this.adr =adr;
		
	}
	public void AffichPers() {

		System.out.println(nom.toUpperCase()+" "+ prenom);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdr() {
		return adr;
	}
	public void setAdr(AdressePostale adr) {
		this.adr = adr;
	}	
	
}
