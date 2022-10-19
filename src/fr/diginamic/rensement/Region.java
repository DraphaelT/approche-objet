package fr.diginamic.rensement;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class Region{
	
	private long populationtotal;
	private int codeRe;
	
	public Region(int codeRe,long populationtotal) {
		super();
		this.codeRe = codeRe;
		this.populationtotal = populationtotal;
	}
	
	Recensement R = new Recensement();
	
	HashMap<Integer ,Region> regionListe = new HashMap<>();

	public void RegionInit() throws IOException {
		
		int Reg=0;
		long populationTotal=0;
		for(Ville v : R.AffichListe()) {			
			
			
			if(Reg != v.getCodeRegion() && populationTotal  != 0){ 				//Temps que la region est la même
				
				regionListe.put(v.getCodeRegion(),new Region(v.getCodeRegion(),populationTotal));
				populationTotal = 0;
				
				
				
			}	
			Reg = v.getCodeRegion();
			populationTotal += v.getPopuTotal();
				
			//Collections.sort(regionListe);
			
		}
		
		for(int i=0;i<=10;i++) {
			regionListe.get(i);
		}
			
			
	}
		
		
	
	
	
	
	public void populationReg(int dep) throws IOException {
		
		R.Recesement();
		long total = 0;
		for(Ville v : R.AffichListe()) {
			if(dep == (v.getCodeRegion())) {
				total+=v.getPopuTotal();				
			}
		}
		System.out.println(total);
	}
	
	public void CalculPopulation() throws IOException {
		
		 
		RegionInit();
		//System.out.println(regionListe);
			
	}



	@Override
	public String toString() {
		return "Region [populationtotal=" + populationtotal + ", codeRe=" + codeRe +  "]";
	}
	
	
		
}
