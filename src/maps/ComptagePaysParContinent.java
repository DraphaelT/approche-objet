package maps;

import java.util.ArrayList;
import java.util.HashMap;


public class ComptagePaysParContinent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pays> list = new ArrayList<>();
		
		list.add(new Pays("France",65,"Europe"));
		list.add(new Pays("Allemagne", 80 , "Europe"));
		list.add(new Pays("Belgique",10,"Europe"));
		list.add(new Pays("Russie",150,"Asie"));
		list.add(new Pays("Chine",1400,"Asie"));
		list.add(new Pays("Indonésie",220,"Océanie"));
		list.add(new Pays("Australie",20,"Océanie"));
		
		HashMap<String, Integer> compt = new HashMap<>(); 
		int eu= 0;		
		int as= 0;
		int oc= 0;
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getContinent().equals("Europe")) {
				eu++;
				compt.put("Europe",eu);
			}
			if(list.get(i).getContinent().equals("Asie")) {
				as++;
				compt.put("Asie",as);
			}
			if(list.get(i).getContinent().equals("Océanie")) {
				oc++;
				compt.put("Océanie",oc);
			}
			
		}
		System.out.println(compt);
		
	}

}
