import java.util.Scanner;

public class MerkkijonojenVertailu {

	public static void main(String[] args) {
		/*
		 * Ohjelma ottaa kaksi vertailukohdetta ja kertoo jos kyseessä on sama tai eri
		 * sana. Ohjelma myös ei välitä jos sana on sama,mutta kirjain koko on eri.
		 */
		Scanner lukija = new Scanner(System.in);

		System.out.println("Syötä kaksi merkkijonoa:");
		String eka = lukija.nextLine();
		String toka = lukija.nextLine();

		if (eka.equalsIgnoreCase(toka)) {
			System.out.println("Syötetyt merkkijonot olivat samat!");
		} else {
			System.out.println("Syötetyt merkkijonot eivät olleet samat!");
		}
		lukija.close();

	}
}