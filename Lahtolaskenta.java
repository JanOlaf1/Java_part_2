public class Lahtolaskenta {
	/*
	 * Tämä ohjelma, nimeltään Lahtolaskenta, tulostaa lukuja alaspäin sadasta
	 * yhteen. Ohjelma jättää tulostamatta kaikki luvut, jotka ovat jaollisia
	 * kolmella. Jaollisuuden tarkasteluun käytetään jakojäännösoperaattoria (%).
	 */
	public static void main(String[] args) {
		int numero = 100;

		while (numero > 0) {
			if (numero % 3 != 0) {
				System.out.println(numero);
			}
			numero--;
		}
	}
}
