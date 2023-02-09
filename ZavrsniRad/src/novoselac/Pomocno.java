package novoselac;

import java.util.Date;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean DEV;

	
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

//unos datuma

	

		
	}
	
	
	
}