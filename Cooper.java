import java.util.Scanner;

public class Cooper {
	/*
	 * Tämä ohjelma, nimeltään Cooper, kysyy käyttäjältä juostun matkan ja laskee,
	 * montako kokonaista 400 metrin kierrosta se vastaa. Ohjelma käyttää kaavaa:
	 * kierrosten määrä = matka / 400.
	 */
	public static void main(String[] args) {

		Scanner vastaus = new Scanner(System.in);
		System.out.println("Anna juostu matka: ");
		int luku1 = vastaus.nextInt();

		int luku2 = luku1 / 400;
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + luku2);
		vastaus.close();

	}
}
