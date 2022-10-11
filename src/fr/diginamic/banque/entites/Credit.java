package fr.diginamic.banque.entites;

public class Credit extends Operation{

	Credit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);
		// TODO Auto-generated constructor stub
	}
	String getType() {
		return "Credit";
	}
	public String toString() {
		String Operation = super.toString();
		return Operation+" C'est un = "+ getType();
	}
	
	
	
}
