package fr.diginamic.testexception;

import listes.EnumContinent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Ville v = new Ville(null,0,EnumContinent.valueOf("EUROPE"));
		
		ReflectionUtils.afficherAttributs(v);
		
	}

}
