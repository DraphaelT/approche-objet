package listes;

import java.util.ArrayList;

public class CreationListe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>(); // Crée un ArrayList de qui va contenir des int
		
		for(int i=1;i<=100;i++) {
			arr.add(i);
		}
		System.out.println(arr.size()); 			// 100
	}

}
