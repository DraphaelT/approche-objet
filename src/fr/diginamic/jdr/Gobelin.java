package fr.diginamic.jdr;

public class Gobelin extends Creature{
	
	private int force ;
    private int vie ;
	private int point = 2;
	
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
		this.force = 10+(int) (Math.random() * ( 10 - 5 ));
	}
	public void setVie() {
		this.vie = 15+(int) (Math.random() * ( 15 - 10 ));
	}
	
	
}
