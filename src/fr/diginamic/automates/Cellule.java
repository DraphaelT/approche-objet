package fr.diginamic.automates;
/**
 * 
 * @author Thomas
 *
 */

public class Cellule {

	private int positionX;
	private int positionY;
	/**
	 * 
	 *Constuteur
	 * 
	 *@param positionX Position de la cellule sur un axe horizontal
	 *@param positionY Position de la cellule sur un axe vertical
	 */
	public Cellule(int positionX, int positionY) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	
	/**
	 * 
	 * @return positionX
	 */
	public int getPositionX() {
		return positionX;
	}
	/**
	 * 
	 * @param positionX
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	/**
	 * 
	 * @return positionY
	 */
	public int getPositionY() {
		return positionY;
	}
	/**
	 * 
	 * @param positionY
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "Cellule [positionX=" + positionX + ", positionY=" + positionY + "]";
	}
	
	
	
}
