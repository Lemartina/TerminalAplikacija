package novoselac;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean DEV;

	//unos datuma
	
//	public static Date unosDatuma() {
//		SimpleDateFormat df = 
//				new SimpleDateFormat("dd.MM.yyyy.HH:mm:ss");
//		
//		
//		System.out.println("Unesite datum i vrijeme dolaska: ");
//		
//		try {
//			return df.parse(ulaz.nextLine());
//			} catch (Exception e) {
//			
//		return new Date();//ako se ne unese dobar datum vraća tekući
//		
//		}
//	}
		
//	public static Date unosDatuma1() {
//		SimpleDateFormat df = 
//				new SimpleDateFormat("dd.MM.yyyy.HH:mm:ss");
//		
//		
//		System.out.println("Unesite datum i vrijeme odlaska: ");
//		while(true) {
//		try {
//			return df.parse(ulaz.nextLine());
//			} catch (Exception e) {
//			
//		return new Date();
//		
//		}
//	}
//	}
	
	//unos datuma drugi način
	public static Date unosDatuma(String poruka, int dan, int mjesec, int godina
			, int sat, int minuta
			) {
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.set(Calendar.DAY_OF_MONTH, dan);
		gc.set(Calendar.MONTH, mjesec-1);
		gc.set(Calendar.YEAR, godina);
		gc.set(Calendar.HOUR, sat);
		gc.set(Calendar.MINUTE, minuta);
		
		
		return gc.getTime();
	}
	
	
	
	
	//unos brojeva
	public static int UnosBrojRaspon(String poruka, int min, int max) {
		int i;

		while (true) {
			try {
				System.out.println(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i < min || i > max) {
					System.out.print("Broj mora biti između " + min + "i" + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");

			}
		}
	}

	
	//unos teksta
	public static String unosTeksta(String poruka) {
		String u;
		while (true) {
			System.out.println(poruka);
			u = ulaz.nextLine();
			if (u.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}

			return u;
		}
	
	}


	
}