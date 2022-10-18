package fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;



public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> listVille = new ArrayList<>();
		
		//Prend le document et le met dans une variable
		Path path = Paths.get("C:/Users/Thomas/Downloads/recensement.csv");
		
		List<String> lit = Files.readAllLines(path, StandardCharsets.UTF_8);
		int premierLigne =0;
		String nomCom = null;
		String codeDepart = null;		
		String nomReg = null;
		int popuTo = 0;		
		
		//Lit tout le fichier ligne par ligne 
		for(String i : lit) {
			int nbEle=0;
			//Ignore la premier ligne
			if(premierLigne>0) {
				String[] tri = i.split(";");
				
				for(String o : tri) {
					nbEle++;
					o = o.replaceAll("\\s", "");
					
					if(nbEle==7){
						nomCom=o;
					
					}
					if(nbEle==3){
						codeDepart=o;
					
					}				
					if(nbEle==2){
						nomReg=o;
						
					}
					if(nbEle==10){
						popuTo=Integer.parseInt(o);
						
					}
					
				}	
				//Crée une ville avec les valeurs des lignes recupérer
				listVille.add(new Ville(nomCom, codeDepart, nomReg, popuTo));
			}
			premierLigne++;
		}
		
		//Creer un chemin vers un fichier et le creer si n'existe pas
		File nvFile = new File("C:/Users/Thomas/Downloads/recensementNV.txt");
				
		//Objet popur ecrire un fichier
		FileWriter wrt = new FileWriter(nvFile);
		
		for(Ville v : listVille) {
			if(v.getPopulTotal()>=25000) {
				wrt.write("Nom : "+v.getNom()+", NumDepartement : "+v.getDepartement()+", Region : "+v.getNomReg()+", Population : "+v.getPopulTotal()+"\n");
			}
		}
		
		
		
		
	}

}
