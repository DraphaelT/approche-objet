package listes;

public enum EnumContinent {
	
	AMERIQUE("Amerique"),
	EUROPE("Europe"),
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	OCEANIE("Oceanie");
		
	private String nom;

	private EnumContinent(String nom) {
		
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	
}
