package fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import maps.Ville;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<String> lines = new ArrayList<>();
		
		File nvFile = new File("C:/Users/Thomas/Downloads/recensementNV.txt");
		
		
		Path path = Paths.get("C:/Users/Thomas/Downloads/recensement.csv");
		List<String> lit = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		Iterator<String> valuesIte = lit.iterator();
		
			
		
	
		FileWriter wrt = new FileWriter(nvFile);
		//ecrit les 100 premiere ligne
		int ligne=0;
		for(String i : lit) {
			
			if(ligne <= 100) {
				ligne++;
								
				wrt.write(i);
				wrt.write("\n");
			}
		}
		wrt.close();
	}
}
