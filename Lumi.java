import java.util.Scanner;

public class Lumi {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään "Lumi", pyytää käyttäjää syöttämään nimiä, kunnes
		 * annetaan nimi "LOPPU". Ohjelma laskee syötettyjen nimien kokonaismäärän ja
		 * kertoo myös, kuinka monta kertaa nimi "Lumi" syötettiin. Käyttäjä voi syöttää
		 * nimen suurilla tai pienillä kirjaimilla, ja ohjelma huomioi tämän.
		 */
		Scanner tutka = new Scanner(System.in);
		String loppu = "LOPPU";
		int toistuvat = 0;
		int maara = 0;

		while (true) {
			System.out.println("Anna nimi: ");
			String nimi = tutka.nextLine().toLowerCase();

			if (nimi.equalsIgnoreCase(loppu)) {
				break;
			} else {
				maara++;
				if (nimi.equalsIgnoreCase("lumi")) {
					toistuvat++;
				}
			}
		}

		System.out.println("Nimiä oli " + maara + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + toistuvat + " kertaa.");

		tutka.close();
	}
}
