package maps;

public class Pays {

	private String nom;
	private double nbHabitant;
	private String continent;
	
	public Pays(String nom, double nbHabitant, String continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public double getNbHabitant() {
		return nbHabitant;
	}

	public String getContinent() {
		return continent;
	}
	
	
	
}
