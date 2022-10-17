package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lion");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> values = mapVilles.keySet().iterator();
		Iterator<String> key = mapVilles.values().iterator();
		while (key.hasNext()) {
			String keyS = key.next();
			int user = values.next();
			System.out.println(user+" "+keyS.toString());
		}
		System.out.println(mapVilles.size());
		
	}

	@Override
	public String toString() {
		return "CreationEtManipulationMap [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
