package tri;
import java.lang.Comparable;
public class ComparatorHabitant implements Comparable<Ville>{
	
	public int compareTo(Ville autre,Ville v2) {
		
		if (autre.getNbHabitant() > v2.getNbHabitant()){
			return 1;
		}
		if (autre.getNbHabitant() < v2.getNbHabitant()){
			return -1;
		}
		return 0;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
