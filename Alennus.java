import java.util.Scanner;
import java.text.DecimalFormat;

public class Alennus {
	public static void main(String[] args) {
		Scanner skanneri = new Scanner(System.in);
		System.out.println("Anna alentamaton hinta: ");
		double hinta = skanneri.nextDouble();
		System.out.println("Anna alennusprosentti: ");
		int prosentti = skanneri.nextInt();
		double lasku = (double) hinta * (100.0 - prosentti) / 100;
		DecimalFormat yksi = new DecimalFormat("0.00");
		System.out.println("Alennettu hinta on " + yksi.format(lasku));
		skanneri.close();

	}
}
