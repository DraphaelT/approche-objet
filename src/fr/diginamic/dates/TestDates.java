package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {	
		//@Deprecated	
		Date date = new Date();
		
		StringBuilder stringb = new StringBuilder();
		
		Calendar cal = Calendar.getInstance(); 
		
		cal.set(2016, 04, 19, 23, 59, 30);
//		cal.set(Calendar.YEAR, 2001);
		
		date = cal.getTime();
		
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		stringb.append(f.format(date));
		
		System.out.println(stringb);
		Locale locale = new Locale("fr", "FR");
		//mm = minute MM = mois HH = heure format 24h hh = done heure format PM AM
		f = new SimpleDateFormat("dd/MM/yyyy 'à' HH:mm:ss",locale);
		
		System.out.println(f.format(date));
		
		//Affiche la date et l'heure de l'ordinateur 
		//Appel la methode getinstance de calendar pour avoir les données puis les mets en format date
		System.out.println(f.format(Calendar.getInstance().getTime()));
		
		
		
	}

}
