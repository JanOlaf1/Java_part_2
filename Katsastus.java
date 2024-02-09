import java.util.Scanner;

public class Katsastus {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään Katsastus, kysyy käyttäjältä tietoa katsastusasemalla
		 * käynnin yhteydessä ja laskee käynnin hinnan. Ohjelma ottaa huomioon
		 * katsastustyyppiin (katsastus/jälkitarkastus) ja auton tyyppiin
		 * (bensiini/diesel) liittyvät erilliset hinnat. Lopuksi se tulostaa käynnin
		 * hinnan käyttäjälle.
		 */
		Scanner tutka = new Scanner(System.in);

		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int valinta = tutka.nextInt();
		int paastot = 0;
		int polttoaine = 0;

		if (valinta == 1) {
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			paastot = tutka.nextInt();
		}

		if (paastot == 1) {
			System.out.print("Onko auto 0=bensa, 1=diesel: ");
			polttoaine = tutka.nextInt();
		}

		int hinta = 0;

		if (valinta == 1) {
			hinta += 50;
		} else if (valinta == 2) {
			hinta += 30;
		}

		if (paastot == 1) {
			if (polttoaine == 0) {
				hinta += 22;
			} else if (polttoaine == 1) {
				hinta += 31;
			}
		}

		System.out.println("Hinta on " + hinta);
		tutka.close();
	}
}
