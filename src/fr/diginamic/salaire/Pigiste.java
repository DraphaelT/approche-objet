package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	private int nbJour;
	private int montantJ;	
	
	public Pigiste(String nom,String prenom,int nbJour, int montantJ) {
		super(nom,prenom);
		this.nbJour = nbJour;
		this.montantJ = montantJ;
	}

	@Override
	public int getSalaire() {
		// TODO Auto-generated method stub
		return montantJ*nbJour;
	}

}
