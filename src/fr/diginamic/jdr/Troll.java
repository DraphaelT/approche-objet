package fr.diginamic.jdr;

public class Troll extends Creature{
	
	private int force ;
    private int vie ;
	private int point = 5;
	
	public int getForce() {
		return force;
	}
	public int getVie() {
		return vie;
	}
	public int getPoint() {
		return point;
	}
	public void setForce() {
		this.force = 10+(int) (Math.random() * ( 15 - 10 ));
	}
	public void setVie() {
		this.vie =20+(int) (Math.random() * ( 30 - 20 ));
	}
}
