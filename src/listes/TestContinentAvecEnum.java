package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> listVille = new ArrayList<>();
		
		listVille.add(new Ville("New York", 343000,EnumContinent.valueOf("AMERIQUE")));
		listVille.add(new Ville("Paris", 47800,EnumContinent.valueOf("EUROPE")));
		listVille.add(new Ville("Pékin", 53400 ,EnumContinent.valueOf("ASIE")));
		listVille.add(new Ville("Moscou", 484000 ,EnumContinent.valueOf("EUROPE")));
		listVille.add(new Ville("Berlin", 9700 ,EnumContinent.valueOf("EUROPE")));
		listVille.add(new Ville("Sydney", 77200,EnumContinent.valueOf("OCEANIE")));
		listVille.add(new Ville("Sao Paulo", 850700,EnumContinent.valueOf("AFRIQUE")));
		listVille.add(new Ville("Dakar", 40600,EnumContinent.valueOf("AFRIQUE")));
		
		for(Ville v : listVille) {
			System.out.println(v.toString());		}
		}

}
