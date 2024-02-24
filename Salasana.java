
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Salasana {
	private static Set<String> kaytetytSalasanat = new HashSet<>();

	public static void main(String[] args) {
		/*
		 * This program checks if given password is ok! Password needs to contain 8
		 * characters, big character, small character. As a Bonus program also checks
		 * that password haven't been used earlier. Maybe later i will add loop that
		 * program stays constantly active until password is ok.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna salasana: ");
		String salasana = tutka.nextLine();

		if (tarkistaSalasana(salasana) && !sisaltaaEriSalasana(salasana)) {
			System.out.println("Salasana kelpaa.");
			kaytetytSalasanat.add(salasana);
		} else {
			System.out.println("Salasana ei käy.");
		}
		tutka.close();
	}

	private static boolean tarkistaSalasana(String salasana) {
		return (salasana.length() >= 8 && sisaltaaSuurenKirjaimen(salasana) && sisaltaaPienenKirjaimen(salasana)
				&& sisaltaaNumeron(salasana));
	}

	private static boolean sisaltaaSuurenKirjaimen(String salasana) {
		for (char merkki : salasana.toCharArray()) {
			if (Character.isUpperCase(merkki)) {
				return true;
			}
		}
		return false;
	}

	private static boolean sisaltaaPienenKirjaimen(String salasana) {
		for (char merkki : salasana.toCharArray()) {
			if (Character.isLowerCase(merkki)) {
				return true;
			}
		}
		return false;
	}

	private static boolean sisaltaaNumeron(String salasana) {
		for (char merkki : salasana.toCharArray()) {
			if (Character.isDigit(merkki)) {
				return true;
			}
		}
		return false;
	}

	private static boolean sisaltaaEriSalasana(String salasana) {
		return kaytetytSalasanat.contains(salasana);
	}
}
