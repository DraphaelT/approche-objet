package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		List<String> liste3 = new ArrayList<String>();
		for(String t : liste1) {			
			liste3.add(t);			
		}
		for(String t : liste2) {			
			liste3.add(t);		
		}
		System.out.println(liste3);
	}

}
