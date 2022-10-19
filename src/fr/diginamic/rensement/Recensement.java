package fr.diginamic.rensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public  class Recensement {
	
	ArrayList<Ville> listVille = new ArrayList<>();
	
	void Recesement() throws IOException{
		
		
		Path path = Paths.get("C:/Users/Thomas/Documents/Cour Java/Base/J7 - TP/tp 16 - recensement population 2016.csv");
		
		List<String> lit = Files.readAllLines(path, StandardCharsets.UTF_8);
		int premierLigne =0;
		
		int codeRegion = 0;
		String nom = null;
		String codeDep = null;
		int codeComm = 0;
		String nomComm = null;
		int popuTotal = 0;	
		
		//Lit tout le fichier ligne par ligne 
		for(String i : lit) {
			int nbEle=0;
			//Ignore la premier ligne
			if(premierLigne>0) {
				String[] tri = i.split(";");
				
				for(String o : tri) {
					nbEle++;
					o = o.replaceAll("\\s", "");
					
					if(nbEle==1){
						codeRegion=Integer.parseInt(o);					
					}
					if(nbEle==3){
						codeDep=o;					
					}
					if(nbEle==7){
						nomComm=o;					
					}
					if(nbEle==6){
						codeComm=Integer.parseInt(o);					
					}				
					if(nbEle==2){
						nom=o;						
					}
					if(nbEle==10){
						popuTotal=Integer.parseInt(o);
					}
				}
				listVille.add(new Ville(codeRegion, nom, codeDep,codeComm,nomComm, popuTotal));
			}
			premierLigne++;		
		}
		
	}
	
	public ArrayList<Ville> AffichListe() throws IOException{
		Recesement();
		
		return listVille;
		
	}
	
	
	public void quelVillePopu(String nomVille) throws IOException {
		Recesement();
		for(Ville o : listVille) {
			if(o.getNomComm().equals(nomVille)) {
				System.out.println(o.getPopuTotal()+"."+o.getCodeDep());
			}
		}
				
	}
	
	
	
	
	
}
