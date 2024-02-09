import java.util.Scanner;

public class Pikavippi {
	/*
	 * Ohjelma Pikavippi laskee lainatun summan takaisinmaksun. Käyttäjä syöttää
	 * korkoprosentin ja laina-ajan (1 tai 2 vuotta). Nordax Pankki tarjoaa 41 %
	 * korolla vuodeksi, Viikinkilaina 37 % kahdeksi vuodeksi. Ohjelma ei huomioi
	 * korkoa korolle -ilmiötä eikä osittain takaisinmaksua. Käyttäjä saa
	 * takaisinmaksettavan summan.
	 */
	public static void main(String[] args) {
		Scanner skanneri = new Scanner(System.in);
		System.out.println("Anna pikavipin määrä euroissa: ");
		int luku = skanneri.nextInt();

		System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		int luku1 = skanneri.nextInt();

		System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		int luku2 = skanneri.nextInt();

		double luku3 = 0;
		if (luku1 == 1) {
			luku3 = (luku * luku2 / 100) * luku1;
		} else if (luku1 == 2) {
			luku3 = (luku * luku2 / 100) * luku1;
		} else {
			System.out.println();
		}
		System.out.println("Lainatut rahat maksavat eli korko " + luku3);
		skanneri.close();

	}
}
