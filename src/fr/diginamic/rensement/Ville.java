package fr.diginamic.rensement;

public class Ville {
	
	private int codeRegion;
	private String nom;
	private String codeDep;
	private int codeComm;
	private String nomComm;
	private long popuTotal;
	
	public Ville(int codeRegion, String nom, String codeDep, int codeComm, String nomComm, long popuTotal) {
		
		this.codeRegion = codeRegion;
		this.nom = nom;
		this.codeDep = codeDep;
		this.codeComm = codeComm;
		this.nomComm = nomComm;
		this.popuTotal = popuTotal;
	}
	

	public int getCodeRegion() {
		return codeRegion;
	}

	public String getNom() {
		return nom;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public int getCodeComm() {
		return codeComm;
	}

	public String getNomComm() {
		return nomComm;
	}

	public long getPopuTotal() {
		return popuTotal;
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nom=" + nom + ", codeDep=" + codeDep + ", codeComm=" + codeComm
				+ ", nomComm=" + nomComm + ", popuTotal=" + popuTotal + "]\n";
	}	

}
