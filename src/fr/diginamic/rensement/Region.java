package fr.diginamic.rensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.lang.Comparable;

public class Region implements Comparable<Region>{
	
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
	/**
	 * Methode qui affiche le top 10 des region les plus peuple
	 * @throws IOException
	 */
	public void CalculPopulation() throws IOException {
		RegionInit();
		
		List<Region> list = new ArrayList<>();
		
		list.addAll(regionListe.values());
		Collections.sort(list);
		for(int i=list.size()-1;i>list.size()-11;i--) {
			System.out.println(list.get(i));
		}			
	}

	@Override
	public String toString() {
		return "Region [populationtotal=" + populationtotal + ", codeRe=" + codeRe +  "]";
	}

	@Override
	public int compareTo(Region o) {
		
		return Long.compare(this.getPopulationtotal(), o.getPopulationtotal());
	}


	public long getPopulationtotal() {
		return populationtotal;
	}
	
	
		
}
