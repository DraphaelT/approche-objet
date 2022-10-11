package fr.diginamic.banque.entites;

public class Compte {
	
	private int numCompte;
	private int soldeCompte;
	
	Compte(int numCompte, int soldeCompte){
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public int getNumCompte() {
		return numCompte;
	}

	void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	public String toString(){
	    return "Numero de compte: "+numCompte+" Votre Solde: "+soldeCompte;
	  }
	
}
