package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {	
		Calendar cal = Calendar.getInstance(); 
		
		cal.set(2016,04,19,23,59,30);
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(f.format(cal.getTime()));
		
		f = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					
		System.out.println(f.format(Calendar.getInstance().getTime()));
		//Langue
		Locale l = new Locale("fr", "FR");
		f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss EEEEE MMMM",l);		
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		l = new Locale("UK");//ou RU
		f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss EEEEE MMMM",l);		
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		l = new Locale("");
		f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss EEEEE MMMM" ,l.CHINESE);		
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		l = new Locale("ger","GERMANY");
		f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss EEEE MMMM",l.GERMANY);		
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		
	}
}
