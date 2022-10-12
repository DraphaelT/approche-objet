package fr.diginamic.essais;
import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle C = new Cercle(5);
		Rectangle r = new Rectangle(3,5);
		Carre c = new Carre(8);
		
		AffichageForme.afficher(C);
		AffichageForme.afficher(r);
		AffichageForme.afficher(c);
		
		
	}

}
