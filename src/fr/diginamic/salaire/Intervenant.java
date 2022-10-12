package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		this.prenom=prenom;
	}

	abstract int getSalaire();
	
	public String AfficheDonnees() {
		 int salaire = getSalaire();
		 Class type = getClass();	
		 return "|Nom : "+nom+" |Prenom : "+ prenom +" |Salaire : "+ salaire+" |Status : "+type.getSimpleName();
	 }
	
}
