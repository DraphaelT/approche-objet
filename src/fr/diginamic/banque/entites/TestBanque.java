package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte compte = new Compte(45,10000);
			
		compte.getNumCompte();
		compte.getSoldeCompte();
		
		System.out.println(compte.toString());
		
		System.out.println("Numero de compte: "+compte.getNumCompte()+" Votre Solde: "+compte.getSoldeCompte());
		
		//TP7
		
		Compte[] tabCompte = new Compte[2];
		
		Compte compteG = new Compte(85,95420);
		CompteTaux compteP = new CompteTaux(46,250000,850);
		
		tabCompte[0]=compteG;
		tabCompte[1]=compteP;
		
		for(int loop=1;loop<=tabCompte.length;loop++) {
			System.out.println(tabCompte[loop-1].toString());
		}
	}

}
