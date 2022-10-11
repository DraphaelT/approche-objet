package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte = new Compte(45,10000);
			
		compte.getNumCompte();
		compte.getSoldeCompte();
		
		System.out.println(compte.toString());
		
		System.out.println("Numero de compte: "+compte.getNumCompte()+" Votre Solde: "+compte.getSoldeCompte());
	}

}
