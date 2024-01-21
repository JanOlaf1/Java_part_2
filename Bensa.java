import java.util.Scanner;
import java.text.DecimalFormat;

public class Bensa {
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna tankattu määrä: ");
		double polttoaine = tutka.nextDouble();
		System.out.println("Anna ajetut kilometrit: ");
		int matka = tutka.nextInt();
		System.out.println("Anna litrahinta: ");
		double hinta = tutka.nextDouble();
		double tulos = polttoaine / matka * hinta;
		DecimalFormat kaksi = new DecimalFormat("0.00");
		System.out.println("Ajo per kilometri maksaa " + kaksi.format(tulos));
		tutka.close();
	}
}
