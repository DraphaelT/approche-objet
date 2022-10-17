package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> chaine = new ArrayList<String>();
		
		Collections.addAll(chaine,"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
	
		System.out.println(chaine);
		int cMax = 0;
		String Max = null;
		
		
		for(int i=0;i<chaine.size();i++) {
			
			if(chaine.get(i).length()> cMax) {
				
				cMax = chaine.get(i).length();
				Max = chaine.get(i);
			}
			if(chaine.get(i).contains("N")) {
				chaine.remove(i);
			}
			chaine.set(i, chaine.get(i).toUpperCase());
		}
		System.out.println(Max);
		System.out.println(chaine);
		
	}

}
