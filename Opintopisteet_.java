import java.util.Scanner;

public class Opintopisteet_ {
	/*
	 * Tämä ohjelma, nimeltään Opintopisteet, kysyy opiskelijalta monesko lukukausi
	 * on menossa ja kuinka monta opintopistettä hän on saanut kullakin
	 * lukukaudella. Ohjelma laskee ja näyttää kuinka paljon opiskelijalla pitäisi
	 * olla tähän mennessä opintopisteitä, kun lukukauden tavoite on 30
	 * opintopistettä, opiskelijan yhteenlasketut opintopisteet, ilmoituksen siitä,
	 * onko opiskelija jäljessä tavoitteesta, tavoitteessa vai yli tavoitteen
	 * ("Olet jäljessä tavoitteesta.", "Olet tavoitteessa." tai
	 * "Olet edellä tavoitteesta."), ja vielä tarvittavien opintopisteiden määrän
	 * tutkintoon, kun tutkinto on 210 opintopistettä
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna lukukausien määrä: ");
		int lukukausienMaara = scanner.nextInt();

		int yhteensaOpintopisteet = 0;

		for (int i = 1; i <= lukukausienMaara; i++) {
			System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
			int opintopisteetLukukaudella = scanner.nextInt();
			yhteensaOpintopisteet += opintopisteetLukukaudella;
		}

		int tavoiteOpintopisteet = lukukausienMaara * 30;
		int tutkintoonVaadittavatOpintopisteet = 210;
		int puuttuvatTutkintoonOpintopisteet = tutkintoonVaadittavatOpintopisteet - yhteensaOpintopisteet;

		System.out.println("Sinulla pitäisi olla tähän mennessä " + tavoiteOpintopisteet + " opintopistettä.");
		System.out.println("Sinulla on " + yhteensaOpintopisteet + " opintopistettä.");

		if (yhteensaOpintopisteet < tavoiteOpintopisteet) {
			System.out.println("Olet jäljessä tavoitteesta.");
		} else if (yhteensaOpintopisteet == tavoiteOpintopisteet) {
			System.out.println("Olet tavoitteessa.");
		} else {
			System.out.println("Olet edellä tavoitteesta.");
		}

		System.out.println("Tutkinnosta puuttuu vielä " + puuttuvatTutkintoonOpintopisteet + " opintopistettä.");

		scanner.close();
	}
}
