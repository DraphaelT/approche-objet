package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	private String typeContrat;
	private int salaire;
	
	public Salarie(String nom, String prenom,String typeContrat, int salaire) {
		super(nom,prenom);
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}


	@Override
	public int getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}
	
	
	
	
}
