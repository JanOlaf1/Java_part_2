import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma pyytää käyttäjältä tuotteen tiedot, suorittaa tekstinkäsittelyä
		 * annetuille syötteille ja tulostaa ne halutussa muodossa. Lisäksi se huomioi
		 * "tietovirran" rivinvaihtomerkkien jäännökset.
		 */
		Scanner tutka = new Scanner(System.in);
		DecimalFormat kaksi = new DecimalFormat("0.00");

		System.out.print("Anna tuotenumero: ");
		int tuotenumero = tutka.nextInt();

		tutka.nextLine();
		System.out.print("Anna tuotteen nimi: ");
		String tuotenimi = tutka.nextLine().toUpperCase();

		System.out.print("Anna tuotteen hinta: ");
		String input = tutka.nextLine().replace(',', '.');
		double tuotehinta = Double.parseDouble(input);

		System.out.print("Anna tuotteen kuvaus: ");
		String tuotekuvaus = tutka.nextLine().trim();

		tutka.close();

		System.out.println("\nNumero: " + tuotenumero);
		System.out.println("Nimi: " + tuotenimi);
		System.out.println("Hinta: " + kaksi.format(tuotehinta));

		if (!tuotekuvaus.isEmpty()) {
			System.out.println("Kuvaus: " + tuotekuvaus);
		}
	}
}
