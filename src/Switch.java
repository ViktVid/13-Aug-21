import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*
		char pol = 'Z';
		
		switch( pol ) {
		case 'z':
			System.out.println("Zena.");
			break;
		case 'm':
			System.out.println("Muskarac.");
			break;
		case 'd':
			System.out.println("Dete.");
			break;
		default:
			System.out.println("Pogresan odabir.");
		
		}

		if( pol == 'Z' || pol == 'z') {
			System.out.println("Zena.");
		} else if (pol == 'm') {
			System.out.println("Muskarac.");
		} else if (pol == 'd') {
			System.out.println("Dete.");
		} else {
			System.out.println("Pogresno unet pol.");
		} */
		
		/*ZADATAK 1
Sa switch petljom, proveri unetu godinu zivota i to
ako je 7god   -> ispisi da je prvi razred
ako je 8god   -> ispisi da je drugi razred */
		
		Scanner godine = new Scanner(System.in);
		
		System.out.print("Upisite broj godina: ");
		
		int godina = godine.nextInt();
		
		switch( godina ) {
		case 7:
			System.out.println("Ucenik prvog razreda.");
			break;
		case 8:
			System.out.println("Ucenik drugog razreda.");
			break;
		default:
			System.out.println("Pogresan odabir.");
		}
		godine.close();
	}

}
