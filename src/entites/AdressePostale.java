package entites;

public class AdressePostale {
		//Definit de quoi est composer une Adresse
		public int numRue ;
		public String libelleRue;
		public int codePostal;
		public String ville;
		
		//Contructeur Addresse
		public AdressePostale(int numRueT,String libelleRueT,int codePostalT,String villeT){
			numRue = numRueT;
			libelleRue = libelleRueT;
			codePostal = codePostalT;
			ville = villeT;
		}
	}
	