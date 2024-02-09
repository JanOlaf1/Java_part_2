import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
	/*
	 * Tämä ohjelma, nimeltään Maalaus, laskee tarvittavan maalimäärän huoneen
	 * maalaamiseen. Käyttäjä syöttää ohjelmalle huoneen leveyden, pituuden,
	 * korkeuden ja maalin riittoisuuden litroina neliömetriä kohti. Ohjelma
	 * huomioi, että kattoa ja lattiaa ei maalata, eikä ikkunoita tai ovia oteta
	 * laskelmissa huomioon.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

		System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
		double leveys = scanner.nextDouble();
		double pituus = scanner.nextDouble();
		double korkeus = scanner.nextDouble();

		System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
		double maalausTehokkuus = scanner.nextDouble();

		double maalinTarve = ((leveys + leveys + pituus + pituus) * korkeus) / maalausTehokkuus;

		System.out.println("Maalin tarve on " + kaksiDesimaalia.format(maalinTarve).replace(".", ",") + " litraa");

		scanner.close();
	}
}
