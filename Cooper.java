import java.util.Scanner;

public class Cooper {
	public static void main(String[] args) {

		Scanner vastaus = new Scanner(System.in);
		System.out.println("Anna juostu matka: ");
		int luku1 = vastaus.nextInt();

		int luku2 = luku1 / 400;
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + luku2);
		vastaus.close();

	}
}
