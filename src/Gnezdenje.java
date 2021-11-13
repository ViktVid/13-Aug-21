import java.util.Scanner;

public class Gnezdenje {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite poluprecnik kruga: ");

		double r = unos.nextDouble();

		double P = r * r * 3.14;
		double O = 2 * r * 3.14;
		{
		if (r >= 0) {
			System.out.println("Poluprecnik nije validan");
		} else if (r >= 3)  {
			System.out.println("Precnik kruga je: " + P);
		} else if (r > 5) {
			System.out.println("Precnik kruga je: " + P + "Obim kruga je: " + O);
	 	}  else if (r > 10) {
			System.out.println("Precnik kruga je: " + P + "Obim kruga je: " + O);
	 	} else {
			System.out.println("Ne moze to.");
	 	}
		}
	unos.close();
	}
}
		
		
		/*zadatak:
	  Uneti poluprecnik kruga
	  Ako je manji ili jednak od 0 -> vratiti poruku da poluprecnik nije validan
	  Ako je poluprecnik manji ili jednak od 5 izracunati P
	  Ako je poluprecnik veci od 5 izracunati 0
	  Ako je poluprecnik veci od 10 izracunati P i O
	    napomena: pi=3.14    P = r*r*pi    O=2*r*pi
	    * prikazati sa ugnjezdenim if-ovima */
		


/*
		int broj = 16;
		boolean condition = true;
		
		{if (broj < 5) {
			System.out.println("x < 5");
		} else if (broj < 10)  {
			System.out.println("10 < x");
		} else if (broj < 20) {
			System.out.println("20 < x");
	 	} else { 
	 		System.out.println("Ne znam koji je broj!");
	 	}
	} */
		
		
		
		
		
		


