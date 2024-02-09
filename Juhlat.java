import java.util.Scanner;

public class Juhlat {
	/*
	 * Tässä ohjelma nimeltään Juhlat, joka laskee tarvittavien kuohuviinipullojen
	 * määrän ja kertoo, montako lasillista jää yli viimeisestä pullosta. Ohjelma
	 * käyttää ceil-käskyä ylöspäin pyöristämiseen.
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anna juhliin tulevien aikuisten määrä: ");
		int vastaus = scanner.nextInt();

		int pullot = vastaus / 7;
		int jamat = ((pullot + 1) * 7) - vastaus;

		if (jamat == 0) {
			System.out.println("Pulloja tarvitaan " + pullot + " kappaletta");
			System.out.println("Viimeisestä pullosta jää 0 lasia");
		} else {
			System.out.println("Pulloja tarvitaan " + (pullot + 1) + " kappaletta");
			System.out.println("Viimeisestä pullosta jää " + jamat + " lasia");
		}
		scanner.close();
	}
}
