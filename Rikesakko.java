import java.util.Scanner;

public class Rikesakko {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, nimeltään Rikesakko, laskee ylinopeussakon käyttäjän antamien
		 * tietojen perusteella. Ohjelma kysyy nopeusrajoituksen ja ajetun nopeuden.
		 * Sakko määräytyy seuraavasti:
		 * Jos suurin sallittu nopeus on 10-60 km/h, enintään 15 km/h ylinopeudesta
		 * rapsahtaa 170 euron rikesakko. Yli 15 km/h ylityksestä sakko on 200 euroa.
		 * Jos suurin sallittu nopeus on 70-120 km/h, enintään 15 km/h ylitys
		 * rangaistaan 140 euron rikesakolla. Yli 15 km/h, mutta enintään 20 km/h
		 * ylityksestä sakko on 200 euroa.
		 * Ohjelma ilmoittaa käyttäjälle sakon suuruuden ottaen huomioon ajetun nopeuden
		 * ja nopeusrajoituksen.
		 */
		Scanner tutka = new Scanner(System.in);

		System.out.println("Anna nopeusrajoitus: ");
		int rajoitus = tutka.nextInt();

		System.out.println("Anna nopeutesi: ");
		int nopeus = tutka.nextInt();

		int rikesakko = 0;

		if (rajoitus >= 10 && rajoitus <= 60) {
			if (nopeus > rajoitus && nopeus <= rajoitus + 15) {
				rikesakko = 170;
			} else if (nopeus > rajoitus + 15 && nopeus <= rajoitus + 20) {
				rikesakko = 200;
			} else if (nopeus > rajoitus + 20) {
				System.out.println("Menee päiväsakoille");
			}
		} else if (rajoitus >= 70 && rajoitus <= 120) {
			if (nopeus > rajoitus && nopeus <= rajoitus + 15) {
				rikesakko = 140;
			} else if (nopeus > rajoitus + 15 && nopeus <= rajoitus + 20) {
				rikesakko = 200;
			} else if (nopeus > rajoitus + 20) {
				System.out.println("Menee päiväsakoille");
			}
		}

		if (rikesakko > 0) {
			System.out.println("Rikesakko on " + rikesakko);
		}
		tutka.close();
	}
}
