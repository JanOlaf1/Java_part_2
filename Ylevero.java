import java.util.Scanner;
import java.text.DecimalFormat;

public class Ylevero {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään Ylevero, kysyy käyttäjältä vuositulot ja iän. Se
		 * laskee Yleveron, joka on 0.68% vuosituloista, kuitenkin maksimissaan 140
		 * euroa. Jos Ylevero on alle 70 euroa, sitä ei peritä. Alle 18-vuotias ei maksa
		 * Yleveroa. Vero lasketaan kaavalla tulot * 0.68 / 100.
		 */
		Scanner skanneri = new Scanner(System.in);
		System.out.println("Anna vuositulosi ja ikäsi: ");
		double vuositulo = skanneri.nextDouble();
		int ika = skanneri.nextInt();
		double lasku = vuositulo * 0.68 / 100;
		double ylevero;

		if (lasku > 140) {
			ylevero = 140;
		} else {
			ylevero = lasku;
		}

		if (ika >= 18 && ylevero > 70) {

		} else {
			ylevero = 0;
		}

		DecimalFormat kaksi = new DecimalFormat("0.00");
		System.out.println("Ylevero on " + kaksi.format(ylevero));
		skanneri.close();
	}
}
