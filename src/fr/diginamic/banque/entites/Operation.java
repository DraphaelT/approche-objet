package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOpe;
	private int montantOpe;
	
	Operation(String dateOpe,int montantOpe){
		this.dateOpe=dateOpe;
		this.montantOpe=montantOpe;
	}
	abstract String getType();
	
	public String toString() {
		return "Date de l'Operation= " + dateOpe + ", Montant de l'operation = " + montantOpe;
	}
	
	//abstract int calcul();
	public String getDateOpe() {
		return dateOpe;
	}
	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}
	public int getMontantOpe() {
		return montantOpe;
	}
	public void setMontantOpe(int montantOpe) {
		this.montantOpe = montantOpe;
	}
	
	
}
