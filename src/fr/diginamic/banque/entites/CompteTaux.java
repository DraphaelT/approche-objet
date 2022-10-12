package fr.diginamic.banque.entites;


public final class CompteTaux extends Compte{	
	private int tauxRemu;
	
	CompteTaux(int numCompte, int soldeCompte, int tauxRemu) {
		super(numCompte, soldeCompte);
		this.tauxRemu = tauxRemu;
	}
	public String toString(){
		String idCompte = super.toString();
	    return idCompte +" Le taux de Remuneration est :"+tauxRemu;
	  }
}
