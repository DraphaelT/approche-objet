package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps",1),
	ETE("Ete",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private int numOrdre;
	private String saison; 
	
	private Saison(String saison, int numOrdre) {
		this.saison = saison;
		this.numOrdre =numOrdre;
	}
	
	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}
	
}
