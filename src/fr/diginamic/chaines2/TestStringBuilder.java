package fr.diginamic.chaines2;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chronometre le code avec StringBuilder  14 milisecondes
		long debut = System.currentTimeMillis();
		StringBuilder b = new StringBuilder();
		for(int i=1;i<=100000;i++) {
			b.append(i).append("|");
		}
		
		System.out.println(b);
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		
		//Chronometre le code avec String      4761 millisecondes
		long debut2 = System.currentTimeMillis();
		String str = "";
		for(int i=1;i<=100000;i++) {
			str += i;
		}
		
		System.out.println(str);
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
	}

}
