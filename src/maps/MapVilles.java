package maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import maps.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Ville> mapVilles = new HashMap<>();
		
		int Max = 0;
		int id = 0;
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800 );
		Ville v3 = new Ville("Narbonne", 53400  );
		Ville v4 = new Ville("Lyon", 484000  );
		Ville v5 = new Ville("Foix", 9700  );
		Ville v6 = new Ville("Pau", 77200  );
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		mapVilles.put(1,v1);
		mapVilles.put(2,v2);
		mapVilles.put(3,v3);
		mapVilles.put(4,v4);
		mapVilles.put(5,v5);
		mapVilles.put(6,v6);
		mapVilles.put(7,v7);
		mapVilles.put(8,v8);
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		Iterator<Ville> valuesIte = mapVilles.values().iterator();
		
		while (valuesIte.hasNext()) {
			Ville ville = valuesIte.next();
			int key = keysIte.next();
			if(ville.getNbHabitant() > Max) {
				Max = ville.getNbHabitant();
				id = key;
			}
		}
		System.out.println(mapVilles);
	
		mapVilles.remove(id);
		
		System.out.println(mapVilles);
		
		
	}

}
