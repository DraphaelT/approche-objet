package fr.diginamic.rensement;

import java.io.IOException;


public class Departement {
	
	private String codeDep;
	private long popuTotal;
	
	public Departement(String codeDep, long population) {
		super();
		this.codeDep = codeDep;
		this.popuTotal = population;
	}



	public void populationDep(String dep) throws IOException {
		Recensement R = new Recensement();
		;
		long total = 0;
		for(Ville v : R.AffichListe()) {
			if(dep.equals(v.getCodeDep())) {
				total+=v.getPopuTotal();		//TODO Pour les départements 1 il demande 01		
			}
		}
		System.out.println(total);
	}

}
