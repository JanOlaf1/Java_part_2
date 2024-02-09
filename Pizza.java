import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään Pizza, auttaa käyttäjää laskemaan kolmen pizzan
		 * yhteishinnan ja yksittäisen pizzan hinnan tarjouksen perusteella. Ohjelma
		 * kysyy käyttäjältä kolmen pizzan hinnat (desimaalilukuja) ja laskee sitten
		 * halvimman pizzan hinnan. Lopuksi se ilmoittaa ostettujen pizzojen
		 * yhteishinnan ja yksittäisen pizzan hinnan ottaen huomioon tarjouksen, jonka
		 * mukaan halvin pizza saadaan kaupan päälle.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna pizzojen hinnat (3): ");
		double hinta1 = tutka.nextDouble();
		double hinta2 = tutka.nextDouble();
		double hinta3 = tutka.nextDouble();
		DecimalFormat kaksi = new DecimalFormat("0.00");
		if (hinta1 < hinta2 && hinta1 < hinta3) {
			double lasku = (hinta1 + hinta2 + hinta3) - hinta1;
			double keskihinta = lasku / 3;
			System.out.println("Maksettavaa: " + kaksi.format(lasku));
			System.out.println("Yksittäisen hinta: " + kaksi.format(keskihinta));
		} else if (hinta2 < hinta1 && hinta2 < hinta3) {
			double lasku = (hinta2 + hinta1 + hinta3) - hinta2;
			double keskihinta = lasku / 3;
			System.out.println("Maksettavaa: " + kaksi.format(lasku));
			System.out.println("Yksittäisen hinta: " + kaksi.format(keskihinta));
		} else {
			double lasku = (hinta3 + hinta2 + hinta1) - hinta3;
			double keskihinta = lasku / 3;
			System.out.println("Maksettavaa: " + kaksi.format(lasku));
			System.out.println("Yksittäisen hinta: " + kaksi.format(keskihinta));
		}
		tutka.close();

	}

}
