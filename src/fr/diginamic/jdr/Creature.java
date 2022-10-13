package fr.diginamic.jdr;

public abstract class Creature {	
	int force  ;
    int vie  ;
	
	private static Loup l = new Loup();
	private static Gobelin g = new Gobelin();
	private static Troll t = new Troll();
	
	static Creature[] creat = {l ,g ,t };

	public static Creature invoc() {
		
		int rng = (int) (Math.random() * ( 3 - 0 ));
		Creature monstre = creat[rng];
		Class<? extends Creature> nomMonstre = monstre.getClass();
		System.out.println("Vous rencontrez un "+nomMonstre.getSimpleName());
		monstre.setForce();
		monstre.setVie();
		return monstre;
	}
	
	
	public abstract int getForce();
	public abstract int getVie();
	public abstract int getPoint();
	public abstract void setVie();
	public abstract void setForce();
}
