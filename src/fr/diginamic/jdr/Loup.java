package fr.diginamic.jdr;

public class Loup extends Creature{
	
	private int force ;
    private int vie ;	
	private int point = 1;
	
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
		this.force = (8+(int) (Math.random() * ( 8 - 3 )));
	}
	public void setVie() {
		this.vie = (10+(int) (Math.random() * ( 10 - 5 )));
	}
	
}
