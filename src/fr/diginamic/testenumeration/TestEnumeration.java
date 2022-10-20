package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saison[] tabS = Saison.values();
		
		for(Saison s : tabS) {
			System.out.println(s.getSaison());
		}
		
		String nom = "ETE";
		
		System.out.println(Saison.valueOf(nom));
		
		String libelle = "Hiver";
		
		System.out.println(enumeration(libelle));
		
	}
	
	public static Saison enumeration(String libelle) {
		
		Saison nom = Saison.valueOf(libelle.toUpperCase());
		
		return nom;
	}
	
}
