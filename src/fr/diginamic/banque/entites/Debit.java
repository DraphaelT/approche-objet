package fr.diginamic.banque.entites;

public class Debit extends Operation{

	Debit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);
		// TODO Auto-generated constructor stub
	}
	String getType() {
		return "Debit";
	}
	public String toString() {
		String Operation = super.toString();
		return Operation+" C'est un = "+ getType();
	}
}
