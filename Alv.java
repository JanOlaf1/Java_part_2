import java.util.Scanner;
import java.text.DecimalFormat;

public class Alv {
	/*
	 * Tässä yksinkertainen ohjelma, joka laskee tuotteen alvittoman hinnan
	 * antamalla alvillisen hinnan ja käyttämällä 14% ALV-kantaa:
	 */
	public static void main(String[] args) {
		Scanner skanneri = new Scanner(System.in);
		int määrä = 3;

		for (int i = 1; i <= määrä; i++) {
			System.out.println("Anna " + i + ". tuotteen hinta: ");
			double hinta = skanneri.nextDouble();
			double alv_prosentti = 0.14;

			double hinta_alv = hinta - (hinta / (1 + alv_prosentti));
			DecimalFormat kaksi = new DecimalFormat("0.00");

			System.out.println("Tuotteen " + i + " ALV on " + kaksi.format(hinta_alv) + " euroa.");
		}

		skanneri.close();
	}
}
