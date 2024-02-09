import java.util.Scanner;

public class Ylinopeus {
	/*
	 * Tässä on yksinkertainen Ylinopeus.java -ohjelma, joka kysyy käyttäjältä
	 * kokonaisluvun ja tulostaa "Ylinopeussakko!" vain jos luku on suurempi kuin
	 * 120:
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kerro nopeus: ");
		int tulos = scanner.nextInt();
		if (tulos > 120) {
			System.out.println("Ylinopeussakko!");
			scanner.close();
		}
	}

}
