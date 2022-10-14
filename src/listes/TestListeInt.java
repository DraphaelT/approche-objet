package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(-1);
		arrInt.add(5);
		arrInt.add(7);
		arrInt.add(3);
		arrInt.add(-2);
		arrInt.add(4);
		arrInt.add(8);
		arrInt.add(5);
		/*
		 * arrInt.addAll();
		 * 
		 * */
		System.out.println(arrInt);
		System.out.println(arrInt.size());
		//Recupere la valeur la plus grande
	    int maxNb=0;
	    for (int i : arrInt) {
	    	
	        if(i>=maxNb) {
	        	maxNb = i;
	        }
	      }
	    System.out.println(maxNb);
	    //Ou plus simple
	    System.out.println(Collections.max(arrInt));
	    // Retirer le plus petit de Array
	    
	    Iterator<Integer> iter = arrInt.iterator();
	   
	    while(iter.hasNext()) {
	    	int nb = iter.next();
	    	if(nb==Collections.min(arrInt)) {	
	    		iter.remove();;
	    	}
	    }
	   	  
	    System.out.println(arrInt);
	   
	    int nb = 0;
	    for(int i : arrInt) {
	    	
	    	if(arrInt.get(nb)<0) {
			   arrInt.set(nb, -i);
			   
	    	}
		 
	    	nb++;
	    }
	    
	    System.out.println(arrInt);
	}

}
