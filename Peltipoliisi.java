import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään Peltipoliisi, tarkistaa, meneekö ajoneuvon ajetulla
		 * nopeudella rikesakolle vai päiväsakolle. Jos nopeus on ylinopeutta
		 * korkeintaan 20 km/h, annetaan rikesakko. Jos ylinopeus on yli 20 km/h,
		 * ohjelma pyytää kuljettajan kuukausitulot ja laskee päiväsakon määrän kaavalla
		 * (nettotulo - 255) / 60, huomioiden, että päiväsakon alin euromäärä on
		 * vähintään 6 euroa. Ohjelma tulostaa lopuksi joko "Ei sakkoja", "Rikesakko"
		 * tai "Päiväsakko", sekä päiväsakon määrän tarvittaessa.
		 */
		Scanner tutka = new Scanner(System.in);
		DecimalFormat kaksi = new DecimalFormat("0.00");
		System.out.println("Anna nopeutesi: ");
		int nopeus = tutka.nextInt();
		int raja = 80;

		if (nopeus > raja && nopeus <= raja + 20) {
			System.out.println("Rikesakko");
		} else if (nopeus > raja + 20) {
			System.out.println("Päiväsakko");
			System.out.println("Anna nettokuukausitulosi: ");
			double tulot = tutka.nextDouble();
			double sakko = (tulot - 255) / 60;

			if (sakko >= 6) {
				System.out.println("Päiväsakon määrä on " + kaksi.format(sakko) + " euroa");
			} else {
				System.out.println("Päiväsakon määrä on 6,00 euroa");
			}
		} else {
			System.out.println("Ei sakkoja");
		}
		tutka.close();
	}
}
