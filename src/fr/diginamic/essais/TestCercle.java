package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle1 = new Cercle(4);
		//Fait appel a une classe pour crée un cercle 
		Cercle c1 = CercleFactory.Creation(14.5);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle1.surface());
		
		System.out.println(c1.perimetre());
		System.out.println(c1.surface());
		
	}

}
