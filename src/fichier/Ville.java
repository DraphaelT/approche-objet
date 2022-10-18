package fichier;

public class Ville {
	
	private String nom;
	private String departement;
	private String nomReg;
	private int populTotal;
	
	public Ville(String nom, String departement, String nomReg, int populTotal) {
		super();
		this.nom = nom;
		this.departement = departement;
		this.nomReg = nomReg;
		this.populTotal = populTotal;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", departement=" + departement + ", nomReg=" + nomReg + ", populTotal="
				+ populTotal + "] \n";
	}
	
	public String getNom() {
		return nom;
	}

	public String getDepartement() {
		return departement;
	}

	public String getNomReg() {
		return nomReg;
	}

	public int getPopulTotal() {
		return populTotal;
	}

	
	
}
