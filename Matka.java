import java.util.Scanner;
import java.text.DecimalFormat;

public class Matka {
	/*
	 * Tee ohjelma Matka, joka kysyy käyttäjältä matkan pituuden ja keskinopeuden
	 * kokonaislukuina. Ohjelma laskee ja tulostaa matkaan kuluvan ajan tunteina
	 * kahdella desimaalilla.
	 */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna matka: ");
		int matka = tutka.nextInt();
		System.out.println("Anna nopeus: ");
		int nopeus = tutka.nextInt();
		double tulos = (double) matka / nopeus;
		DecimalFormat kaksi = new DecimalFormat("0.00");
		System.out.println("Aikaa menee " + kaksi.format(tulos) + " tuntia");
		tutka.close();

	}
}
