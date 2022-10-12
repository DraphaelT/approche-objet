package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int nbMax;
	private int totalClient;
	private int recette;
	
	public Theatre(String nom,int nbMax,int totalClient,int recette){
		this.nom=nom;
		this.nbMax=nbMax;
		this.totalClient=totalClient;
		this.recette=recette;
	}
	
	public void incrire(int nbClient,int prix){
		if(nbClient+totalClient>nbMax) {
			System.out.println("Erreur");
		}
		if(nbClient+totalClient <= nbMax) {
			totalClient+=nbClient;
			recette += prix;
		}		
	}

	public int getTotalClient() {
		return totalClient;
	}

	public int getRecette() {
		return recette;
	}
	
	
}
