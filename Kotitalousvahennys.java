import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {
	/*
	 * Tämä ohjelma, nimeltään Kotitalousvahennys, laskee käyttäjän saaman
	 * kotitalousvähennyksen määrän. Ohjelma kysyy työkorvausten euromääriä niin
	 * kauan, kunnes käyttäjä antaa korvauksen määräksi nolla. Kotitalousvähennyksen
	 * määrä on 50% työkorvauksesta. Vähennyksen omavastuu on 100 euroa, ja vähennys
	 * lasketaan kaavalla työkorvausten summa * 50 / 100.0 - omavastuu.
	 * Kotitalousvähennyksen vähimmäismäärä on 0 euroa ja enimmäismäärä 2 400 euroa.
	 */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		int lasku = 0;
		int omavastuu = 100;
		double summa = 0;
		DecimalFormat two = new DecimalFormat("0.00");

		while (true) {
			System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
			double vastaus = tutka.nextDouble(); // Use nextDouble() for decimal input

			lasku += vastaus;

			if (vastaus == 0) {
				summa = (lasku * 50 / 100.0 - omavastuu);

				if (summa > 2400) {
					summa = 2400;
					break;
				} else if (summa <= 0) {
					summa = 0;
					break;
				}
			}
		}

		if (summa == 0) {
			System.out.println("Kotitalousvähennyksen määrä on " + two.format(summa) + " euroa");
		} else {
			System.out.println("Kotitalousvähennyksen määrä on " + two.format(summa) + " euroa");
		}

		tutka.close();
	}
}
