package fr.diginamic.operations;

public class Operation {
	
	public static double calcul(double a , double b,char signe) {
		if(signe == '-' ) {
			return a-b;
		}
		if(signe == '+' ) {
			return a+b;
		}
		if(signe == '/' ) {
			return a/b;
		}
		if(signe == '*' ) {
			return a*b;
		}
		return 0;
	}
	
}
