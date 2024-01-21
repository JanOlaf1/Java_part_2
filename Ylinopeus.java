import java.util.Scanner;

public class Ylinopeus {
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
