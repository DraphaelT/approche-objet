package fr.diginamic.jdr;

public class Personnage{
	
	private int force;	
	private int vie ;
	private int score;
	
	public Personnage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Regarde si le Personnage est en vie
	public boolean regardePV() {
		if(vie>0) {
			System.out.println("Vous avez "+vie+" restant");
			return true;
		}
		System.out.println("Votre personnage est décédé. Il aobtenu le score de X points. Veuillez créer un nouveau personnage");
		return false;
	}

	public void creationPersonnage(Personnage nom) {
		nom.setForce( 12+(int) (Math.random() * ( 18 - 12 )));
		nom.setVie(20+(int) (Math.random() * ( 50 - 20 )));
		nom.setScore(0);
		System.out.println("Votre Personnage a bien était crée.");	
		System.out.println("Bienvenue \n");
	}
	
	public void degatSubie(int degat){
		this.vie += degat;
	}
	public void gagnerPoint(int point) {
		this.score += point;
	}
	
	
	public int getVie() {
		return vie;
	}
	public void setForce(int force) {
		this.force = force;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int getForce() {
		return force;
	}
	public int getScore() {
		return score;
	}
	
}
