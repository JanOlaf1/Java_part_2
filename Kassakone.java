import java.util.Scanner;
import java.text.DecimalFormat;

public class Kassakone {
	public static void main(String[] args) {
		double yhteensa = 0;

		Scanner tutka = new Scanner(System.in);
		DecimalFormat dos = new DecimalFormat("#.##");

		while (true) {
			System.out.println("Anna ostoksen hinta (0 lopettaa): ");
			double hinta = tutka.nextDouble();

			if (hinta != 0) {
				yhteensa += hinta;
			} else {
				break;
			}
		}

		double alvOsuus = yhteensa * 24 / 124;
		double verotonHinta = yhteensa - alvOsuus;

		System.out.println("Ostosten verollinen hinta on " + dos.format(yhteensa));
		System.out.println("ALV:n osuus on " + dos.format(alvOsuus));
		System.out.println("Veroton hinta on " + dos.format(verotonHinta));
		tutka.close();

	}
}
