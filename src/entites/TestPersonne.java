package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adrPers1 = new AdressePostale(74512,"Monopolie",8,"Birdeux");
		Personne per1 = new Personne("WOW","Incroyable");
		Personne per2 = new Personne("jenesaispas","Qui");
		
		Personne per3 = new Personne("G","Jean",adrPers1);
		
		//TP3 Modifier des variables 
		per1.setNom("Youpi");
		per1.setPrenom("Jetaitincroyable");
		per3.setAdr(adrPers1);
		
		//Recupere la valeur nom de per1 pour l'afficher
		System.out.println(per1.getNom());
		
		//Invoque une methode pour afficher le nom et prenom
		per1.AffichPers();
		
		//1er TP
		
		//Création d'une personne avec une adresse
		/*
		per1.nom = "Jesaispas";
		per1.prenom ="Personne";
		per1.
		per1.adr.codePostal=74512;
		per1.adr.libelleRue="Monopolie";
		per1.adr.numRue= 4;
		per1.adr.ville="Birdeux";
		
		per2.nom = "Wow";
		per2.prenom = "Incroyable";
		per2.adr.codePostal=74512;
		per2.adr.libelleRue="Atesrisque";
		per2.adr.numRue=7;
		per2.adr.ville="Porus";
		*/
	}

}
