import java.util.Scanner;

public class Lento {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma kysyy käyttäjältä lentoyhtiön numeron ja selvittää, onko se
		 * Finnairin lento. Jos numero alkaa "AY":llä, se tulkitaan Finnairin lennoksi.
		 * Tämän jälkeen ohjelma tarkistaa, onko kyseessä kaukolento, kotimaan lento vai
		 * Venäjän lento sen perusteella, onko lennon kolmas merkki 1, 2-6 vai 7.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna lennon numero: ");
		String tallennus = tutka.next().toUpperCase();
		String finski = "AY";
		if (tallennus.startsWith(finski)) {
			int numero = Integer.parseInt(tallennus.substring(2, 3));
			switch (numero) {
			case 1:
				System.out.println("Kaukolento");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Kotimaan lento");
				break;
			case 7:
				System.out.println("Venäjän lento");
				break;

			}

		} else {
			System.out.println("Ei ole Finnairin lento");
		}
		tutka.close();

	}
}
