package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test N°1
		CalculMoyenne test1 = new CalculMoyenne();
		
		test1.Ajout(5.6);
		test1.Ajout(7);
		test1.Ajout(8);
		
		System.out.println(test1.calcul());
		//Test N°2
		CalculMoyenne test2 = new CalculMoyenne();
		
		test2.Ajout(81);
		test2.Ajout(3.1);
		test2.Ajout(7.45);
		
		System.out.println(test2.calcul());
	}

}
