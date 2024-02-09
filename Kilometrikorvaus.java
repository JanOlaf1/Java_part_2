import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {
	/*
	 * Tämä ohjelma, nimeltään Kilometrikorvaus, laskee omalla autolla ajojen
	 * kilometrikorvaukset. Ohjelma kysyy käyttäjältä ajokilometrejä, kunnes
	 * käyttäjä syöttää nollan. Tämän jälkeen ohjelma näyttää ajetut kilometrit sekä
	 * ajoista maksettavan korvauksen, joka on 0.43 euroa per kilometri.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat kaksi = new DecimalFormat("0.00");
		int yhteensa = 0;
		int luku;

		do {
			System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
			luku = scanner.nextInt();

			if (luku != 0) {
				yhteensa += luku;
			}

		} while (luku != 0);

		System.out.println("Yhteensä " + yhteensa + " kilometriä");
		double korvaus = yhteensa * 0.43;
		System.out.println("Korvaus on " + kaksi.format(korvaus) + " euroa");

		scanner.close();
	}
}
