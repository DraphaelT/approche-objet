package fr.diginamic.essais;
import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salarie s = new Salarie("George","Inventer","CDI",1000);
		
		System.out.println(s.getSalaire());
		
		Pigiste p = new Pigiste("Rick","C",20,150);
		
		System.out.println(p.getSalaire());
		
		///////////////////////////////////////
		
		System.out.println(s.AfficheDonnees());
		
		System.out.println(p.AfficheDonnees());
		
		
	}

}
